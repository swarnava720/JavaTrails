public class digit {
    public static void main(String[] args) {
        int n = 1098965;int sum = 0;int arr[]=new int[10];int i=0;
        while(n>0){
        int x =n%10;
        sum += x;
        arr[i]=x;
        n=n/10;
        i++;
        }
        for(int elements : arr ){
            System.out.print("[ "+ elements+" "+"]");
        }
        System.out.println(sum);
    }
}
