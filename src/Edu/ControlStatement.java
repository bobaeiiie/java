package Edu;

public class ControlStatement {
    public static void main(String[] args) {
//          if문
//        if(조건1) {
//            // 처리 코드
//        } else if (조건2) {
//            // 처리 코드
//        } else {
//            // 처리 코드
//        }
//
//         switch 문
//        String food = "";
//        switch (food) {
//            case "김밥" :
//                System.out.println("분식");
//                break;
//            case "뚝배기" :
//                System.out.println("한식");
//                break;
//            default:
//                System.out.println("기타");
//        }
//
//         for문
//         for(초기값; 조건식; 증감연산자) {
//        for(int i = 0; i < 3; i++) {
//            if(i == 1) {
//                continue;
//            }
//            System.out.println(i);
//        }
        
        // 구구단 출력
//        for (int dan = 2; dan <= 9; dan++) {
//            for (int num = 0; num <= 9; num++) {
//                System.out.printf("%d X %d = %d%n", dan, num, dan * num);
//            }
//        }

        // 강사님 방법
//        for (int i = 2; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.printf("%d X %d = %d%n", i, j, i * j);
//            }
//        }

        // while 문 / do-while 문
//        while (true) {
//            // 처리 코드
//        }

        // 별 찍기
        //     *
        //    **
        //   ***
        //  ****
        // *****

//        for(int i = 1; i <= 5; i++) {
//            for(int z = 5; z > i; z--) {
//                System.out.print(" ");
//            }
//            for(int z = 1; z <= i; z++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        // 강사님 방법
        int cnt = 5;
        for (int i = 0; i < cnt; i++) {
            for (int j = i; j < (cnt - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}