//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter

// scanner kutuphanesine yazmaya ihtiyacimiz vardi//
    import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {

        /* scanner calisabilmesi icin scanner sinifini olusturuo
        gostermemiz lazim yani aslinda ekrana girebilmem icin
        ekran sinifi olusturuo icine girmeliyim
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal = ");
        double pricipal = scanner.nextDouble();
  // next.double yaziyoruz ama yanlis kullanim yapmisim next.Double();//
        System.out.println("annual interest rate = ");
        double interest_rate = scanner.nextDouble();

        System.out.println("period = ");
        float period = scanner.nextFloat();

        /*
        M: Aylık ödeme miktarı
        P: Ana para (mortgage miktarı)
        r: Aylık faiz oranı (yıllık faiz oranı bölü 12)
        n: Toplam ödeme sayısı (kredi süresi x 12)
         */
        double result = interest_rate/12;
        double result1 = period*12;
        double result2 = result * (Math.pow((1 + result), result1) )/ ((Math.pow(1 + result, result1)) - 1);
        System.out.println( "Mortgage = " + result2);
    // bu islemi mortgage hesaplamasi ile yapmaya calistim//
        //toplam geri odemeyi de yazdiralim//
        double result3 = result2*result1;
        System.out.println("Toplam geri odeme = " + result3);


        System.out.println("pricipal = " + pricipal);
        System.out.println("annual interest rate = " + interest_rate);
        System.out.println("period = " + period);

        /* mortgage ben boyle yapmaya calistim kod calisiyor ama islem
        hatasi nulunuyor benim gibi yapan belki olur yazilimda herkesin
        farkli tarzlari vardir ama bu kodda islem hatasi oldugunu belirtmek
        isterim
         */
    }
}