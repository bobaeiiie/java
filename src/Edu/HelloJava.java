package Edu;

public class HelloJava {
    public static void main(String[] args) {
//         System.out.println("Hello World");

        // 변수
        int num = 1;

        // 상수
        final int num2 = 200_000; // 언더스코어 표기법: 숫자 단위 편하게 보기 위함
        // num2 = 1; 재할당 불가능

        // 스왑
        int swap1 = 10;
        int swap2 = 30;
        int swap3 = 0;

        swap3 = swap1;
        swap1 = swap2;
        swap2 = swap3;

//        System.out.println(swap1);
//        System.out.println(swap2);

        System.out.printf("swap1 = %d, swap2 = %d\n", swap1, swap2);
    }
}
