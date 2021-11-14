import java.util.Scanner;
public class rain{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int n=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i); 
        }
        
    }
}