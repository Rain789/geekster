import java.util.Scanner;
public class Dowhilefact {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char ch;
        do{
            System.out.println("Enter any number");
            int fact=1;
            int a =s.nextInt();
            for(int i=1;i<=a;i++){
                fact =fact*i; 
            }
            System.out.println(fact); 
            System.out.println("Do yo want continue Y/N ?");
            ch= s.next().charAt(0);
        }
        while(ch=='y'||ch=='Y');
        s.close();
        
    }
}
