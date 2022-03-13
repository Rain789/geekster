import java.util.*;
public abstract class Factorial {
    public static int factorial(int n){
            if(n==1||n==0){
                return 1;
            }
            int fact_nm1=factorial(n-1);
            int fact=fact_nm1*n;
            return fact;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println("factorial of "+n+" ="+ans);
    }
}
