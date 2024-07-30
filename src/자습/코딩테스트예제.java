package 자습;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class 코딩테스트예제 {
    public static void main(String[] args) {
        // 1. 두 정수의 합을 계산하는 프로그램을 작성하세요.
        int num1 = 5;
        int num2 = 10;

        int sum = num1 + num2;
        System.out.println("1번. " + sum);

        // 2. 문자열을 뒤집는 프로그램을 작성하세요.
        String text = "Hello";

        String reverse = new StringBuilder(text).reverse().toString();
        System.out.println("2번. " + reverse);

        // 3. 배열에서 최대값을 찾는 프로그램을 작성하세요.
        int[] numbers = {3, 5, 7, 2, 8};

        int biggest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }
        System.out.println("3번. " + biggest);

        // 4. 주어진 배열을 오름차순으로 정렬하는 프로그램을 작성하세요.
        int[] numbers2 = {5, 3, 8, 4, 2};

        Arrays.sort(numbers2);

        System.out.print("4번. ");
        for (int i : numbers2) {
            System.out.print(i);
        }
        System.out.println();

        // 5.주어진 문자열에서 특정 문자의 개수를 세는 프로그램을 작성하세요.
        String text2 = "banana";
        char cntText = 'a';
        int cnt = 0;

        for (int i = 0; i < text2.length(); i++) {
            if (text2.charAt(i) == cntText) {
                // charAt() : String 타입의 문자열에서 특정 글자만 char 타입으로 변환
                cnt++;
            }
        }
        System.out.println("5번. " + cnt);

        // 6. 두 배열의 같은 위치의 원소를 더하여 새로운 배열을 만드는 프로그램을 작성하세요.
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] sumArr = new int [4]; // 길이를 잡아두는 것 보다 배열의 length로 지정하는 방법이 나았다.

        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i] + arr2[i];
        }
        System.out.println("6번. ".concat(Arrays.toString(sumArr)));

        // 7. 문자열이 회문인지 판별하는 프로그램을 작성하세요.
        String text3 = "racecar";
        boolean flg = true;
        int length = text3.length();

        for (int i = 0; i < length / 2; i++) {
            if (text3.charAt(i) != text3.charAt(length - 1 - i)) {
                flg = false;
            }
        }
        if (flg) {
            System.out.println("7번. 회문이다.");
        }
        else {
            System.out.println("7번. 회문이 아니다.");
        }

        // 8. 구구단을 출력하는 프로그램을 작성하세요.
//        System.out.println("8. ");
//        for (int dan = 2; dan < 10; dan++) {
//            System.out.println("** " + dan + "단 **");
//            for (int num = 1; num < 10; num++) {
//                System.out.println(dan + "X" + num + "=" + (dan * num));
//            }
//        }

        // 9. 별 찍기
//        System.out.println("9. ");
//        for (int i = 1; i < 5; i++) {
//            System.out.print("*");
//            for (int j = 1; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 10. 주어진 2차원 배열의 모든 요소의 합을 계산하는 프로그램을 작성하세요.
        int[][] sumArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum2 = 0;

        for (int[] row : sumArray) {
            for(int num: row) {
                sum2 += num;
            }
        }
        System.out.println("10. " + sum2);

        // 11. 주어진 문자열에서 중복된 문자를 제거한 문자열을 반환하는 프로그램을 작성하세요.
        String text4 = "programming";

        Set<Character> charSet = new LinkedHashSet<>();
        // LinkedHashSet : 중복을 제거하고 입력된 순서를 유지함

        for (char c : text4.toCharArray()) { // forEach
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        // 문자열을 효율적으로 연결하기 위해 StringBuilder 사용
        for (char c : charSet) {
            result.append(c);
        }

        System.out.println("11. " + result.toString());

        // 12. 주어진 문자열에서 단어의 개수를 세는 프로그램을 작성하세요.
        String text5 = "Hello World, this is a test.";

        String[] words = text5.split(" ");
        System.out.println("12. " + words.length);

        // 13. 두 문자열의 공통 문자 찾기
        String text6 = "apple";
        String text7 = "grape";

        Set<Character> set1 = new HashSet<>();
        // HashSet : 중복을 제거하며 순서가 중요하지 않음
        for (char c : text6.toCharArray()) {
            set1.add(c);
        }

        Set<Character> commonChars = new HashSet<>();
        // 두 문자열의 공통 문자를 저장하기 위해 사용
        for (char c : text7.toCharArray()) {
            if(set1.contains(c)) {
                // set1에 현재 문자가 포함되어 있는지 확인
                commonChars.add(c);
            }
        }
        System.out.println("13. " + commonChars);

    }
}



