import java.util.Scanner;
public class OddEvenfunction {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check Odd or Even");
        int num = s.nextInt();
        checkOddEven(num);
        s.close();
    }
    public static int checkOddEven(int num){
        if(num%2==0){
            System.out.println("Entered number was even");
        }
        else{
            System.out.println("Entered number was odd");
        }
        return num;

    }
    
}
