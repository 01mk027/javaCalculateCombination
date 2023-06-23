import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Creating varibles and instance of Scanner class
        int n, r;
        Scanner input = new Scanner(System.in);

    //Getting values from user via keyboard
        System.out.println("Enter the number of cluster elements: ");
        n = input.nextInt();

        System.out.println("Enter the number of elements of subset: ");
        r = input.nextInt();
    //Factorial of n and r are defined as double, because capacity of integer type is not proper for big numbers.
        double nFact = 1, rFact = 1, nminusrFact = 1, comb;
    
    //Calculating nFact
        for(int i=1; i<=n; i++)
        {
            nFact *= i;
        }
    //Calculating rFact
        for(int j=1; j <= r; j++)
        {
            rFact *= j;
        }
    //Calculating nminusrFact
        for(int k=1; k <= (n-r); k++)
        {
            nminusrFact *= k;
        }

    //Calculating C(n, r)
        comb = nFact / (rFact * nminusrFact);
    
    //Printing result to screen
        System.out.println("Calculated combination = " + comb);
    }
}
