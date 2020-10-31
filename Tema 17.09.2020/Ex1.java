import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul de elemente din vector: ");
        int n = sc.nextInt();
	    int counter = 0;
        int[] V = new int[n];
        for (int i=0; i<V.length;i++)
        {
            System.out.print("Introdu V["+i+"]=");
            V[i]=sc.nextInt();
            counter+=V[i];
        }
        System.out.println("Suma vectorului este egala cu: "+counter);
    }
}
