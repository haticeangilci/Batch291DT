package Denemeler;

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
        }*/
        //------------------------------------------------------------------------------------------------
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
        //----------------------------------------------------------------------------------
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
        //----------------------------------------------------------------------------------------
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
        /*if(dayname.equalsIgnoreCase("Saturday") ||
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
        //---------------------------------------------------------------------------
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
        //-------------------------------------------------------------------------------------
        //Scanner input = new Scanner(System.in);
       /* System.out.println("Dikdörtgenin kısa kenarını giriniz:");
        double kısakenar = input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenarını giriniz:");
        double uzunkenar = input.nextDouble();
        if(kısakenar!=uzunkenar){
            System.out.println("Dikdörtegendir");
        }else{
            System.out.println("Karedir");
        }*/
        //-----------------------------------------------------------------------
        // Örnek: Kullanıcıdan bir gün alın eğer gün  Cuma ise ekrana "Muslumanlar için kutsal gun" yazdırın."Cumartesi" ise ekrana "Yahudiler için kutsal gun"yazdırın. " Pazar" ise ekrana "Hiristiyanlar için kutsal gun" yazdırın.
        /*Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan gün al
        System.out.print("Bir gün girin: ");
        String gun = scanner.nextLine().toLowerCase(); // Girilen gün küçük harfe dönüştürülüyor

        // Gün kontrolü ve mesaj yazdırma
        if (gun.equals("cuma")) {
            System.out.println("Müslümanlar için kutsal gün");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler için kutsal gün");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar için kutsal gün");
        } else {
            System.out.println("Geçersiz bir gün girdiniz.");
        }
        scanner.close(); // Scanner nesnesi kapatılıyor*/
        //}
        //--------------------------------------------------------------------------------------
        // Örnek: Kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve dikdörtgenin kare olup olmadığını yazdırın.
     /*   Scanner scanner = new Scanner(System.in);

        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int kisaKenar = scanner.nextInt();

        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int uzunKenar = scanner.nextInt();

        if (kisaKenar == uzunKenar) {
            System.out.println("Bu bir karedir.");
        } else {
            System.out.println("Bu bir kare değildir.");
        }

        scanner.close();*/
        //---------------------------------------------------------------------------------------------------------
        //Örnek: Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını yazdırın
        // Kullanıcıdan bir karakter al
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0); // Kullanıcıdan alınan ilk karakter//Kullanıcı Girdisi: next().charAt(0) ile kullanıcıdan girilen ilk karakter alınır./

        // Harf kontrolü
        if (Character.isLetter(karakter)) { //Harf Kontrolü: Character.isLetter(karakter) fonksiyonu, girilen karakterin bir harf olup olmadığını kontrol eder.
            System.out.println(karakter + " bir harftir.");
        } else {
            System.out.println(karakter + " bir harf değildir.");
        }

        scanner.close(); // Scanner nesnesini kapat//Scanner Kapatma: Kullanıcı girişi tamamlandıktan sonra scanner.close() ile kaynaklar kapatılır.*/
        //-----------------------------------------------------------------------------------------------------------------
        //Örnek: Kullanıcıya yasını sorun , eger yas 65 ten küçük ise "emekli olamazsın, çalışmalısın",65 e eşit veya büyükse "Emekli olabilirsin"yazdırın.
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı griniz:");
        int yas = input.nextInt();

        if(yas<65){
            System.out.println("Emekli olamazsın,çalışmalısın");
        }else {
            System.out.println("Emekli olabilirsin");
        }*/
        //---------------------------------------------------------------------------------------------
        //Örnek: Kullanıcıda bir ucgenin uc kenar uzunluğunu alın eger uc kenar uzunluğu birbirine eşit ise ekrana "Eskenar ucgen"yazdırın.Diğer durumlarda ekrana "Eşkenar değil"yazdırın.
       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz:");
        int kenar1 = scanner.nextInt();

        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        int kenar2 = scanner.nextInt();

        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Eşkenar üçgen");
        } else {
            System.out.println("Eşkenar değil");
        }

        scanner.close();*/

        //---------------------------------------------------------
        //Örnek:Kullanıcıdan gun ismini yazmasını isteyin.Girilen isim geçerli bir gun ise gün ismini 1,2,3.harflerini ilk harf büyük diğer ikisi küçük olarak yazdırın, gün ismi geçerli değilse "Geçerli gün ismi giriniz"yazdırın.
       /* Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuluyor.

        System.out.print("Bir gün ismi giriniz: ");
        String gunIsmi = scanner.nextLine().toLowerCase(); // Kullanıcıdan alınan gün ismi küçük harflere dönüştürülüyor.

        // Geçerli gün isimlerini içeren bir dizi tanımlanıyor
        String[] gecerliGunler = {"pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"};

        boolean gecerliMi = false; // Başlangıçta gün isminin geçerli olup olmadığını kontrol etmek için bir değişken tanımlanıyor.

        // Kullanıcının girdiği gün isminin geçerli günler listesinde olup olmadığını kontrol etme
        for (String gecerliGun : gecerliGunler) {
            if (gunIsmi.equals(gecerliGun)) {
                gecerliMi = true; // Eğer eşleşme varsa geçerli olduğunu işaretle
                break; // Dışarıdaki for döngüsünden çık
            }
        }

        // Eşleşme durumuna göre çıktı veriliyor
        if (gecerliMi) {
            // Eğer gün ismi geçerli ise, ismin ilk harfini büyük yapıp geri kalanını olduğu gibi yazma
            String formatliGun = gunIsmi.substring(0, 1).toUpperCase() + // İlk harfi büyük yap
                    gunIsmi.substring(1, gunIsmi.length()); // Kalan harfleri olduğu gibi al
            System.out.println(formatliGun); // Formatlanmış gün ismi yazdırılıyor
        } else {
            System.out.println("Geçerli bir gün ismi giriniz."); // Eğer geçerli bir gün değilse hata mesajı
        }

        scanner.close(); // Scanner nesnesi kapatılıyor
        */
        //--------------------------------------------------------------
        //Örnek:Kullanıcıdan iki sayı isteyin, sayıların ikisi de pozitif ise sayıların toplamını yazdırın,sayıların ikiside negative ise sayıların çarpımını yazdırın, sayıların ikisi farklı işaretlere sahipse "farklı işaretlerde sayılarla işlem yapamazsın"yazdırın,sayılardan sıfıra eşit olan varsa "sıfır çarpmaya göre yutan elemandır"yazdırın.
        /*Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        int sayı1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        int sayı2 = input.nextInt();

        if (sayı1 > 0 && sayı2 > 0) {
            System.out.println("Toplam: " + (sayı1 + sayı2));

        } else if (sayı1 < 0 && sayı2 < 0) {
            System.out.println("Çarpım: " + (sayı1 * sayı2));

        } else {
            System.out.println("Farklı işaretlerde sayılarla işlem yapamazsın");

        }*/

        //-------------------------------------------------------------------------------------------
        //Örnek:Kullanıcıdan 100 üzerinden notunu isteyin.Not'u harf sistemine çevirip yazdırın.50 den küçükse "D",50-60 arası "C",60-80 arası "B",80 ve üzeri "A";
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu giriniz: ");
        byte not = input.nextByte();

        if (not < 50) {
            System.out.println("D");
        } else if (not < 60) {
            System.out.println("C");
        } else if (not < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }*/

        //----------------------------------------------------------------------
    }
}

