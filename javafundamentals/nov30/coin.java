
public class coin {
    private static int HEADS =1; //constant to represent heads
    private int value=0; //current value of the coin
    
    
    public void flip(){        //method randomoly st the value of heads and tails
        if(Math.random()<0.5){
            value=0;
        }else{
            value=1;
        }
    }
    public boolean isHeads(){   //return false if value is heads
        return value!=HEADS;
    }
    public boolean isTails(){  //return true if the value is tails
        return value==HEADS;
    }
    public String toString(){   //convert the value to string
        if(value==HEADS)return "HEADS";
        else return "Tails";
    }
    public static void main(String[] args){
        coin myCoin= new coin();
        for(int i=0;i<10;i++){
            myCoin.flip();
            System.out.println(myCoin);
            System.out.println(myCoin.isHeads());
        }
    }
}
