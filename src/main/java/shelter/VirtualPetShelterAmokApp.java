package shelter;

import java.util.Scanner;

public class VirtualPetShelterAmokApp {

	public static void main(String[] args) {

		PetShelter shelter = new PetShelter();

		VirtualPet percy = new OrganicCat("Percy, an organic Cat", 2, 5, 8, 9);
		VirtualPet hermoine = new OrganicCat("Hermoine, and organic Cat", 3, 7, 5, 2);
		VirtualPet tofu = new OrganicDog("Tofu, an organic dog", 1, 5, 8, 3);
		VirtualPet hershey = new OrganicDog("Hershey, an organic dog", 2, 2, 2, 2);
		VirtualPet calino = new RoboCat("Calino, a robotic cat", 4, 6, 2, 4);
		VirtualPet tinker = new RoboCat("Tinker, a robotic cat", 5, 6, 7, 9);
		VirtualPet spotbot = new RoboCat("Spotbot, a robotic dog", 2, 4, 6, 4);
		VirtualPet toro = new RoboCat("Toro, a robotic dog", 2, 3, 5, 9);
		shelter.addPet(percy);
		shelter.addPet(hermoine);
		shelter.addPet(tofu);
		shelter.addPet(hershey);
		shelter.addPet(calino);
		shelter.addPet(tinker);
		shelter.addPet(spotbot);
		shelter.addPet(toro);

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Paws With A Cause Pet Shelter!");
		System.out.println();

		String userInput = "";
		while (!userInput.equals("7")) {

			System.out.println("Here are your options...");
			System.out.println("1.Feed all the  organic pets in the shelter.");
			System.out.println("2. Give all the  organic pets in the shelter water. ");
			System.out.println("3. Play with one pet.");
			System.out.println("4. Clean all the dog cages.");
			System.out.println("5. Clean all the litterboxes.");
			System.out.println("6. Give oil to the robotic pets.");
			System.out.println("7. Leave the shelter");
			System.out.println("What would you like to do?");
			userInput = input.nextLine();
			
				if (userInput.equals("1")) {
					shelter.feedAllOrganicPets(null);
					System.out.println("You fed all the organic pets. ");
					System.out.println();
					input.nextLine();
				} else if (userInput.equals("2")) {
					shelter.waterAllOrganicPets();
					System.out.println("You gave water to all the organic pets. Press Enter");
					System.out.println();
					input.nextLine();
}			
				else if (userInput.equals("3")) {

					System.out.println("Which pet would you like to play with?");
					System.out.println("percy");
					System.out.println("hermoine");
					System.out.println("tofu");
					System.out.println("hershey");
					System.out.println("calino");
					System.out.println("tinker");
					System.out.println("spotbot");
					System.out.println("toro");
					input.nextLine();
					System.out.println("You played with a pet. Yay!");
				}
				else if(userInput.equals("4")) {
					shelter.cleanCages();
					System.out.println("You cleaned out all the cages");
					input.nextLine();
					
				}else if(userInput.equals("5")) {
					shelter.cleanLitterBox();
					System.out.println("You cleaned all the litterboxes");
				}
				else if (userInput.equals("6")) {
					shelter.oilAllRoboPets();
					System.out.println("You oiled down all the robotic pets");
					System.out.println();
					input.nextLine();
				}
				else if (userInput.equals("7")) {
					System.out.println("Bye for now! Thanks for stopping in!");
				}
			}
	shelter.tick();		
	}
	
}