import java.util.*;
public class Pattern17 {
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
        }*/
       
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
