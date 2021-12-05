class Vehicle{
    String model;
    int price;
    int wheel;
    Vehicle(){                      //defaul constructor
        this.model="default_model";
        this.price=2000000;
        this.wheel=4;
    }
    Vehicle(String model, int price, int wheel){           //parameterized const.
        this.model=model;
        this.price=price;
        this.wheel=wheel;
    }
    //set method:
    public void setModel(String model){
        this.model=model;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setWheel(int wheel){
        this.wheel=wheel;
    }
    //get method:
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
    public int getWheel(){
        return wheel;
    }
}
public class Vehicles {
    public static void main(String[] args){
        System.out.println("Bike");
        Vehicle bike = new Vehicle();
        bike.setModel("Suzuki Hayabusa");
        bike.setWheel(2);
        bike.setPrice(200000);
        System.out.println(bike.getModel());
        System.out.println(bike.getPrice());
        System.out.println(bike.getWheel());
        System.out.println();

        //CAR

        System.out.println("CAR");
        Vehicle CAR = new Vehicle();
        CAR.setModel("BMW");
        CAR.setWheel(4);
        CAR.setPrice(2500000);
        System.out.println(CAR.getModel());
        System.out.println(CAR.getPrice());
        System.out.println(CAR.getWheel());
        System.out.println();

        //TRUCK

        System.out.println("Truck");
        Vehicle Truck = new Vehicle();
        Truck.setModel("TATA truck");
        Truck.setWheel(8);
        Truck.setPrice(4000000);
        System.out.println(Truck.getModel());
        System.out.println(Truck.getPrice());
        System.out.println(Truck.getWheel());
        System.out.println();

    }
}
