import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul de elemente din vector: ");
        int n = sc.nextInt();
        int max=0,min=100;
        int[] V = new int[n];
        int j = V.length;
        for (int i = 0; i < j; i++) {
            System.out.print("Introdu V[" + i + "]=");
            V[i] = sc.nextInt();
            if (max<V[i]) {
            	max=V[i];
            }
            if(min>V[i]){
            	min=V[i];            }
        }
            System.out.println("Valoarea maxima este:"+max);
            System.out.println("Valoarea minima este:"+min);
    }
}
