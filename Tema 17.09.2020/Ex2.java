import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul de elemente din vector: ");
        int n = sc.nextInt();
        int[] V = new int[n];
        int j = V.length;
        for (int i = 0; i < j; i++) {
            System.out.print("Introdu V[" + i + "]=");
            V[i] = sc.nextInt();
        }
        for (int i = j; i > j - 1; i--) {
            System.out.println("V[" + (i - 1) + "]=" + V[i - 1]);
            j--;
            if (j == 0) {
                break;
            }
        }
    }
}
