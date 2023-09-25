
public class Conversion {
     void decimalToBinary(int d) {
        int arr[]=new int[10];
        int i=0;
        while(d>0){
          arr[i]=d%2;
          d=d/2;
          i++;
        }
        int count=0;
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            if (arr[i]==1){
                count++;
            }
            ;
        }
        System.out.println();
        System.out.println("The no. of bits are  :"+ count);

    }
        void binaryToDecimal(int x){
        double power=0;
        double sum = 0;
        while(x>0){
            double r = x%10;
               sum = sum + r*Math.pow(2,power);
               x= x/10;
               power++;
        }
        System.out.println(sum);

    }
    void binaryToDecimal2(int [] arr){
        int i;
        double sum = 0;
        for(i=0;i<arr.length-1;i++){
              sum = sum + arr[i] * Math.pow(2,arr.length-i-1);
        }
        System.out.println(sum);
    }
}
