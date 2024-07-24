package Edu.innerClass;

public class innerClass {
    public static void main(String[] args) {
        Mammal mammal = new Mammal(); // 외부 클래스 인스턴스
        Mammal.Whale whale = mammal.new Whale(); // 내부 클래스 인스턴스 (객체 타입 외부.내부)
        whale.info();
        
        // 축약
        Mammal.Whale whale2 = new Mammal().new Whale();
    }
}

class Mammal {
    String birth = "출산";

    class Whale {
        String name = "고래";
        static String color = "회색";

        // 자바 언어 사양상 컴파일 에러 발생
        // 주의 : 컴파일러에 따라서 특정 설정 하에 동작할 수도 있으나, static 사용하지 않기
        // static int age = 18;

        // super, this 등의 조치 없이 부모 클래스 접근 및 사용 가능
        public void info() {
            System.out.println(birth);
        }
    }
}