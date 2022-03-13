import java.util.*;
public class PrintEven {
    public static void Even(int n){
        if(n<=1){
            return;
        }
        if(n%2==0)
        Even(n-2);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("even number:");
        Even(n);
    }
}
