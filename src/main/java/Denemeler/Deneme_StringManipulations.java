package Denemeler;

public class Deneme_StringManipulations {
    public static void main(String[] args) {
        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //Example 1: Convert the word “money” in String “s” to “dollar”.

        //replace() methodu, 2.parametredekini 1.nin yerine koyar.
        //Kucuk buyuk harfe duyarlidir
        String s = "Learn Java earn money";
        String son=s.replace("money","dollar");
        System.out.println(son);

        //---------------------------------------------------

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.
        //Example 2: Delete all "e" letters in the string "s".
        String s1 = "Learn Java earn money";
        String son1=s1.replaceAll("e","");
        System.out.println(son1);









    }
}
