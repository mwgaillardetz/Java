import java.util.Scanner;
import java.util.Random;




public class Main {
	
	public static void main(String [] args) {
		
		
		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//Game variables
		String[] enemies = {"skeleton", "zombie", "dirty B"};
		int maxEnemyHealth = 30;
		int enemyAttackDamage = 25;
		
		
		//Player variables
		int health = 100;  //player health
		int attackDamage = 50;  //player attack damage
		int numHealthPotions = 3;  //number of health potions character starts out with
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 50; //drop rate %
		
		boolean running = true;
		
		System.out.println("AAA                                         tttt            iiii                                            BBBBBBBBBBBBBBBBB                                              tttt                                                           d::::::d                222222222222222                           000000000     ");
		System.out.println("A:::A                                     ttt:::t           i::::i                                           B::::::::::::::::B                                          ttt:::t                                                           d::::::d               2:::::::::::::::22                       00:::::::::00  "); 
		System.out.println("A:::::A                                    t:::::t            iiii                                             B::::::BBBBBB:::::B                                         t:::::t                                                           d::::::d               2::::::222222:::::2                    00:::::::::::::00"); 
		System.out.println("A:::::::A                                   t:::::t                                                             BB:::::B     B:::::B                                        t:::::t                                                           d:::::d                2222222     2:::::2                   0:::::::000:::::::0");
		System.out.println("A:::::::::A            ccccccccccccccccttttttt:::::ttttttt    iiiiiii    ooooooooooo   nnnn  nnnnnnnn              B::::B     B:::::B  aaaaaaaaaaaaa      ssssssssss   ttttttt:::::ttttttt      aaaaaaaaaaaaa  rrrrr   rrrrrrrrr       ddddddddd:::::d                            2:::::2                   0::::::0   0::::::0");
		System.out.println("A:::::A:::::A         cc:::::::::::::::ct:::::::::::::::::t    i:::::i  oo:::::::::::oo n:::nn::::::::nn            B::::B     B:::::B  a::::::::::::a   ss::::::::::s  t:::::::::::::::::t      a::::::::::::a r::::rrr:::::::::r    dd::::::::::::::d                            2:::::2                   0:::::0     0:::::0");
		System.out.println("A:::::A A:::::A       c:::::::::::::::::ct:::::::::::::::::t     i::::i o:::::::::::::::on::::::::::::::nn           B::::BBBBBB:::::B   aaaaaaaaa:::::ass:::::::::::::s t:::::::::::::::::t      aaaaaaaaa:::::ar:::::::::::::::::r  d::::::::::::::::d                         2222::::2                    0:::::0     0:::::0");
		System.out.println("A:::::A   A:::::A     c:::::::cccccc:::::ctttttt:::::::tttttt     i::::i o:::::ooooo:::::onn:::::::::::::::n          B:::::::::::::BB             a::::as::::::ssss:::::stttttt:::::::tttttt               a::::arr::::::rrrrr::::::rd:::::::ddddd:::::d                    22222::::::22                     0:::::0 000 0:::::0");
		System.out.println("A:::::A     A:::::A    c::::::c     ccccccc      t:::::t           i::::i o::::o     o::::o  n:::::nnnn:::::n          B::::BBBBBB:::::B     aaaaaaa:::::a s:::::s  ssssss       t:::::t              aaaaaaa:::::a r:::::r     r:::::rd::::::d    d:::::d                  22::::::::222                       0:::::0 000 0:::::0");
		System.out.println("A:::::AAAAAAAAA:::::A   c:::::c                   t:::::t           i::::i o::::o     o::::o  n::::n    n::::n          B::::B     B:::::B  aa::::::::::::a   s::::::s            t:::::t            aa::::::::::::a r:::::r     rrrrrrrd:::::d     d:::::d                 2:::::22222                          0:::::0     0:::::0");
		System.out.println("A:::::::::::::::::::::A  c:::::c                   t:::::t           i::::i o::::o     o::::o  n::::n    n::::n          B::::B     B:::::B a::::aaaa::::::a      s::::::s         t:::::t           a::::aaaa::::::a r:::::r            d:::::d     d:::::d                2:::::2                               0:::::0     0:::::0");
		System.out.println("A:::::AAAAAAAAAAAAA:::::A c::::::c     ccccccc      t:::::t    tttttt i::::i o::::o     o::::o  n::::n    n::::n          B::::B     B:::::Ba::::a    a:::::assssss   s:::::s       t:::::t    tttttta::::a    a:::::a r:::::r            d:::::d     d:::::d                2:::::2                               0::::::0   0::::::0");
		System.out.println("A:::::A             A:::::Ac:::::::cccccc:::::c      t::::::tttt:::::ti::::::io:::::ooooo:::::o  n::::n    n::::n          B:::::BBBBBB::::::Ba::::a    a:::::as:::::ssss::::::s      t::::::tttt:::::ta::::a    a:::::a r:::::r            d::::::ddddd::::::dd               2:::::2       222222                  0:::::::000:::::::0");
		System.out.println("A:::::A               A:::::Ac:::::::::::::::::c      tt::::::::::::::ti::::::io:::::::::::::::o  n::::n    n::::n          B:::::::::::::::::B a:::::aaaa::::::as::::::::::::::s       tt::::::::::::::ta:::::aaaa::::::a r:::::r             d:::::::::::::::::d               2::::::2222222:::::2      ......       00:::::::::::::00"); 
		System.out.println("A:::::A                 A:::::Acc:::::::::::::::c        tt:::::::::::tti::::::i oo:::::::::::oo   n::::n    n::::n          B::::::::::::::::B   a::::::::::aa:::as:::::::::::ss          tt:::::::::::tt a::::::::::aa:::ar:::::r              d:::::::::ddd::::d               2::::::::::::::::::2      .::::.         00:::::::::00   ");
		System.out.println("AAAAAAA                   AAAAAAA cccccccccccccccc          ttttttttttt  iiiiiiii   ooooooooooo     nnnnnn    nnnnnn          BBBBBBBBBBBBBBBBB     aaaaaaaaaa  aaaa sssssssssss              ttttttttttt    aaaaaaaaaa  aaaarrrrrrr               ddddddddd   ddddd               22222222222222222222      ......           000000000     ");
        
        
        
        
        
        
		
		GAME:
		while(running){
			System.out.println("--------------------");
			
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)]; //generates random enemy from array "enemies"
			System.out.println("\t#" + enemy + " appeared #\n");  //dash t is for tab, dash n is to tell it to move onto next line
			
			while(enemyHealth > 0){
				System.out.println("\tYour HP:" + health);
				System.out.println("\t" +enemy + "HP:" +enemyHealth);
				System.out.println("\n\t What would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health potion");
				System.out.println("\t3. Run!");
				
				String input = in.nextLine();
				if (input.equals("1")){
			    
				   int damageDealt = rand.nextInt(attackDamage);
				   int damageTaken = rand.nextInt(enemyAttackDamage);
				
				   enemyHealth -= damageDealt;
				   health -= damageTaken;
				   
				   System.out.println("You strike" + enemy + " for " + damageDealt + "damage.");
				   System.out.println("You receive " + damageTaken + " in retaliation ");
				   
				   if (health < 1){
					   System.out.println("You have taken too much damage...game over");
					   break;
				   }
				   
				}
				
				else if (input.equals("2")){
					
					if (numHealthPotions > 0){
						health += healthPotionHealAmount;
						numHealthPotions --;
						System.out.println("You drink a healthy protein shake, healing yourself for " +healthPotionHealAmount +
						"\n\t>You now have " + health + "HP"
						+ "\n\t> You have " + numHealthPotions + "potions remaining");
					}
					else{
						System.out.println("\t> You have no more potions left scoundrel");
					}
				}
				
				else if (input.equals("3")){
					
					System.out.println("You fled, coward");
					continue GAME;
				}
			     
                else {
					System.out.println("Invalid command");
				}
				
				if (health < 1) {
					System.out.println("You limp out the dungeon weak from battle");
					break;
				}
				
				System.out.println("------");
				System.out.println(enemy + "was defeated");
				System.out.println("You have " +health + " points left");
				if (rand.nextInt(100) < healthPotionDropChance) {
					numHealthPotions ++;
					System.out.println("The enemy dropped a health potion. you now have" +numHealthPotions+ " potions");
				}
				
				System.out.println("-------------");
				System.out.println("What would you like to do?");
				System.out.println("1. Continue fighting");
				System.out.println("2. Quit");
				
				String Ninput = in.nextLine();
				
				while (!Ninput.equals("1") && !Ninput.equals("2")){
					System.out.println("Invalid command");
					Ninput = in.nextLine();
				}
				
				if (Ninput.equals("1")){
					System.out.println("You continue on your adventure");
				}
				
				if (Ninput.equals("2")){
					System.out.println("You quit");
					break;
				}
				
				System.out.println("Thank you for playing");
				
			}
			
		}
		

	}
}



		
		
		
		
	
