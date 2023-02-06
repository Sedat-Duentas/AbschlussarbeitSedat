open class Character(open var name: String, open var lifePoints: Double) {

    // TODO Funktion Attacke, die den zufälligen Schaden vom gegnerischen Leben abzieht und den aktuellen lebenspunkt zurück gibt
    fun attack(gegner: Character, damage: Double): Double {
        gegner.lifePoints -= damage
        if (gegner.lifePoints < 0) gegner.lifePoints = 0.00
        return gegner.lifePoints
    }

    // TODO Funktion für die Auswahl der Attacke
    fun doAtack(character: Character, atackNumber: Int) {
        when (atackNumber) {
            1 -> this.firstAttack(character)
            2 -> this.secondAttack(character)
            3 -> this.thirdAttack(character)
            4 -> this.healing(character)
        }
    }

    var gameOver = false

    // TODO Funktion der drei Attacken die in den jeweiligen Klassen überschieben werden
    open fun firstAttack(gegner: Character) {
        println("Fehler")
    }
    open fun secondAttack(gegner: Character) {
        println("Fehler")
    }
    open fun thirdAttack(gegner: Character) {
        println("Fehler")
    }

    open fun healing(held: Character) {
        println("Fehler")
    }

    // TODO Funktion die den Rundenanzahl bestimmt und ausgibt
    open fun printMove(roundsNumber: Int) {
        println("Der ${roundsNumber + 1}. zug von: $name")
    }
}