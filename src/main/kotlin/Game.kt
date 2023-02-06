fun game() {
    /**
     * Die Herstellung der einzelnen Helden Objekte
     */
    var aragorn: Aragorn = Aragorn("Aragorn", 600.0)
    var legolas: Legolas = Legolas("Legolas", 650.0)
    var gandalf: Gandalf = Gandalf("Gandalf", 700.0)
    /**
     * Die Herstellung einer Heldenliste, die in der For-Schleife benutzt wird
     */
    var helden: MutableList<Character> = mutableListOf(aragorn, legolas, gandalf)
    /**
     * Die Herstellung des Bösewichtes: Sauron
     */
    var sauron: Sauron = Sauron("Sauron ", 1400.0)
    /**
     * Initialisierung von drei Variablen: Tod eines Objektes, die Rundenzahl und die Schleifenrunde
     */
    var dead: Boolean = false
    var rounds: Int = 0
    var roundsNumber: Int = 0

        while (!dead) {                                                                                                 // While-Schleife mit einer Nicht-Tod-Bedingung
            for (held in helden) {                                                                                      // For-Schleife die durch die Heldenliste durchläuft
                roundsNumber = 0                                                                                        // Die Runden nummer beginnt mit der 0
                    while (held.lifePoints > 0.0 && sauron.lifePoints > 0.0 && roundsNumber < 3) {                      // While-Schleife mit den Bedingungen: Helden und Sauron leben größer null und Angriffs runden nummer kleiner als drei
                        held.printMove(roundsNumber)                                                                    // Bestimmung der nächsten runde
                        var eingabeVomNutzer: Int = readln().toInt()                                                    // Eingabe vom Nutzer die in einer Variable gespeichert wird
                        var richtigeEingabe = held.doAtack(sauron, eingabeVomNutzer,helden)                             // Attacken-Funktion
                        if (richtigeEingabe)                                                                            // If Bedingung dass nur dann die nächste Runde beginnt, wenn die korrekte Zahl eingegeben wurde
                            roundsNumber++                                                                              // Erstellung der nächsten runde und nächsten Angriff eines Helden
                    }

                if (sauron.lifePoints > 0.0) {                                                                          // If-Abfrage nach der Schleife - solange Saurons Leben größer als null ist
                    var sauronsZufalligeZahl = (1..3).random()                                                    // wird eine zufällige Zahl der Angriffsart von Sauron bestimmt
                    sauron.doAtack(held, sauronsZufalligeZahl,helden)                                                   // Funktion Angriff von Sauron wird ausgeführt
                }

                if (aragorn.lifePoints <= 0.0 && aragorn.isAlive == true) {                                             // If-Abfrage nach der Schleife - solange Aragorns Leben kleiner gleich null ist und ob Aragorn noch lebt
                    aragorn.isAlive = false                                                                             // Aragorn lebt, wird auf False gesetzt
                    println("Aragorn fällt heldenhaft im Kampf gegen Sauron")                                           // Es wird ausgegeben das Aragorn gefallen ist
                    println()                                                                                           // println als Leerzeichen
                }

                if (legolas.lifePoints <= 0.0 && legolas.isAlive == true) {                                             // If-Abfrage nach der Schleife - solange Legolas Leben kleiner gleich null ist und ob Legolas noch lebt
                    legolas.isAlive = false                                                                             // Legolas lebt, wird auf False gesetzt
                    println("Legolas fällt heldenhaft im Kampf gegen Sauron")                                           // Es wird ausgegeben das Legolas gefallen ist
                    println()                                                                                           // println als Leerzeichen
                }

                if (gandalf.lifePoints <= 0.0 && gandalf.isAlive == true) {                                             // If-Abfrage nach der Schleife - solange Gandalf Leben kleiner gleich null ist und ob Gandalf noch lebt
                    gandalf.isAlive = false                                                                             // Gandalf lebt, wird auf False gesetzt
                    println("Gandalf fällt heldenhaft im Kampf gegen Sauron")                                           // Es wird ausgegeben das Gandalf gefallen ist
                    println()                                                                                           // println als Leerzeichen
                }

                if (sauron.lifePoints <= 0.0) {                                                                         // If-Abfrage nach der Schleife - wenn Saurons Leben kleiner/gleich null ist
                    println("${held.name} hat Sauron den letzten gnadenstoß verpasst und die Helden zum Sieg geführt")  // wird eine Println ausgegeben das Sauron verloren hat
                    dead = true                                                                                         // und die Tod-Bedingung wird auf true gesetzt
                    break                                                                                               // und dann wird die Abfrage abgebrochen

                } else if (aragorn.lifePoints <= 0.0 && legolas.lifePoints <= 0.0 && gandalf.lifePoints <= 0.0) {       // If-Abfrage nach der Schleife - wenn das Leben von einem Held kleiner/gleich null ist
                    println("Die Helden sind gefallen, Sauron gewinnt den Kampf und regiert jetzt über Mittelerde")     // wird eine Println ausgegeben das Sauron gewonnen hat
                    dead = true                                                                                         // und die Tod-Bedingung wird auf true gesetzt
                    break                                                                                               // und dann wird die Abfrage abgebrochen
                }
            }
            rounds++                                                                                                    // Die Runde wird wiederholt
        }
    }