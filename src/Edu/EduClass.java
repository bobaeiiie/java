//package Edu;
//
//import Test.Test;
//
//public class EduClass {
//    public static void main(String[] args) {
//        Whale whale = new Whale(); // 클래스가 하나의 객체가 되고 데이터 타입으로 쓸 수 있음
//
//        System.out.println(whale.age);
//        System.out.println(whale.info());
//        System.out.println(whale.name);
//
//        Test test = new Test();
////        System.out.println(test.i); // java: i is not public in Test.Test; cannot be accessed from outside package
//        System.out.println(test.j); // 30
//
//        System.out.println(whale.info());
//        System.out.println(whale.info(32));
//    }
//}
//
//class Whale {
//    public int age = 32; // 인스턴스 변수
//    public static String name = "고래"; // 클래스 변수
//
//    public String info() {
//        int i = 3; // 지역 변수
//        return "고래입니다.";
//    }
//
//    public String info(int age) {
//        return age + "살 고래입니다.";
//    }
//}
//
