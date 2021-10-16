

    public class largestnumber {
        public static void main(String[] args) {
            System.out.println("Welcome....!");
            System.out.println("Welcome Garima Geekster Class ");
            System.out.println("HTML and java is a good language");
            int _a=12;
            float f=20.2f;
            double d=2.666;
            short s=15;
            String ss="other";
            System.out.println("value of a :"+_a);
            System.out.println("value of f :"+f);
            System.out.println("value of d :"+d);
            System.out.println("value of s :"+s);
            System.out.println("value of string :"+ss);

            int a=20, b=100, c=10, largest;
            //object of the Scanner class

            largest = c > (b > a ? b : a) ? c : ((b > a) ? b : a);
            System.out.println("The largest number is: "+largest);
        }
    }
