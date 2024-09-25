package d3_datatypes_contact_operators05092024;

public class Concatenation {
    public static void main(String[] args) {
      //Ornek 1: Bir String ve iki int variable olusturun. String degeri ile Integer’larin toplamini console’a yazdirin.
      //Example 1: Create a String and two int variables. Print the string value and the sum of the Integers to the console.
       String s = "apple";
       int a = 10;
       int b = 11;
        System.out.println(s + a + b);// apple1011//bu concate-birleştirme
        System.out.println(s + (a + b));// apple21// bu toplama
        System.out.println(s + a * b);//apple110//öncelikle çarpma sonra concate
        System.out.println(a + b + s);//21apple









    }
}
