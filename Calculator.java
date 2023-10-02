
// Student Name
import java.util.*;

public class Calculator {
   public static void main(String[] args) {
      // declare and initialize variables
      int choice = 0;
      double operand1 = 0.0;
      double operand2 = 0.0;

      // get user input
      Scanner input = new Scanner(System.in);

      System.out.println("Calculator Options:");
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");

      System.out.print("Enter your choice (1-4): ");

      try {
         choice = input.nextInt();

         if (choice < 5 && choice > 0) {
            input.nextLine(); // clear newline from stream

            System.out.print("Enter operand 1: ");
            if(input.hasNextDouble())
            {
               operand1 = input.nextDouble();
            }
            else{
               
               operand1 = 0;
            }
            input.nextLine();  // clear stream of newline and bad data (if any)

            System.out.print("Enter operand 2: ");
            if(input.hasNextDouble())
            {
               operand2 = input.nextDouble();
            }
            else{
               operand2 = 0;
            }
            input.nextLine(); // clear stream of newline and bad data (if any)
         }
         else{
            System.out.println("Invalid Choice");
         }

      } catch (Exception ex) {
         System.out.println("Invalid choice");
      }
      // process user input
      if (choice == 1) // add
      {
         double result = operand1 + operand2;
         System.out.println(operand1 + " + " + operand2 + " = " + result);
      } else if (choice == 2) // subtract
      {
         double result = operand1 - operand2;
         System.out.println(operand1 + " - " + operand2 + " = " + result);
      } else if (choice == 3) // multiply
      {
         double result = operand1 * operand2;
         System.out.println(operand1 + " * " + operand2 + " = " + result);
      } else if (choice == 4) // divide
      {
         double result = operand1 / operand2;
         System.out.println(operand1 + " / " + operand2 + " = " + result);
         System.out.println(result);
      }
      input.close();
   }
}