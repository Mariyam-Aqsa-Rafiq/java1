public class circular {
    int queue[];
    int front;
    int rear;
    int capacity;
    int size;

    public circular(int capacity)
    {
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    void add(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    int poll()
    {
        if(size==0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        queue[front]=-1;
        front=(front+1)%capacity;
        size--;
        return value;
    }
    void display()
    {
        for(int i=0;i<capacity-1;i++)
        {
            if(queue[i]==-1)
            {
                System.out.println("-"+" ");
            }
            else {
                System.out.println(queue[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circular q=new circular(5);

        q.add(10);
        q.add(20);
        q.display();
        q.add(30);
        q.add(40);
        q.display();
        q.add(50);
    }
}
