//AUTHOR T0MW0ZZER

public class Item {

    String name;
    int value;
    int amount;
    
    public Item(String name, int value, int amount){
        this.name = name;
        this.value = value;
        this.amount = amount;
    }
    
    public String getItemName(){
        return name;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int newAmount){
        amount = amount + newAmount;
    }
    
}
