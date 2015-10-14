
public class Weapon {
    int damage;
    
    public Weapon(){
        damage = 5;
    }
    
    public Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}
