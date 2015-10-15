//AUTHOR T0MW0ZZER

public class Hero {
   String name;
   int health;
   int attack;
   int exp;
   String classType;
   
   public Hero(String name, String classType, int health, int attack, int exp){
       this.name = name;
       this.health = health;
       this.attack = attack;
       this.exp = exp;
       this.classType = classType;
   }
   
   public String getName(){
       return name;
   }
   
   public int getHealth(){
       return health;
   }
   
   public int getAttack(){
       return attack;
   }
   
   public int getExp(){
       return exp;
   }
   
   public void gainHealth(int gainHealth){
       health = health + gainHealth;
   }
   
   public void looseHealth(int looseHealth){
       health = health - looseHealth;
   }
   
   public void gainExp(int addExp){
       exp = exp + addExp;
   }
}
