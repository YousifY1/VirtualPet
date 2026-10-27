import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is Mr. Pickles.");

      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5)
        {
            System.out.println("Happiness: " + happiness);
            System.out.println("Hunger: " + hunger);
            System.out.println("Energy: " + energy);
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
         
         
         if (choice == 1) {
               happiness += 1;
               hunger -= 3;
               System.out.println("I was sooooo hungry...");
          }     
         else if (choice == 2) {
               happiness += 3;
               hunger += 2;  
               energy -= 2;
               System.out.println("That was fun...a little bit.");
          }     
         else if (choice == 3) {
               happiness -= 1;
               hunger += 1;
               energy += 3;
               System.out.println("Szzzzzzzz.....");
          }     
         else if (choice == 4) {
               happiness += 2;
               hunger += 1;
               energy -= 1;
               System.out.println("I feel so clean...time to lay in the mud again!");
          }
          else if (choice == 5) {
               System.out.println("The game has ended.");
          }   
                   

      if (happiness >= 15)
            System.out.println("YOU WIN!");
      if (hunger >= 10)
            System.out.println("Your pet ran away looking for food!");
      if (energy == 0)
            System.out.println("Let's just say that your parents took your pet to a farm. The less you know the better.");
      if (choice == 5)
            System.out.println("You quit.");
   } input.close();
}
}