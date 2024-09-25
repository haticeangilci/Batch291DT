package d8stringmanipulations13092024;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz:" );
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        // ii)Space karakteri password'de olmasin
       //boolean spacecontrol = pwd.replaceAll("[^ ]","").length() == 0;
       // boolean spacecontrol = pwd.replaceAll("[^ ]","").isEmpty();
        boolean spacecontrol = !pwd.contains(" ");
        //System.out.println("spacecontrol = " + spacecontrol);

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length()>0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        // iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length()>0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        // v)En az bir tane rakam olsun

        boolean num = pwd.replaceAll("[^0-9]", "").length()>0;
        //System.out.println("num = " + num);

        if (!num) {
            System.out.println("Sifre an az bir rakam icermelidir");
        }

        //ODEV: En az 1 tane sembol icermeli

        boolean isValid = lengthControl && spacecontrol && upperCaseControl && lowerCaseControl && num;

        if (isValid) {
            System.out.println("Şifre geçerlidir");

        } else {
            System.out.println("Şifre geçersizdir");

        }

        





        

    }

}
