import java.util.Scanner;
public class Stack {
    int[] st= new int[5];
    int top;
    Stack()
    {
        top=-1;
    }
    Scanner in = new Scanner(System.in);
    void push()
    {
        if(top==4)
        {
            System.out.println("Stack overflow");
            return;
        }
        int num;
        System.out.println("Enter data");
        num=in.nextInt();
        st[++top]=num;
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return;
        }
        int num;
        num=st[top--];
        System.out.println("Poped element is: "+ num);
    }
    void display(){
        System.out.println("Elements in stack are:");
        for(int i=0;i<=top;i++)
            System.out.print(st[i]+"\t");
    }
    
    public static void main(String [] args)
    {
        int ch=0;
          Scanner in = new Scanner(System.in);
        Stack S1= new Stack();
        while(ch!=4)
        {   
            System.out.println("Enter your choice");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. display");
            System.out.println("4. exit");
            ch=in.nextInt();
            switch(ch)
            {
                case 1: S1.push();
                        break;
                case 2:S1.pop();
                        break;
                case 3: S1.display();
                        break;
                case 4: break;
            }
        }
    }
}
