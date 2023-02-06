class Sauron(override var name : String, override var lifePoints : Double):Character(name,lifePoints) {
    /**
     * Hier sind die Funktionen der drei Attacken die zufällig einen Schaden bestimmen und diesen dem Gegner zufügen
     */
    override fun firstAttack(gegner: Character) {
        var damage = (300..350).random().toDouble()
        attack(gegner, damage)
        Thread.sleep(2000)
        println("$name greift mit der stormAttack an und fügt ${gegner.name} einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name} sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }
    override fun secondAttack(gegner: Character) {
        var damage = (350..400).random().toDouble()
        attack(gegner, damage)
        Thread.sleep(2000)
        println("$name greift mit der fireAttack an und fügt ${gegner.name} einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name} sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }
    override fun thirdAttack(gegner: Character) {
        var damage = (400..450).random().toDouble()
        attack(gegner, damage)
        Thread.sleep(2000)
        println("$name greift mit der curseAttack an und fügt ${gegner.name} einen Schaden von $damage Punkten zu")
        println("Die verbleibenden Lebenspunkte von ${gegner.name} sind noch: ${gegner.lifePoints}  Punkte")
        println()
    }
}