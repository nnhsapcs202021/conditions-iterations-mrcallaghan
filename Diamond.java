import java.util.Scanner;

public class Diamond
{
    public static void main( String[] args )
    {
        /*
         *  		side length = 4
         *  		   row    spaces      stars
         *     *  		1       3           1
         *    ***  		2       2           3
         *   *****		3       1           5
         *  *******		4       0           7
         *   *****		3       1           5	(start of bottom)
         *    ***		2       2           3
         *     *		1       3           1
         */

        Scanner scan = new Scanner( System.in );
        System.out.print( "Enter the side length for the diamond: " );
        int sideLength = scan.nextInt();

        // top of diamond
        for(    int row = 1; row <= sideLength; row++ )
        {
            for(    int spaces = 0; spaces < sideLength - row; spaces++ )
            {
                System.out.print( " " );
            }

            for(    int stars = 0; stars < row * 2 - 1;  stars++ )
            {
                System.out.print( "*" );
            }

            System.out.println();
        }

        // bottom of diamond
        for(    int row = sideLength - 1; row >= 1;  row-- )
        {
            for(    int spaces = 0; spaces < sideLength - row; spaces++ )
            {
                System.out.print( " " );
            }

            for(    int stars = 0; stars < row * 2 - 1;  stars++ )
            {
                System.out.print( "*" );
            }

            System.out.println();
        }
    }
}
