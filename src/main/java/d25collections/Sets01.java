package d25collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

    //Interview Sorusu
    //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
    //Interview Question
    //Example 1 : Store student email addresses in natural order.
    long t1=System.nanoTime();
    //---------------------------------------------------------
    //1.yoll:Yavaş-Her elemanda sıralama yapar
        TreeSet<String> emails = new TreeSet<>();
        emails.add("kmail@gmail.com");
        emails.add("amail@gmail.com");
        emails.add("bmail@gmail.com");
        emails.add("cmail@gmail.com");
        emails.add("dmail@gmail.com");
        emails.add("email@gmail.com");
        emails.add("fmail@gmail.com");
        emails.add("hmail@gmail.com");
        emails.add("ımail@gmail.com");
        emails.add("tmail@gmail.com");
        emails.add("vmail@gmail.com");
        System.out.println(emails);//[amail@gmail.com, bmail@gmail.com, cmail@gmail.com, dmail@gmail.com, email@gmail.com, fmail@gmail.com, hmail@gmail.com, kmail@gmail.com, tmail@gmail.com, vmail@gmail.com, ımail@gmail.com]

        //TreeSet'ler çok yavaş.Biraz hızlandırabilir miyiz?
        //Elemanları eklerken en hızlı olandan (HashSet) yardım alalım.
        long t2=System.nanoTime();

        //----------------------------------

        //2.yol: Tavsiye edilir - Daha hızlı
        HashSet<String>emailsHs= new HashSet<>();//HashSet hızlandırılan methoddur.
        emailsHs.add("kmail@gmail.com");
        emailsHs.add("amail@gmail.com");
        emailsHs.add("bmail@gmail.com");
        emailsHs.add("cmail@gmail.com");
        emailsHs.add("dmail@gmail.com");
        emailsHs.add("email@gmail.com");
        emailsHs.add("fmail@gmail.com");
        emailsHs.add("hmail@gmail.com");
        emailsHs.add("ımail@gmail.com");
        emailsHs.add("tmail@gmail.com");
        emailsHs.add("vmail@gmail.com");
        System.out.println(emailsHs);//[fmail@gmail.com, tmail@gmail.com, dmail@gmail.com, ımail@gmail.com, cmail@gmail.com, hmail@gmail.com, vmail@gmail.com, email@gmail.com, kmail@gmail.com, bmail@gmail.com, amail@gmail.com]

        //Boş bir TreeSet oluşturalım ve constructor ına HashSet i yazalım
        TreeSet<String>emailsHsTs=new TreeSet<>(emailsHs);//TreeSet a'dan Z'ye sıraladı.
        System.out.println(emailsHsTs);//[amail@gmail.com, bmail@gmail.com, cmail@gmail.com, dmail@gmail.com, email@gmail.com, fmail@gmail.com, hmail@gmail.com, kmail@gmail.com, tmail@gmail.com, vmail@gmail.com, ımail@gmail.com]

        long t3=System.nanoTime();

        //------------------------------------------------------------

        System.out.println(t2-t1);//TreeSet
        System.out.println(t3-t2);//HashSet












    }
}