/* Print right_triangle pattern

*
* *
* * *
* * * *
* * * * *

Logic->> 
->> for nth row we need to print stars till n 
*/

public class right_triangle {
    public static void main(String[] args) 
    {
        for(int row=1;row<6;row++)
    {
        for(int col=row;col>=0;col--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
        
    }

    
    
}
