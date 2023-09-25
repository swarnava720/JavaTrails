import java.util.*;
class prime{
    public static void main(String[] args) {
        System.out.println("enter number  :");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
         int flag = 1;
        for (int i = 2;i<n;i++){
            if(n%i==0){
             flag = 0;
            }
            
        }
        if (flag==1){
            System.out.println("prime");
        }
        else{
            System.out.println("non prime");
        }
    }
}