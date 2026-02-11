public class Methods {
static void greet(){
System.out.println("Hello");
}
void farewell(){
    System.out.println("Good bye");
}
  public static void main(String args[]) {
    Methods obj=new Methods();
    obj.farewell();
    Methods.greet();

  }
}
