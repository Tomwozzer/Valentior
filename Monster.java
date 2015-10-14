//AUTHOR T0MW0ZZER

public class Monster {
    String type;
    int health;
    int attack;
    boolean isKill;
    
    public Monster(String type, int health, int attack, boolean isKill){
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.isKill = isKill;
    }
    
    public String getType(){
        return type;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public boolean getIsKill(){
        return isKill;
    }
    
    public void changeHealth(int lostHealth){
        health = health - lostHealth;
    }
}
