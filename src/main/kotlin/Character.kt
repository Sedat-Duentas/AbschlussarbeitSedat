open class Character(open var name: String, open var lifePoints: Double) {

    var isAlive = true // Variable für die Charaktere, um zu bestimmen, ob sie noch Leben

    /**
     * Funktion Attacke, die den zufälligen Schaden vom gegnerischen Leben abzieht und den aktuellen lebenspunkt zurück gibt
      */
    fun attack(gegner: Character, damage: Double): Double {
        gegner.lifePoints -= damage
        if (gegner.lifePoints < 0) gegner.lifePoints = 0.00
        return gegner.lifePoints
    }
    /**
     * Funktion für die Auswahl der Attacke
     */
    fun doAtack(character: Character, atackNumber: Int, helden:MutableList<Character>): Boolean {
            when (atackNumber) {
                1 -> {
                    this.firstAttack(character)
                    return true
                }
                2 -> {
                    this.secondAttack(character)
                    return true
                }
                3 -> {
                    this.thirdAttack(character)
                    return true
                }
                4 -> {
                    this.healing(helden)
                    return true
                }
                else -> {
                    println("Bitte korrekte Zahl angeben!")
                    return false
                }
            }
    }
    /**
     * Funktion der drei Attacken die in den jeweiligen Klassen überschieben werden
     */
    open fun firstAttack(gegner: Character) {
        println("Fehler")
    }
    open fun secondAttack(gegner: Character) {
        println("Fehler")
    }
    open fun thirdAttack(gegner: Character) {
        println("Fehler")
    }
    open fun healing(helden: MutableList<Character>) {
        println("Fehler")
    }
    /**
     * Funktion die Rundenanzahl bestimmt und ausgibt
     */
    open fun printMove(roundsNumber: Int) {
        println("Der ${roundsNumber + 1}. zug von: $name")
    }
}