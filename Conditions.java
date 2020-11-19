
/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author mrcallaghan
 * @version 19nov2020
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int)(Math.random() * 2);

        /*
         * if statement
         *  Statements are executed if the conditional expression is true.
         *  
         *  Conditional expressions evaluate to either true or false.
         *  The conditional expression must go inside of parentheses.
         *  Statements are grouped by blocks (i.e., { }), not by indentation like in Python.
         *  There is no colon after the conditional expression, unlike Python.
         * 
         */
        if (coinFlip == 1)
        {
            System.out.println("Coin is heads!");

        }
        
        /*
         * if-else statement
         *  The else block is executed if the condition evaluates to false.
         */
        
        if (coinFlip == 1)
        {
            System.out.println("Coin is heads!");

        }
        else
        {
            System.out.println("Coin is tails!");
        }
        
        // model the roll of a four-sided die [1-4]
        int dieRoll = (int)(Math.random() * 4) + 1;
        
        /*
         * if-else if-else statement
         *  In Java, "else if" is used instead of "elif" like Python.
         */
        if (dieRoll == 1)
        {
            System.out.println("rolled a one");
        }
        else if (dieRoll == 2)
        {
            System.out.println("rolled a two");
        }
        else if (dieRoll == 3)
        {
            System.out.println("rolled a three");
        }
        else
        {
            System.out.println("rolled a four");
        }
        
        /*
         * { } are not required for a single statement.
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        if (coinFlip == 0)
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
        
        
        
        
        

    }
}
