import java.util.Scanner;

public class GreaterNumber_02 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        if(a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
