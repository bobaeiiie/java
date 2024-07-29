package Edu;

import java.util.Scanner;

public class EduString {
    public static void main(String[] args) {

//         // String Classs
//        String str1 = "안녕";
//        String str2 = "안녕";
//
//        System.out.println(System.identityHashCode(str1));
//        System.out.println(System.identityHashCode(str2));
//
//        String str3 = "자바";
//        str3 = "PHP";
//
//        String str4 = "안녕하세요, 자바입니다.";
//
//        // chatAt()
//        System.out.println(str4.charAt(3));
//
//        // format()
//        System.out.println(str4.format("%s : 비밀번호 오류", "E10"));
//
//        // equals()
//        System.out.println(str1.equals(str2));
//
//        // length()
//        System.out.println(str4.length());
//
//        // replace()
//        String tmp = str4.replace("자바", "PHP");
//        System.out.println(tmp);
//
//        // join()
//        String[] stringArr = {"JAVA", "PHP", "C#"};
//        System.out.println(String.join(" / ", stringArr));
//
//        // toLowerCase(), toUpperCase()
//        String caseStr = "ASDfgh";
//        System.out.println(caseStr.toLowerCase());
//        System.out.println(caseStr.toUpperCase());
//
//        // trim()
//        String trimStr = "   가나다라마   ";
//        System.out.println(trimStr.trim());
//
//        // StringBuffer Class / StringBuilder Class
//        StringBuffer sb = new StringBuffer("안녕 자바!");
//        // 기본 크기가 16(16글자)인 버퍼를 생성, capacity 생성도 가능
//        // capacity 자동으로 늘리는 처리 많이 일어나지 않게 여유있게 지정함
//        System.out.println(sb);
//
//        sb.append(" 안녕 PHP!");
//        System.out.println(sb.toString());
//
//        // -------------------------------------------
//        // Math Class
//        int num1 = -5;
//        // 절대값
//        System.out.println(Math.abs(num1));
//        // 올림
//        System.out.println(Math.ceil(2.56)); // 리턴 타입 double
//        // 내림
//        System.out.println(Math.floor(2.56));
//        // 반올림
//        System.out.println(Math.round(2.56)); // 리턴 타입 long
//
//        // random : 0.0 <= 1.0
//        System.out.println(Math.random());
//
//        // 1 ~ 10 랜덤 숫자 획득
//        System.out.println(Math.round(10 * (Math.random())));
//        // 0.0 ~ 9.9999... 이므로 오답
//
//        // 정답 1.
//        System.out.println(Math.floor((Math.random()) * 10) + 1);
//        // 정답 2. 강제 형변환으로 가수 부분 날리는 방법
//        System.out.println((int)((Math.random()) * 10) + 1);
//        System.out.println((int)9.9999999); // 가수 부분을 날림

        // 스캐너
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("입력하신 값은 %s입니다.", input);

        
    }
}
