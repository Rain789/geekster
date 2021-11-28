import java.util.Scanner;
public class positivearray {

        public static void main(String[] args){
            int[] array = new int[10];
            int sum=0;
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number");
            for(int i=0;i<array.length;i++){
                array[i]=s.nextInt();
            }
            System.out.println("positve integer is: ");
            for(int i=0;i<array.length;i++){
                if(array[i]>0)
                    System.out.println(array[i]);
            }
        }
}
