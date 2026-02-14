class Static{
   static String  div = 'ITS';
   String name ;
   
   Static(String d,String s){
    div=d;

    name=s;
   }

    void display ()System.out.println(div+" "+name);

}
   
   public class Main{
   public static void  main (String []args){
    Static s1 = new Static ("Pallavi");
     Static s2 = new Static ("Snehal");
     s1.display();    
 s2.display();    
   }
}
}
