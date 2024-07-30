package Edu;

import java.util.ArrayList;
import java.util.List;

public class EduGenerics {
    public static void main(String[] args) {
        // 기존 방식
//        Box stringBox = new Box();
//        Box integerBox = new Box();
        
        // 제네릭스 방식
        Box<String> box = new Box<String>(); // String : 파라미터화된 타입
        Box<Integer> box2 = new Box<Integer>();
        box.add("떡볶이");
        box.add("텐동");
        box.add("서브웨이");
//        box.add(123);
        System.out.println(box.toString());

        // 데이터 여러개
        Box2<String, Integer> box3 = new Box2<String, Integer>(); // T = String, E = Integer
        box3.add("떡볶이", 4000);
        box3.add("순대", 3000);
        box3.add("튀김", 5000);
        System.out.println(box3.toString());
    }
}

// 기존 방식
// 선언 시 지정한 타입밖에 사용할 수 없음
//class Box1 {
//    List<String> items = new ArrayList<String>();
//}
//class Box2 {
//    List<Integer> items = new ArrayList<Integer>();
//}

// 제네릭스 방식 - 소스코드를 모듈화
class Box<T> { // Box<T> : 원시타입 / T : 타입 파라미터로 외부에서 타입 지정받음
    List<T> items = new ArrayList<>(); // <> / <T> : 생략 가능

    public void add(T item) {
        this.items.add(item);
    }

    @Override // toString을 Object 객체에서 상속받음
    public String toString() {
        return items.toString();
    }
}

// 데이터를 여러개 저장하고 싶을 때
class Box2<T, E> { // 타입 파라미터 여러개 지정
//    private List<T> items1 = new ArrayList<>();
    List<T> items1 = new ArrayList<>();
    List<E> items2 = new ArrayList<>();

//    public List<T> getItems1() {
//        return this.items1;
//    }

    public void add(T item1, E item2) {
        this.items1.add(item1);
        this.items2.add(item2);
    }

    @Override
    public String toString() {
        return items1.toString() + " : " + items2.toString();
    }
}