public class ReverseNum {
    public static void Revers(int n){
        if(n<10){
        System.out.println(n);
        return;}
        else{
            System.out.print(n%10);
            Revers(n/10);
        }
    }
    public static void main(String[] args){
        int n=65123;
        System.out.println("Reverse Number is:");
        Revers(n);
    }
}
