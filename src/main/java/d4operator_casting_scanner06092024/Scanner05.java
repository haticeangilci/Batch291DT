package d4operator_casting_scanner06092024;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        //Example 5: The first two and last two digits of a 5-digit number you will receive from the user.
        //Write the code that prints the sum of the numbers
        //           45678 ==> 45 + 78 = 123


        Scanner input = new Scanner(System.in);

        System.out.println("Beş basamaklı bir sayı giriniz: ");
        int num = input.nextInt();

        int firstTwoDigits = num / 1000;//soldan ilk iki basamağı verir.
        int LastTwoDigits = num / 100;//sağdan  son iki basamağı verir.

        System.out.println(firstTwoDigits + LastTwoDigits);















    }
}
