import java.util.Scanner;

public class CommonLoopAlgorithms7
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
        double totalValue = 0.0;
        int count = 0;
        double newInt = 0.0;
        System.out.print("Enter a number (type N to stop the loop): ");
        while(s.hasNextDouble() == true)
        {
            newInt = s.nextDouble();
            totalValue += newInt;
            count++;
            System.out.print("Enter a number (type N to stop the loop): ");
        }
        double average = totalValue/count;
        System.out.println(average);
        return average;

    }

    /*
     * Loop Algorithm #2: Counting Matches
     * reads a series of numbers (ends with a letter)
     * counts the number of numbers that are greater than 100
     * @return the number of numbers that are greater than 100
     */
    public static int countMatches()
    {
        Scanner s= new Scanner(System.in); //Create a new scanner object that reads from the system.in streamline
        int x=0; //initialize our counter variable to 0
        while (s.hasNextInt()) // this loop goes through the user input and checks whether or not the input is an integer.; runs as long as next inputted value is an integer.
        {

            int a = s.nextInt(); // This line takes in the user input as an integer and stores it in a variable.
            if (a > 100) //This if-statement checks if the user input stored in variable a is greater than 100. If it is greater than 100, x increases by a value of 1 (counts 1 more number thant is > 100)
            {

                x++; // increments the counter variable by one, every time an integer inputted is greater than 100, it increases by one.

            }

        }
        return x; //This line of code returns the final count value of x

    }

    /*
     * Loop Algorithm #3: Finding the First Match
     * reads a series of words separated by whitespace
     * continues to read and count words until a word is longer than five characters
     * @return the number of words read before the match
     */
    public static int findFirstMatch()
    {
        Scanner s = new Scanner(System.in); // Setup scanner
        int i = -1; // Setup counter
        int charLong = 0; // Setup Tester
        do
        {
            String word = s.next();// Moves to next word
            charLong = word.length();// Checks word length

            i++; // Increments counter
        } while (charLong <= 5); // Checks Length
        return i; // Return counter

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
        Scanner s = new Scanner(System.in); // creates a ne Scanner object
        System.out.print("Enter a number: "); // prompts user to enter number
        int num = s.nextInt();
        while (num>=100 || num <=0) // if number is > 100 or is negative, the loop runs
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
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter integers one at a time(enter a letter to stop): ");
        int max = s.nextInt(); // set the current max value

        while (s.hasNextInt())
        {
            int next = s.nextInt(); // updates for every integer the user adds
            if (next > max)
                max = next; // updates the current max value

        }
        System.out.println("The max value is: " + max);
        return max;

    }

    /*
     * Loop Algorithm #6: Compare Adjacent Values
     * reads a series of numbers until an adjacent duplicate
     * number is entered
     * @return the adjacent duplicate number that was entered
     */
    public static String compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        int tmp1 = s.nextInt();
        int tmp2;
        while (s.hasNextInt()) {
            tmp2 = s.nextInt();
            if (tmp1 == tmp2) {
                return "" + tmp1;
            }
            tmp1 = tmp2;
        }
        return "no duplicate";

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
