import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1 , sayi2 , total=1, sayiFark;
        int sayi1Fak=1, sayi2Fak=1, sayiFarkFak=1;

        System.out.println("Lütfen Eleman Sayısını (n) Giriniz = ");
        sayi1 = input.nextInt();
        System.out.println("Lütfen Seçim Sayısını (r) Giriniz = ");
        sayi2 = input.nextInt();
        sayiFark = sayi1 - sayi2;
        if (sayi1>sayi2) {
            for (int i = 1; i <= sayi1; i++) {
                sayi1Fak *= i;
            }
            for (int j = 1; j <= sayi2; j++) {
                sayi2Fak *= j;
            }
            for (int k = 1; k <= sayiFark; k++) {
                sayiFarkFak *= k;
            }
            total = sayi1Fak / (sayi2Fak * (sayiFarkFak));
            System.out.print("Kombinasyon Değeri = " + total);
        }else {
            System.out.println("lütfen geçerli bir sayı giriniz \n 1.sayı 2.sayıdan büyük olmalıdır");
        }
    }
}
