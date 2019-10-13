package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n=ulaz.nextInt();
        int minus=1;
        if (n<0) {
            n=-n;
            minus=-1;
        }
        for (int i=1; i<n; i++) {
            if (i%sumaCifara(i)==0) System.out.printf("%d ",i*minus);
        }
    }
    public static int sumaCifara(int n) {
        int suma=0;
       while(n!=0) {
            suma=suma+n%10;
            n=n/10;
        }
        return suma;
    }
}
