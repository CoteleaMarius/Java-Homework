import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti nr1 si nr2: ");
        calculator(sc.nextInt(),sc.nextDouble());
        System.out.println("Introduceti nr1 si nr2: ");
        calculator(sc.nextInt(),sc.nextInt());
        System.out.println("Introduceti nr1 si nr2: ");
        calculator(sc.nextDouble(),sc.nextInt());
        System.out.println("Introduceti nr1 si nr2: ");
        calculator(sc.nextDouble(),sc.nextDouble());
    }
    public static void calculator(int nr1, double nr2){
        double nr3=nr1+nr2;
        System.out.println("Rezultatul este: "+nr3);
    }
    public static void calculator(int nr1, int nr2){
        int nr3=nr1-nr2;
        System.out.println("Rezultatul este: "+nr3);
    }
    public static void calculator(double nr1, int nr2){
        double nr3=nr1/nr2;
        System.out.println("Rezultatul este: "+nr3);
    }
    public static void calculator(double nr1, double nr2){
        double nr3=nr1*nr2;
        System.out.println("Rezultatul este: "+nr3);
    }
}
