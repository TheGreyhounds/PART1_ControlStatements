import java.util.Scanner;

public class ControlStatements {
        public static void main(String[] args){
                // Scanner object allows for input from terminal
                Scanner keyboard_input = new Scanner(System.in);
                System.out.print("Enter first number: ");
                double variableOne = keyboard_input.nextDouble();
                
                //System.out.println();
                
                System.out.print("Enter second number: ");
                double variableTwo = keyboard_input.nextDouble();
                
                //System.out.println();
                
                //The IF statement will run if the argument provided returns TRUE
                if (variableOne == variableTwo){
                        System.out.println("The first number is equal to the second number");
                }
                 
                //You can also add an else statement to run if the if statement returns false
                if (variableOne > 0) {
                        System.out.println("Number one is positive");
                } else {
                        System.out.println("Number one is negative");
                }
                
                //You can check multiple arguments with the else if statement
                if (variableTwo > 0) {
                        System.out.println("Number two is positive");
                } else if (variableTwo == 0){
                        System.out.println("Number two is equal to 0");
                } else if (variableTwo < 0) {
                        System.out.println("Number two is negative");
                } // ... as many else if statements as you want
                
                else {
                        System.out.println("This will never, ever run.");
                }
                
                // Play around with input values. What happens to the other
                // else if statements if an else if statement above it executes?
              
                for (int k = 0; k < 10; k++) {
                        System.out.println(k);  // Doesn't execute when k == 10, because 10 < 10 != true,
                                                // so the loop doesn't execute again
                }
                
                int a = 5;
                int b = 10;
                
                // This is the ternary operator, and has the form as follows:
                // booleanExpression ? statementIfTrue : statementIfFalse;
                int c = a < b ? a : b;
                System.out.println("C starts with the value " + c);
                
                try {
                        while (c < 10) {
                                System.out.println("C now has the value " + c);
                                Thread.sleep(1000);
                                c++;
                        }
                
                // We run our while-loop in try-catch statement just in case
                // Thread.sleep(1000) throws an InterruptedException, which we
                // "catch," name "ex" and handle in our catch block.
                } catch (InterruptedException ex) {
                        ex.printStackTrace();
                        System.exit(1);
                }
                
                do {
                        System.out.println("Life’s but a walking shadow, a poor player that struts " +
                                           "and frets his hour upon the stage and then is heard no more");
                } while(false);
        }
}
