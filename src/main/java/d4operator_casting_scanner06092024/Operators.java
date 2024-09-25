package d4operator_casting_scanner06092024;

public class Operators {
    public static void main(String[] args) {
        /*
        +,-,*,/ islemleri Java'da matematikte kullanildigi gibi kullanilir
        Not 1: Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse (en az bir değer ondalıksa) java sonucun ondalik kismini silerek onu int'e donusturur.
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
         */
        int amountOfMoney1 = 25;
        int amountOfPeople1 = 10;
        System.out.println(amountOfMoney1 / amountOfPeople1);//2 çıktı. 2.5 çıkmalıydı.Java .5'i sildi.

        double amountOfMoney2 = 25; // 8 byte ondalıklı sayı
        int numberOfPeople2 = 10; // 4 byte tamsayı
        //double 8 byte daha fazla bilgi depolamaktadır. Büyük olması bundandır.
        System.out.println(amountOfMoney2 / numberOfPeople2);

        //-------------------------------------------------------------
        /*2) Java da "logical operator" lar.
       ==> AND (&&) isleminden true alabilmek icin her sey true olmalidir
       AND islemini carpma olarak dusunebiliriz

       ==> OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
       OR isleminde sonucun false olabilmesi icin hersey false olmalidir

       //==> NOT Operatoru (!) true olani false , false olani true yapar
       !true  ==> false
       !false ==> true
       !!true ==> true*/

        //---------------------------------------------------------
        /*3) Comparison (Karsilastirma) Operators
       <, >, <=, >=, ==, !=
       Not: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz*/
        boolean a = 3 < 5; //true
        boolean b = 2 + 3 != 5; //false
        boolean c = 2 + 3 * 5 >= 19; //false, once carpma yapilmali
        System.out.println(a && b); //false
        System.out.println(a || b || c); //true





    }
}
