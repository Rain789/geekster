import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int fact=1;
        int a =s.nextInt();
        for(int i=1;i<=a;i++){
            fact =fact*i; 
        }
        System.out.println(fact);
    }
}