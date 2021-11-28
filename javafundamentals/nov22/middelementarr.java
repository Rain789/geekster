import java.util.Scanner;
public class middelementarr {
    public static void main(String[] args){
        int[] array = new int[10];
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
        }
        int num = (array.length)/2;
        if(num % 2==0){

            for(int i=0;i<num;i++){
                System.out.println(array[i]);
            }
        }
            else{
                System.out.print("middle element is: ");
                System.out.println(array[num]);
            }
            s.close();
        }
    }
