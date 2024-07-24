package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

class Mammal {
    String  kinds;
    final protected String name = "테스트";

    public Mammal() {
        this.kinds = "포유류";
        // this.name = "ss"; // 상수이므로 에러
//        System.out.println("Mammal");
    }

//    final public void printInfo() {  final method : 자식 클래스에서 오버라이딩 불가능
    public void printInfo() {
        System.out.println("Kinds: " + this.kinds);
    }
}

class Whale extends Mammal {
    public Whale() {
        super();
//        this.name = "고래";
//        System.out.println("Whale");
        System.out.println(this.kinds.concat(this.name));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Name: " + this.name);
    }
}


