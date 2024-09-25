package d11loops23092024;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {
        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

      X X X X X
      X X X X X
      X X X X X    */
       /* Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int column1 = input.nextInt();

        int row = 3;
        int c1 = 5;

        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= c1; k++) {
                System.out.print("X ");
            }
            System.out.println();// üstteki print yanyana yazdırır. Pointer'i bir alta aldık.
        }*/

        //------------------------------------------------------------------------------------
        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

	    *
	    * *
	    * * *
	    * * * *

        */
        System.out.println("----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayısal değeri giriniz: ");
        int r = scanner.nextInt();
        for (int i = 1; i <r ; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
