package Denemeler;

public class Deneme_ifSwitch {
    public static void main(String[] args) {
    /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/
        

         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        byte yas = scanner.nextByte();
        
        if(yas<0){
            System.out.println("Geçerli yaş giriniz");
        } else if (  yas < 5) {
            System.out.println("bebek");
        } else if (yas < 13) {
            System.out.println("cocuk");
        }else if (yas < 21) {
            System.out.println("genç");
        }else if (yas < 31) {
                System.out.println("yetişkin");
        }else {
            System.out.println("Tanimlanmamis");
        }*/
        //------------------------------------------------------------------------------------------------------------
        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter day name: ");
        String dayname = input.next();

        boolean weekend = dayname.equalsIgnoreCase("Saturday") ||
                dayname.equalsIgnoreCase("Sunday");
        boolean weekday = dayname.equalsIgnoreCase("Monday") ||
                dayname.equalsIgnoreCase("Tuesday") ||
                dayname.equalsIgnoreCase("Wednesday") ||
                dayname.equalsIgnoreCase("Thursday") ||
                dayname.equalsIgnoreCase("Friday");

        if(weekend){
            System.out.println("Hafta Sonu");

        }else if(weekday){
            System.out.println("Hafta içi");

        }else {
                System.out.println("Enter a valid day  ");
            }*/
        //--------------------------------------------------------------------------
        //Örnek:Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        //1.yol else-if:
     /*   Scanner input = new Scanner(System.in);
        System.out.println("Gün ismi giriniz:");
        String dayname = input.next();*/

       /* if(dayname.equalsIgnoreCase("Pazartesi")){
            System.out.println(1);

        } else if (dayname.equalsIgnoreCase("Salı")){
            System.out.println(2);


        } else if (dayname.equalsIgnoreCase("Çarşamba")){
            System.out.println(3);

        } else if (dayname.equalsIgnoreCase("Perşembe")){
            System.out.println(4);

        } else if (dayname.equalsIgnoreCase("Cuma")){
            System.out.println(5);

        } else if (dayname.equalsIgnoreCase("Cumartesi")){
            System.out.println(6);

        } else if (dayname.equalsIgnoreCase("Pazar")){
            System.out.println(7);

        } else {
            System.out.println("Lütfen geçerli günü giriniz");
        }*/
        //2.yol Switch:
        /*switch (dayname.toLowerCase()) {
            case "monday":
                System.out.println(1);
                break;
            case "tuesday":
                System.out.println(2);
                break;
            case "wednesday":
                System.out.println(3);
                break;
            case "thursday":
                System.out.println(4);
                break;
            case "friday":
                System.out.println(5);
                break;
            case "saturday":
                System.out.println(6);
                break;
            case "sunday":
                System.out.println(7);
                break;
            default:
                System.out.println("Geçerli gün ismi giriniz");
                break;

        }*/
        //----------------------------------------------------------------

        /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
        12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
        8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
        */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter month name no :");
        Byte monthno= input.nextByte();

        switch (monthno) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter valid month name no");
            }*/
        //-----------------------------------------------------------------------------------------
         /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
        Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Month :");
        int numOfMonth = input.nextInt();

        String season = switch (numOfMonth) {
            case 12, 1, 2 -> "Kış";
            case 3, 4, 5 -> "İlkbahar";
            case 6, 7, 8 -> "Yaz";
            case 9, 10, 11 -> "Sonbahar";
            default -> "Bilinmeyen ay";
        };

        System.out.println("Mevsim = " + season);

    }*/

    }
}




