public class Sumofthenaturalnum {
    // public static void Sum(int i,int n,int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.println("Sum of the first 10 natural numbers = "+sum);
    //         return;
    //     }
    //     sum+=i;
    //     Sum(i+1, n, sum);
    //     // System.out.println(sum);
    // public static int factorial(int n){
    //     if(n==1||n==0){
    //         return 1;
    //     }
    //     int fact_nm1=factorial(n-1);
    //     int fact=fact_nm1*n;
    //     return fact;

    // }
    //Sum of the fibonacci series//
    // public static int Fib(int n){
    //     if(n<=1)
    //         return n;
    //     return Fib(n-1)+Fib(n-2);
    // }
    public static void Fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        Fibonacci(b, c, n-1);
    }
    public static void main(String[] args){
        // Sum(5,10,0);
        // int ans=factorial(5);
        // System.out.println("factorial of 5 = "+ans);
        // int n=9;
        // System.out.println(Fib(n));
        int a=0, b=1;
        int n=7;
        Fibonacci(a, b, n-2);     
    }
    
}
