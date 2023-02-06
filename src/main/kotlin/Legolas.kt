class Legolas(override var name : String, override var lifePoints : Double):Character(name,lifePoints) {

    // TODO Hier sind die Funktionen der drei Attacken die zufällig einen Schaden bestimmen und diesen dem Gegner zufügen

    override fun firstAttack(gegner: Character) {
        var damage = (40..100).random().toDouble()
        attack(gegner, damage)
        println("$name greift mit der fistAttack an und fügt ${gegner.name}einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name}sind noch: ${gegner.lifePoints} Punkte")
        println()
    }

    override fun secondAttack(gegner: Character) {
        var damage = (60..100).random().toDouble()
        attack(gegner, damage)
        println("$name greift mit der swordAttack an und fügt ${gegner.name}einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name}sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }

    override fun thirdAttack(gegner: Character) {
        var damage = (80..100).random().toDouble()
        attack(gegner, damage)
        println("$name greift mit der arrowAttack an und fügt ${gegner.name}einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name}sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }

    // TODO Funktion die den Rundenanzahl bestimmt und ausgibt und nach der Angriffsart fragt

    override fun printMove(roundsNumber: Int) {
        super.printMove(roundsNumber)
        println("Welchen Angriff möchtest du durchführen :")
        println("1.fistAttack")
        println("2.swordAttack")
        println("3.arrowAttack")
    }
}