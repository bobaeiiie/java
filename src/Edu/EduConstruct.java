//package Edu;

//public class EduConstruct {
//    public static void main(String[] args) {
//        Whale whale = new Whale("고래");
//        Whale whale2 = new Whale(3);
//    }
//}

//class Whale {
//    // 클래스명과 동일한 생성자
//    // 값을 초기화한가더나 필드에 미리 넣어둔다거나 데이터베이스 연결하는 등의 준비 처리
////    public Whale() {} // 디폴트 생성자 실행하므로 생성자 지정하지 않아도 오류 없었음
//    public Whale(int age) {
//        System.out.println("고래는 " + age + "살 입니다.");
//    }
//    public Whale(String name) {
//        System.out.println(name.concat("생성자")); // concat() : 문자열 연결
//    }
//}

// 오버로딩 하는 이유
//class Whale {
//    String name;
//    int age;
//
//    public Whale() {
//        this("고래", 18)
//    }
//
//    public Whale() {
//        this(name, 18)
//    }
//
//    public Whale() {
//        this.name = "고래";
//        this.age = 18;
//    }
//
//    public Whale(String name, int age) {
//        this.name = "고래";
//        this.age = 18;
//    }
//}