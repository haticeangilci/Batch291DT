package d8stringmanipulations13092024.Denemeler;

public class Deneme_Ternary {
    public static void main(String[] args) {
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //Example 1: Write the code that calculates the absolute value of a number.

        // condition ? true : false

        int c = -4;

        // condition      ?     true    :      false
        int result = c < 0 ? -1 * c : c;
        System.out.println(result);
        //---------------------------------------------------------------------
        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        int a = 2;
        int b = -3;

        //condition ? true: false ;

        Object result1 = (a > 0 && b > 0) || (a < 0 && b < 0) ? a * b : "Farklı işaretli sayıları çarpamıyorum";
        System.out.println(result);

        //--------------------------------------------------------------------------------
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        //Example : Write the code to check if the given number has 3 digits

        //condition ? true:false;

        int d = -20;

        d = Math.abs(d);//Negatif sayıyı Pozitif sayıya çeviriyor.Mutlak değer alma method

        String result2 = (d > 99) ? "Sayınız üç basamaklıdır" : "Sayınız üç basamaklı değildir";
        System.out.println(result2);
        //----------------------------------------------------------------------------------------

         /*Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        Example 1: Write the code to check if the given year is a "Leap Year”.

        1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */

        // (c) ? ( (c) ? (t) : (f) ) : (  (c) ? (t) : (f)  )

        int y = 2020;
        String result3 = (y % 100 == 0) ?
                ((y % 400 == 0) ? ("Leap Year") : ("Leap Year değil")) :
                ((y % 4 == 0) ? ("leap Year") : ("Leap Year değil"));
        System.out.println(result3);


    }
}
