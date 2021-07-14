import java.util.Scanner;

public class Simulator {
public static void main(String[] args) {
		Simulator sim = new Simulator();
		sim.somefunction();
		
	}
	
Scanner stringReader = new Scanner(System.in);
		
	public void somefunction() {
		
		
		System.out.println("You are walking up to my house for a tour...");
		System.out.println("You get to the Front Door and see a Doorbell on your left");
		System.out.println("Do you want to Ring the Doorbell or Knock on the door?");
		
		System.out.println("Enter 'ring' or 'knock':");
		String choose = stringReader.nextLine();
		Integer input = 0;
				
		if (choose.equals("ring")) {
			ringDoorBell();			
		}
	
		if (choose.equals("knock")) {
			knockOnTheDoor();		
		}
		
	
		System.out.println("You enter the house and are standing in the foyer");
		System.out.println("Would you like to enter the Living Room(1)?," 
						+ "\nthe Dining Room(2)?" + "\nthe Kitchen(3)?" 
						+ "\nOr head to the exit(5)?");
		
		
		 input = stringReader.nextInt();
				
//		boolean explore = true;
		
		while(input != 5){
//			System.out.println("Enter '1' '2' '3' or '4':");
			input = stringReader.nextInt();
			
//			System.out.println(input);
		
			switch(input) {
			case 1:
			if (input.equals(1)) {
				livingRoom();
				break;
			}
				
			case 2:
			if (input.equals(2)) {
				diningRoom();
				break;
		}
				
			case 3:
			if (input.equals(3)) {
				kitchen();
				break;
		}
				
			case 4:
			if (input.equals(4)) {
				foyer();
				break;
		}
				
			case 5:
			if (input.equals(5)){
				exit();
				break;
			}
			stringReader.close();
		}
		}
	}
		

	
	public void ringDoorBell() {
		System.out.println("Ding Dong!!, Ding Dong!!");
		System.out.println("Sean answers the door and says: "
				+ "\nHello! How are you today?" + "\nAre you ready for your tour?");
		System.out.println("Enter 'yes' or 'no'");
		String ringBell = stringReader.nextLine();
		if(ringBell.equals("yes")) {
			System.out.println("Great! Please come in and I will show you around");
			guestBook();
		}else {
			exit();
			System.out.println("Okay, Thank you for stopping by."
					+ "\nI will talk to you next time you are in the neighborhood!");
			
		}			
	}
	
	
	public void knockOnTheDoor() {
		System.out.println("Knock, Knock!!");
		System.out.println("Sean answers the door and says: "
						+ "\n'Hello! How are you today?" + "\nAre you ready for your tour?");
		System.out.println("Enter 'yes' or 'no':");
		String knockDoor = stringReader.nextLine();
		if(knockDoor.equals("yes")) {
			System.out.println("Great! Please come in and I will show you around");
			guestBook();
		}else {
			exit();
			System.out.println("Okay, Thank you for stopping by."
					+ "\nI will talk to you next time you are in the neighborhood!");	
			
		}
	
	}
	
	
	public void foyer() {
		
		System.out.println("We walk to the foyer");
		System.out.println("There is a guest book sitting on an end table by the door");
		guestBook();
		System.out.println("What room would you like to see?");
		System.out.println("If we go North, we will be in the Living Room(1)"
							+ "If we head West, we will be in the Dining Room(2)"
							+ "East will take us into the Kitchen(2)"
							+ "And South will take us back outside and exit the game(5).");
		System.out.println("Enter '1' '2' '3' or '5' ");
		Integer foyer = stringReader.nextInt();
		if (foyer.equals(1)) {
			System.out.println("That sounds like a plan, let's head into the Living Room");
			livingRoom();
		}if(foyer.equals(2)) {
			System.out.println("That sounds like a plan, let's head into the Dining Room");	
			diningRoom();
		}if(foyer.equals(3)) {
			System.out.println("That sounds like a plan, let's head into the Kitchen");
			kitchen();
		}if(foyer.equals(5)) {
			exit();
		}
	}
	
	public void livingRoom() {
		
		System.out.println("We go North where we walk into the Living Room");
		System.out.println("You notice a nice and comfortable looking couch");
		System.out.println("You ask 'Can I sit on your couch to see how comfortable it is?'");
		System.out.println("Sean replies,'Of Course! Mi casa es su casa!'");
		couchSit();	
		System.out.println("Let's go back to the Foyer");
		System.out.println("What room would you like to see now?");
		System.out.println("If we go North, we will be in the Living Room(1)"
							+ "\nIf we head West, we will be in the Dining Room(2)"
							+ "\nEast will take us into the Kitchen(3)"							
							+ "\nAnd South will take us back outside and exit the game(5).");
		System.out.println("Enter '1' '2' '3' or '5'");
		Integer living = stringReader.nextInt();
		if(living.equals(1)) {
			System.out.println("Perfect! Let's head into the Living Room");
			livingRoom();
		}if(living.equals(2)){
			System.out.println("Perfect! Let's head into the Dining Room");
			diningRoom();
		}if(living.equals(3)) {
			System.out.println("Perfect! Let's head into the Kitchen");
			kitchen();
		}if(living.equals(5)) {
			exit();
		}
	}
	
	
	public void diningRoom() {
		
		System.out.println("We walk into the Dining Room");
		System.out.println("You notice a large and very elaborate table");
		System.out.println("As you sit down at the dining room table," + "You ask 'So, what do you have to eat?'");
		tableEat();
		System.out.println("Let's go back to the Foyer");
		System.out.println("What room would you like to see now?");
		System.out.println("If we go North, we will be in the Living Room(1)"
				+ "\nIf we head West, we will be in the Dining Room(2)"
				+ "\nEast will take us into the Kitchen(3)"
				+ "\nAnd South will take us back outside and exit the game(5).");
		System.out.println("Enter '1' '2' '3' or '5'");
		Integer dining = stringReader.nextInt();
			if(dining.equals(1)) {
				System.out.println("Perfect! Let's head into the Living Room");
				livingRoom();
			}if(dining.equals(2)){
				System.out.println("Perfect! Let's head into the Dining Room");	
				diningRoom();
			}if(dining.equals(3)) {
				System.out.println("Perfect! Let's head into the Kitchen");
				kitchen();
			}if(dining.equals(5)) {
				exit();
			}
	}
	
	public void kitchen() {
		
		System.out.println("We head into the Kitchen");
		System.out.println("'What a beautifully designed kitchen!'");
		System.out.println("'May I have a drink of water?" + "\nYes, of course!");
		drink();
		System.out.println("Let's go back to the foyer");
		System.out.println("What room would you like to see now?");
		System.out.println("If we go North, we will be in the Living Room(1)"
				+ "\nIf we head West, we will be in the Dining Room(2)"
				+ "\nEast will take us into the Kitchen(3)"
				+ "\nAnd South will take us back outside and exit the game(5).");
		System.out.println("Enter '1' '2' '3' or '5'");
		Integer kitchen = stringReader.nextInt();
			if(kitchen.equals(1)) {
				System.out.println("Perfect! Let's head into the Living Room");
				livingRoom();
			}if(kitchen.equals(2)){
				System.out.println("Perfect! Let's head into the Dining Room");	
				diningRoom();
			}if(kitchen.equals(3)) {
				System.out.println("Perfect! Let's head into the Kitchen");
				kitchen();
			}if(kitchen.equals(5)) {
				exit();
			}
	}
	
	public void exit() {
		System.out.println("That's too bad you have to leave! I was hoping to show you the rest of the property! "
				         + "\nHave a Great day and come back soon!");
	}
	
	public void tableEat() {
		System.out.println("\t>NOM!! NOM!! NOM!!<");
		System.out.println("Wow! That was delicious! Thank you!");
	}
	
	public void couchSit() {
		System.out.println("'IIIIIIKEA! That is one comfortable couch!'" + "\n\t>******Snoring******<");
		System.out.println("Sir, can you please wake up so we can finish our tour?");
	}
	
	public void drink() {
		System.out.println("\t>******Glug, Glug, Glug******<"
					   + "\n\t>******AAAAAAAHHHHHHHHH******<" + "\nThank you so much!"
					   + "\nThat was some pretty good water!");
	}
	
	public void guestBook() {
		System.out.println("You ask, 'Do you mind if I sign your guest book?" + "\nNot at all. Please do!" 
					     + "\n\t>******Scribble Scribble Write Write******<");
	}
	
	
	
	
	}


