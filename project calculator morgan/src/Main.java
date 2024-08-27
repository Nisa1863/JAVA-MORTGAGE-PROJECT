//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        // bir yilin 12 ay oldugunu tanimliyoruz//
        final byte PERCENT = 100;
        /* percent gelir demektir genellikle bir sayinin
        100 e bolunmus halidir aslinda yuzdelik kismi da denebilir
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Principal : ");
        int principal = scanner.nextInt();
        //bir tam sayi ciktisi alabilmek icin//

        System.out.print("annual interest rate:");
        float annualInterest = scanner.nextFloat();
        //ekrandan yani kullanicidan cikti alabimek icin//
        //float kullandik istersek double da kullanabilirdik ondalikli sayilar icin//
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        /* yuzde hesaplamalarinda yillik faiz oranini aylik faiz
        oranina donusturmek istedigimizde annualInterest /PERCENT yilllik
        faizin ondalikli formats donusturduk
        / MONTHS_IN_YEAR aylik faiz oranini hesaplar
         */

        System.out.println("period years:");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        //kredinin toplam odeme sayisini hesapliyoruz//

        double Mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        //mortgage hesaplamasi//

        String mortagageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        // mortgage degerini para formatinda bicimlendir//
        System.out.println("Mortagage :" + mortagageFormatted);
    }
}
