package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-55);




    }   //main dışı

    public static void studentGrade (int not){
        //System.out.println(not);
        if (not<0||not>100){
            try {
                throw new InvalidStudentGradeException("Ogrenci notu sıfırdan küçük veya yüzden büyük girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(not);
        }

    }



}
