package d8stringmanipulations13092024;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //Example 1: Convert the word “money” in String “s” to “dollar”.

        //replace() methodu, 2.parametredekini 1.nin yerine koyar.
        //Kucuk buyuk harfe duyarlidir
        String s = "Learn Java earn money";
        String s1=  s.replace("money","dolar");
        System.out.println(s1);//Learn Java earn dolar

        //---------------------------------------------------

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.
        //Example 2: Delete all "e" letters in the string "s".

        String s2= s.replace("e","");//"" tırnak içi boş ise hiçlik.Siler ve silinen karerkteri harfleri birbirine yapıştırır.
        System.out.println(s2);







    }
}
