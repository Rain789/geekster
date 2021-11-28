import java.util.Scanner;
public class arraysum {
    public static void main(String[] args){
        int[] array = new int[10];
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
       
        for(int i=0;i<array.length;i++)
        sum = sum+array[i];{
            System.out.println("sum of the array is: "+sum);
        }
        s.close();


    }
}
