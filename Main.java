class Static{
   static String  clg = "ITS";
   String name ;
   
   Static(String s){
    name=s;
   }

void display (){System.out.println(clg +" "+name);}

}
   
   public class Main{
   public static void  main (String []args){
    Static s1 = new Static ("Pallavi");
     Static s2 = new Static ("Snehal");

     s1.display();    
 s2.display();    
   }
}

