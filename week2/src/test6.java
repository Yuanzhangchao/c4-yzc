public class test6 {
    public static void main(String args[]){
        Car car = new Car(4,1150.0,6);
        car.getCar();
        Truck truck = new Truck(6,15000.0,1,7000.0);
        truck.getTruck();
    }
}
class Vehicle{
    private int wheels;
    private double weight;
    Vehicle(int wheels, double weight)
    {
        this.weight = weight;
        this.wheels = wheels;
    }
    public void getWheels(){
        System.out.print("车轮得个数是：" + wheels + "  ");
    }
    public void getWeight(){
        System.out.println("车重：" + weight);
    }
}
class Car extends Vehicle{
    private int loader;
    public Car(int wheels, double weight, int loader){
        super(wheels, weight);
        this.loader = loader;
    }
    public void getCar(){
        getWheels();
        getWeight();
        if(loader <= 5)
            System.out.println("这是一辆小车，能载5人，实载" + loader + "人");
        else
            System.out.println("这是一辆小车，能载5人，实载" + loader + "人,你超员了！");
    }
}
class Truck extends Vehicle{
    private int loader;
    private double payload;
    public Truck(int wheels, double weight, int loader ,double payload){
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }
    public void getTruck(){
        getWheels();
        getWeight();
        if(loader <= 3)
             System.out.println("这是一辆卡车，能载3人，实载" + loader + "人");
        else
             System.out.println("这是一辆卡车，能载3人，实载" + loader + "人,你超员了！");
        if(payload <= 5000)
             System.out.println("这是一辆卡车，核载5000kg，你已装在了" + payload + "kg");
        else
             System.out.println("这是一辆卡车，核载5000kg，你已装在了" + payload + "kg,你超载了！！！");

    }
}