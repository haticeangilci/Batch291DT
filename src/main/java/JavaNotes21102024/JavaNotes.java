//*Non-primitive Data types:
//    Ornegin String class non-primitive bir data type'dir.
//    Not 1: Uretilen her bir class ayni zamanda bir "non-primitive" data type dir.
//     Bu yuzden "non-primitive" data type'lar sinirsiz sayidadir denilebilir.
//    Not 2: Non-primitive data type'larin isimleri buyuk harf ile baslar
//    Not 3: Non-primitive'ler icin Java memory'de buyuklugune gore degisen boyutlarda yer ayirir   */
//    //String Data Tipi (Class): String data tipi, cumleler, kelimeler, semboller, rakamlar içerebilir
//*Soru: primitive ve non-primitive data type'lari arasindaki farklar nelerdir? (İnterview sorusu)
//    1) "primitive" ler sadece bizim atadigimiz degeri icerir
//        "non-primitive" ler bizim atadigimiz degeri ve methodlari icerir
//    2) "primitive" ler kucuk harfle baslar, "non-primitive" ler buyuk harfle baslar
//    3) "primitive" leri Java uretmistir ve 8 tanedir
//       "non-primitive" leri Java ve kod yazanlar uretebilir, sinirsiz sayidadir.
//    4) "primitive" ler memory'de data type'larina gore sabit boyutta bellek kullanir
//       "non-primitive" ler icin Java memory'de buyuklugune gore degisen boyutlarda bellek kullanabilir  */
//*Java primitive data tiplerine yeni ozellikler(methodlar) ekleyerek yeni bir yapi olusturdu. Bu yapiya wrapper class denir.
//        Wrapper class’lar, Java'nın primitive veri türlerini object olarak  temsil etmek için kullandığı class’lardir. Bu özellik, primitive veri türlerini koleksiyonlarda
//        (örneğin ArrayList gibi) kullanabilmek için oldukça kullanışlıdır, çünkü Java'da koleksiyonlar
//        sadece Object referans türlerini kabul eder. Ayrica en onemlisi girdigimiz veriler uzerinde
//        method kullaniminin da yolunu acar.*/
//        //Wrapper'lar buyuk harfle baslar cunku class'tirlar.
//        // primitive          : char          - boolean - byte - short - int         - long  - float  - double
//        //wrapper class       : Character     - Boolean - Byte - Short - Integer     - Long  - Float  - Double
////-----------------------------
//        //Autoboxing - Unboxing
//        /*Java'da primitive(ilkel) türler ve wrapper sınıfları arasında otomatik dönüşüm yapabilen
//        autoboxing ve unboxing mekanizmaları vardır. Autoboxing, primitive bir türü otomatik olarak onun
//        wrapper sınıfına çevirir. Örneğin, long'u Long'a dönüştürür. Unboxing ise tam tersi bir işlem yapar,
//        Long'u long’a dönüştürür. Ikisi de otomatik gerceklesir.*/
//
//
//        +,-,*,/ islemleri Java'da matematikte kullanildigi gibi kullanilir
//        Not 1: Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
//        Not 2: Eger sonuc tamsayi degilse (en az bir değer ondalıksa) java sonucun ondalik kismini silerek onu int'e donusturur.
//        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
////-------------------------------------------------------------
//        /*2) Java da "logical operator" lar.
//       ==> AND (&&) isleminden true alabilmek icin her sey true olmalidir
//       AND islemini carpma olarak dusunebiliriz
//       ==> OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
//       OR isleminde sonucun false olabilmesi icin hersey false olmalidir
//       //==> NOT Operatoru (!) true olani false , false olani true yapar
//       !true  ==> false
//       !false ==> true
//       !!true ==> true*/
//        //---------------------------------------------------------
//        /*3) Comparison (Karsilastirma) Operators
//       <, >, <=, >=, ==, !=
//       Not: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz*/
//*Java'da Scanner class'i, kullanıcıdan veya farklı bir kaynaktan girdi almanın oldukça kolay bir yolunu sağlar.
//        1- Scanner class'i, farklı veri tiplerini (int, float, double, String, boolean vb.) kolaylıkla okuyabilir.
//        2- Tek bir Scanner objesi, aynı girdi kaynağından farklı türlerde veri okuyabilir.
//        3- next(), nextInt(), nextDouble() gibi farklı metotlar, farklı ihtiyaçlara uygun şekillerde kullanicidan girdi almayı sağlar.
////1.adım:Scanner class dan object oluştur.
//        //System.in (standart giriş) üzerinden klavyeden giriş okunur.
////2.adım: kullanıcıya bilgi ver
//        System.out.println("Lütfen yaşınızı giriniz:");
////3.adım: Oluşturduğumuz obje üzerinden uygun method ile
//        // kullanıcının girdiği veriye alıp memoriye yerleştirelim
//*Java'da kütüphane, belirli bir işlevselliği sağlayan class'lar, interface'ler ve metotlar koleksiyonudur. Bu kütüphaneler, Java geliştiricilerinin daha hızlı ve etkili bir şekilde programlama   yapabilmelerine olanak tanır. Java kütüphaneleri genellikle .jar (Java Archive) dosyaları olarak dağıtılır.
//        Java'nın standart kütüphanesi (Java Standard Library), Java Development Kit (JDK) ile birlikte gelir  ve dilin temel yapısını oluşturur. Java'da bir kütüphaneyi kullanabilmek için import anahtar kelimesi  ile belirtilen class'lari projenize eklemeniz gerekir.*/
//        //------------------------------------------------------------
//    /*Sayisal primitive data tiplerinin birbirine donusturulmesine Type Casting denir  Numeric (sayisal) Data Type ==> byte - short - int - long - float - double
//        /*Not 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
//        Bu isleme "AutoWidening" (Otomatik genisletme) denir*/
//        /*Not 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Veri kaybi olusabilir.        Java bu isi otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
//         */ isleme "Explicit Narrowing"(Aciktan Daraltma)denir.
//-------------------------------------------------------------------------------------------------------------------
////Aciklama: Bu kodda, nextInt() çağrısından sonra nextLine() hemen çağrılır.
//        // Ancak, kullanıcının yaşını girdikten sonra Enter tuşuna basmasıyla oluşan
//        // yeni satır karakteri (\n) girdi akışında kalır. nextInt() yalnızca sayısal değeri okur
//        // ve yeni satır karakterini okumaz(akista kalir). Bu yüzden, program nextLine()'a ulaştığında,
//        // hâlâ okunmamış bir yeni satır karakteri bulur ve bunu boş bir satır olarak yorumlar,
//        // böylece kullanıcıdan adını almak için beklemeksizin hemen ilerler.
//        /*Bu sorunu çözmenin yaygın bir yolu, sayısal girdi aldıktan sonra bir nextLine() çağrısı
//        ekleyerek kalan yeni satır karakterini temizlemektir*/
//        //ARASTIRMA ODEVI:Yeni Satir Karakteri (‘\n’) Hatasini duzeltmenin baska yollari var mi?
//        /*ÖDEV CEVAP:
//        1-nextLine() Kullanımı: nextInt()'dan sonra bir nextLine() çağrısı eklemek,
//        akıştaki yeni satır karakterini temizlemenin en yaygın yoludur.
//        2-try-catch Kullanımı: nextInt() çağrısından sonra bir hata oluşursa, bunu yakalayarak
//        bir nextLine() çağrısı ile akışı düzeltmek de mümkündür.
//        3-Flag Kullanımı: Girdi alma işlemini bir bayrak (flag) ile kontrol edebilir ve bu bayrağı
//        kullanarak yeni satır karakterinin temizlenip temizlenmeyeceğini belirleyebilirsiniz.
//        4-Girdi Biçimlendirme: Kullanıcının girdiği veriyi daha iyi biçimlendirmek için printf veya
//        String.format() gibi yöntemlerle yönlendirme yapabilirsiniz.
////equals() iki String'in birbirinin aynisi olup olmadigini kontrol eder.
//        //Bu method boolean return eder(true veya false).
//        //equalsIgnoreCase() iki String'in birbirinin aynisi olup olmadigini
//        //buyuk kucuk harfi dikkate almadan kontrol eder
////“switch” Statement
////switch ifadesi, farklı koşullara dayalı olarak farklı eylemler gerçekleştirmek için kullanılır.
////if -else if'in yaptigini yapar. Okumasi ve yazmasi daha kolaydir.
////genel kullanimda, 3'ten fazla durum varsa switch kullaniriz.(best practise)
////toLowerCase() metodu, bir String içindeki tüm harfleri küçük harfe
//// dönüştürmek için kullanılır.
//*Not : switch condition parantezi icine 1) String 2) int 3) byte 4) short 5) char kullanabilirsiniz
//switch condition parantezi icine 1) long 2) boolean 3) float 4) double kullanilmaz */
//*Yeni switch ifadesi, daha esnek ve güçlü bir yapı sunarak, geleneksel switch-case
//*yapısının daha temiz ve ifade edilebilir hale getirilmesini sağlar.
//Ayrıca, daha önceki switch yapısı değer döndürmezken, yeni switch ifadesi bir değer döndürebilir  ve bu değer doğrudan bir değişkene atanabilir.
//        Yeni switch ifadesinin ana özellikleri:
//        Case değerleri: Birden fazla case ifadesini tek bir işlemle birleştirme imkanı.
//        Arrow (->) Operatörü: Geleneksel break yerine kullanılarak, kodun daha okunabilir olmasını sağlar.*/
//        //----------------------
////String Data Tipi (Class)
////String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.
////length() methodu String'in uzunlugunu dondurur.1’den baslar Not: s.length()-1 her zaman son index'i verir
////charAt(int index) metodu, belirtilen index’te yer alan karakteri döndürmek için kullanılır.
////Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
// //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
// // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.
////substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
////substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)
////2.kullanimi: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna  kadar olan substring'i döndürür.
////contains() method’u herhangi bir karakterin veya karakterlerin String'de  var olup olmadigini kontrol eder.
////contains() methodu true veya false return eder. Boolean
////startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder startsWith() methodu boolean return eder.
//        //------------------
////Bir gerçek sayının sayı doğrusundaki yerinin başlangıç noktasına (sıfıra) olan uzaklığına
//// o sayının mutlak değeri denir. Sifirin mutlak degeri de sifirdir.
////replace() methodu, 2.parametredekini 1.nin yerine koyar. //Kucuk buyuk harfe duyarlidir
//-------------------------------------------------------------------------------------------------------------------------
////Regular Expression (Regex)
//             Meshur Regex'ler (Regular Expression):
//            Bir grup data'yi almak icin kullanilir
//            1) Tum rakamlar ==> [0-9]
//            2) Tum kucuk harfler ==> [a-z]
//            3) Tum buyuk harfler ==> [A-Z]
//            4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
//            5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
//            6) Tum noktalama isaretleri ==> \\p{Punct}
//            7) Tum sesli harfler ==> [aeiouAEIOU]
//               Tum a, x, y harfleri ==> [axy]
//            a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
//            8) Tum kucuk harfler haric: ==> [^a-z]
//            9) Tum harfler haric ==> [^a-zA-Z]
//            Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
//            Sadece space karakteri : \\s
//            Space karakteri haric  : \\S
//            Sadece rakamlar        : \\d  (digit ten geliyor)
//            Rakamlar haric         : \\D
//
////trim() metodu bir String'deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
////split() String'i istediginiz karakterden parcalamaya yarar.
// //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna "method chain (zincir)" denir
////Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.
//        //Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.
//        /*Java’da su donguleri gorecegiz
//        1. for-loop        2. while-loop        3. do-while-loop        4. for-each-loop  Collections’larda)
//        /*1. for-loop
//  for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak için kullanılan bir döngüdür.
//        Döngü başlangıcında kullanılan değişkene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.
//        for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.
//        Bazi durumlarda döngü sonsuz sayıda yinelenir*/
//For (Baslangic Degeri; Loop Calisma Kurali; Artirma/Eksiltme) {
//            Calisacak Kodlar
//        //Artirma ==> Increment, Azaltma ==> Decrement
//        // Baslangic Degeri; Loop Calisma Kurali; Artirma/Eksiltme
////Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
//        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail
//        //Example 1: Starting from a specific character of a String up to a specific character
//        // take all characters as dynamic.
//        //1.yol: Hard Cording , tavsiye edilmez
//        String a = "abcde@gmail.com";
//        System.out.println(a.substring(4, 9));//dinamik olmuyor. İlk yazdığın seneryo için geçerlidir.
//        //2.yol: Dinamik
//        String company1 = a.split("@")[1].split("\\.")[0];
//        System.out.println(company1); //gmail
//        //3.yol : Dinamik
//        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
//        //Bu method olmayan karakterler icin -1 verir.
//        int startingIndex = a.indexOf("@") + 1;//3
//        int enddingIndex = a.indexOf(".");//9
//        String companyName = a.substring(startingIndex, enddingIndex);
//        System.out.println(companyName);
//      let indexOfU = str.indexOf("u"); // 'u' karakterinin ilk bulunduğu yerconsole.log(indexOfU); // Çıktı:24```
//###2. `lastIndexOf()`
//`lastIndexOf()` metodu, dizge içerisinde belirtilen son eşleşmenin dizinini (son konumunu) döndürür. Eğer eşleşme bulunamazsa, -1 değeri döndürülür.
//**Kullanım örneği:**
//```javascriptlet str = "JavaScript ile programlama öğreniyorum";
//let lastIndexOfU = str.lastIndexOf("u"); // 'u' karakterinin son bulunduğu yerconsole.log(lastIndexOfU); // Çıktı:33```
//###3. Diğer Karakterler İçin ÖrneklerŞimdi `y` karakteri için aynı işlemleri yapalım:
//**`indexOf("y")`:**
//```javascriptlet indexOfY = str.indexOf("y"); // 'y' karakterinin ilk bulunduğu yerconsole.log(indexOfY); // Çıktı:10``
//**`lastIndexOf("y")`:**
//```javascriptlet lastIndexOfY = str.lastIndexOf("y"); // 'y' karakterinin son bulunduğu yerconsole.log(lastIndexOfY); // Çıktı:35```
//### ÖzetAşağıda yukarıdaki tüm örneklerin bir arada olduğu bir kod parçası bulunmaktadır:
//```javascriptlet str = "JavaScript ile programlama öğreniyorum";
//let indexOfU = str.indexOf("u");
//let lastIndexOfU = str.lastIndexOf("u");
//let indexOfY = str.indexOf("y");
//let lastIndexOfY = str.lastIndexOf("y");
//console.log(`indexOf("u"): ${indexOfU}`); //24console.log(`lastIndexOf("u"): ${lastIndexOfU}`); //33console.log(`indexOf("y"): ${indexOfY}`); //10console.log(`lastIndexOf("y"): ${lastIndexOfY}`); //35```
//Bu kodu çalıştırarak, dizgede `u` ve `y` karakterlerinin ilk ve son konumlarını öğrenebilirsiniz. Eğer başka bir konuda yardım istiyorsanız, lütfen sorun!
////Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
////isBlank() metodu ise hem hicligi hem de space’i kontrol eder(true verir)
////-------------------
////1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
//---------------------------------------------------------------------------------------------------------------------------
//  /*Java'da Bellek Kullanımı:
//    Java'da bellek (memory) yönetimi, büyük ölçüde Java Virtual Machine (JVM) tarafından otomatik olarak gerçekleştirilir.
//    Java'da iki ana bellek alanı vardır: Heap (yığın) ve Stack (yığın).
//    1. Heap Belleği:
//    a) Heap, dinamik olarak oluşturulan nesneler (Object ve Array gibi non-primitive türler) için kullanılır.
//    b) new anahtar kelimesi ile oluşturduğunuz nesneler heap bölgesinde saklanır.
//    c) Heap, daha büyük ve karmaşık veri yapılarının saklandığı bellek alanıdır.
//    Bu nedenle Garbage Collector (çöp toplayıcı) tarafından yönetilir.
//    Garbage Collector, kullanılmayan nesneleri bellekten otomatik olarak temizler.
//    Heap belleği, yavaş ancak büyük veri yapıları için uygundur.
//    2. Stack Belleği:
//    a) Stack, metod çağrıları ve lokal değişkenler (örneğin, int x = 10;) için kullanılır.
//    b) Primitive türler (int, char, boolean vb.) stack belleğinde saklanır.
//    c) Stack, LIFO (Last In, First Out) prensibiyle çalışır. Yani en son eklenen veri ilk çıkar.
//    d) Stack, hızlı ve verimli bir bellektir, ancak boyutu sınırlıdır.
//    e) Non-primitive türlerin referansları (adresleri) stack belleğinde saklanır. Bu referanslar,
//    heap belleğinde bulunan nesnelere işaret eder.Bir ülkenin navigasyon sistemi gibi.Heap, daha büyük veri yapılarını barındırır ve adresleme yoluyla stack'ten erişilir.
//    Büyük bir şehir haritasına benzetilebilir, çünkü karmaşık veriler burada tutulur ve doğrudan erişilmez,
//    sadece referanslar aracılığıyla erişilir.
//        memory kullanimi:
//        String'lerin esitliklerini kontrol ederken "==" yerine equals kullaniriz
//        cunku == kullanirsaniz, iki String'i karsilastirirken adreslerini kontrol eder.
//        equals() methodu ise iki String'i karsilastirirken sadece degerlerine bakar,
//        degerleri ayni ise bu iki String esittir der, degerler farkli ise bu iki String farklidir der
//         //String str1="merhaba";
//        //String str5="merhaba";
//        String str1 = new String("Merhaba");
//        String str2 = new String("Merhaba");
//        String str3 = str1;
//        System.out.println(str1 == str2); //false
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(str1 == str3); //true
//  //Döngüler (Loops) tekrar eden kodlama işlerini kolaylaştırmak için kullanılır.
//        //Tüm kod parçalarını belirli bir kural döngüsü içinde tekrarlamak için kullanılır.
//        /*Java’da su donguleri gorecegiz
//        1. for-loop
//        2. while-loop
//        3. do-while-loop
//        4. for-each-loop (Collections’larda)*/
//        //-----------------------
//        /*1. for-loop
//        for döngüsü, temel olarak bir kod blogunu belirli bir sayıda ve üst üste çalıştırmak
//        için kullanılan bir döngüdür.
//        Döngü başlangıcında kullanılan değişkene döngü içinde müdahale edilerek tekrar sayısı değiştirilebilir.
//        for döngüsü, yineleme(iteration) sayısı bilindiğinde belirli döngüler için kullanılır.
//        Bazi durumlarda döngü sonsuz sayıda yinelenir
//   for (Baslangic Degeri; Loop Calisma Kurali; Artirma/Eksiltme) {
//            Calisacak Kodlar
//
////charAt() methoduna index verince size karakteri getirir.
//        //break keyword’u, bir döngüyü veya bir switch ifadesini erken
//        // bir şekilde sonlandırmak için kullanılır.
//        //Artirma ==> Increment, Azaltma ==> Decrement
//        // Baslangic Degeri; Loop Calisma Kurali; Artirma/Eksiltme
//        for (int i = 1     ;  i < 5             ;     i++) { // i = i + 1;
////------------for kalibi
//*        for (baslangic degeri; loop calisma kurali; artirma/azaltma){
//            calisacak kodlar
//        }*/
//        //------------while kalibi
//*        baslangic degeri
//                while (loop calisma kurali){
//                        calisacak kodlar
//                        artirma/azaltma
//                }*/
////Array - dizi
//            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
//            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
//            bir String dizisi sadece String değerler saklayabilir.
//            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
//            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
//            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
//            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
//            6)Array’ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
//            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
//        //Array olusturmak
////1.yol:for loop
//        int totalChar = 0;
//        for (int i = 0 ; i< cities.length; i++){ //length field'dir method değildir.
//            totalChar = totalChar+cities[i].length();//length() methoddur.
//            //Dizilerde: length kullanılır (parantezsiz).
//            // String'lerde: length() kullanılır (parantezli).
//        //2.yol:for each loop
//            //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
//            //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
//            //variable ismi olarak da genel kabul w’nun kullanilmasidir.
//        /*   for (Datatype variable : array yada collections){
//            calisacak kodlar
//        }*/
////do-while döngüsü, döngü bloğundaki kodun en az bir kere çalışacağından
//        // emin olmak istediğiniz zaman kullanılır. Yani döngüdeki kodlar,
//        // koşul kontrolü yapılırken bile olsa, en az bir kez çalışacaktır.
//        //-------------while
//*        Baslangic degeri
//        while (loop calisma kurali) {
//            calisacak kodlar
//            Artirma/azaltma
//        }
//        */
//        //-------------do - while
//        /*        Baslangic degeri
//        do {
//            calisacak kodlar
//            Artirma/azaltma
//        } while (loop calisma kurali);*/
////---------------
//        //while loop ile do while loop farki nedir?
//        //Asagidaki kodu inceleyiniz. Bu kodda WHILE dongusune giremez cunku sart saglanmiyor.
//        //while-loop da loop'un en basta kirilmasi mumkundur cunku once kural kontrol edilir
//        // sonra islem yapilir
//        int k = 1;
//        while (k < 1) {
//            System.out.println("Ben while loop'um");
//            k++;
//        }
//        //Asagidaki kodu inceleyiniz. do-while loop'da loop'un en basta kirilmasi mumkun degildir.
//        // Once 1 kere calistirilir (tabi sonsuz donguye sokulmazsa) Sonra kural kontrol edilir.
//        int m = 1;
//        do {
//            System.out.println("Ben do while loop'um");
//            m++;
//        }while (m>1);
////binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
//        //binarySearch() methodunu sort() kullanmadan kullanmayiniz
//        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
//        // "-" ==> isaretinin anlami eleman yok demektir
//Yani, metot şu şekilde çalışır:
//Diziyi ikiye bölün.
//Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
//Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
//Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
//Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar
//tekrar edilir.*/
////Cok boyutlu dizi (MultiDimensional Array) temel olarak Array’in içine Array koymak anlamına gelir.
//        // En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
//        // İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.
////MultiDimensional Array nasil olusturulur?
//        int[][] a = new int[3][2]; //3 distaki, 2 icteki eleman sayisi
//        a[0][0] = 5;
//        a[0][1] = 12;
//        a[1][0] = 81;
//        a[1][1] = 45;
//        a[2][0] = 123;
//        a[2][1] = 0;
//*ArrayList, dinamik boyutlu bir array’dir; eleman ekleyip çıkarırken boyutu otomatik olarak ayarlanır.
//         Gerçek hayatta bir alışveriş listesi gibi düşünülebilir.
//         Alışveriş listesi, ürün isimlerini içerir ve bu isimler String türündedir.*/
//        1)Array’ler primitive data type’lari ve reference’lari depolayabilir ama Arraylist’ler
//        non-primitive’leri (reference’lari) depolar
//        2)ArrayListler memory’de Array’lerden daha fazla yer kaplar
//        3)Array’ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
//        4)ArrayList’ler eleman sayisinda esnektirler.
//        5) Array’leri Java niye iptal etmedi?
//            a) Array’ler cok daha hizlidir
//            b) Array’ler memory’de cok az yer kaplarlar
//            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array’ler tercih edilir
//        6) Java’da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
//        veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
//         doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
//         bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
//Array’ler object’tir. Bu yuzden
//    - Heap Memory’de depolanirlar.
//    - Value ile birlikte method’lara da sahiptirler - runtime’da olusturulurlar.
//    Bir Array nasil declare edilir?
//     Array olusturmak icin iki yol vardir :
//    - int myArray[ ] ; Bu daha cok kullanilir
//    - int [ ] myArray;
//    Bir Array nasil olusturulur..
//    int myArray[ ] = new int[6];
//    - Yukaridaki kod length’i 6 olan bir array olusturur.
//    - Biz array’e eleman eklemezsek Java elemanlar icin data type’ina uygun
//    default degerler atar.
//    Eger yukaridaki array’i yazdirirsaniz ekranda {0, 0, 0, 0, 0, 0} gorursunuz
//    Not: Array olustururken length’i yazmazsaniz compile time error alirsiniz.
//    Array’e deger nasil atanir...
//    int myArray[] = new int[3];
//    myArray[0] = 9;
//    myArray[1] = 10;
//    myArray[2] = 11;
//    Veya
//    int myArray[] = {9, 10, 11};
//    Array’in elemanlarina nasil ulasilir ve nasil update edilir ?
//    int myArray[] = {9, 10, 11};
//    Array elemanlarina index’ler kullanilarak ulasilir.
//    myArray[0] ==> 9,
//    myArray[1] ==> 10,
//    myArray[2] ==> 11,
//    NOT 1 : “n” array’in length’i olmak uzere myArray[n-1] son elemani gosterir
//    NOT 2 : Bir Array’de olmayan index’i kullanmak isterseniz “ArraysIndexOutOfBoundsException”
//    hatası alirsiniz.
//     Multi Dimesional Array :
//    Deger Atama -->int arr[][] = { {1, 2}, {3}, {4, 5, 6, 7}, {8, 9} };
//    yazdırma-->System.out.println(Arrays.deepToString(arr));
//    Bir Array’in uzunlugu nasil bulunur?
//    int myArray[] = {9, 10, 11}; --> int size = myArray.length;
//    NOT : String ve Array icin length method’larinda dikkatli olmak gerekir.
//    Strings ==> length()
//    Arrays ==> length
//    Bir Array’in tum eleamanlari nasil yazdirilir?
//    int myArray[] = {9, 10, 11};
//    A) for(int i=0; i<size; i++) {
//    System.out.println(myArray[i]);}
//    B) System.out.println(Arrays.toString(myArray));
//    Bir Array’in tum elemanlari nasil siralanir?
//    int myArray[] = {9, 15, 11};
//    Arrays. sort (myArray);
//    Siralama buyukten kucuge nasil yapilir ?
//    - Once sort methodu kullanilir
//    - Sonra siralamayi ters cevirmek icin loop kullanilir
//    Bir Array’de istenen bir elemanin varligi nasil kontrol edilir?
//    binarySearch() methodu belli bir elemanin bir array’de olup olmadigini kontrol etmek icin kullanilir.
//    Not: binarySearch() methodunu kullanmadan once mutlaka sort() methodu kullanilmalidir.
//    int[ ] numbers = { 2, 4, 6, 8 };
//    System.out. println (Arrays. binarySearch(numbers, 2)); =======> 0.index
//    System.out. println (Arrays. binarySearch(numbers, 4)); =======> 1.index
//    Not: Eger bir eleman array’de yoksa output negatif olur.
//    1) O eleman var olsaydi sira numarasi kaç olurdu, bulunuz.
//    2) Sira numarasinin negatif degeri binarySearch() outputu olur
//    System.out.println(Arrays.binarySearch(numbers, 1)); =======> -1
//    System.out.println(Arrays.binarySearch(numbers, 3)); =======> -2
//    System.out.println(Arrays.binarySearch(numbers, 9)); =======> -5
//    Iki array’in esit olup olmadigi nasil kontrol edilir?
//    equals() method’u degerleri ve indexleri birlirkte kontrol edip, boolean bir deger return eder.
//    Bir String nasil array’e cevrilir ?
//    split() method’u String’e ait bir method’dur ve belirledigimiz ayirac’_09_Arrays.Q18 gore String’i parcalara ayirip bir Array’e cevirir.
//        //Java 7: Programlama dilinin sürümüdür.
//        //JDK 7: Java 7 ile yazılım geliştirmek için kullanılan araç setidir.
//        //ArrayList nasil olusturulur?
//   //ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi
//  ArrayList<Integer> ages = new ArrayList<>(); //Java 7 ve sonrasi -type inference -tip cikarimi
// //ArrayList'lere eleman nasil eklenir?
//        //add() metodu, ArrayList'e yeni bir eleman eklemek için kullanılır ve
//        // eklenen elemanı listenin sonuna yerleştirir.
//        ages.add(9);
//        ages.add(12);
//        ages.add(5);
//        System.out.println(ages); //[9, 12, 5]
//
////List'te araya eleman eklemek icin index numarasini yazariz
//ages.add(1, 28);
//  System.out.println(ages); //[9, 28, 12, 5]
//  //add(int index, E element): Bu metot, belirtilen elemanı ArrayList'in belirtilen konumuna ekler.
// // Mevcut elemanlar sağa kaydırılır.
//ages.add(3, 7);
//System.out.println(ages); //[9, 28, 12, 7, 5]
//  ages.add(11);
//  System.out.println(ages); //[9, 28, 12, 7, 5, 11]
////addAll() metodu, bir koleksiyondaki tüm öğeleri mevcut ArrayList'e eklemek için kullanılır.
// // Bu metod, genellikle bir ArrayList'i başka bir koleksiyonun öğeleriyle genişletmek istediğinizde kullanışlıdır.
// //addAll(int index, Collection<? extends E> c): Bu metod, belirtilen koleksiyondaki tüm öğeleri ArrayList'in
//  // belirtilen indeksinden başlayarak ekler. Bu işlem sırasında, var olan öğeler sağa kaydırılır.
//ages.addAll(0, newAges);
//        System.out.println(ages); //[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]
//        //size() metodu, ArrayList'teki öğelerin sayısını döndürür. (int return eder)
//        int totalElement = ages.size();
//        System.out.println(totalElement); //12
//        //-------------------
//        //get(int index) metodu, ArrayList'te belirli bir konumdaki ogeye erismek icin kullanilir.
//        int element = ages.get(3);
//        System.out.println(element); //9, 3.index'teki elemani getirdi
//        //-------------------
//        //set(int index, E element) metodu, ArrayList'te belirtilen indeksteki öğeyi verilen
//        // yeni öğeyle değiştirir.
//        // Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.
//        Integer a = ages.set(1, 25);
//        System.out.println(a); //2, eski deger yani degistirecegi deger
//        System.out.println(ages); //[1, 25, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]
////indexOf(Object o) metodu, belirli bir öğenin ArrayList içerisindeki ilk görüldüğü indeksini döndürmek
// // için kullanılır. Eğer verilen öğe ArrayList içinde mevcut değilse, bu metod -1 değerini döndürür.
//
//***//Bir interface, bir class’a nasıl davranması gerektiğini tanımlayan bir sözleşmedir.
//// Bir class, bir interface’i implement ettiğinde, interface’deki tüm yöntemleri implement etmelidir.
////List'i kullanmak, kodunuzun daha esnek ve uyumlu olmasını sağlar.
// //List tipinde bir değişken tanımladığınızda, bu değişkenin farklı List implementasyonlarını
//// (örneğin ArrayList, LinkedList, Vector vb.) tutabilmesi mümkündür.
//
////Cok boyutlu dizi (MultiDimensional Array) temel olarak Array’in içine Array koymak anlamına gelir.
//// En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
//// İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.
////MultiDimensional Array nasil olusturulur?
//int[][] a = new int[3][2]; //3 distaki, 2 icteki eleman sayisi
//        a[0][0] = 5;
//        a[0][1] = 12;
//        a[1][0] = 81;
//        a[1][1] = 45;
//        a[2][0] = 123;
//        a[2][1] = 0;
//        //MultiDimensional Array konsola nasil yazdirilir?
//        System.out.println(Arrays.toString(a)); //[[I@4617c264, [I@36baf30c, [I@7a81197d]
//        //MultiDimensional Array'leri yazdirirken toString() degil, deepToString() method'u kullaniriz
//        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]
//        //MultiDimensional Array'den spesifik bir eleman nasil yazdirilir?
//        System.out.println(a[1][1]); //45
//        //MultiDimensional Array icindeki bir Array nasil yazdirilir?
//        System.out.println(Arrays.toString(a[2])); //[123, 0]
//        //Kisa yoldan MultiDimensional Array nasil olusturulur?
//        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};
//        System.out.println(Arrays.deepToString(students));
//        //[[Ali, Kemal], [Cemal], [Ayhan, Beyhan, Seyhan], [Ceyhan, Burhan]]
//
//
//
//*for each kullandiginizda list’lerde eleman sayisini azaltamazsiniz.
//Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
// boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir. Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.
//---------------------------------------------------------------------------------------------------------------------------
//Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur. Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa, siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur
//Collections.sort(nums); //sort() yapmak icin 1.yol:Collections yardimci class'i kullandik        nums.sort(null); //sort() yapmak icin 2.yol: ArrayList icindekini kullanmak
// int minDiff = nums.get(1) - nums.get(0); //12-10 = 2 min fark olarak kabul ettik
//        //[10, 12, 19, 23]
//for (int i = 1; i < nums.size(); i++) { //1.index'ten baslattik ki, 1.den 0.yi cikaralim
//minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
//}
//System.out.println(minDiff); //2
// //En kucuk farki hangi iki sayidan elde ettigimizi bulalim
////[10, 12, 19, 23]
//for (int i = 1; i < nums.size(); i++) {
//if (nums.get(i) - nums.get(i - 1) == minDiff) {
//  System.out.println(nums.get(i) + " ve " + nums.get(i - 1)); //12 ve 10
//      }
//  }
////Bir list olusturmak icin kisayol
//        List<Integer> myList = Arrays.asList(1, 3, 4, 9, 7);
//        System.out.println(myList); //[1, 3, 4, 9, 7]
//  //1- Arrays.asList() ile oluşturulan liste, sabit boyutludur. Array gibi calismaya baslar.
//// Bu, listenin boyutunu değiştiremezsiniz; yani yeni eleman ekleyemez veya çıkaramazsınız.   //Listin eleman sayisini degistiren methodlari kullanamazsiniz.
////2- Arrays.asList() ile oluşturulan liste, bazı liste işlemlerini desteklemez.
//// Örneğin, remove(), add(), clear() gibi yöntemler desteklenmez.  Ama set() veya size() kullanabilirsiniz
// //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.
////myList.remove(0); HATA
////myList.add(5); HATA
////myList.clear(); HATA
//myList.set(0, 5);
//System.out.println(myList); //[5, 3, 4, 9, 7]
//System.out.println(myList.size()); //5
////ArrayList’lerin sagladigi bazi methodlari kullanmak istiyorsaniz ve eleman sayisini degistirmeyecekseniz asList kullanabilirsiniz
//*Java da Method Olusturma: Java’da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.  Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir     ve bu iç class’in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde      geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */
//        /* Method Creation - Metot Olusturma
//        Java'da method nasil olusturulur?
//        1- main method'un disinda, class'in icinde olusturulur
//        2- Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
//        3- Olusturulan method nasil kullanilir?
//            Main icinden method cagrisi yapilmalidir. Buna Method Call denir.
//*Java Object Oriented Programming bir dildir. Yani her seyi object olarak kabul eder.
//    Object olustururken de iki sey dikkate alinir. Pasif ve aktif ozellikler.
//    Bu gune kadar variable ve methodlar kullandik. Simdi kendi object’lerimizi olusturup kullanacagiz.
//    Bunun icin class’lar olusturup, class’larimizin icine variable ve methodlar
//    ekleyecegiz ki bunlardan object’ler uretebilelim.*/
//    /*  1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
//        2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
//    main methodu oluşturmanız gerekebilir.
//        3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method’lu class olur.
//    Adina da “runner” eklenir.*/
//*6-Constructor nedir?
//    Class’tan object olusturmamizi saglayan bolumdur. Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
//    Bu constructor’lara “default constructor” denir.
//    default constructor ===> Car () */
//    /*7- Constructor nasil olusturulur?
//    Access Modifier + Class ismi + () + {}
//    Kendiniz constructor’inizi olusturdugunuz zaman Java default constructor’i siler
//    ***Method ile Constructor arasindaki fark nedir? (Interview Sorusu)
//    a)Methodlarda return type olur, constructor’larda olmaz
//    b)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
//    c)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.(constructorlar objeleri başlatmak ve class'in başlatılmasını sağlamak için kullanılır.)
//    d)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar
//    !!!Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object’ler olusturabiliriz*/
//        Java’da iki tur constructor vardir
//        a- Parametresiz (default)
//            a) otomatik uretilen parametresiz constructor
//            b) kullanici tarafindan tanimlanan parametresiz constructor
//        b- Parametreli
//  public Car (String brand, String model, int year, boolean hybrid) {
//this.brand = brand; //Bu class'taki brand degerini kullanma, ben sana parametre olarak gonderecegim
//        this.model = model;
//        this.year = year;
//        this.hybrid = hybrid;
//    }*/
////ornek 1: Iki sayiyi carpan bir method olusturunuz.
//    //example 1: Create a method that multiplies two numbers
//    //protected: Bu class'tan erisilebilir.
//    //Bir de sadece miras alinan class’lardan erisilebilir(extends)
//    protected static int multiply(int a, int b) {
//        return a * b;
//    }
//    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
//  //private : Buraya sadece ayni class icerisinden erisilebilir.Diger class'lar erisemez
//    private static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
//        return a * b + c;
//    }
//    //----------------------
////ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
////Eger bir method yeni bir data uretmiyor ise return type'i void olur.void ise return yazilmaz
//    public static void print(String str) {
//        System.out.println(str);    }
//      Polymorphism:
//        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)
//        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
//        Polymorphism (cok bicimlilik) demektir.
//        Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
//        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
//        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/
//        add(3, 5);
//        //-----------------
//        String s = "Java";
//        //s.substring() => Bu methodu bir String objesi uzerinden cagiririz. Boyle metotlara
//        //non-static denir
//        //Math.min() ==> Bu methodu direkt class adiyla cagirdik. Boyle metotlara static denir
//    //String s = "Java";    //s.substring(int beginIndex); ==> tek parametre almis
//    //s.substring(int beginIndex, int endIndex); ==> iki parametre almis
//    //Method ismi + Parametre = Method Signature (metot imzasi) benzersiz olmalidir
//       /* Method Overloading'de sadece parametreler degistirilir.
//       Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.
//    Method Overloading icin;
//    a) Parametre sayisini degistirebilirsiniz.
//    b) Parametre data tiplerini degistirebilirsiniz.
//    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
//    d) Method overloading olustururken return type’in, access modifier’in,
//       static veya non-static olmanin hicbir etkisi yoktur.
//    Soru 1: private method'lar overload edilebilir mi?
//    Cevap 1: private method'lar overload edilebilirler cunku;
//    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
//    ulasilabilir oldugundan overload'a engel degildir.
//    Soru 2: static method'lar overload edilebilir mi?
//    Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
//--------------------------------------------------------------------------------------------------------------------
//  /*Pass by Value (Değer ile Geçiş):
//        Bir değişkenin değerini, yani veriyi, bir metoda parametre olarak ilettiğinizde, aslında o değişkenin
//        bir kopyasını iletirsiniz. Metodun içinde bu kopya değiştirilse bile, orjinal değişkenin değeri değişmez.
//        Degisken ve Object’lerin adreslerinin (reference) kopyasinda calisilir. */
//        /* Pass by Reference (Referans ile Geçiş):
//        Java’da genel olarak “pass by reference” kullanılmaz. Bunda degisken ve object’lerin adresleri direkt methoda gonderilir.
//        Kopya yoktur.Method’a adres yollaninca method, adresi kullanarak orjinal degere ulasir ve degeri degistirebilir.
//         Bu yaklasimda hem adres hem de orjinal veri degisebilir.
//        Dikkat : Java da Object ile calisirken (heap memory’de), Object’in referansı(adresi) degismez ama   bazi Object’lerin orjinal içeriği degisebilir (Mutable-Değiştirilebilir- Nesneler : ArrayList, HashMap,StringBuilder)
//        (Immutable-Değişmez- Nesneler: Integer, String gibi Wrapper Clas’lar,ENUM)
//         Peki Java bunu neden boyle yapar? (Pass by reference kullanımına gore)
//        1- Güvenlik:
//        "Pass by Value," verilerin kontrolsüz değiştirilmesini engeller. Bu, programın güvenliğini
//        artırır çünkü bir metodun içinde değiştirilen veriler, çağrıldığı yerdeki orijinal veriyi etkilemez.
//        2-Performans:
//        Pass by value, Java'nın performans açısından daha verimli çalışmasını sağlar.
//        Adres degisikliginin onune gecilerek hiz saglanir
//  //Variable arguments - Değişken sayida argümanlar
//* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
//    Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.
//    Varargs, aşağıdaki kurallara tabidir:
//    1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
//    Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
//    2- Varargs arka planda Array yapisini kullanir
//    3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
//    4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
//    5- Varargs parametre, sıfır argüman alabilir. main ici add(); olabilir*/
////Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.
////LocalDate java.time paketinde yer alan bir classtir.
//        //Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
//        //Java'da java.time.LocalDate class’i, yerel tarihleri temsil etmek için kullanılır
//        // ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.
//Java'da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
//        //Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi
////ileriki tarihe nasil gidilir?
//        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
//        //Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.
//        LocalDate newDate = myDate.plusYears(1).plusMonths(2).plusDays(4);
//        System.out.println(newDate); //2025-12-06
//ornek 6:Gecmis tarihe nasil gidilir?
//minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
//minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
//minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
//        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/
//        System.out.println(myDate.minusYears(1).minusMonths(3).minusDays(1));
//        //2023-07-01
////of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.
////isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
////isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir
//        boolean t1 = date1.isAfter(date2);
//        System.out.println(t1); //false
//        boolean t2 = date1.isBefore(date2);
//        System.out.println(t2); //true
////Ayin kac cektigini bulalim. Yil ve ay icin YearMonth objesi olusturalim
//            YearMonth yearMonth = YearMonth.of(year, month);
//            //Ayin maksimum gun sayisini bulalim
//            int daysInMonth = yearMonth.lengthOfMonth();
////break'te buradaki kodlar calisir
//        //return icinde bulundugu metodu sonlandirir. Burada main metodu sonlandirir ve        //programin calismasi durur//Java'da Period class’i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır. // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.// Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.
////Kullanım Alanları
////Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek// veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda// ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır. //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.   // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.
////Instant
////ZonedDateTime
//  //Duration
////Clock
// //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html
//*LocalTime Class’ta kullanilan tarih saat formatlari
//        HH : mm ==> 24'lu saat sistemi
//        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
//        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
//        HH : mm : ss ==> saniyeyi gosterir
//        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
//        "mm" "minute" demektir. "MM" "month" demektir.
//        dd-MM-yyyy ==> gun - ay - yil
//        MMM ==> Aug
//        MMMM ==> August
////DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve metni tarih ve saat nesnelerine çözmenize olanak tanır.
//        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
//        // biçimlendirmek için kullanılır.
//        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir
//        LocalTime myCurrentTime = LocalTime.now();
//        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");
//        String formattedTime = dtf1.format(myCurrentTime);
//        System.out.println(formattedTime); //11:14 ÖÖ
////ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.
////https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
////Tokyo'da ayin kaci?
//        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
//        System.out.println(dateInTokyo); //2024-10-04 //Arastirma Odevi: Java bu bilgiyi internetten mi cekiyor?
//1) "StringBuilder" class’da String ureten bir class’tir.
//2) String class kullanarak String üretiriz, Java nicin StringBuilder’i da olusturdu?
//3)String class "immutable" (degistirilemez) String uretir,
//4StringBuilder class "mutable"(degistirilebilir) String üretir.
//        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
//            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
//        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız gereken durumlarda
//            StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
//        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli yöntemler
//         ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık kullanılan yöntemler bulunur.
//        //Immutable - degistirilemez
//        //Bir String variable olusturup, sonra ona baska String degerleri concatenate ettiginizde,
//        // her seferinde Heap Memory’de yeni bir String objesi olusur. Orjinal deger degismez.
//*1-String’i degistirdikten sonra ayni String’e assign ederseniz Java yine yeni bir container olusturur.
//2-Degismis degeri bu yeni container’in icine koyar ve eski container’i gosteren        pointer yeni container’a yonlendirilir
//3-Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici"adressiz olan container’lari siler. GC bellek sızıntılarını önler.
//GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
//Veri memory’de sahipsiz ve guvenliksiz bir sekilde beklemez.
//4-GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir ve uygulamadan bağımsızdır*/
////capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
//        // Buradaki "karakter" kavramıyla kastedilen şey, Java'daki char veri tipindeki karakterlerdir. // char veri tipi, Java'da Unicode karakterleri temsil etmek için kullanılır ve  // her bir char 2 byte (16-bit) yer kaplar.
//*capacity Java’nin size verdigi data depolama yer sayisidir,  length ise size verilen data depolama yerinin kullanilan kismidir
//        ==>Java  baslangic olarak size capacity 16 olarak verir,
//        Siz eger verilen bu capacity’i asarsaniz Java yeni capacity’i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
//        16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/
////1-reverse(): StringBuilder Object'inin içeriğini ters çevirir.String class'ta yoktur
//        StringBuilder sb1 = new StringBuilder("Java is easy");
//        System.out.println(sb1); //Java is easy
//        sb1.reverse();
//        System.out.println(sb1); //ysae si avaJ
//        //-------------------
//        //2- deleteCharAt(int index): Belirtilen konumda(index'te) bulunan karakteri siler.
//        sb1.deleteCharAt(1);
//        System.out.println(sb1); //yae si avaJ
//        //-------------------
//        //3- delete(int start - dahil , int end - haric): Belirtilen aralıktaki karakterleri siler.
//        sb1.delete(0, 2);
//        System.out.println(sb1); //e si avaJ
//        //-------------------
//        //4-replace(int start-dahil, int end-haric, String str): Belirtilen indexteki karakterleri
//        // verilen stringle değiştirir.
//        sb1.replace(0, 2, "hasan");
//        System.out.println(sb1); //hasansi avaJ
////-------------------
////5-insert(int offset, String str): Belirtilen konumdan itibaren verilen stringi ekler.
//// Buradaki offset, eklemenin başlayacağı konumu belirtir ve aslında bir index görevi görür.
//        sb1.insert(2, "34");
//        System.out.println(sb1); //ha34sansi avaJ
//        //6-compareTo() metodunun görevi, iki StringBuilder Objesini karşılaştırmaktır.
//        // int değeri döndürür.Sozluk gibidir.Eğer iki StringBuilder nesnesi birbirine eşitse, 0 döndürür.
//        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden önce geliyorsa, negatif deger döndürür.
//        // Eğer birinci StringBuilder nesnesi ikinci StringBuilder nesnesinden sonra geliyorsa, pozitif deger döndürür.
//        // Farkli olan iki harfin ascii kodlari arasindaki farki verir.
//        // Ornegin; Bu sifir ve birler if'ler icerisinde kullanilarak iki Object arasindaki iliski belirlenmis olur.
//        // Kelimelerin sözlük sıralamasını belirleyebilirsiniz, kelimeleri alfabetik sıraya göre sıralayabilirsiniz.
////-------------------
////7-toString() metodu, StringBuilder nesnesinin içeriğini bir String nesnesine dönüştürür.
//        String str = sb1.toString().toUpperCase();
//        System.out.println(str); //HA34SANSİ AVAJ
//        //String nasil StringBuilder a cevirilir?
//        //Cevirmek istedigimiz String'i StringBuilder'in parantezi icine parametre olarak gondeririz
//        StringBuilder newSb1 = new StringBuilder(str);
//        System.out.println(newSb1); //HA34SANSİ AVAJ, Data type StringBuilder oldu
//        //--------------------------------------
//        //StringBuffer nasil olusturulur?
//        StringBuffer sbf = new StringBuffer("Java");
//        System.out.println(sbf);
//        /*
//1) StringBuffer Java’da String ureten bir diger classtir.
//2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "mutable-degistirilebilir" String uretir
//3) StringBuffer "multi-thread(coklu is parcacigini destekler)" dir,   ama StringBuilder "multi-thread" degildir.
//4) StringBuilder "multi-thread" olmadigi icin StringBuffer’dan daha hizli calisir
// 5) Multi-thread yapilirken, yapilan islerin siralamasi onem arzeder. Yapilan isleri mantikli bir
//        siraya koymak "synchronization" olarak adlandirilir
//        StringBuffer multi-thread oldugu icin ayni zamanda synchronized’dir
//                Uc tane String olusturan class ogrendik;
//                1) Immutable String lazimsa ==> String class
//                2) Mutable String lazimsa , StringBuilder veya StringBuffer
//                                a) StringBuilder'i multi-thread gerekmezse kullaniriz
//                                b) StringBuffer'i multi-thread gerekirse kullaniriz
//        //------------------
//  /*Tek iş parçacığı (Single-Threaded), aynı anda sadece bir görevi işleyebilirken,birden fazla iş parçacığı (Multi-Threaded) aynı anda farklı görevleri işleyebilir ve böylece işlerin daha hızlı ve etkili bir şekilde tamamlanmasına olanak tanır.*/
//        //------------------
//*Senkronizasyon olmadan, birden fazla thread'in aynı veri üzerinde çakışan değişiklikler yapması
//         (örneğin aynı hesaptan para çekilmesi) veri yarışı (race condition) denilen duruma yol açar ve  bu da veri kaybına veya tutarsızlığa sebep olabilir. Senkronizasyon mekanizması,
//bu tür sorunları önleyerek veri bütünlüğünü ve programın doğru çalışmasını sağlar.*/
////Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
//    static double pi; //global variable
//    //-------------------
//    static { //static block
//        pi = 3.14;
//        System.out.println("Static block 1");
//    }
//    //-------------------
//    public static void main(String[] args) {
//        /*“static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını   veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.
//Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
//Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
//bir şekilde hazır olmasını sağlar.*/
//System.out.println(pi);
//System.out.println("main method ici");
//* Access Modifier (Erişim Belirleyici)
//       1)public
//       2)protected
//       3)default
//       4)private
//       public > protected > default > private
//       public      ==> public olanlar her class’dan kullanilabilir
//       protected   ==> protected olanlar baska package’lardan kullanilamaz, ancak baska package’larda child classlar icinden kullanilabilir
//       default     ==> default olanlar baska package’lardan kullanilamazlar
//       private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler
//       Soru: ”protected ile default" arasindaki farki söyleyiniz?
//       Cevap: protected olanlar baska package’lardan kullanilamaz ancak baska package’larda
//       child classlar icinden kullanilabilir. default olanlar baska package’lardan kullanilamazlar
//     public String stdName = "Ali Can";
//    protected String address = "Istanbul";
//    String email = "alican@gmail.com"; //Hicbir sey yazmazsak default olur
//    private String tcKimlik = "1234567891";
//*   @Override
//    public String toString() {
//        return "Student{" +
//                "stdName='" + stdName + '\'' +
//                ", address='" + address + '\'' +
//                ", email='" + email + '\'' +
//                ", tcKimlik='" + tcKimlik + '\'' +
//static, bir değişkenin veya bir method’un Class’a ait olduğunu ve Class’in bir örneği (Object’i)
//    // oluşturulmadan kullanılabileceğini belirtmek için kullanılan bir anahtar kelimedir.
//    1) static variable veya static methodlar (class member) tum object’ler icin ortak elemandir
//    2) static class member’lar uzerinde yapilan degisiklikler tum objectleri etkiler.
//    3) static class member’lar class’a, non-static class member’lar object’lere aittir
//    4) static class member’lara ulasmak icin object olusturmaya gerek duyulmaz,
//        ama non-static class member’lara ulasmak icin object olusturmak sarttir
//    5) static variable’larin diger adi class variable’dir,
//        non-static variable'larin diger adi instance variable veya object variable’dir
////-------------------
//    //OOP (Object Oriented Programming -  Nesne Tabanlı Programlama)
//    //Gerçek hayatta gördüğümüz birçok Object'in (nesnenin) bilgisayar ortamına aktarılma şeklidir.
//    //Yani bir object'in rengi, durumu, ismi, üretim yılı gibi birçok özelliklerin bilgisayar
//    // ortamında gösterilmesi buna örnek olarak verilebilir.
//    //-------------------
//    /*Object Yönelimli Programlamanın Faydaları:
//    1) Object oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe olanak sağlar.(String gibi)
//    2) Class'larin 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar
//    ile çalıştırılabilir. Substring() method’u 1 kere yazilmis ama surekli kullanabiliyoruz.
//    3) Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
//    4) Object'ler birbirinden bağımsız olduğundan bilgi gizliliği konusunda avantaj sağlar.
//    5) Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir class’ ta değişiklik
//    yapılıp tüm projelerde çalışması sağlanır. Bu zaman kaybını büyük ölçüde azaltır.*/
//    //-------------------
//    /* OOP’leri 4 temel özellikte inceleyebiliriz.
//    1. Inheritance - Miras Alma
//    2. Polymorphism - Çok Biçimlilik
//    3. Encapsulation - Kapsülleme
//    4. Abstraction – Soyutlama
//
////-----------------------------------------------------------------------------------------------------------------------------------------
//Java DateTime hesaplaması;
//Java'da tarih ve saat hesaplamaları yaparken, Java'nın kullandığı tarih ve saat bilgileri, işletim sisteminin sağladığı zaman bilgisinden alınır. Java, zaman ve tarih bilgilerini işletim sisteminin saatinden alır ve o anki sisteme göre bu bilgileri işler.Java'da tarih ve saat hesaplamaları için kullanılan bazı sınıflar şunlardır:1. **java.time.LocalDate** ve **java.time.LocalTime**: Tarih ve saati, sistemin yerel saatine göre alır, ancak saat dilimi bilgisi içermez.
//2. **java.time.LocalDateTime**: Sistemden alınan yerel tarih ve saati, saat dilimi olmadan temsil eder.
//3. **java.time.ZonedDateTime**: Saat dilimi bilgisi ile birlikte tarih ve saati alır. Bu, dünya çapında farklı saat dilimleriyle çalışırken kullanılır.
//4. **System.currentTimeMillis()**: 1 Ocak 1970'ten itibaren milisaniye cinsinden geçen süreyi verir ve bu değer de işletim sisteminin saatine dayanır.
//5. **java.util.Date** ve **java.util.Calendar** (eski yöntemler): İşletim sisteminden alınan zamana dayalı olarak tarih ve saat bilgilerini tutar.
//Yani, Java çalıştığı cihazın yerel tarih ve saat bilgisini işletim sistemi aracılığıyla alır ve bu bilgiyi farklı sınıflar aracılığıyla manipüle eder.
//Java'da **ZoneId** sınıfı, dünya üzerindeki farklı saat dilimlerini temsil eder ve bu saat dilimleri belirlenirken *IANA (Internet Assigned Numbers Authority) Time Zone Database* kullanılır. Bu veri tabanı, dünya çapındaki saat dilimlerini standartlaştırır ve her dilim bir kimlik ile tanımlanır.
//### Java'da ZoneId Dilimlerinin Belirlenme Şekli:
//1. *IANA Time Zone Database*:
//   Java, zaman dilimlerini IANA tarafından sağlanan zaman dilimi veritabanından alır. Bu veritabanında her zaman dilimi, coğrafi bir bölge adı ve bazen de özel bir tanım ile belirlenir.
//Örneğin:
//   - "Europe/Istanbul"
//   - "America/New_York"
//   - "Asia/Tokyo"
//
//   Bu bölgeler, coğrafi olarak belirlenmiş zaman dilimlerine karşılık gelir ve IANA tarafından düzenli olarak güncellenir. IANA veritabanı, yaz saati uygulamaları (DST) ve zaman dilimi değişikliklerini de içerir, bu sayede güncel zaman dilimi bilgileri sağlanır.
//2. *ISO 8601 Standardına Dayalı UTC Ofsetleri*:
//   Saat dilimleri ayrıca UTC'ye (Coordinated Universal Time) göre pozitif veya negatif bir ofsetle de belirtilebilir. Örneğin:
//   - UTC+02:00
//   - UTC-05:00
//
//   Bu, saat diliminin UTC'ye göre farkını temsil eder ve bazı durumlarda sabit bir ofset olarak kullanılabilir.
//3. *Yaz Saati Uygulaması (Daylight Saving Time - DST)*:
//--------------------------------------------------------------------------------------------------------------------------------------
//Bazı ZoneId dilimlerinde yaz saati uygulaması olabilir. IANA veri tabanında bu bilgiler de yer alır ve Java, belirli bir zaman diliminde yaz saati uygulaması geçerli olup olmadığını otomatik olarak tanır ve saatleri buna göre ayarlar.
//4. *Sistem Zaman Dilimi*:
//   Java uygulamaları çalıştıkları sistemin saat dilimini varsayılan olarak kullanır. Örneğin, eğer bir Java uygulaması Türkiye'de çalıştırılıyorsa, varsayılan saat dilimi "Europe/Istanbul" olacaktır.
//### Java'da ZoneId Kullanımı Örnekleri:
//java
//// Sistemin varsayılan saat dilimi
//ZoneId defaultZone = ZoneId.systemDefault();
//System.out.println("Varsayılan saat dilimi: " + defaultZone);
//// Spesifik bir saat dilimi
//ZoneId istanbulZone = ZoneId.of("Europe/Istanbul");
//System.out.println("İstanbul saat dilimi: " + istanbulZone);
//// UTC Ofseti ile saat dilimi
//ZoneId utcPlus2 = ZoneId.of("UTC+02:00");
//System.out.println("UTC+02:00 saat dilimi: " + utcPlus2);
//### Özetle:
//Java'daki **ZoneId** dilimleri, dünya genelindeki saat dilimlerini standart bir şekilde tanımlayan IANA Time Zone Database'e dayanır ve bu dilimler coğrafi bölgelere göre veya UTC'ye göre ofsetlerle belirlenir. Ayrıca yaz saati uygulamaları gibi detaylar da bu veri tabanında yer alır ve Java tarafından otomatik olarak yönetilir.
//--------------------------------------------------------------------------------------------------------------------------------------
//Java'da **StringBuilder** sınıfı, özellikle *performans* ve *bellek verimliliği* nedeniyle kullanılır. Bunun nedeni, Java'daki String nesnelerinin *değişmez (immutable)* olmasıdır. Yani bir kez oluşturulduktan sonra bir String nesnesi değiştirilemez. Bu durum, çok sayıda string işlemi yapıldığında performans kaybına ve gereksiz bellek kullanımına neden olabilir.
//### String ve StringBuilder Farkı:
//1. **String nesneleri değişmezdir (immutable):
//   String ile her yeni ekleme, birleştirme veya değiştirme işlemi yapıldığında yeni bir String nesnesi oluşturulur. Bu süreç şu şekilde işler:
//   - Mevcut String birleştirilir veya değiştirilir.
//   - Yeni bir String nesnesi oluşturulur.
//   - Eski String nesnesi bellekte atıl durumda kalır (GC - Garbage Collection tarafından temizlenene kadar).
//   Bu durum, çok sayıda string manipülasyonu içeren döngüler veya işlemler yapıldığında, büyük miktarda gereksiz nesne oluşturulmasına ve performans kaybına yol açar.
//2. **StringBuilder değiştirilebilir (mutable) bir sınıftır**:
//   StringBuilder, oluşturulan bir string üzerinde değişiklik yapmaya olanak tanır, yani aynı nesne üzerinde işlemler yapılır. Yeni nesneler oluşturulmaz. Bu da performansı artırır ve bellekteki yükü hafifletir.
//### StringBuilder Kullanımının Avantajları:
//1. *Verimlilik*:
//   Çok sayıda string birleştirme veya değiştirme işlemi yapıyorsanız, StringBuilder bu işlemleri değişmez (immutable) nesneler üretmeden, mevcut nesne üzerinde gerçekleştirir. Bu, daha az bellek kullanımına ve daha hızlı işlemlere olanak tanır.
//2. *Daha Az Bellek Tüketimi*:
//   StringBuilder, büyüyen bir tampon (buffer) kullanarak string işlemlerini aynı bellek alanında tutar. Yeni nesneler oluşturulmadığı için bellekte gereksiz yük oluşmaz.
//3. *Daha Hızlı İşlem*:
//   StringBuilder ile yapılan string işlemleri, String kullanarak yapılan işlemlerden çok daha hızlıdır, çünkü her adımda yeni nesneler yaratılmaz ve mevcut nesne üzerinde işlem yapılır.
//### Örnek:
//java
//// String ile birleştirme
//String result = "";
//for (int i = 0; i < 1000; i++) {
//    result += "test"; // Her adımda yeni bir String nesnesi oluşturuluyor.
//}
//// StringBuilder ile birleştirme
//StringBuilder sb = new StringBuilder();
//for (int i = 0; i < 1000; i++) {
//    sb.append("test"); // Aynı StringBuilder nesnesi üzerinde işlem yapılıyor.
//}
//String finalResult = sb.toString(); // Sonuç String'e dönüştürülüyor.
//
//Bu örnekte, StringBuilder kullanmak, özellikle döngüde çok sayıda string birleştirme işlemi yapıldığında daha verimli olur.
//### StringBuffer ile Farkı:
//StringBuilder, StringBuffer'ın benzeri olsa da, *thread-safe* (çoklu iş parçacığı) değildir. Eğer kodunuzda birden fazla iş parçacığı aynı string verisini değiştirmeye çalışmıyorsa, StringBuilder kullanmak daha performanslıdır. StringBuffer ise senkronizasyon sağlar ancak bu, performans açısından bir miktar maliyetlidir.
//### Sonuç:
//Java'da **StringBuilder**, özellikle string manipülasyonları için çok daha hızlı ve bellek açısından verimli bir çözüm sağlar. String nesnelerinin değişmez doğasından kaynaklanan dezavantajları aşmak için tercih edilir ve bu nedenle sık sık, çok sayıda string işlemi yapılması gereken durumlarda kullanılır.
//
//     //-----------------------------------------------------------------------------------------------------------------------------------
//    /*1.Inheritance, OOP’nin dort temel ozelliginin 1.sidir.    Ozellikleri bir class'tan diğer class'lara alan bir kavramdır.*/
//    /*Bunun Java daki karsiligi sudur: Siz bir class olusturacaksiniz ama daha once olusturulmus
//    bir class sizin istediginiz ozelliklerin bircogunu kapsiyor.
//    O zaman direkt yeni olusturdugunuz classi, ozelliklerini kullanmak istediginiz classa ‘child’ yapmalisiniz. Bunu da ‘extends’ keyword’unu kullanarak yapiyoruz.*/
//  Inheritance’in Faydalari nelerdir?
//    1) Kodun yeniden kullanılmasına yardımcı olur.
//    2) Ana kodun tekrar yazılmasına gerek olmadığı için, daha az kod yazarak, zamandan ve
//    emekten tasarruf sağlayabiliriz.
//    3) Kolayca update yapabiliriz.
//    4) Class’lari kuculturuz.
//    5) Daha az geliştirme ve bakım maliyetine yol açar.
//       //-------------------
//    //a) Java ‘Multiple Inheritance' i desteklemez. ‘Single Inheritance’ i destekler.
//    //b) Parent ve birden fazla child ile olusturulan inheritance yapilanmasina
//    //   'Hierarchical Inheritance' denir ve Java bunu kabul eder.
//    /*c) Ama coklu parent’lardan yararlanamamak iyi olmadi. Ozelliklerini inherit etmek istedigimiz
//    class’lar birden fazla ise (parent’lar) o durumda Java bize,
//    Apartman tarzi yapilanma olusturmustur.( 'Multi Level Inheritance’) Java bunu kabul eder.*/
//    // Java’da parent’tan child’a olan iliskilere HAS-A Relationship denir
//    // Java’da child’tan parent’a olan iliskilere IS-A Relationship denir
//    HAS-A Relationship, bir class'in başka bir class'i içerdiği ilişkiyi ifade eder.
//    Yani, bir class başka bir class'in bir parçası olduğunda HAS-A ilişkisi vardır.
//    Bu ilişki bileşim (composition) veya toplama (aggregation) ile sağlanır.
//    IS-A Relationship, bir class'in başka bir class'in bir türü olduğu anlamına gelir.
//    Bu ilişki, bir class'in  başka bir class'tan türediği (miras aldığı) durumlarda ortaya çıkar.
//    Bu durum kalıtım (inheritance) ile sağlanır.
//    IS-A ilişkisi child class'tan parent class'a doğru çalışır.    Yani, bir alt class üst class'in bir türüdür.
// ---------------------------------------------------------------------------------------------------------------------
//* instance (örnek) blok, bir Class’in her Object’i (nesnesi) oluşturulduğunda çalışan bir kod bloğudur.
//       Instance bloklarının temel özellikleri şunlardır:
//    1- Her Örnek İçin Çalışır: Instance blok, bir class’in her örneği oluşturulduğunda çalışır.
//    Yani, her yeni object için bu blok tekrar çalışır.
//    2- Kod Tekrarını Önler: Instance blokları kullanarak, her Object’in başlatma işlemlerini veya belirli kod
//    parçalarını tekrar tekrar yazmaktan kaçınırsınız.
//       Gerçek hayattan bir örnek: Bir otomobil Class’i düşünün. Her otomobilin örneği (nesnesi-object’i)
//       oluşturulduğunda, otomobilin rengini ve yakıt türünü belirlemek için instance bloklarını kullanabilirsiniz.
//Örneğin: instance blok, her otomobil Object’i oluşturulduğunda çalışır ve otomobilin rengini siyah ve yakıt türünü benzin olarak başlatır.
//        Bu, her yeni otomobilin aynı başlangıç değerleriyle başlamasını sağlar.
//        Diger ozellikler sonra ayarlanir ki tekrardan kurtuluruz*/
//    //Instance block olusturalim    {
//        System.out.println("Merhaba Java Kullanicilari");    }
//    public static void main(String[] args) {
//        InstanceBlock1 obj1 = new InstanceBlock1(); //Merhaba Java Kullanicilari
//        InstanceBlock1 obj2 = new InstanceBlock1(); //Merhaba Java Kullanicilari
////Senaryo: Subat ayinda fiyatlarda indirim olacak. Class cagirildiginda otomatik price’i alacak
//// ve class’in heryerinde bu degeri kullanacak.
////Scenario: There will be a discount on prices in February. The class will get the price automatically when called
//// and will use this value everywhere in the class
//    //Bir variable olusturup deger atamazsaniz o variable'i initialize etmediniz demektir
//    static double pi; //global variable
//    static int price;
//*“static” blok, bir class’in yüklenmesi sırasında otomatik olarak çalışan ve class’in başlatılmasını veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.  Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
//Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
//         bir şekilde hazır olmasını sağlar.*/
//        System.out.println(pi);
//        System.out.println("main method ici");
//*Constructor Hiyerarsisi- Child class’tan bir object olusturdugunuzda constructor’lar
//    en ustteki parent class’tan baslatilarak alta doğru calistirilir*/
//    //Constructor olusturalim
//    public Vehicle(){
//        System.out.println("Honda, 2023, Benzin");
//    }-----------------------------------------------------------------------------------------------------------------------
////---------------------------------------
////2.Polymorphism:
////Method Overloading + Method Overriding
//
////OOP'nin prensiplerinin 2.sidir. Polymorphism (cok bicimlilik) demektir.
////Bir method’u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
//
////iki cesidi var.
//
//// i.Method Overloading: Bunu gormustuk
//
////ii.Method Overriding (gecersiz kilmak, agir basan)
//// Child class'in Parent'taki methodu degistirerek kullanmasidir.
//
////----------------
////Override isleminde access modifier’larin durumlari ne olmalidir, onu ogrenelim
//
//*Soru1: private method'lar override edilebilir mi?
//Cevap1: private method'lar override edilemezler cunku
//override edebilmek icin o method'a baska bir class'dan ulasabilmek gerekir.
//Ama private method'lar baska classlardan ulasilamaz methodlardir.
//
//Not: child’in access modifier’i parent’tan daha dar olamaz.
//Ornek: parent public - child protected olamaz cunku bu hata,
//Child class'ının eat metodunun, Parent class'ının eat metodundan daha az erişilebilir olmasından kaynaklanır.
// */
////---------------
////Override isleminde access modifier’larin durumlarini ogrendik.
////Simdi de return type durumlarina bakalim.
//
////Parent icinde data type’i olan bir method olusturup child’da override edelim
//
////---------------
////Parent’ta int veri turunde bir method acip, child’da override etseydik ne olurdu?
////---------------
////Peki Parent’ta Class veri turunde bir method acip, child’da override etseydik ne olurdu?
//
//public void eat() {
//    System.out.println("Animals eat...");
//}
//
//public Animal create(){ //Data type Animal'dir
//    return new Animal(); //Animal objesi uretip disari Animal verdiniz
//}
//
//public int add(int a, int b){
//    return a + b;
//}
//
//public Integer multiply(Integer a, Integer b){
//    return a * b;
//} //child'da override edecegiz....bir de super metot cagrisi
//
//public void drink() {
//    System.out.println("Animals drink...");
////---------------------------------------------------------------------------------------------------------------------------------------
//*
//Soru: Peki child bir class’ta Object olusturuldugunda, Parent bunu nasil algiliyor da
//kendi constructor’unu calistiriyor?
//
//Cevap: Super() cagrisi ile yapilir. Super çağrısı, bir child class'ın constructor'unda,
//parent class’in parametresiz constructor'unu çağırmak için kullanılan bir ifadedir.
//
//super() çağrısı, bir child class'ta bir object oluşturulduğunda, otomatik olarak çağrılır.
//Ancak, super() çağrısını manuel olarak da çağırabilirsiniz.
//Bunu yapmak için, super() ifadesini, child class'ın constructor'unun başında kullanabilirsiniz.
//Manuel olarak yazarsaniz parametreli constructor’lari da cagirabilirsiniz.
//
//Neden super cagrisi yapalim?
//
//1- super keyword’unu kullanirsaniz, hem parent class’in methodunu çağırabilir hem de bu
//methodun davranışını child class’in ihtiyacına göre genisletebilirsiniz.
//
//2 - extends ise sadece miras almayı sağlar, ancak parent class’in methodlarını değiştirmez.
//*/
////--------------------------------
//*Soru : Ayni class’taki constructor’lar arasinda gezinebilir miyim?
//Ornegin Car class’tan hem sedan hem de sport modellerini ayni anda alip diger ortak ozelliklerle birlikte
//uretime sokabilir miyim? Evet.
//
//Cevap : Ayni class’taki constructor’lar arasinda gezinmek icin super() silinir ve this() keyword’u kullanilir.
// this() default olarak parametresiz constructor’i secer.
//
//this() ve super() her zaman ilk satirda olmalidir.
//Bu yuzden bir constructor’da ikisi bir arada kullanilamazlar.*/
//
////------------------
//*Soru : super() keyword’u kullanilarak parent class’taki
//constructor’lar degil de, variable’lar ve methodlar secilebilir mi?  Evet.
//
//Cevap : child’da bir constructor icinde, super yazip parantez
// koymadan, nokta koyup parent’taki variable veya methodlara ulasabiliriz */
////----------------------------------------------------------------------------------------------------------D22-OOP-ANIMAL
//*Return type void ise degisim olmaz. Hep void olarak kalir*/
//
////---------------
////Soru2: static method'lar override edilebilir mi?
////Cevap2: static method'lar override edilemezler cunku; static variable veya method'lar tum objeler icin ortaktir.
//// Java static method'larin override edilmesine musaade etmez.
////---------------
//*Final keyword’u: Override’da ozel bir durum vardir:
//
//1- Java’da "final" anahtar kelimesi (keyword) ile işaretlenen bir method, alt class’lar tarafından override edilemez.
//2- Yani, bir class’in child’lari, final olarak işaretlenmiş bir methodu değiştiremez veya üzerine yazamaz.
//3- Bu method, final olarak işaretlenerek nihai ve değiştirilemez hale getirilir.
//4- Final Variables, Final Classes, Final Parametreler’de olabilir.
//
//Sonuc: "Final" kelimesi, programcılara kodlarını daha güvenli ve öngörülebilir hale getirme, optimizasyon sağlama
//veya belirli davranışları zorlamada yardımcı olmak için kullanılır.*/
//
////ODEV: final overload'a engel midir?
////--D22—Honda-------------------------------------------------------------------------------------------
//   /*
// 4- Abstraction(Soyut)
// Abstraction iki bolumden olusur.
// i) Abstract Class:
// Kendisinden object olusturulmaz. Bazi class’lari obje olusturmak amaciyla degil,
// objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
// Baslangic degil, sonuctur. Cünkü bu sınıflar belirli bir nesne grubunu temsil eder ve
// bu gruptaki tüm nesneler için ortak olan özellikleri belirler.
// */
//
// //----------------
//  /*
//1)Abstract method'larin body'si olmaz.Size ne yaptigini soyler,nasil yaptigini soylemez.
//2)Body'si olan method'lara 'non-abstract' veya ‘concrete' (somut) method denir
//3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.
//4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
//5)Abstract class'lar hem 'abstract method' hem de 'concrete method’ icerebilirler.
//6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
// */
//
// //----------------
// //Java’da bir interface veya abstract class içinde main methodu yazmak mümkündür
// //Bir abstract class içinde birden fazla body'siz (gövdesiz) metod, yani abstract metod bulunabilir
// //Abstract Class’lar başka class’lar tarafından extends edilerek kullanılabilir.
// //Java’da bir abstract class, normal (somut) bir class’in child’i olabilir.
////--D22—Student------------------------------------------------------------------------------------------
////3.Encapsulation: Data hiding(Veri Saklama)
//
//// OOP mantiginda class uyelerine erisimi sinirlandirabilirsiniz.
//// Bunu access modifier(erişim değiştiricileri)’larla yapabilirsiniz
//
//*Ama class’a ulasim disinda ‘access modifier’ larla yapamadigimiz bazi seyleri ‘encapsulation’ ile yapabiliriz.
//
//1) Encapsulation, verileri koruma ve gizleme amacı taşır. Encapsulation kullanarak
//read ve write (okuma ve yazma) ozelliklerini birbirinden ayri olarak tanimlayabiliriz.
//
//2) İstedigimize okuma, istedigimize yazma yetkisi veririz.
//***Bazi insanlar bilgiyi sadece
//gorsun ama degistiremesin. (Mesela,bir personel bir rapora fiyat bilgisi girsin-write-
//ama rapor sonucunu(sirket kar zararini) goremesin. Sirket muduru de raporu okusun -read- ama degistiremesin.
//CEO’da maliyet artislarini yansitabilmek icin hem okusun hemde yazsin gibi)
//
//a) Data nasil saklanir?
//Access modifier'larini 'private' yaparak datayi diger class'lardan gorunmez hale getiririm
//boylece data'yi saklamis olurum.
//
//b) Data'yi sakladin ama okuman gerekirse ne yapacaksin?
//get() method'lar olusturarak saklanmis datalari diger class'lardan okuyabilirim
//
//c) Data'yi sakladin ama o data'yi degistirmen gerekirse ne yapacaksin?
//set() method'lar olusturarak saklanmis datalari diger class'lardan degistirebilirim
//
//d)Hem okunabilir hemde yazilabilsin diyorsaniz, hem getter hemde setter method’u ayni anda olusturmaliyiz.
// */
//// Setter metodu yeni data uretmez, var olan datayi degistirir
////bu yuzden return type'lari hep void olmalidir.
//
////Setter metotlar ise private elemanlara deger atamasi gerceklestirdigi icin parametre alirlar.
////ODEV: encapsulation da private ile gizlenen bir veri baska package'dan set method ile degistirilebilir mi?
//Cevap: Evet, private olarak tanımlanan bir veri, başka bir paketten doğrudan erişilemez. Ancak, bu veriyi değiştirmek için sınıf içinde tanımlı bir public veya protected set metodu kullanılabilir. Bu sayede, dışarıdan bu metod aracılığıyla private verinin değeri değiştirilebilir.
//Kısacası: private veri doğrudan erişilemez; ama bir set metodu ile başka paketten değerini değiştirmek mümkün olabilir.
//
////D23---AbcstractChild----------------------------------------------------------------------------------------------------------------
//public abstract class AbstractChild extends Honda{
//    //Bu abstract bir class'tir. Parent'i da abstract.
//    //Parent'inin abstract methodlarini implement etmek zorunda değil
////------------------------------------------------------------
//*
//a) interface’leri parent yapmak icin ‘implements’ keyword’u child icinde kullanilir
//b) extends kullanilmaz cunku bu iki class arasinda kullanilir
//c) AudiA4 Class’i, Engine interface’i icindeki tum methodlari override etmek zorundadir.
//d) AudiA4 Class’i, Engine interface’i icindeki tum methodlari override etmek zorunda
//oldugundan method’larin bas kismina ‘override’ yazmak gerekmez ama tavsiye edilir.
//e) Class icinde access modifier yazilmazsa default kabul edildiginden, mecbur public yazariz
//*/
////Engine e = new Engine(); //HATA, interface'lerden object uretilmez
////-----------------------------------------------------------------------------------------------------------------------------------------
//*Interface (arayüz), class’larin uygulayabileceği bir “sözleşme” olarak düşünülebilir.
// Bir interface, bir veya daha fazla abstract method içerir ve
//bu methodların imzalarını (adlarını ve parametrelerini) belirtir,
//ancak bu methodların nasıl uygulanacağını tanımlamaz.
//Class’lar, bu interface’leri uygulayarak (implement ederek) bu methodları
//kendi ihtiyaçlarına göre tanımlarlar.*/
//
////------------------
////i) interface icindeki method’lar otomatik olarak ‘public’ dir,
//// bu yuzden interface’lerde method olustururken access modifier yazmayiz.(static degillerdir)
//
////ii) interface icindeki method’lar otomatik olarak ‘abstract’ dir, bu yuzden interface’lerde
//// abstract method olustururken ‘abstract’ keyword’unu ve ‘method body’ sini yazmayiz.
//
////--------------------
//
//1) interface’lerden object olusturamazsiniz.(constructor’lari olmadigi icin eksik yapilardir)
//2) interface’ler sadece parent olur
//3) interface’ler yapilmasi sart olan seyleri depolamak icin olusturulur.
//Bu yüzden interface’lere "to do list " de denir.(yapilacaklar listesi)
//
//        child                   parent
//
//        class                   class          ==>     extends
//        interface               interface      ==>     extends -->Bir interface baska bir interface'in child'i olabilir
//
//        class                   interface      ==>     implements
//        interface               class          ==>     olamaz —> Bir interface baska bir class'in child'i olamaz
//*/
//*4- Birden fazla interface'in her birine aynı isimli ve aynı parametre yapısına sahip abstract metodlar koyabiliriz.
//Örneğin, Engine, AC ve Brake interface'lerinin her birinde run() metodunu tanımlayabiliriz.
//Bu durumda, bu interface'leri implement eden child class bu metodları override ettiğinde,
//tek bir override işlemi yeterlidir ve bir belirsizlik (ambiguity) oluşmaz. Override edilen metod,
//tüm interface'lerdeki abstract metodların yerine geçer.*/
////5) Interface’ler de variable’lar default olarak public static final’dir. Yani yazmasaniz da olur
////6) Interface’lerin hepsine ayni isimli variable koyabiliriz. Static olup interface uzerinden ulasildigi icin sorun olmaz.
//*7) Normalde interface icine concrete method konulamaz ama bazi özel durumlarda concrete
//method koymak gerekirse;
//    a) default keywordunu kullanarak bunu yapabiliriz
//    b) static keywordunu kullanarak bunu yapabiliriz
//==>  static keywordunu kullanarak olusturdugumuz concrete methodlara ulasmak icin
//object olusturmaya gerek yoktur. Interface ismi yeterlidir
//==>  default keywordunu kullanarak olusturdugumuz concrete methodlara interface’in child class’indan
//object olusturarak ulasilabilir*/
////Interview Sorusu:
//*a) Abstract class'lar hem abstract method hemde concrete methodlar icerebilir.
//fakat interface’ler varsayilan olarak abstract method icerir.
//   Ama interfacelerde istersek default ve static keywordlerini kullanarak concrete method olusturabiliriz
//b) Abstract class'lar multiple inheritance’i desteklemez ama interface’ler destekler
//c) Abstract class'lar icinde her turlu variable olusturulabilir, interfaceler icindeki variable’lar public, static ve final olmak zorundadir
//d) Interface, concrete class'ın child'ı olamaz. Abstract class, concrete class'ın child'ı olabilir.
//e) Abstract class'lar bir class olduğundan, içinde constructor'lar olabilir. Ancak abstract class'tan doğrudan nesne (object) oluşturulamaz. Yani abstract class'ı new anahtar kelimesi ile kullanarak bir nesne oluşturamazsınız, ancak constructor'ları kullanılabilir ve miras alınan class tarafından çağrılabilir. Interface'lerde ise constructor yoktur, çünkü bir interface'den doğrudan nesne oluşturulamaz. Interface'ler sadece bir sözleşme (contract) sunar.
////--D23—Honda—Abstract
////7) Final methodlar override edilemedigi icin, abstract olamazlar.
//// (***”final” bir access modifier değildir. "final," bir Java anahtar kelimesidir)
//
////----------------
////8) Abstract bir class’in abstract bir child’i olabilir ve abstract child parent’inin methodlarini
//// override etmek zorunda degildir ama isterse de edebilir
//
////----------------
////9) Abstract bir class private olamaz yoksa child’lari ona ulasip override edemez
////--------------------------------------------------------------------------------D24—COLLECTIONS---LinkedList01
//*Collections (koleksiyonlar), Object’leri depolamak ve işlemek için kullanılan
//bir class’lar ve interface'ler kümesidir.
//
//—Collections, çeşitli Object (nesne) işleme yöntemlerini de destekler:
//        Ekleme: Bir nesneyi bir koleksiyona eklemek için kullanılır.
//        Silme: Bir nesneyi bir koleksiyondan silmek için kullanılır.
//        Arama: Bir koleksiyonda bir nesneyi bulmak için kullanılır.
//        Döngüleme: Bir koleksiyonun tüm nesnelerini işlemek için kullanılır.
//
//—Collections, Java programcılarının aşağıdakileri yapmasına olanak tanır:
//        Verileri verimli bir şekilde depolamak
//        Verileri hızlı bir şekilde işlemek(verileri aramak, sıralamak, filtrelemek)
//        Verileri güvenli bir şekilde depolamak*/
//
////--------------------------------
//*Java da Array’ler neden eksik kaldi da Collection’lar gelistirildi?
//Java’da array'ler eksik kaldı çünkü:
//Boyutları statiktir: Bu, array'lerin dinamik olarak büyüyemediği veya küçülemediği anlamına gelir.
//İç içe geçmiş array'ler karmaşıktır: Bu, array'lerin birbirleriyle ilişkili olduğu durumlarda karmaşık ve hata yapmaya müsaittir.
//Array'ler genel olarak verimli değildir: Bu, ekleme, silme ve arama gibi işlemler için genellikle daha yavaştır.
//Collections, bu dezavantajları çözmek için tasarlanmıştır.*/
////List<String> list3 = new List(); //HATA, interface'lerden object uretilmez
////------------------
//*LinkedList: Bağlı bir listedir.
//
//LinkedList’ler de, bir dizi index'e sahiptir. Ancak, bu index'ler,
//LinkedList'in içinde bulunan node'ların konumunu temsil eder.
//
//ArrayList'lerde, bir elemana erişmek için, o elemanın index'ine doğrudan erişilebilir. Ancak, LinkedList'lerde, bir elemana erişmek için, o elemanın bulunduğu node'a erişmek gerekir. Bu, LinkedList'lerde bir elemana erişmenin daha yavaş olmasına neden olabilir.
//
//1) Her eleman, bir önceki ve bir sonraki elemanı işaret eden (pointer) bağlantılara sahiptir. Bu nedenle, ekleme ve silme işlemleri hızlıdır, ancak elemanlara erişim, başka bir elemandan başlayarak ilerlemeyi gerektirir. Yani ArrayList’e gore erisim yavastir.
//ArrayList’lerde get(index) ile hizli erisiriz. Ama LinkedList’ler en bastan istenen eleman mi diye
//tek tek bakar.
//2) Başka bir elemanın başından veya sonundan eleman eklemek veya silmek, hızlı bir şekilde yapılabilir.
//3) Bağlantılar ve düğümler (node) nedeniyle LinkedList, genellikle daha fazla bellek kullanır.*/
//*Sonuc:
//LinkedList’in bu hızlı ekleme ve silme işlemleri, bazı senaryolarda tercih edilmesine neden olurken, veriye doğrudan erişim gerektiren durumlarda ArrayList daha uygundur.
//Bu nedenle, hangi liste türünün kullanılacağı, uygulamanın gereksinimlerine ve yapılacak işlemlerin türüne bağlıdır.*/
////-------------------------
////Java’da LinkedList'e eleman eklemek için genellikle add metodu kullanılır.
//// Bu, standart ve en yaygın yöntemdir. Ancak, LinkedList’e eleman eklemek
//// için daha "kısa yollar" bulunmaktadır.
////List.of(), Constructor’a degil de, dogrudan yazilirsa, immutable (değişmez-Boyutta, elemanda degismez)
//        // bir liste döndürür. Bu liste üzerinde herhangi bir değişiklik yapmaya çalışmak
//        // UnsupportedOperationException hatası fırlatır. Yani, List.of() ile oluşturulan
//        // bir liste üzerinde eleman ekleyemez, çıkaramaz veya mevcut elemanların değerlerini değiştiremezsiniz.
//
//*        List<String> immutableList = List.of("Eleman1", "Eleman2", "Eleman3");
//        immutableList.add("serkan");
//        System.out.println(immutableList);*/
//  //-------------------------
// //2- add(int index, E element); belirtilen konuma bir oge ekler
////3- addFirst(E e): Listenin basina oge ekler
////4- addLast(E e): Listenin sonuna bir öğe ekler.
////5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur
////6)removeFirstOccurrence() metodu,
//// belirtilen bir öğeyi LinkedList içinde
////bastan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
////Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
////Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
////---------ek bilgi - Tum Yusuf'lari siler
////myList.removeAll(Collections.singleton("Yusuf")); //[Hasan, Zeynep, Veli, Ayse, Fatma, Huseyin]
////7) removeLastOccurrence metodu, belirtilen bir öğeyi LinkedList içinde
////sondan başlayarak arar ve bu öğeyi bulduğunda onu listeden kaldırır.
////Eğer bu öğe birden fazla kez bulunuyorsa, en sondaki öğe kaldırılır.
////Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
////8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır.
//// Bu metod, elemanı koleksiyondan kaldırmaz.
//// Bu metod, koleksiyon boşsa null dondurur
////9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır.
//// Bu metod, koleksiyon boşsa null döndürür.
////10) element() metodu, bir koleksiyonun başındaki elemanı alır, ancak elemanı koleksiyondan kaldırmaz.
//// Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar. (peek() null dondurur)
//// bir koleksiyonun boş olup olmadığını kontrol etmek için NoSuchElementException istisnasını kullanir
////11) pop() metodu, bir koleksiyonun ilk elemanını alır ve koleksiyondan kaldırır.
//// Bu metod, koleksiyon boşsa NoSuchElementException istisnası atar.(poll() null dondurur)
////Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no
//
//*Java’da üç tür set vardır:
//
//1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
//her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
//Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
//bir hücreye yerleştirilir.
//
//HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
//null’i eleman olarak kabul ederler */
//
////-------------ek bilgi
////Hash Code gormek istersek
////-------------
//    /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
//    bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
//    LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
//    Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)
//    Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz
//    //-------------
//    3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
//    HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
//    Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
//    Bu nedenle, TreeSet bir Sorted Set’tir.*/
//    //-------------------
//    //HashSet nasil olusturulur?
//    HashSet<String> hs = new HashSet<>();
//    System.out.println(hs); //[]
//    //HashSet'e nasil eleman eklenir?
//    hs.add("Sinan");
//    hs.add("Kerem");
//    hs.add("Tuba");
//    hs.add("Onur");
//    System.out.println(hs); //[Kerem, Sinan, Tuba, Onur]
//
//
//
////--------------------------------------------------------------------------------------D25-COLLECTIONS-MAPS01—
////1) Map’ler sozluk gibidir. Aciklamalidir.  orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
////2) Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir.
////3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
////4) Map'in elemanlarina komple 'entry set' (giris elemani) denir.
////Map nasil olusturulur?
////put():Bir key-value çiftini map'e ekler.
////1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
////Sadece 'key' degerlerini nasil alabiliriz?
////keySet(): Map'teki tüm key'lerin bir set'ini döndürür.Set'in sırası rastgeledir.
////Sadece 'value' degerlerini nasil alabiliriz?
////values():Map'teki tüm value'ların bir collection'ını döndürür.Collection'ın sırası rastgeledir.
////get(): Bir key'e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
////entrySet() metodu, HashMap'in tüm degerlerini içeren (key-value) bir Set döndürür.
//// Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
////Bu yuzden ozel method gelistirilmis. Set’in icinde Map yapisi saklanir.
////Java'da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
//// hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.
////-------------------------------------------------------------------D25-COLLECTIONS---Queue01
////Queue'ya nasil eleman eklenir?
////1)add(): Belirtilen öğeyi kuyruğa ekler.
////2) remove(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür.
//// Kuyruk boşsa bir istisna fırlatır.
////3)peek(): Kuyruğun başındaki öğeyi döndürür, kuyruk boşsa null döner.
////4)clear() metodu, kuyruğun içindeki tüm öğeleri kaldırır, böylece kuyruk boş bir duruma gelir.
////5)poll(): Kuyruğun başındaki öğeyi kuyruktan kaldırır ve döndürür. Kuyruk boşsa null döner.
////6)element(): Kuyruğun başındaki öğeyi döndürür, ancak kuyruk boşsa bir istisna fırlatır.
////System.out.println(storage.element()); HATA cunku queue bos
//
////-------------------------------
//// PriorityQueue (oncelik kuyrugu), bir FIFO (first in first out) yapısı ile nesneleri
//// öncelik sırasına göre sıralayan bir kuyruk (Queue) aracıdır.
//// Yani, en yüksek önceliğe sahip olan nesne, her zaman ilk olarak çıkar.
////Örneğin, sayıları içeren bir PriorityQueue kullanıyorsanız,
//// sayılar kendi doğal sıralamalarına göre önceliklendirilir.
////Gerçek hayattan bir örnek olarak, bir hastanedeki hastaların acil servise giriş sırası
//// priorityQueue olarak temsil edilebilir. Hastalar, aciliyet derecelerine göre sıralanır.
//// Aciliyeti en yüksek olan hasta, her zaman ilk olarak tedavi edilir.
////PriorityQueue nasil olusturulur?
//PriorityQueue<String> emergencyQueue = new PriorityQueue<>();
////PriorityQueue'ya nasil eleman eklenir?
////add(): Belirtilen öğeyi kuyruğa ekler.
//emergencyQueue.add("Mehmet");
//emergencyQueue.add("Mahmut");
//emergencyQueue.add("Ekrem");
//emergencyQueue.add("Oya");
//emergencyQueue.add("Tansu");
////emergencyQueue.add(null); HATA
//System.out.println(emergencyQueue); //[Ekrem, Mehmet, Mahmut, Oya, Tansu]
////-----------------------------
////Deque (Double-Ended Queue), hem başından hem de sonundan eleman eklemeye
//// ve çıkartmaya izin veren bir veri yapısıdır.
//// Deque, FIFO (first in first out) veya LIFO (last in first out) olarak sıralanabilir.
////Java'da deque'ler, Deque interface'iyle temsil edilir. Deque arabirimini uygulayan en yaygın class’lar
//// ArrayDeque ve LinkedList sınıflarıdır.
////---------------Deque nasil olusturulur?
//Deque<String> d = new LinkedList<>();
////Deque’e nasil eleman eklenir?
////1) add(): Belirtilen öğeyi ekler.
//d.add("Mehmet");
//d.add("Mahmut");
//d.add("Ekrem");
//d.add("Oya");
//d.add("Tansu");
//System.out.println(d); //[Mehmet, Mahmut, Ekrem, Oya, Tansu]
////2) addFirst(E e): Deque'in başına bir öğe ekler. Dönüş türü void'dir çünkü
//// sadece eklemeyi gerçekleştirir ve değer döndürmez.
////3) addLast(E e): Deque'nin sonuna bir öğe ekler. Dönüş türü yine void'dir.
////4)removeFirst(): Deque'nin başındaki öğeyi kaldırır ve kaldırılan öğeyi döndürür.
//// Bu method E türünde bir değer döndürür.(Burda String)
////--------------------------
////ArrayDeque, Java'da çift yönlü kuyruk (double-ended queue) yapısını temsil eder
//// (verilerini bir dizi (array) içinde saklar) ve Deque arayüzünü uygular.
//// Bu yapı, hem baştan hem sondan ekleme ve çıkarma işlemlerine izin verir.
//// ArrayDeque, LinkedList'e kıyasla daha yüksek performans sunar çünkü içerikleri için dizi tabanlı
//// bir yapı kullanır.ArrayDeque, başta ve sonda hızlı ekleme/çıkarma işlemleri için idealdir.
////ArrayDeque Nasıl Oluşturulur?
////Eleman Nasıl Eklenir?
//// Baştan Ekleme: addFirst()
//// Sondan Ekleme: addLast()
////Eleman Çıkarma:
////removeFirst(): Kuyruğun başından bir eleman çıkarır.
////removeLast(): Kuyruğun sonundan bir eleman çıkarır.
////ODEV: ArrayDeque’de belirli bir indekse veya araya doğrudan eleman eklemek için bir metod bulunur mu?
//Cevap :ArrayDeque sınıfı, belirli bir indekse veya araya doğrudan eleman eklemek için bir metod sağlamaz. Sadece elemanları başa veya sona ekleyebilirsiniz. Belirli bir indekse eleman eklemek isterseniz, ArrayList gibi başka bir veri yapısını kullanmanız önerilir. Eğer ArrayDeque ile yapmak isterseniz, ArrayDeque'yi bir ArrayList'e dönüştürüp, istediğiniz indekse ekleme yapabilir ve sonra tekrar ArrayDeque'ye dönüştürebilirsiniz; ancak bu yöntem verimli değildir.
////-------------------------------------------------------------D25-COLLECTIONS-SETS01
////TreeSet'ler cok yavas, biraz hizlandirabilir miyiz?
////Elemanlari eklerken en hizli olandan (HashSet) yardim alalim.
////-----------------------------------------------------------------------------------D26-MAPS-EXCEPTIONS-MAPS02
////------------------
////1) replace() methodu, value’lari key’leri kullanarak update etmeye yarar
////Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
//// kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.
//stdAges.replace("Tom", 39);
//System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}
////------------------
////2) replace() methodu, eski deger kontrolu yaparakta calisir
//stdAges.replace("Tom", 21, 45);
//System.out.println(stdAges); //Degisiklik olmayacak cunku eski deger 21 degil{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}
//stdAges.replace("Tom", 39, 45);
//System.out.println(stdAges); //Degisiklik olacak cunku eski deger 39. {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
////------------------
////3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
//// Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.
//stdAges.putIfAbsent("Tom", 77);
//System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
////Tom key'i map'te oldugu icin "Tom", 77'yi eklemedi
//stdAges.putIfAbsent("Ayse", 23);
//System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}
////Ayse key'i map'te olmadigi icin "Ayse", 23 eklendi
////------------------
////4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar
////key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
//// bir varsayılan değer sağlama avantajına sahiptir.
//System.out.println(stdAges.get("Tom")); //45
//System.out.println(stdAges.getOrDefault("Tom", 18)); //45, Tom map'te var
////Tom'un orjinal degerini verdi
//System.out.println(stdAges.get("Jerry")); //null
//System.out.println(stdAges.getOrDefault("Jerry", 0)); //18
////------------------
////5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
////containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
////Boolean return ederler
////-------------------------------------------------------------------------------------------MAPS04-----------------
////Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim
//Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
//Veri yarışlarını ve tutarsızlıkları önler.
//Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
//Paralel işleme ve performans artışı sağlar.
//Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
//Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
//*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?
//1- HashMap
//    a) Thread Safety:
//Thread-safe değildir.
//Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
//    b) Multi Thread:
//****Tek iş parçacıklı (single-threaded) ortamlar için idealdir.****
//Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
//    c) Synchronized:
//Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
//    d) Null Key/Value:
//Bir null key ve birden fazla null value kabul eder.
//    e) Performans:
//En hızlısıdır çünkü synchronized değildir.
//2- Hashtable
//    a) Thread Safety:
//Thread-safe'tir.
//Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
//    b) Multi Thread:
//***Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.***
//    c) Synchronized:
//Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı tarafından erişilebilir.
//    d) Null Key/Value:
//Ne null key ne de null value kabul eder. NullPointerException atar.
//    e) Performans:
//HashMap'ten daha yavaştır çünkü synchronized'dir
//3- ConcurrentHashMap
//    a) Thread Safety:
//Thread-safe'tir.
//Segment-based locking kullanarak senkronizasyon sağlar.
//    b) Multi Thread:
//***Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.***
//Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
//    c) Synchronized:
//Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
//    d) Null Key/Value:
//Ne null key ne de null value kabul eder. NullPointerException atar.
//    e) Performans:
//HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
//Çok iş parçacıklı ortamlar için optimize edilmiştir.
//*HashMap, Hashtable ve ConcurrentHashMap ne zaman kullanılir?
//1- HashMap:
//Tek iş parçacıklı uygulamalar için idealdir  çünkü synchronized değildir(ek bir işlem ve zaman gerektirmez)
//Çok iş parçacıklı ortamda kullanılacaksa, dış senkronizasyon mekanizmaları ile korunmalıdır.
//2- Hashtable:
//Eski kod tabanları ve miras uygulamalar için uygundur
//(Varolan bir kod tabanını korumak veya mevcut bir projeyi
//güncellemek zorunda olduğunuz durumlar)
//Yeni projeler için genellikle önerilmez çünkü daha modern ve performanslı alternatifler vardır.
//3- ConcurrentHashMap:
//Modern ve yüksek performanslı çok iş parçacıklı uygulamalar için en iyi seçenektir.
//(Web sunucuları, veri işlem sistemleri, yüksek trafikli uygulamalar)
//Thread safety ve performansın önemli olduğu her durumda tercih edilir.
////studentGrades.put(null, 50); //Hata
////studentGrades.put("Ahmet", null); //Hata
//// ConcurrentHashMap oluşturma
//ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();
//// Eleman ekleme
//stock.put("Elma", 10);
//stock.put("Muz", 20);
////Elemana erisme
//System.out.println("Elmanin stok miktari: " + stock.get("Elma")); //Elmanin stok miktari: 10
////Guncelleme veya ekleme
//stock.putIfAbsent("Cilek", 30); //Cilek yoksa ekle
//System.out.println(stock); //{Muz=20, Elma=10, Cilek=30}
//stock.replace("Muz", 20, 25);
//System.out.println(stock); //{Muz=25, Elma=10, Cilek=30}
////Eleman silme
//stock.remove("Elma");
//System.out.println(stock); //{Muz=25, Cilek=30}
////--------------------/*
//1) TreeMap’ler entry’leri natural order’a gore siraya koyar, bu yuzden yavastirlar
//2) TreeMap’ler  thread-safe ve synchronized degildir.
//3) TreeMap’lerin key’lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
//ama value kisimlarinda istediginiz kadar kullanabilirsiniz
//4) TreeMapler key’e bakarak siralama yapar
//TreeMap<String, Integer> countryPopulation = new TreeMap<>();
//countryPopulation.put("Germany", 83000000);
//countryPopulation.put("USA", 400000000);
//countryPopulation.put("Turkiye", 83000000);
//countryPopulation.put("Netherland", 18000000);
////countryPopulation.put(null, 18000000); HATA
//countryPopulation.put("Italy", null);
//countryPopulation.put("France", null);
//System.out.println(countryPopulation);
////{France=null, Germany=83000000, Italy=null, Netherland=18000000, Turkiye=83000000, USA=400000000}
////-----------------------------------------------------------------------------------------------D27 EXCEPTIONS—E01
////try-catch kullandiginizda sistem tarafindan "try" bolumu calistirilir,
//// eger "try" bolumunde hata ile karsilasilmazsa "catch" blogu hic calismaz
////Eger "try" bolumunde hata ile karsilasilirsa hata alinan satirda calisma durdurulur
//// ve "catch - yakalamak" bolumu calismaya baslar.
////1)Throw Exceptions : a/b gibi islem sirasinda degilde, istenmeyen durumu gorunce hatayi biz olusturalim
////2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
////3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
//// geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.
////4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
//// dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.
////---------------------------------------------------------------------------D28EXCEPTION_ENUM-
//*Java'da enum (enumeration - sıralama), bir dizi sabit değeri temsil etmek için kullanılan özel bir class türüdür.
//enum yapısı, belirli bir değer kümesini temsil eden sabitleri (constants) tanımlamak için kullanılır.
//Degisme ihtimali olmayan verileri tutarlar.(ay, gun isimleri gibi) ve buyuk harfle yazilirlar.
//enum'un temel avantajları şunlardır:
// Tip Güvenliği: enum ile tanımlanan bir değişken, sadece belirtilen enum değerlerinden birine sahip olabilir.
// Bu, geçersiz değerlerin atanmasını engeller.
// Kod Okunabilirliği: enum kullanımı, kodun okunabilirliğini artırır, çünkü anlamlı isimlere sahip
// sabitleri kullanabilirsiniz.
// Kod tekrarını azaltır: Enumlar, aynı sabit değerleri birden çok kez tanımlamayı önler.
// Bu, kod tekrarını azaltır. Ve dis kaynaklara bagimliligi kaldirir.
// Ornegin illeri app’inizde saklarsiniz, gerektiginde cagirir kullanirsiniz.
// Bir siteden cekmezsiniz. Cunku site cokmus olabilir*/
// //---------------
// /* Expected 0 arguments but found 3 hatası,Cities enum yapısında. Her bir enum değeri için 3 argüman sağladık
//  (int, String, String). Bu argümanları kabul eden bir yapıcı (constructor) tanımlamanız gerekiyor.
// ama once 3 tane variable olusturalim private, bir değişkenin yalnızca class'in içinden erişilebilir olmasını sağlar.
// Bu, değişkenin dışarıdan erişilmesini ve değiştirilmesini önler.(encapsulation) final, bir değişkenin değerinin değiştirilemeyeceğini belirtir. Bu, plaka kodunun yalnızca bir kez ayarlanmasını sağlar.
// Açıklama: Enum'lar, önceden tanımlanmış sabit değerleri temsil eden yapılardir.
// Bu nedenle, plaka kodu, yalnızca enum'un içinden ayarlanmalı ve değiştirilmelidir.
// Dışarıdan erişilmesi veya değiştirilmesi, enum'un tutarlılığını bozabilir.*/
//
// //-----------
// 1) enum’daki datalar sabittir
// 2) enum’dan new keywordu ile yeni bir object olusturamazsiniz
// 3) Cunku enum icine koymus oldugunuz her bir sabit data bu classtan olusturulmus bir object mantigi ile calisir
// 4) enum icerisine koymus oldugumuz her bir sabit default olarak public static ve final’dir.
// (Burada iller kastediliyor-enum tanımlarken bu anahtar kelimeleri sabitlerin önüne yazmak gerekmez
// ve yazılamaz da; dilin sözdizimi bunu desteklemez)
// 5) Bu nedenle enum icindeki her bir sabit dataya enum ismi yazarak ulasabilirsiniz
// 6) enum’daki constructor yeni bir object olusturmak icin degil, enum’in icindeki her bir sabit
// datanin icindeki variable’lari baslatmak icin kullanilir */
////5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda oluşur
////6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
////Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir.
//// try-catch kullanmazsiniz.Burda programin durmasi kesinlikle isteniyordur.
//*1)Run butonuna bastiktan sonra console'da alinan Exception'lara Runtime Exception denir
//  ArithmeticException, NullPointerException vs...
//  RunTime Exception’lara Unchecked Exception’da denir. (run butonundan once kontrol edilmemis)
//2) Code yazarken kirmizi alt cizgi seklinde alinan Exceptionlar’da vardir. Bunlara da Compile Time Exception
//denir,  Compile Time Exception’lara Checked Exception’da denir.(run butonuna basmadan once kontrol var)*/
////---------------
//*Aciklama: FileInputStream kullanacagiz. Bir class'tir.FileInputStream sınıfı, Java'da dosyaları bayt (byte) bazlı
//okumak için kullanılır. Bu sınıf, Java'nın java.io paketinin bir parçasıdır.
//Genellikle metin dosyaları, resimler, ses dosyaları vb. dosya türlerini okumak için kullanılır.
//Not: ASCII tablosundaki "A" ya da herhangi bir başka karakter 1 byte'a eşittir.*/
//interview sorusu
//throw ile throws arasindaki farklar nelerdir?
//1) throw method body’si icinde, throws ise method parantezinden sonra kullanilir
//2) throw method body’si icinde istenilen yerde istenildigi kadar yazilip kullanilabilir
//   throws ise method signature’dan hemen sonra ve sadece bir kere yazilir
//3) throw’dan sonra new keyword’u ve constructor kullanarak object olusturulur
//   throws’dan sonra ise sadece Exception class ismi yazilir
//4) throw belli sartlar icin Exception firlatmada kullanilir (age negatif olamaz diye biz sart koyduk)
//    throws ise bir methodun belli bir Exception’u firlatabileceğini belirtmek icin kullanilir
//    (olusabilecek bir hataya karsi yazilir)
////read() metodu dosyadan bir bayt (byte) okur (tam sayı değerini-0-255 arasında)
////Dosyada 'A' karakteri varsa, read() metodu 65 değerini döndürecektir.
////Dosyada 'a' karakteri varsa, read() metodu 97 değerini döndürecektir.
////-1 değeri, dosya sonu (EOF - End of File) olarak kabul edilir.
////read, dosya sonuna ulaşıldığında -1 değerini döndürur.
////Not: Bir onceki uygulamamizda method signature icine exception eklemesi yaptik.
//// Bu seferde try-catch kullanalim
//1)	FileNotFoundException ve IOException Compile Time Exception'lardir. Yani kodu yazarken hata aliriz.
//2) IOException Class, FileNotFoundException class'in parent'idir yani
//    istenirse FileNotFoundException yerine IOException'da kullanilabilir
//3) IOException ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
////finally
//1) finally bloğu genellikle;
// a) Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi, close() methodu ile),
//Özellikle eski Java versiyonlarında (Java 7 öncesi), veritabanı bağlantıları gibi kaynaklar
//manuel olarak kapatılmalıydı. Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz
//yere yer kaplar ve potansiyel performans sorunlarına neden olabilir. Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile)
// b) Dosyaların kapatılması :  (az once dosya baglantisi yapmistik.  fis.close(); ile kapatilabilirdi)
// Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. Aksi halde, dosya kolları
// gereksiz yere sistemde yer kaplar.
// c) Her durumda çalıştırılması gereken temizleme işlemleri :
// (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir sürecin sonunda her zaman yapılmalıdır.
//Örneğin, bir log dosyasına her işlemin başlangıç ve bitiş zamanını kaydetmek gibi. BufferedWriter ile)
// finally icin bir senaryo olusturalim; a/b bolumu ile bir index bulalim ve bu index'i kullanarak
// Array'deki elemani bulalim
//// Coklu finally block kullanilamaz
////java da try + bir catch, try + birden fazla catch, try + catch + finally,
//// try + finally kullanilabilir.
////-----------------------------------------------------------------------D28-EXCEPTION-ENUM--EnumRunner
//       //values() methodu enum icindeki tum datalari bir Array icinde bize verir
////İşgörüşmesi notu olabilir sık sık okumalıyız...
//   /*Java'da final, finally ve finalize() terimleri farklı amaçlarla kullanılan üç farklı kavramı temsil eder.
//final:
//   Değişkenler İçin: final keyword'uyle tanımlanan bir variable sadece bir kez değer alabilir.
//   Bu, değişkenin değerinin sonradan değiştirilemeyeceği anlamına gelir. Yani, bu değişken sabittir (constant)
//   Metotlar İçin: final keyword'uyle tanımlanan bir metot, child class'lar tarafından
//   override edilemez.
//   Class'lar İçin: final keyword'uyle tanımlanan bir class, genişletilemez (extends edilemez).
//   Yani bu class'in child'i olmaz.
//finally:
//   finally bloğu, try-catch yapısının bir parçasıdır. Bu blok, try bloğunda bir istisna oluşsa da
//   oluşmasa da her zaman çalıştırılır.Genellikle kaynakların serbest bırakılması,
//   dosyaların kapatılması gibi temizleme işlemleri için kullanılır.
//finalize():
//   Bu, Object sınıfında tanımlanan bir metottur ve varsayılan olarak hiçbir işlem yapmaz.
//   Bir nesne bellekten kaldırılmadan hemen önce Garbage Collector (Çöp Toplayıcı) tarafından
//   otomatik olarak çağrılır. Genellikle dış kaynakların serbest bırakılması için kullanılır,
//   ancak modern Java uygulamalarında kullanımı önerilmez.
//Kendi istisna (Custom Exception class) class'larinizi oluşturabilirsiniz.
//Bunun için genellikle Exception class'ini ya da daha spesifik bir child sınıfı genişleterek (extends) yeni bir class oluşturursunuz.
//Kendi exception class'larinizi oluşturmanız için birkaç neden vardır:
//1- Özelleştirilmiş İstisna Mesajları: Özel istisna sınıflarınızla, belirli bir hata durumu için daha anlamlı ve detaylı hata mesajları oluşturabilirsiniz.
//2-Daha İyi Hata Yönetimi: Özel istisnalar sayesinde hataları daha spesifik olarak yakalayıp, uygun şekilde yönetebilirsiniz.
//(ornegin okul app'inde negatif yas girilmesinde hata firlatabilirsiniz)
//3- İş Kurallarını Tanımlama: Bazı iş kuralları, standart Java istisnalarıyla doğrudan temsil edilemez.
//Bu tür kurallar için özel istisnalar oluşturarak, iş kurallarınızı daha iyi tanımlayabilirsiniz.
//(Java icin negatif veya pozitif yas girilmesinin farki yoktur. Sifira bolme olsaydi vardir) */
//*4- Daha Anlamlı Loglama: Özelleştirilmiş istisna sınıflarınızla, hatanın neden kaynaklandığına dair
//daha spesifik bilgilere sahip olabilir ve bu bilgileri loglarda saklayabilirsiniz.
//Örnek olarak, belirli bir yaşın altındaki kullanıcıların sisteme kaydolamayacağı bir uygulamanız varsa,
//bu durumu belirtmek için özel bir istisna oluşturabilirsiniz*/
////Exception yazarsak compile time(checked exceptions) cesidinde bir istisna olusur.(FileNotFoundException gibi)
//// RuntimeException yazsaydik run time cesidinde olusurdu.(ArrayIndexOutOfBoundsException)
//// RuntimeException(unchecked) Exception'ın bir alt sınıfıdir.
////-----------------------------------------------------------------------
////Ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez senaryosu uzerinden gidelim.
////Let's go through the scenario where the student's grade cannot be entered less than zero or greater than zero.
////------------------------------------------------------------------------------D29-ITERATORS_LAMBDA--Iterators
//1)  Iterator'ler loop'larin yaptigi ayni isi yapar
//2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
//3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
//4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir
//5) Iki tip iterator vardir:
//    a) Iterator:
//        Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
//    b) ListIterator:
//        Bu eleman silebilir, ekleyebilir ve degistirebilir
//    Not:
//    Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
//    ListIterator iki yonlu calisabilir
////hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
////next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir
////remove() : Pointer'in atladigi elemani siler
//while (myItr.hasNext()) { //en basa konumlanan pointer'dan sonra eleman var mi diye bakar.
////            myItr.next(); //pointer'i bir sonraki elemanin onune alir ve atladigi elemani verir
////            myItr.remove(); //next()'in atladigi elemani siler
////        System.out.println(myList); //[]
////--------------------
//*Lambda ifadeleri, Java 8 ile birlikte tanıtılan ve fonksiyonel(methodsal) programlamayı
//kolaylaştırmak için kullanılan bir özelliktir.
//
//Lambda ifadelerinin genel avantajları:
//1- Daha az kod yazma: Lambdalar, daha az ve daha okunabilir kod yazmanızı sağlar.
//2- Fonksiyonel programlama: Java'nın fonksiyonel programlama özelliklerini kullanmanıza yardımcı olur.
//3- İsimsizdir: Lambda ifadeleri, bir isme sahip değildir.(method ismi yoktur)
//4- Tek bir ifade içerebilir: Lambda ifadeleri, bir veya daha fazla işlem gerçekleştiren tek
//bir ifade içerebilir.
//5- Bir veya daha fazla parametre alabilir*/
////---------------
// /*1) Lambda Functional Programming'dir, digeri "Structured Programming" dir
//Structured Programming: Yapısal programlama, programların belirli yapılar veya kontrol yapıları
//(örneğin döngüler, şartlı ifadeler) kullanılarak yazılmasını teşvik eden bir programlamadir.
//2) Functional programming, Collection'lar ve Array’ler ile yaygin olarak kullanilir.
//(Map'lerde direkt kullanilmaz
//entrySet ile Set'e cevrilirse kullanilabilir)*/
//// set(E e): Koleksiyonun geçerli elemanını değiştirir.
////stream() metodu, koleksiyonları bir akışa (stream) dönüştürerek üzerinde işlem yapmayı sağlar.
////Akışın (stream) adı, verinin bir kaynaktan hedefe doğru "akmasını" ifade eder.
////Stream API'si ile birlikte sıkça kullanılan bazı metodlar şunlardır:
////1) filter(): Koşulu karşılayan elemanları filtreler.
////map(): Elemanları dönüştürmek için kullanılır.
//ı ve değiştirilmesini engeller*/
