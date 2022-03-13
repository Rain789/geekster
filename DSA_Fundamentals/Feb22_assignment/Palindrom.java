import java.util.*;
public class Palindrom {
    static boolean isPalRec(String str, int a,int b){
        if(a==b)
        return true;
        
        if((str.charAt(a))!=(str.charAt(b)))
        return false;
        if(a<b+1)
        return isPalRec(str, a+1, b-1);
        return true;
    }
    static boolean isPalindrome(String str){
        int n=str.length();
        if(n==0)
        return true;
        return isPalRec(str, 0, n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the string:");
        String str=sc.next();
        if(isPalindrome(str))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
