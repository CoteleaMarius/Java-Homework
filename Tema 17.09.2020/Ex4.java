import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
            char[] V=new char[10];
            Scanner sc=new Scanner(System.in);
            for (int i=0;i<V.length;i++)
            {
                System.out.print("Introdu V["+i+"]=");
                V[i]=sc.nextLine().charAt(0);
                if (V[i]=='a' || V[i]=='e' || V[i]=='i' || V[i]=='o' || V[i]=='u'){
                    System.out.println("V["+i+"] este o vocala");
                }
                else{
                    System.out.println("V["+i+"] este o consoana");
                }
            }
        }
    }