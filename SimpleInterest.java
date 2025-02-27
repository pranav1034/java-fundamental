import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the Principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter the Rate of Interest (in %): ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time (in years): ");
        int time = sc.nextInt();
      
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);

    }
}
