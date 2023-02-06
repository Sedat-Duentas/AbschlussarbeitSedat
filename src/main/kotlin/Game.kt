fun game() {

    var aragorn: Aragorn = Aragorn("Aragorn", 600.0)                                                     // TODO Die Herstellung der einzelnen Helden Objekte
    var legolas: Legolas = Legolas("Legolas", 650.0)
    var gandalf: Gandalf = Gandalf("Gandalf", 700.0)

    var helden: MutableList<Character> = mutableListOf(aragorn, legolas, gandalf)                                       // TODO Die Herstellung einer Heldenliste, die in der For-Schleife benutzt wird

    var sauron: Sauron = Sauron("Sauron ", 1400.0)                                                       // TODO Die Herstellung des Bösewichtes: Sauron

    var dead: Boolean = false                                                                                           // TODO Initialisierung von drei Variablen: Tod eines Objektes, die Rundenzahl und die Schleifenrunde
    var rounds: Int = 0
    var roundsNumber: Int = 0

        while (!dead) {                                                                                                     // TODO While-Schleife mit einer Nicht-Tod Bedingung
            for (held in helden) {                                                                                          // TODO For-Schleife die durch die Heldenliste durchläuft
                roundsNumber =
                    0                                                                                            // TODO Beginn mit der Runden nummer 0
                while (held.lifePoints >= 0.0 && sauron.lifePoints >= 0.0 && roundsNumber < 3) {                            // TODO While-Schleife mit den Bedingungen: Helden und Sauron leben größer-gleich null und Angriffs runden nummer kleiner als drei
                    held.printMove(roundsNumber)                                                                            // TODO Bestimmung der nächsten runden
                    var eingabeVomNutzer: Int =
                        readln().toInt()                                                            // TODO Eingabe vom Nutzer die in einer Variable gespeichert wird
                    held.doAtack(
                        sauron,
                        eingabeVomNutzer
                    )                                                                  // TODO Attacken-Funktion
                    roundsNumber++                                                                                          // TODO Erstellung der nächsten runde und nächsten Angriff eines Helden
                }

                if (sauron.lifePoints > 0.0) {                                                                              // TODO If-Abfrage nach der Schleife - solange Saurons Leben größer als null ist
                    var sauronsZufalligeZahl =
                        (1..3).random()                                                        // TODO wird eine zufällige Zahl der Angriffsart von Sauron bestimmt
                    sauron.doAtack(
                        held,
                        sauronsZufalligeZahl
                    )                                                              // TODO Funktion Angriff von Sauron wird ausgeführt
                }

                if (aragorn.lifePoints <= 0.0 && aragorn.gameOver == false) {
                    aragorn.gameOver = true
                    println("Aragorn fällt heldenhaft im Kampf gegen Sauron")
                    println()
                }

                if (legolas.lifePoints <= 0.0 && legolas.gameOver == false) {
                    legolas.gameOver = true
                    println("Legolas fällt heldenhaft im Kampf gegen Sauron")
                    println()
                }

                if (gandalf.lifePoints <= 0.0 && gandalf.gameOver == false) {
                    gandalf.gameOver = true
                    println("Gandalf fällt heldenhaft im Kampf gegen Sauron")
                    println()
                }

                if (sauron.lifePoints <= 0.0) {                                                                             // TODO If-Abfrage nach der Schleife - wenn Saurons Leben kleiner/gleich null ist
                    println("${held.name} hat Sauron den letzten gnadenstoß verpasst und die Helden zum Sieg geführt")      // TODO wird eine Println ausgegeben das Sauron verloren hat
                    dead =
                        true                                                                                             // TODO und die Tod-Bedingung wird auf true gesetzt
                    break                                                                                                   // TODO und dann wird die Abfrage abgebrochen

                } else if (aragorn.lifePoints <= 0.0 && legolas.lifePoints <= 0.0 && gandalf.lifePoints <= 0.0) {                                                                        // TODO If-Abfrage nach der Schleife - wenn das Leben von einem Held kleiner/gleich null ist
                    println("Die Helden sind gefallen, Sauron gewinnt den Kampf und regiert jetzt über Mittelerde")                                          // TODO wird eine Println ausgegeben das Sauron gewonnen hat
                    dead =
                        true                                                                                             // TODO und die Tod-Bedingung wird auf true gesetzt
                    break                                                                                                   // TODO und dann wird die Abfrage abgebrochen
                }
            }
            rounds++                                                                                                        // TODO Die Runde wird wiederholt
        }
    }