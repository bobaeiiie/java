package Edu;

import java.util.function.*;

@FunctionalInterface // 함수형 인터페이스를 어노테이션 함. 하나만 가능
interface InterfacePlus {
    int plus(int x, int y);
}

//class Plus implements InterfacePlus {
//    public int plus(int x, int y) {
//        return x + y;
//    }
//}

public class EduLambda {
    public static void main(String[] args) {
        // ***** 람다식이란?
        // 일반적 객체지향의 형태
//        Plus p = new Plus();
//        System.out.println(p.plus(1, 2));

        // 익명 클래스 이용
//        InterfacePlus obj = new InterfacePlus() {
//            public int plus(int x, int y) {
//                return x + y;
//            }
//        };
//        System.out.println(obj.plus(3, 5));
//
//        // 람다식
//        InterfacePlus lambda = (x, y) -> x + y;;
//        System.out.println(lambda.plus(5, 5));

        // ***** 표준 함수형 인터페이스 API
        // 파라미터 1개, 리턴값 있다.
        Function<Integer, Integer> funLambda = x -> x + 2; // <T,R> : 넘겨줄 파라미터, 돌려받을 값
        System.out.println(funLambda.apply(5)); // apply()

        // 파라미터 2개, 리턴값 있다.
        BiFunction<Integer, Integer, Integer> funBiLambda = (x, y) -> x + y;
        // 더 축약할 수 있기도 함
//        BiFunction<Integer, Integer, Integer> funBiLambda = Integer::sum;
        System.out.println(funBiLambda.apply(5, 7));

        // 파라미터가 없고, 리턴값 있다.
        Supplier<Integer> funSupplierLambda = () -> 5;
        System.out.println(funSupplierLambda.get()); // get()

        // 파라미터 있고, 리턴값 있고, 조건식 표현 시 사용
        Predicate<Integer> funPredicateLambda = x -> x % 2 == 0; // true/false 로 만들어야 함
        System.out.println(funPredicateLambda.test(5)); // test()

        // 파라미터 있고, 리턴값 없다.
        Consumer<String> funConsumerLambda = x -> System.out.println(x);
        funConsumerLambda.accept("안녕 자바"); // accept()

        // ***** Function 합성

        // 내 방식
        // x + y 람다식
        InterfacePlus lambda1 = (x, y) -> x + y;
        System.out.println(lambda1.plus(1, 2));
        // x - y 람다식
        InterfacePlus lambda2 = (x, y) -> x - y;
        System.out.println(lambda2.plus(4, 2));

        // 강사님 방식 : 만들어져 있는 것을 잘 활용하는 것이 중요하다
        // x + y 람다식
        BiFunction<Integer, Integer, Integer> biFncPlusLambda = Integer::sum;
        // x - 4 람다식
        Function<Integer, Integer> biFncMinusLambda = x -> x - 4;

        // andThen
        int result1 = biFncPlusLambda.andThen(biFncMinusLambda).apply(6,4);
        System.out.println(result1); // 6
        
        // compose
        Function<Integer, Integer> biFncPlusLambda2 = x -> x * 2;
        int result2 = biFncPlusLambda2.compose(biFncMinusLambda).apply(7);
        System.out.println(result2); // 4
        
        // identity
        Function<Integer, Integer> identityLambda = Function.identity();
        System.out.println(identityLambda.apply(5)); // 5

        // ***** Predicate 결합
        // 조건식
        Predicate<Integer> greater = x -> x > 0;
        Predicate<Integer> lesser = x -> x < 10;

        // &&
        Predicate<Integer> andPredicate = greater.and(lesser);
        System.out.println(andPredicate.test(5)); // true
        System.out.println(andPredicate.test(100)); // false

//        int x = 1;
//        if(x > 0 && x < 10) {
//            return "ture";
//        }
//        else {
//            return "false"
//        }

        // ||
        Predicate<Integer> orPredicate = greater.and(lesser);
        System.out.println(orPredicate.test(100));  // false
        System.out.println(orPredicate.test(-100)); // false

        // !
        Predicate<Integer> notPredicate = greater.negate();
        System.out.println(notPredicate.test(-100)); // true
    }

    // 기존 함수(메소드) 작성
//    int plus(int x, int y) {
//        return x + y;
//    }

    // 자바스크립트 익명함수와 같다
//    (int x, int y) {
//        return x + y;
//    }
    // 람다식 형태로 변형
//    (x, y) -> x + y;
}
