public class Quest {
    
    String description;
    String name;
    int goldReward;
    Item itemReward;

    public Quest(String description, String name, int goldReward, Item itemReward) {
        this.description = description;
        this.name = name;
        this.goldReward = goldReward;
        this.itemReward = itemReward;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoldReward(int goldReward) {
        this.goldReward = goldReward;
    }

    public void setItemReward(Item itemReward) {
        this.itemReward = itemReward;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public Item getItemReward() {
        return itemReward;
    }

    @Override
    public String toString() {
        return "Quest{" + "description=" + description + ", name=" + name + ", goldReward=" + goldReward + ", itemReward=" + itemReward + '}';
    }
    
    
    
}
