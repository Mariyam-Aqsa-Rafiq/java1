package Strings;

import java.util.concurrent.atomic.AtomicLongArray;

class employee{
    private int salary;
    String emp_name="Riya";
    String emp_dept="IT";

    //settter and getter methods
    //setter -- used to assign the value to the private data member of the class
    public void setData(int sal)
    {
        salary=sal;
    }

    //getter() -- used to return yhe value stored in the private data member
    public int getData()
    {
        return salary;
    }
}
public class demo {
    public static void main(String[] args) {
        employee e=new employee();
        System.out.println(e.emp_name);
        System.out.println(e.emp_dept);
        //System.out.println(e.salary);
        e.setData(100000);
        System.out.println(e.getData());
    }
}
