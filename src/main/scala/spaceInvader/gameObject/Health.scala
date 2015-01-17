package spaceInvader.gameObject

trait Health {
    protected var hp: Int
    
    def takeDmg(amt: Int) = {
        hp -= amt
    }

    def getHp() = hp 
}
