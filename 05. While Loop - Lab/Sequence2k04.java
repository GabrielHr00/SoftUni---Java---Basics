import java.util.Scanner;

public class Sequence2k04 {public static void main(String[] argvs) {

    Scanner scan = new Scanner(System.in);
    int n = Integer.parseInt(scan.nextLine());
    int k = 1;
    while (k <= n) {
        System.out.println(k);
        k = k * 2 + 1;
    }
    }
}
