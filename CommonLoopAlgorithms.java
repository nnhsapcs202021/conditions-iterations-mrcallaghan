import java.util.Scanner;

public class CommonLoopAlgorithms
{

    /*
     * Loop Algorithm #1: Average
     * reads a series of numbers (ends with a letter)
     * calculates the average of the numbers
     * @return the average of the numbers
     */
    public static double average()
    {

        Scanner s = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while(s.hasNextDouble()) {
            System.out.println("Enter an int or double, or enter a letter to end.");
            double numberinput = s.nextDouble();
            sum = sum + numberinput;
            count++;
        }

        return sum/count;
    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter a series of numbers: ");
        int counter = 0;
        while (s.hasNextInt())
        {
            int num = s.nextInt();
            if (num > 100)
            {
                counter++; 
            }
        }
        return counter;
    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a series of words separated by spaces: ");
        String str = "";
        int i = -1;
        while (str.length() <= 5)
        {
            str = s.next();
            i++;
        }
        return i;
    }

    /*
     * Loop Algorithm #4: Prompting until a Match Is Found
     * prompts the user to enter a positive integer less than 100
     * reads the number
     * continues to prompt the user until the number matches the criteria
     * @return the number that matched the criteria
     */
    public static int promptUntilMatch()
   {
       Scanner s = new Scanner(System.in); // creates a new Scanner object
        System.out.print("Enter a number: "); // prompts user to enter number
        int num = s.nextInt();
       while (num>100 || num <0) // if number is > 100 or is negative, the loop runs
       {
           System.out.print("Enter a new number: "); // prompts user to enter a new number
           num = s.nextInt();
        }
        return num; // returns the number that is positive and less than 100
   }


    /*
     * Loop Algorithm #5: findMax
     * reads a series of numbers (ends with a letter)
     * @return the greatest number
     */
    public static int findMax() 
    {
        int num = 0;
        int max = -1000000000;  // Integer.min;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("Enter a number, enter a letter to stop: ");
            num = scan.nextInt();
            if (num  > max)
            {
                max = num;
            }

        } while (scan.hasNextInt());
        return max;
    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in); // creates a Scanner object
        System.out.println("Enter numbers, system will return the number you enter twice in a row and stop the program: "); // input prompt for the user
        int previousNumber = s.nextInt();
        int currentNumber = s.nextInt();
        while (previousNumber != currentNumber) // Keep the program running as long as 2 integers aren't entered in a row that are the same
        {
            previousNumber = currentNumber; // keeps updating the value of the variables to cycle through the integers
            currentNumber = s.nextInt();
        }

        return currentNumber; // return statement
    }

    /*
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit on its own line.
     * @return the adjacent duplicate number that was entered
     */
    public static void identifyDigits(int intValue)
    {
    }
}