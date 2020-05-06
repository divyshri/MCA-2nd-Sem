import java.util.*;
public class Patten_5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int limit,space;
        System.out.println("Enter the limit");
        limit = scan.nextInt();
        
        space = limit;
        for(int i=1;i<=limit;i++)
        {
            for(int j=1;j<=space;j++)
                System.out.print("   ");
            space--;
            int z=1;
            for(int k=1;k<=2*i-1;k++){
                if(k <= (2*i-1)/2){
                    System.out.print(" "+z+" ");
                    z++;
                }
                else{
                    System.out.print(" "+z+" ");
                    z--;
                }
            }
            System.out.println();
        }
        space =2;
        for(int i=1;i<=limit;i++)
        {
            for(int j=1;j<=space;j++)
                System.out.print("   ");
            space++;
            int z=1;
            for(int k=1;k<=2*(limit-i)-1;k++){
                if(k <= (2*(limit-i)-1)/2){
                    System.out.print(" "+z+" ");
                    z++;
                }
                else{
                    System.out.print(" "+z+" ");
                    z--;
                }
            }
            System.out.println();
        }
        
        
    }
    
}
