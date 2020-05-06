import java.util.*;

public class Linear_Array {
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
         int size1,size2;
         System.out.println("Enter size of the firt array");
         size1 = scan.nextInt();
         System.out.println("Enter size of the second array");
         size2 = scan.nextInt();
         int[] x = new int[size1];
         int[] y = new int[size2];
         int[] z = new int[1000];
         System.out.println("Enter elements of the first array");
         for(int i=0;i<size1;i++)
             x[i] = scan.nextInt();
         System.out.println("Enter elements of the second array");
         for(int i=0;i<size2;i++)
             y[i] = scan.nextInt();
         int i=0,j=0,k=0; 
         while(i<size1 && j<size2)
         {
             if(x[i] <= y[j])
             {
                 z[k] = x[i];
                 i++;
                 k++;
             }
             else if(y[j] < x[i])
             {
                 z[k] = y[j];
                 j++;
                 k++;
             }
         }
         while(i<size1)
         {
             z[k] = x[i];
                 i++;
                 k++;
         }
         while(j<size2)
         {
             z[k] = y[j];
                 j++;
                 k++;
                         
         }
         System.out.println("\n\nElements in the final array are");
         for(int q=0;q<k;q++)
             System.out.println(z[q]);
         
         
    }
}
