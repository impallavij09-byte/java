class Bank{
    int RateofInterest(){
        return 0;

    }
}
class SBI extends Bank {
    int RateofInterest(){
        return 9;
    }
}
class ICIC extends Bank {
    int RateofInterest(){
        return 7;
    }
}
public class Overridding2 {
    public static void main(String[] args) {
        SBI s=new SBI();
        ICIC i=new ICIC();
        System.out.println("SBI Rate of interest " +s.RateofInterest());
        System.out.println("ICIC Rate of interest is " +i.RateofInterest());
    }
    
}
