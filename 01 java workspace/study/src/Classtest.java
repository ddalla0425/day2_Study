public class Classtest {
    public static void main(String[] args) {
        test();
        test(10);
        test(10,20);
    }
    //public void
    public static void test() {System.out.println("테스트 메소드");}
    public static void test(int num) {System.out.println("테스트 메소드 num : " + num);}
    public static void test(int num ,int num1) {System.out.println("테스트 메소드 num : " + num + ", num1 :  " + num1);}


}

class ClassLiv {

}