package d8stringmanipulations13092024.Denemeler;

import java.util.Scanner;




        public class Deneme_Arrays {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int toplamHak = 3; // Kullanıcının toplam hak sayısı
                int kalanHak = toplamHak; // Başlangıçta kalan hak sayısı toplam hak sayısına eşittir

                while (kalanHak > 0) {
                    System.out.println("Bir tahminde bulunun (kalan hak: " + kalanHak + "): ");
                    // Kullanıcının tahminine (veya eylemine) dair bir kod yer alacak.
                    // Örneğin, kullanıcıdan bir sayı girmesini isteyebiliriz.
                    int tahmin = scanner.nextInt(); // Kullanıcı tahmini alırız

                    // Burada tahminle ilgili bir kontrol yapabiliriz. Bu örnekte basit bir kontrol yapıyoruz.
                    if (tahmin == 42) { // Doğru tahmin
                        System.out.println("Tebrikler, doğru tahmin yaptınız!");
                        break; // Doğru tahminde duralım
                    } else {
                        kalanHak--; // Yanlış tahmin edersek kalan hakkı azaltıyoruz
                        System.out.println("Yanlış tahmin, kalan hak: " + kalanHak);
                    }
                }

                if (kalanHak == 0) {
                    System.out.println("Haklarınız kalmadı, oyunu kaybettiniz.");
                }

                scanner.close(); // Kaynakları serbest bırakma
            }
        }


