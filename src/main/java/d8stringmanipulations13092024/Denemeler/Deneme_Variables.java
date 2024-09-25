package d8stringmanipulations13092024.Denemeler;

public class Deneme_Variables {
    public static void main(String[] args) {
        System.out.println(38 / 2 * (4 + 3) * 2);
        System.out.println(8 + 2 * (14 - 6 / 2) - 12);
        int a = 15 % 4;
        System.out.println(a);

       /* Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir tam sayı giriniz:");
        int sayi = input.nextInt();
        int toplam = 0;

        if (sayi > 0) {
            toplam += sayi % 10;
            sayi/=10;
           System.out.println("Sayıların toplamı: = " + toplam);
*/
           String str1="Java";
           String str2="Güzel";
           int sayi1 =5;
           int sayi2 = 4;

           // Java Guzel 54
            System.out.println(str1+" "+str2+" "+sayi1+sayi2);
           //Java 5 Guzel
            System.out.println(str1+" "+sayi1+" "+str2);
           // Java 94
            System.out.println(str1+" "+ (sayi1+sayi2)+sayi2);
           //Java 19
            System.out.println(str1+" "+ (sayi1-sayi2)+(sayi1+sayi2));
           //54 Guzel
            System.out.println(sayi1+""+sayi2+" "+str2);
            boolean sonuc1= 5+2==7;
            System.out.println(sonuc1);
            boolean sonuc2=5*2==15;
            System.out.println(sonuc2);

            /* 1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
            toplamını konsola yazdırınız.*/
                double gomlek = 15.04;
                double etek = 12.99;
                double ceket = 30.05;
                double toplam  = gomlek+etek+ceket;
        System.out.println("Toplam = " + toplam);
             /*2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        değişkenlerin değerlerinin çarpımını konsolda yazdırınız.*/
            float no1= 0.00000004f;
            

















    }
}

