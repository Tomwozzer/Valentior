//AUTHOR T0MW0ZZER

import java.util.Scanner;
public class Valentior {

    public static void main(String[] args) {
       
        Item [] backpack = new Item[20];
        Item gold = new Item("Gold", 1, 25);
        backpack[0] = gold;
        int backpackSize = backpack.length;
        
        boolean isKill = false;
        int numChoice = 0;
        Scanner input = new Scanner(System.in);
		System.out.println("Hello adventurer! What is your name?");
		String name = input.nextLine();
		
		System.out.println("Greetings " + name);
		System.out.println("What class would you like to be?");
		System.out.println("1) Rouge");
		System.out.println("2) Mage");
		System.out.println("3) Warrior");
                System.out.println("4) Find out more information about each class");
		
		String classType = "";
		numChoice = input.nextInt();
                
                int attack = 0;
                int health = 0;
                
                if (numChoice == 1){
                    classType = "Rougue";
                    attack = 40;
                    health = 150;
                } else if (numChoice == 2){
                    classType = "Mage";
                    attack = 50;
                    health = 100;
                } else if (numChoice == 3){
                    classType = "Warrior";
                    attack = 30;
                    health = 170;
                } 
                
                while (numChoice != 1 && numChoice != 2 && numChoice != 3){
                    

                    if (numChoice == 4){
                    System.out.println("Rougue: A swift class, focusing on sneaking and ranged attacks. Low health, High damage");
                    System.out.println("Mage: A magical class, focusing on heavy damage and healing spells. Low Health, Extreemly high damage");
                    System.out.println("Warrior: A tough class focusing on decent damage with high defence.");
                    
                    System.out.println("");
                    
                    System.out.println("What class would you like to be?");
                    System.out.println("1) Rouge");
                    System.out.println("2) Mage");
                    System.out.println("3) Warrior");
                    
                    numChoice = input.nextInt();
                    
                    if (numChoice == 1){
                            classType = "Rougue";
                    } else if (numChoice == 2){
                        classType = "Mage";
                    } else if (numChoice == 3){
                        classType = "Warrior";
                    } 
                    
                    } else {
                        System.out.println("Please enter a valid option");
                    }
                
                }
                
                input.nextLine();
                
                Hero hero = new Hero(name, classType, health, attack, 0);
		
		System.out.println("Greetings " + hero.getName() + " the " + hero.getClass());
		System.out.println("Your journey starts here, you are currently staying in a tavern in your home town of Rallion");
		System.out.println("It's a quite night in the tavern a few drunks scattered around the room. You hear footsteps approaching and a friendly face greets you. Well met, would you like me to get you any food?");
		System.out.println("enter y or n");
		numChoice = input.nextInt();
		if (numChoice == 1){
			System.out.println("Brilliant sir, what can i get for you?");
			System.out.println("Our meals tonight are Venison with all the goods, Roast boar, or maybe just a simple vegetable soup");
			System.out.println("1) Venison	 2) Roast Boar	 3) Vegetable Soup");
			
			 numChoice = input.nextInt();
			
			if (numChoice == 1){
				System.out.println("Very well sir, Venison it is... I will return with your meal shortly");
			} else if(numChoice == 2){
				System.out.println("Very well sir, Roast boar it is... I will return shortly with a slice of it");
			} else if(numChoice == 3){
				System.out.println("What are you, a maiden? There is something fruity about you sir..... Nevertheless i will return shortly with it");
			}
			
		} else if (numChoice == 2){
			System.out.println("Very well sir, nothing for you i will fetch you some more mead however to keep you going");
		}
		
		System.out.println("You hear a loud knocking at the tavern door. Everyone goes quite. You hear the screaming of women and children. Next the tavern door busts in a goblin holding a severed head stares right at you before he pounces!");
		Monster goblin1 = new Monster("Goblin", 100, 20, false);
		System.out.println("You have two options:  1) Stand and Fight  or  2) Run and hide");
		
		numChoice = input.nextInt();
		
		if (numChoice == 1){
			System.out.println("You punch the goblin, mid air, as hard as you can. He stumbles to the ground. You draw your sword and prepare yourself for battle!");
                } else if (numChoice == 2){
			System.out.println("The goblin tackles you to the ground and leaves you no escape. He leaves you no option but to fight him");
		}
		
		System.out.println("***==-- Time to Fight --==***");
		System.out.println("Tutorial: do you know how to fight or would you like to learn how?");
		System.out.println("1) Learn to fight   2) I know how to fight, let me kill this bitch");
		numChoice = input.nextInt();
		
		if (numChoice == 1){
			System.out.println("You have three options when fighting something. You may attack the monster. You may use an item or you may attempt to run");
			System.out.println("The interface looks like this:");
			System.out.println("1) Attack   2) Use an Item  3) Run");
			System.out.println("You may press either 1, 2 or 3 to do the corrosponding action");
			System.out.println("Lets try attacking the monster");
                        while (isKill == false){
                            printAttack();
                            numChoice = input.nextInt();
                            if (numChoice == 1){
                                System.out.println("This goblin has " + goblin1.getHealth() + " remaining");
                                System.out.println("You attack the monster. Dealing " + (attack -10) + " damage");
                                goblin1.changeHealth(attack - 10);
                                System.out.println("The goblin has " + goblin1.getHealth() + " health remaining");
                                if (goblin1.getHealth() <= 0){
                                    System.out.println("Goblin Defeated, you have earned 48 xp!!!");
                                    hero.gainExp(48);
                                    isKill = true;
                                }
                            } else if (numChoice == 2){
                                System.out.println("Which item would you like to use?");
                                for (int i = 0; i <backpack.length; i++){
                                    if(backpack[i] != null){
                                        System.out.println(backpack[i].getItemName());
                                    }
                                }
                                System.out.println("What item would you like to use?");
                            } else if (numChoice == 3){
                                System.out.println("You push past the goblin and all the tavern folk");
                                System.out.println("As you run out the door a group of goblins surround you and knock you unconcious");
                                System.out.println("You awaken a short while later to a burning village and dead villagers litter the streets");
                                System.out.println("A travelling merchant is 'searching' the bodies. As he comes up to you he notices you are infact alive");
                                System.out.println("'Well met stranger, are you okay?' he says as he pulls you to his feet");
                                System.out.println("'I hear its good karma to help those in need, so here, have some gold!");
                                System.out.println("Item aquired: 100 gold!");
                                backpack[0].setAmount(100);
                                System.out.println("You know have: " + backpack[0].getAmount() + " gold");
                                isKill = true;
                            }
                        }    
		} else if (numChoice == 2){
			System.out.println("You face your enemy and prepare to kill this bitch");
                        while (isKill == false){
                            printAttack();
                            numChoice = input.nextInt();
                            if (numChoice == 1){
                                System.out.println("This goblin has " + goblin1.getHealth() + " remaining");
                                System.out.println("You attack the monster. Dealing " + (hero.getAttack() - 10) + " damage");
                                goblin1.changeHealth(hero.getAttack() - 10);
                                System.out.println("The goblin has " + goblin1.getHealth() + " health remaining");
                                if (goblin1.getHealth() <= 0){
                                    System.out.println("Goblin Defeated, you have earned 48 xp!!!");
                                    hero.gainExp(48);
                                    isKill = true;
                                }
                            } else if (numChoice == 2){
                                System.out.println("Which item would you like to use?");
                                for (int i = 0; i <backpack.length; i++){
                                    if(backpack[i] != null){
                                        System.out.println(backpack[i].getItemName());
                                    }
                                }
                                System.out.println("What item would you like to use?");
                                for (int i = 0; i < backpack.length; i++){
                                    if(backpack[i] != null){
                                        System.out.println(backpack[i].getItemName());
                                    }    
                                }
                            } else if (numChoice == 3){
                                System.out.println("You cannot run, you wanted to slay this bitch, now do it!");
                            }
                        }   
                }
                
                System.out.println("The burnt, looted village stands before you. All around you see death and despair.");
                System.out.println("You have 3 options ahead of you. 3 places to travel to.");
                System.out.println("1)  You may attempt to head to the Capital City of Valentior");
                System.out.println("2)  You may head to the crime ridden town of Duskdale");
                System.out.println("3)  Your third option is to the peaceful village of Ardendale");
                
                numChoice = input.nextInt();
                int locationChoice = numChoice;
                if (locationChoice == 1){
                    System.out.println("You head for the Capital, Valentior");
                    locationChoice = 1;
                } else if (locationChoice == 2){
                    System.out.println("You head for the town of Duskdale");
                    locationChoice = 2;
                } else if (locationChoice == 3){
                    System.out.println("You head to the peacful billage of Ardendale");
                    locationChoice = 3;
                }
                
                System.out.println("As you are travelling down the road you see in the distance a man approaching");
                System.out.println("As he gets closer you realise he is a travelling merchant with his donkey");
                System.out.println("'Hello stranger' he greets you with. Would you like to see my wears?");
                System.out.println("You realise you could do with some supplies. You agree and the stranger opens his cart to you");
                System.out.println("The stranger has some health potions, a new sword, some mana potions and a potion of madness");
                System.out.println("1) Buy one of the items  2) Find out more about the items");
                while (numChoice != 1 || numChoice != 2){
                    if(numChoice == 1){
                        System.out.println("Which item would you like to buy?");
                        System.out.println("1) Health Potion  2) Iron Sword  3) Mana Potion  4) Potion of madness  5) Exit and continue");
                        numChoice = input.nextInt();
                        int amount;
                        int bpCount = 1;
                        if (numChoice == 1){
                            System.out.println("How many would you like to buy? (30 coins each)");
                            amount = input.nextInt();
                            Item HealthPotion = new Item("Health Potion", 30, amount);
                            backpack[bpCount] = HealthPotion;
                            bpCount++;
                        } else if(numChoice == 2){
                            System.out.println("The merchant only has one sword. It costs 100 coins)");
                            Item IronSword = new Item("Iron Sword",  100, 1);
                            backpack[bpCount] = IronSword;
                            bpCount++;
                        } else if(numChoice == 3){
                            System.out.println("How many would you like to buy? (30 coins each)");
                            Item ManaPotion = new Item("Mana Potion", 30 , 1);
                            backpack[bpCount] = ManaPotion;
                            bpCount++;
                        } else if(numChoice == 4) {
                            System.out.println("The merchant only has one potion of madness. It costs 60 coins");
                            Item MadnessPotion = new Item ("Madness Potion", 60, 1);
                            backpack[bpCount] = MadnessPotion;
                            bpCount++;
                        } else if (numChoice == 5){
                            System.out.println("You bid your fairwells to the merchant and carry on");
                            numChoice = 3;
                        }
                    } else if (numChoice == 2){
                        System.out.println("Which item would you like to know more about?");
                        System.out.println("1) Health Potion  2) Iron Sword  3) Mana Potion  4) Potion of madness  5) Exit and continue");
                        numChoice = input.nextInt();
                        if (numChoice == 1){
                            System.out.println("A standard health potion that heals the user by 50 points");
                        } else if (numChoice == 2){
                            System.out.println("A better sword then yours. It increases damage by 10 points");
                        } else if (numChoice == 3){
                            System.out.println("A standard mana potion that increases mana by 50 points");
                        } else if (numChoice == 4){
                            System.out.println("3 random effects, 2 good, 1 bad. Wanna risk it buddy?");
                        } else if (numChoice == 5){
                            numChoice = 3;
                        }
                    }
                    
                }
                
                System.out.println("'Thank you for your trade'. The merchant thanks you and leaves. You press on");
                
                String currentLocation;
                
                if (locationChoice == 1){
                    System.out.println("You arrive at the gates of Valentior!");
                    currentLocation = "Valentior";
                } else if (locationChoice == 2){
                    System.out.println("You arrive at the plains, outside the town of Duskdale!");
                    currentLocation = "Duskdale";
                } else if (locationChoice == 3){
                    System.out.println("You arrive at the tiny village of Ardendale");
                    currentLocation = "Ardendale";
                }
                
                
                
    }
    
    public static void printAttack(){
        System.out.println("1) Attack!   2) Use Item   3) Attempt to Run");
    }
    
    public static void printCityMenu(){
        System.out.println("1) Look for merchants");
        System.out.println("2) Look for a tavern");
        System.out.println("3) Look for a job");
        System.out.println("4) Look for a quest");
        System.out.println("5) Find out information from the inhabitants");
        System.out.println("6) Explore the city");
    }
    
    public static void printTownMenu(){
        System.out.println("1) Look for merchants");
        System.out.println("2) Look for a quest");
        System.out.println("3) Look for a job");
        System.out.println("4) Find out information from the inhabitants");
        System.out.println("5) Explore the town");
    }
    
    public static void printVillageMenu(){}
    
}