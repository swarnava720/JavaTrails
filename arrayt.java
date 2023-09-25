import java.util.*;
public class arrayt {
    public static void main (String [] args){
        System.out.print("Enter array length :");
        Scanner sc = new Scanner(System.in);
        int L =0;
         if (sc.hasNextInt()) {
             L = sc.nextInt();
        } 
        int arr[]=new int[L];
         System.out.println("Enter array Elements");

        for(int i =0;i<L;i++){
                       arr[i]=sc.nextInt();
                    
        }
        int sum = 0;
        
        for(int  element : arr){
            sum += element;
        }
        int product = 1;
        for (int element : arr){
            product *= element;
        }
        double average= (sum/L);
        System.out.println(product+" is the product of array elements");
        System.out.println(sum+" is the sum of array elements");
         System.out.println(average+" is the average of array elements");
    }
}}
