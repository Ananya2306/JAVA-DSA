import java.util.*;
/*
Write a program that asks the user for a number N and a choice C. 
And then give them the possibility to choose between computing the sum and 
computing the product of all integers in the range 1 to N (both inclusive).

If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
 */
public class SumProd {
    public static void main(String[] args) {

        System.out.print("Enter the number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the choice :- ");
        int c = sc.nextInt();

        int sum =0;
        int prod = 1;

      /*   for(int i=1; i<=n; i++) {
        sum = sum+i;
        prod = prod*i;
        }
      */
       
       /*  switch (c) {
            case 1:
            System.out.println(sum);
                break;
            case 2:
            System.out.println(prod);
                break;
            default: 
            System.out.println("-1");
                break;
        }*/
        if(c == 1) {
            for(int i=0; i<n; i++){
                sum = sum+i;
            }
            System.out.println(sum);
        }
        else if(c == 2){
            for(int i=0; i<n; i++){
                prod = prod*i;
            }
            System.out.println(prod);
        }
        else{
            System.out.println("-1");
        }
        
        sc.close();
    }
}
