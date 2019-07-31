import java.util.*;

public class Odds {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called \"Odds and Evens\"");

        Scanner myObj = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = myObj.nextLine();  
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");

        boolean choiceFlag;
        choiceFlag = true;
        String choice = myObj.nextLine();


        while (choiceFlag) {

            if (choice.equals("O")) {
                System.out.println(name + " has picked odds! The computer will be evens.");
                break;
            } else if (choice.equals("E")) {
                System.out.println(name + " has picked evens! The computer will be odds.");
                break;
            } else {
                System.out.println(name + "! you have made wrong choice.");
                System.out.print("Choose either O or E, which one do you like? ");
                choice = myObj.nextLine();
                

                continue;
            }
        }


        System.out.println("--------------------------------------------------");
        System.out.println("Let's play the game.");
        System.out.print("How many \"finger(s)\" do you put out? ");
        int userChoice = myObj.nextInt();
        int computerChoice;
        Random rand = new Random();
        int sum=0;
        while (choiceFlag) {
            computerChoice = rand.nextInt(6);
            if(choice.equals("E") && computerChoice%2==0 || choice.equals("O") && computerChoice %2!=0) {
                continue;
            }
            else {
                choiceFlag=false;

            }

        System.out.println("The computer plays number " + computerChoice);
        sum = userChoice + computerChoice;


        System.out.println("Your choice  " + userChoice + " + " + "Computer's choice " + computerChoice + " = " + sum);
        
        }

        /// Determining the winner

        if (choice.equals("E") &&sum%2==0) {
            System.out.println("The sum is even," + name + "won!");
        }

        else if(choice.equals("O") && sum%2!=0) {
            System.out.println("The sum is odd," + name + "won!");
        }

        else
            {
                System.out.println("Computer Won");

            }
        
        }
        }


