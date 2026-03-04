class Vehicle{
    void run(){
        System.out.println("Vehicle is running ");
    }
}
class bike extends Vehicle{
    void run (){
        System.out.println("Bike is running ");
    }
}
public class Overridings {
    public static void main (String[] args){
        bike obj =new bike ();
        Vehicle obj2=new Vehicle();
        obj.run();
        obj2.run();
    }   
}
