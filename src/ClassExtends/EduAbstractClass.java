package ClassExtends;

import java.util.ArrayList;

public class EduAbstractClass {
    public static void main(String[] args) {
//        Whale whale = new Whale();
//        System.out.println(whale.birth());
//
//        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
//        System.out.println(flyingSquirrel.residence());

        /*
        다형성
         */
        // overloading, overriding, 클래스명 = 타입명
        // Mammal whale = new Whale(); // 클래스 타입명 상속받은 부모 클래스 이름도 가능
        // System.out.println(whale.toString());
        // whale.swimming(); // 자식에게만 있는 메소드는 실행 불가능
        // whale.test(); // 오버라이딩한 경우 재정의된 메소드가 실행 (주의)

        // 데이터 타입이 같아야 하는 배열에 담을 경우에 사용
        // Whale[] arr = new Whale[2]; FlyingSquirrel은 Whale 타입이 아니므로 에러
        // Mammal[] arr = new Whale[2]; // 공통적으로 Mammal 상속받으므로 가능
        // arr[0] = new Whale(); // 자동으로 mammal로 형변환 해서 들어감
        // arr[1] = new FlyingSquirrel(); 
        
        // 업캐스팅
        // 자식 클래스를 부모 클래스로 바꾸는 것
        Mammal mammal;
        Whale whale = new Whale();
        mammal = (Mammal)whale;
        System .out.println(mammal.birth());

        Mammal[] arr = new Mammal[2];
        arr[0] = new Whale();
        arr[1] = new FlyingSquirrel();

        // 다운캐스팅
        Whale whale2 = (Whale)arr[0];
        System .out.println(whale2.swimming());

        // 타입 다형성
        // 배열이자 리스트, 자동으로 늘어나고 줄어듬
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        ArrayList<Mammal> mammals = new ArrayList<>(); // 부모 클래스로 이용 가능
        mammals.add(whale);
        mammals.add(flyingSquirrel);
        
        // 파라미터 다형성
        PrintTest printTest = new PrintTest();
        printTest.instancePrint(whale);
        printTest.instancePrint(flyingSquirrel);
    }
}

class PrintTest {
    final public void instancePrint(Mammal mammal) {
        System.out.println(mammal.toString());
    }

//    final public void instancePrint(FlyingSquirrel flyingSquirrel) {
//        System.out.println(flyingSquirrel.toString());
//    }
}

/*
인터페이스
 */
interface Swim {
    // 추상 메소드로 틀만 만듦
    public String swimming();
}

/*
추상 클래스
 */
abstract class Mammal {

    // 자식 클래스에서 공통 부분 추출
    protected String name;

    public Mammal(String name) {
        this.name= name;
    }

    public String birth() {
        return this.name + "출산 합니다.";
    }

    // 자식 쪽에서 재정의하게 유도
    abstract public String residence();

    public void test() {
        System.out.println("부모 테스트");
    }

//    final public void instancePrint(Whale whale) {
//        System.out.println(whale.toString());
//    }
//
//    final public void instancePrint(FlyingSquirrel flyingSquirrel) {
//        System.out.println(flyingSquirrel.toString());
//    }
}

class Whale extends Mammal implements Swim {
    
    // 생성자
    public Whale() {
        super("고래 ");
    }

    public String residence() {
        return this.name + "바다에 삽니다.";
    }

    public String swimming() {
        return this.name + "헤업 칩니다.";
    }
    
    public void test() {
        System.out.println("자식 테스트");
    }
}

class FlyingSquirrel extends Mammal {

    // 생성자
    public FlyingSquirrel() {
        super("날다람쥐 ");
    }

    public String residence() {
        return this.name + "산에 삽니다.";
    }
}

class FlyingFish implements Swim {
    protected String name;
    
    /*
    생성자
     */
    public FlyingFish(String name) {
        this.name = "날치 ";
    }

    public String swimming() {
        return this.name + "헤엄 칩니다.";
    }
}