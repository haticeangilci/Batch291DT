package d8stringmanipulations13092024.Denemeler;

import java.util.Scanner;

public class Deneme_IfStatement {
    public static void main(String[] args) {
        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayı = scanner.nextInt();

        if(sayı>0) {
            System.out.println("Pozitiftir");

        } else if (sayı<0) {
            System.out.println("negatiftir");
        }else {
            System.out.println("noturdur");
        }*/
        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.

      /*  int num= 1123;

        if(num>99 && num<1000) {
            System.out.println("Üç basamaklıdır");

        }else {
            System.out.println("Üç basaklı değil");
        }

*/
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı = scanner.nextInt();

        if (sayı % 2 == 0) {
            System.out.println("Sayı çift sayıdır");

        } else {
            System.out.println("Sayı Tek sayıdır");
        }
*/
//Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı = scanner.nextInt();

        if(sayı>0){
            System.out.println("Sayı pozitiftir");
        } else if (sayı<0) {
            System.out.println("Sayı negatiftir");
        }else {
            System.out.println("Sayı notr dür");
        }*/
 /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
          1==> Pazar, 2 ==> Pazartesi …*

        //*Example 1: When you receive the number of days from the user, write the code that writes the day name
          1==> Sunday, 2 ==> Monday …*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün sayınısı giriniz");
        byte gun = scanner.nextByte();


        if(gun <= 0 ){
            System.out.println("Gün sayıları 1 den küçük olamaz");
        } else if (gun == 1) {
            System.out.println("Pazar");
        } else if (gun == 2) {
            System.out.println("Pazartesi");
        } else if (gun == 3) {
            System.out.println("Salı");
        } else if (gun == 4) {
            System.out.println("Çarşamba");
        } else if (gun == 5) {
            System.out.println("Perşembe");
        } else if (gun == 6) {
            System.out.println("Cuma");
        } else if (gun == 7) {
            System.out.println("Cumartesi");
        } else  {
            System.out.println("Gün sayısı 7 den büyük olamaz");

        }*/

        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/


       /* Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz:");
        double yas = input.nextDouble();
        int ys = (int) yas;

        if(ys!=yas) {
            System.out.println("Yaşınız tam sayı olmalıdır.");
        }else if (ys<1){
            System.out.println("Yaşınız birden küçük olamaz");
        }else if (ys<5){
                System.out.println("Bebek.");
        }else if (ys<13){
            System.out.println("Çocuk.");
        }else if (ys<21){
            System.out.println("Genç.");
        }else if (ys<31){
            System.out.println("Yetişkin.");
        }else {
            System.out.println("Tanımlanmamış.");
        }*/
        //------------------------------------------------------------------------
         /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/
        //1.yol if koşuluyla yazmak ki bu biraz tercih edilmez. Dikkatli olmak gerekir. Ama değer ataması yaparsak if yerine ozaman daha sade ve anlaşılır olur.

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Lütfen günü yazınız: ");
        String dayname = input.next();*/

        /*if (dayname.equalsIgnoreCase("Saturday") ||
                dayname.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else if (dayname.equalsIgnoreCase("Monday") ||
                dayname.equalsIgnoreCase("Tuesday") ||
                dayname.equalsIgnoreCase("Wednesday") ||
                dayname.equalsIgnoreCase("Thursday") ||
                dayname.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");

        } else {
            System.out.println("Enter valid day");

        }*/

        //2.yol koşulları sade bırakmak daha faydalı.
/*
        boolean isWeekend = dayname.equalsIgnoreCase("Saturday") ||
                dayname.equalsIgnoreCase("Sunday");
        boolean isWeekday =dayname.equalsIgnoreCase("Monday") ||
                dayname.equalsIgnoreCase("Tuesday")||
                dayname.equalsIgnoreCase("Wedneyday")||
                dayname.equalsIgnoreCase("Tuesday")||
                dayname.equalsIgnoreCase("Friday");


        if(isWeekend){
            System.out.println("Weekend");

        } else if (isWeekday) {
            System.out.println("Weekday");
        }else {
            System.out.println("Geçerli gün ismi giriniz");
        }*/

        //nested : icice gecmis demektir

        /*ornek 1:
    Kisi erkek ise;
          i)16 yasindan kucuk ise calismamali
          ii)16 - 65(dahil) arasi calismali
          iii)65 yasindan buyuk ise emekli olmali
    Kisi kadin ise;
         i)18 yasindan kucuk ise calismamali
         ii)18 - 60 (dahil) arasi calismali
         iii)60 yasindan buyuk ise emekli olmali
    Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

    /*example 1:
    If the person is male;
          i) If he is younger than 16 years old, he should not work
          ii)Workers between 16 - 65 (inclusive)
          iii) Must retire if over 65 years of age
    If the person is a woman;
         i) If she is under 18 years of age, she should not work
         ii)18 - 60 (inclusive) working age
         iii) Must retire if over 60 years of age
    Based on the gender and age of the person, type the appropriate message into the console*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String gender = scanner.next();

        System.out.println("Yaşınızı giriniz");
        int yas = scanner.nextInt();

        if(gender.equalsIgnoreCase("Erkek")){
            if(yas<0){
                System.out.println("Yaş negatif olamaz");

            } else if (yas<16) {
                System.out.println("Çalışmamalı");

            } else if (yas<=65) {
                System.out.println("Çalışmalı");

            } else {
                System.out.println("Emekli olmalı");

            }


        } else if (gender.equalsIgnoreCase("Kadın")){
            if(yas<0){
                System.out.println("Yaş negatif olamaz");

            } else if (yas<18) {
                System.out.println("Çalışmamalı");

            } else if (yas<=60) {
                System.out.println("Çalışmalı");

            } else {
                System.out.println("Emekli olmalı");

            }

        }else {
            System.out.println("sizin için farklı bir tanımlama yapılmalı");

        }*/

        //--------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarını giriniz:");
        double kısakenar = input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenarını giriniz:");
        double uzunkenar = input.nextDouble();

        if(kısakenar!=uzunkenar){
            System.out.println("Dikdörtegendir");
        }else{
            System.out.println("Karedir");
        }


    }



}