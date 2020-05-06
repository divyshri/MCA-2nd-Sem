import java.util.*;

public class Stack_Example{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size,top=-1,choice;
        System.out.println("Enter the size of the stack");
        size = scan.nextInt();
        int[] stack = new int[size];
        boolean flag=true;
        while(flag)
        {
            System.out.println("Enter your choice to perform following actions");
            System.out.println("1. Push the element into the stack");
            System.out.println("2. Pop the element from the stack");
            System.out.println("3. Display the elments in the stack");
            System.out.println("4. Exit the program");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    if(top==size-1)
                        System.out.println("Stack is full element cannot be inserted");
                    else
                    {
                        System.out.println("Enter element to push into stack");
                        stack[++top] = scan.nextInt();
                    }
                    break;
                case 2:
                    if(top==-1)
                        System.out.println("Stack if empty");
                    else
                        System.out.println("Popped element is "+ stack[top--]);
                    break;
                case 3:
                    if(top==-1)
                        System.out.println("Stack is empty");
                    else
                    {
                        System.out.println("Elements in the stack are - ");
                        for(int i=top;i>=0;i--)
                            System.out.println(stack[i]);
                        System.out.println();
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect Choice please try again");
            }          
        }
    }
}