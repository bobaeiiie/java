package Edu;

public class DataType {
    public static void main(String[] args) {
        boolean flg = true;

        byte numByte = (byte) 127;
        short numShort = (short) 32767;

        int numInt = 1; // 정수 기본형
        long numLong = 1L; // 기본형 아니므로 L표기

        double numDouble = 1.0; // 실수 기본형
        float numFloat = 1.0f; // 기본형 아니므로 f표기

        char enChar = 'A'; // 홑따옴표
        String enString = "A"; // 쌍따옴표

        // 연산자
        int num1 = 1;
        int num2 = 2;
        // System.out.println(num1 == num2); // 데이터타입 자동 지정되므로 완전비교 연산자가 없음

        // 문자열 비교
        String str2 = "asd";
        String str3 = "123";
        // System.out.println(str2 == str3);
        System.out.println(str2.equals(str3)); // String Class의 equals() 메소드 사용
    }
}