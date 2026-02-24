// class Employee {
    //float salary=40000;
//}
//class Programmer extends Employee{
  //  int Bonus =10000;
//}
//public class Inheritance{
  //  public static void main (String args[]){
  //      Programmer p=new Programmer();
   //     System.out.println(" Programmer's salary is: "+p.salary);
   //      System.out.println(" Programmer's bonus  is: "+p.Bonus);
  //  }
//}

class Animal{
    void eat(){
    System.out.println(" Eating  ");}
}
class Dog extends Animal {
    void bark (){
        System.out.println("Barking ");}
    }
    public class Inheritance{
    public static void main (String args[]){
       Dog d=new Dog ();
        d.eat();
       d.bark();
    }
    }
