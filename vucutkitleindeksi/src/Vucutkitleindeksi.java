import java.util.Scanner;

public class Vucutkitleindeksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a,b,sonuc;
        System.out.println("Lutfen boyunuzu (metre cinsinde) giriniz :");
        a= scan.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz :");
        b= scan.nextDouble();
        sonuc = b/(a*a);
        System.out.println("Vucut Kitle İndeksiniz :"+sonuc);
    }
}
