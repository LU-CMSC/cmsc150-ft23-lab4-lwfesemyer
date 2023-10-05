import java.util.Random;
import java.util.Scanner;

public class NewerRandomNumber {
    public static void main (String[] args) {
        
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int input;
    
        int rand = random.nextInt(100)+1;

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        input = in.nextInt();
        if(input<rand){
            System.out.println("Your guess was too low.");
            System.out.print("Type a number: ");
            input = in.nextInt();
            if (input<rand){
                System.out.println("Your guess was too low.");
                System.out.print("Type a number: ");
                input = in.nextInt();
                if (input<rand){
                System.out.println("Your guess was too low.");
                }
                else if (input>rand){
                System.out.println("Your guess was too high.");
                }
                else if (input==rand){
                    System.out.println("Yippee!");
                }    
            }
            else if (input>rand){
                System.out.println("Your guess was too high.");
                System.out.print("Type a number: ");
                input = in.nextInt();
                if (input<rand){
                System.out.println("Your guess was too low.");
                }
                else if (input>rand){
                System.out.println("Your guess was too high.");
                }
                else if (input==rand){
                    System.out.println("Yippee!");
                }    
            }
            else if (input==rand){
                System.out.println("Yippee!");
            }
        }
        else if (input>rand){
            System.out.println("Your guess was too high.");
            System.out.print("Type a number: ");
            input = in.nextInt();
            if (input<rand){
                System.out.println("Your guess was too low.");
                System.out.print("Type a number: ");
                input = in.nextInt();
                if (input<rand){
                System.out.println("Your guess was too low.");
                }
                else if (input>rand){
                System.out.println("Your guess was too high.");
                }
                else if (input==rand){
                    System.out.println("Yippee!");
                }
            }
            else if (input>rand){
                System.out.println("Your guess was too high.");
                System.out.print("Type a number: ");
                input = in.nextInt();
                if (input<rand){
                System.out.println("Your guess was too low.");
                }
                else if (input>rand){
                System.out.println("Your guess was too high.");
                }
                else if (input==rand){
                    System.out.println("Yippee!");
                }
            }
            else if (input==rand){
                System.out.println("Yippee!");
            }            
        }
        else if (input==rand){
            System.out.println("Yippee!");
        }
        in.close();

        System.out.println("The real number was: " + rand);

    }

}
