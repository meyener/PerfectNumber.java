import java.util.Scanner;

/**
 * PerfectNumbers
 */
public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int perf=0,waste,num1,val1,n;
        System.out.println("Please enter a number : ");
        n=scanner.nextInt();

        for (int i = 1; i <=n/2; i++) {
            if (n%i==0) {
                perf+=i;
            } 
        }if (perf==n) {
            System.out.println(n+" is a perfect number.");
        } else {
            System.out.println(n+" is not a perfect number");
        }
    }
}