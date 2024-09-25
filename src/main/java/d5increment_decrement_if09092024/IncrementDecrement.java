package d5increment_decrement_if09092024;

public class IncrementDecrement {
    public static void main(String[] args) {

        //-----------------------increment
        int a = 5;
        a = a + 2;
        System.out.println(a);//7

        a += 2;
        System.out.println(a);//9

        //-------carpma
        int d = 6;
        d = d * 2;
        System.out.println(d); //12
        d *= 2;
        System.out.println(d); //24

        //------bolme
        int e = 24;
        e = e / 2;
        System.out.println(e); //12
        e /= 2;
        System.out.println(e); //6

        //-------------1 ile increment
        int f = 13;
        f = f + 1;
        f += 1;
        f++;// en kısa yolu 1 arttır.
        System.out.println(f);

        //------1 decrement

        int h = 15;
        h= h - 1;
        h-= 1;
        h--;
        System.out.println(h);

        //------------------Post Increment (i++), Pre Increment (++i)
        int i =10;
        int k = i++;//(int k=10) direk atıyor, sonra i++=i ye 1 ekliyor ,
        // döngülerde kullanılıyor.Önce eşitliyor sonra arttırıyor
        System.out.println(k);//10
        System.out.println(i);//11

        int m = 15;
        int n = ++m;// ilk başta n neyi arttıracağını bilmiyor, atlıyor sonra  m yi arttırıyor. n ye atıyor.
        System.out.println(n);//16
        System.out.println(m);//16

        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(t);//19
        System.out.println(s);//19



    }
}
