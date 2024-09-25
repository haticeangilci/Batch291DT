package d4operator_casting_scanner06092024;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.

        1- Scanner class'i, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
        2- Tek bir Scanner objesi, aynı girdi kaynağından farklı türlerde veri okuyabilir.
        3- next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan girdi almayı sağlar.*/

        //------------------------------------------------------------
        //Ornek 1 : Kullanicidan yasini isteyip console’a yazdiriniz.
        //Example 1: Ask the user for their age and print it to the console.

        //1.adım:Scanner class dan object oluştur.
        //System.in (standart giriş) üzerinden klavyeden giriş okunur.

        Scanner input = new Scanner(System.in);//Oluşturulan objet input

        //2.adım: kullanıcıya bilgi ver
        System.out.println("Lütfen yaşınızı giriniz:");

        //3.adım: Oluşturduğumuz obje üzerinden uygun method ile
        // kullanıcının girdiği veriye alıp memoriye yerleştirelim

        byte age = input.nextByte();// Oluşturalan object üzerinden uygun method seç.
        System.out.println("Girilen Yaş:" + age);

        /*Java'da kütüphane, belirli bir işlevselliği sağlayan class'lar, interface'ler ve metotlar koleksiyonudur.
        Bu kütüphaneler, Java geliştiricilerinin daha hızlı ve etkili bir şekilde programlama
        yapabilmelerine olanak tanır. Java kütüphaneleri genellikle .jar (Java Archive) dosyaları olarak dağıtılır.
        Java'nın standart kütüphanesi (Java Standard Library), Java Development Kit (JDK) ile birlikte gelir
        ve dilin temel yapısını oluşturur. Java'da bir kütüphaneyi kullanabilmek için import anahtar kelimesi
        ile belirtilen class'lari projenize eklemeniz gerekir.*/











    }
}
