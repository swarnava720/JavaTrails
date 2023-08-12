import java.util.*;

public class game {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Enter a number less than 3  :");
        Scanner sc = new Scanner(System.in);
        int a, x;
        a = sc.nextInt();
        x = r.nextInt(3);
        
        switch (a) {
            case 0:
                System.out.println("You chose Rock !");
                break;
            case 1:
                System.out.println("You chose Paper ! ");
                break;
            case 2:
                System.out.println("You chose Scissor !");
                break;
            default:
                System.out.println("Please try again");
        }
        switch (x) {
            case 0:
                System.out.println("Computer chose Rock !");
                break;
            case 1:
                System.out.println("Computer chose Paper !");
                break;
            case 2:
                System.out.println("Computer chose Scissor !");
                break;
            default:
                System.out.println("Computer try again !");
        }
        if (a == x) {
            System.out.println("It's a TIE  !!!");
        }
        if (a==0 && x==2 || a==2 && x==1 || a==1 && x==0){
            System.out.println("Congratulations !! You WIN");
        }
        else if (a==2 && x==0 || a==1 && x==2 || a==0 && x==1) {
            System.out.println("Sorry, You lost");
        }
        

    }

}
