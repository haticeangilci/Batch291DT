package d5increment_decrement_if09092024;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
        //Example 1: Create the code that prints whether a number received from the user is odd or even.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int num = input.nextInt();


        //----------------------------1.yol;
        if (num % 2 == 0) {// örnegin 4 girdi /2 ye bölündüğünde kalan 0 olduğu için bu kod çalışır.
            System.out.println("Çift sayı");
        }
        if (num % 2 != 0){//num % 2 == 1 de yazabilirdik.//false ürettiği için bu bilok çalışmaz
            System.out.println("Tek sayı");
        }
        //----------------2.yol:
        //if-else Statements

        if(num % 2 == 0){
            System.out.println("Sayı çifttir");
        }else {
            System.out.println("Sayı tektir");


        }





    }


}
