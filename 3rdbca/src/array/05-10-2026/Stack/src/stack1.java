import java.util.Stack;

public class stack1 {
    int stack[]=new int[5];
    int top=-1;

    void push(int data)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }

    void peek()
    {

    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        stack1 s=new stack1();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.push(60);
        s.pop();
        s.display();

        //System.out.println(s);
    }
}
