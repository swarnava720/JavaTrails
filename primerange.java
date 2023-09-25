public class primerange {
    public static boolean prime(int n) {
        int flag = 1;
        int i;
        if (n <= 1)
            return false;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 0;
            }

        }
        if (flag == 1)
            return true;

        return false;
    }

    public static void main(String[] args) {
        int x = 29;int y = 693;int sum = 0;
        for(int i = x;i<=69;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
