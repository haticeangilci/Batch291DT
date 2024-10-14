package TekrarSoruCozumu;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
// if (7 == 4 + 3) {
//            System.out.println("conditional doğru,if çalışmıştır");

        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz:");
       /* double num= input.nextDouble();
        int num1 =(int) num;
        System.out.println(num1);

        if (num>0){
            System.out.println("Pozitif");

        } else if (num<0) {
            System.out.println("Negatif");

        }else {
            System.out.println("Nötr");
        }
*/
        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.


      /*  if(a>=0 || a<10){
            System.out.println("Lütfen Rakam yazınız");

        }

*/

        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.

        /*if(a>99 && a<=999){
            System.out.println("Üç basamaklıdır");
        }else if(a>0 && a<=99) {

            System.out.println("İki basamaklıdır ");

        }else if (a<=0){
            System.out.println("Sizin istediğiniz sayı değeri 0 ve küçük değerdir...Basamaklı sayıya girmez");
        }*/

         //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
/*

        if(a%2==0){
            System.out.println("Çift sayı");
        }else if(a/5==0){
            System.out.println("Tek sayıdır");
        }
*/



       /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
       // Type casting yaptık. Ondalıklı sayının küsüratı kes at int çevir komutu kullanalım.
          1==> Pazar, 2 ==> Pazartesi …*






        */
        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/
        System.out.println("Yaşınızı giriniz");
        byte a= input.nextByte();
        if(a<=0 ){
            System.out.println("Yaşınız sıfır ve sıfırdan küçük olamaz. ");
        }else if(a<=4) {
            System.out.println("Bebek");

        }else if(a<13) {
            System.out.println("Çocuk");
        }else if(a<21) {
            System.out.println("Genç");
        }else if(a<31) {
            System.out.println("Yetişkin");
        }else {
            System.out.println("Tanımlanmamış");
        }










        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/


        //equals() iki String'in birbirinin aynisi olup olmadigini kontrol eder.
        //Bu method boolean return eder(true veya false).

        //equalsIgnoreCase() iki String'in birbirinin aynisi olup olmadigini
        //buyuk kucuk harfi dikkate almadan kontrol eder

        //“switch” Statement

        //switch ifadesi, farklı koşullara dayalı olarak farklı eylemler gerçekleştirmek için kullanılır.
        //if -else if'in yaptigini yapar. Okumasi ve yazmasi daha kolaydir.
        //genel kullanimda, 3'ten fazla durum varsa switch kullaniriz.(best practise)

        /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        Sunday==>1  . . .  Saturday==>7
        */

       /*Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz
           switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz */



    }
}
