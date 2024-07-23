package Edu;

public class EduClassExtends {
    public static void main(String[] args) {
        Whale whale = new Whale();
        whale.printInfo();
    }
}

class Mammal {
    String  kinds;
    protected String name;

    public Mammal() {
        this.kinds = "포유류";
//        System.out.println("Mammal");
    }

    public void printInfo() {
        System.out.println("Kinds: " + this.kinds);
    }
}

class Whale extends Mammal {
    public Whale() {
        super();
        this.name = "고래";
//        System.out.println("Whale");
        System.out.println(this.kinds.concat(this.name));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Name: " + this.name);
    }
}


