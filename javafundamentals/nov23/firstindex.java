public class firstindex {
    public static void findfirst(int[] arr, int index){
        int n=-1;
        int i=0;
        while(i<arr.length){
            if(arr[i]==index){
                n=i;
                break;
            }
            i++;
        }
        System.out.println("index of"+index+"is :"+n);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       System.out.println("enter the size of array: ");
       int n=s.nextInt();
       int [] arr=new int[n];
       int index;
       System.out.println("enter the array element:");
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       System.out.println("enter the element those index found: ");
       index=s.nextInt();
       findfirst(arr, index);

    }
    
}
