class Gandalf(override var name : String, override var lifePoints : Double):Character(name,lifePoints) {

    // TODO Hier sind die Funktionen der drei Attacken die zufällig einen Schaden bestimmen und diesen dem Gegner zufügen

    override fun firstAttack(gegner: Character) {
        var damage = (70..100).random().toDouble()
        attack(gegner, damage)
        println("$name greift mit der swordAttack an und fügt ${gegner.name}einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name}sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }

    override fun secondAttack(gegner: Character) {
        var damage = (80..100).random().toDouble()
        attack(gegner, damage)
        println("$name greift mit der airSwirl an und fügt ${gegner.name}einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name}sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }

    override fun thirdAttack(gegner: Character) {
        var damage = (90..100).random().toDouble()
        attack(gegner, damage)
        println("$name greift mit der curseAttack an und fügt ${gegner.name}einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name}sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }

    override fun healing(held:Character) {
        var aragorn: Aragorn = Aragorn("Aragorn", lifePoints)                                                     // TODO Die Herstellung der einzelnen Helden Objekte
        var legolas: Legolas = Legolas("Legolas", lifePoints)
        var gandalf: Gandalf = Gandalf("Gandalf", lifePoints)
        var helden: MutableList<Character> = mutableListOf(aragorn, legolas, gandalf)
        for (held in helden) {
            if (gameOver == true) {
                helden.remove(held)
            }
        }
        var randomHeld = helden.random()
        randomHeld.lifePoints = randomHeld.lifePoints * 2
        println("${randomHeld.name} hat eine Heilung erhalten")
        println(randomHeld.lifePoints)
    }

    // TODO Funktion die den Rundenanzahl bestimmt und ausgibt und nach der Angriffsart fragt

    override fun printMove(roundsNumber: Int) {
        super.printMove(roundsNumber)
        println("Welchen Angriff möchtest du durchführen :")
        println("1.swordAttack")
        println("2.airSwirl")
        println("3.curseAttack")
        println("4.healing")
    }
}