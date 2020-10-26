//EX.1
public class Main {
    public static void main(String[] args) {
        char c='e';
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println(c + " este vocala");
        else
            System.out.println(c + " este consoana");
    }
}
//EX.2
public class Main{
    public static void main(String[] args) {
        int n=5,contor=n/n,suma=0;
        while(contor<=n){
            suma+=contor;
            contor++;
        };
        System.out.println("Suma primelor "+n+" numere reale este:"+suma);
    }
}
//EX.3
public class Main{
    public static void main(String[] args) {
        int n=3,x=0,r;
        for(int i=0;i<=n;i++){
            r=n*x;
            System.out.println(n+"x"+x+"="+r);
            x++;
            
        }
    }
}
//EX.4
public class Main{
    public static void main(String[] args) {
        int num=750;
        String marime;
        marime=(num>=1000000) ? "Large" : "Small";
        System.out.println(marime);
    }
}
//EX.5
public class Main {

    public static void main(String[] args) {
        int num = 20;

        for(int i = 1; i <= num; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//EX.6
public class Main{
    public static void main(String[] args) {
        int num=1500;
        int i=0;
        while(i<=num){
            ++i;
            if(i%3==0 || (i+5)%7==0 || i%10==0){
                continue;
            }
            System.out.println(i);
        }
    }
}