import java.util.*;
public class GCD {
    public static int gcd(int n1,int n2){
        if(n2!=0)
        return gcd(n2,n1%n2);
        else
        return n1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st value:");
        int n1=sc.nextInt();
        System.out.println("Enter the 2nd value:");
        int n2=sc.nextInt();
        System.out.println("GCD of n1 and n2 is "+gcd(n1, n2));
        gcd(n1, n2);
    }
}
