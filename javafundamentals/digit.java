import java.util.Scanner;
public class digit {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number");
        int numlength= s.nextInt();
        int count = 0;
        while(numlength>0){
            numlength = numlength/10;
            count++;
        }
        if(count>=1 && count<5){
            System.out.println("you have entered "+count+" Digit number");
        }
        else{
            System.out.println("number is too big");
        }

    }
    
}
