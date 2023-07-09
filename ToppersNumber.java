import java.util.Scanner;
public class ToppersNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddsum = 0,evensum = 0;
        while(num > 0) {
            int rem  = num%10;
            if(rem % 2 == 0) {
                evensum += rem;
            } else {
                oddsum += rem;
            }
            num /= 10;
        }
        if(oddsum == evensum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
