class Student{
    int id;
    String name;
    float marks;

    public void insert(int i, String n , float m){
        id=i;
        name =n;
        marks=m;
        System.out.println("student Added");

    }
    public void show(){
        System.out.println("ID "+id);
          System.out.println("NAME "+name);
            System.out.println("MARK "+marks);

    }

}


public class Object {
    public static void main(String args[]){
        Thsi s1 =new Thsi();
        s1.id=101;
        s1.name="Jhon";
        s1.marks=65.8f;
        Thsi s2=new Thsi();
        s2.insert(102,"Nick",89.4f);
        s1.show();
        s2.show();
    }
    
}
