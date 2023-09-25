import java.util.*;
class Trail {
 public static void main(String [] args){
   System.out.println("Enter the number of rows  : ");
      Scanner obj = new Scanner(System.in);
        int r = obj.nextInt();
    
     for(int i = 0;i<r;i++){
       for(int j = 0; j<=i;j++){
          System.out.print("*");
         }
      System.out.println(); 
    }
  }
}