package Strings;

public class customer{
    private int atm_pin;
    String c_name="Shreya";
    int acc_no=20001980;

    public void setData(int pin){
        atm_pin=pin;
    }


    public int getData()
    {
        return atm_pin;
    }
}
public class bank {
    public static void main(String[] args) {
        customer b=new customer();
        System.out.println(b.c_name);

    }
}

