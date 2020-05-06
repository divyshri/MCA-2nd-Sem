import java.util.*;
public class Queue {
       public static void main(String[] args)
       {
           Scanner scan  = new Scanner(System.in);
           int size,front=-1,rear=-1;
           System.out.println("Eneter the size of the Queue");
           size = scan.nextInt();
           int[] queue = new int[size];
           int choice;
           boolean flag=true;
           while(flag)
           {
               System.out.println("Enter your choice to perform following actions");
               System.out.println("1. Insert the element into the queue");
               System.out.println("2. Delete the element from the queue");
               System.out.println("3. Display all the elements of the queue");
               System.out.println("4. Exit the program");
               System.out.println("5. Value of rear and front");
               choice = scan.nextInt();
               switch(choice)
               {
                   case 1:
                       if(rear == size-1)
                       {
                           System.out.println("Queue is full cannot insert element");
                       }
                       else
                       {
                           System.out.println("Enter element to insert into the queue");
                           queue[++rear]=scan.nextInt();
                           if(rear==0)
                               front++;
                       }
                       break;
                   case 2:
                       if(front==-1)
                           System.out.println("Queue is empty");
                       else
                       {
                            System.out.println("Deleted element is = " + queue[front++]);
                            if(front>rear)
                                front=rear=-1;
                       }
                       break;
                   case 3:
                       if(front==-1)
                            System.out.println("Queue is empty");
                       else
                       {
                           System.out.println("Elements in the queue are");
                           for(int i=front;i<=rear;i++)
                               System.out.println(queue[i]);
                           System.out.println();
                       }
                       break;
                   case 4:
                       flag=false;
                       break;
                   case 5:
                       System.out.println("Front = " + front + " Rear = " + rear);
                       break;
                   default:
                       System.out.println("Incorrect choice please try again");
               }        
           }
       }
}
