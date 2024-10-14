package TekrarSoruCozumu;

public class Ternary_StringManipulations {
    public static void main(String[] args) {

        //String Data Tipi (Class)
        //String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.
        //------------------
        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.

        //String s = "Java is easy";

        //length() methodu String'in uzunlugunu dondurur.1’den baslar


        //------------------
        //Ornek 2: "s" String'inde ilk ve son index’teki karakterleri aliniz.


        //charAt(int index) metodu, belirtilen index’te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        //Not: s.length()-1 her zaman son index'i verir

        //------------------
        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        //------------------
        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.

        //------------------
        //Ornek 5: "s" String'indeki “easy" kelimesini aliniz.

        //2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna
        // kadar olan substring'i döndürür.


        //------------------
        //Ornek 6: “s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".

        //contains() method’u herhangi bir karakterin veya karakterlerin String'de
        // var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean

        //------------------

        //Ornek 7: “s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //Example 7: Check if the string "s" starts with a certain letter.

        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.
        //------------------
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //Example 1: Write the code that calculates the absolute value of a number.

        //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        //Bir gerçek sayının sayı doğrusundaki yerinin başlangıç noktasına (sıfıra) olan uzaklığına
        // o sayının mutlak değeri denir. Sifirin mutlak degeri de sifirdir.

        //(c) ? (t) : (f)

        //------------------
        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        //------------------

        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali



    }
}