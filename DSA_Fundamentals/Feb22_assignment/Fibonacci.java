import java.util.*;
public class Fibonacci {
    public static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }
    public static void main(String[] args){
        int a=1, b=1;
        // int n=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();        
        System.out.println(b);
        fibonacci(a, b, n-2);  
    }
}
