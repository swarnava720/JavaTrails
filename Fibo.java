public class Fibo {
    static int rec(int x){
      if(x<=1){
      return x;}
      else {
          return rec(x-1)+ rec(x-2);
      }
    }
    public static void main(String[] args) {
         int n = 15;
        int arr[]= new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i = 2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println(arr[n]);
        System.out.println();
 
        int w= 9;
        System.out.println(rec(w));
    }
}
