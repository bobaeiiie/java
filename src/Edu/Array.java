package Edu;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 선언
//        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr = new int [5];

        // 값 삽입
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 출력
//        System.out.println(arr);
        // [I@4c873330

        // ex) 1~100,000 의 숫자를 배열로 만들어주세요
        int[] arr2 = new int [100000];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
//        System.out.println(Arrays.toString(arr2));

        // 캐릭터 배열
//        char[] arr2 = new char[3];
//        arr3[0] = 'a';
//        arr3[1] = 'b';
//        arr3[2] = 'c';

        // 선언과 동시에 초기화 하는 방법
        char[] arr3 = {'a', 'b', 'c'};

//        System.out.println(Arrays.toString(arr3));

        // 배열 사용 주의 사항 (참조형)
//        int[] arr4 = {1, 2, 3};
//        int[] arr5 = arr4;
//        arr5[1] = 43;

        // 원본까지 같이 변경됨
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.toString(arr4));

        // 원본 유지하는 복사 방법
//        int[] arr4 = {1, 2, 3};
//        int[] arr5 = new int[arr4.length];

//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = arr4[i];
//        }
//
//        arr5[1] = 43;
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(arr5));

        // 로직 고려한 간단한 방법
//        int[] arr4 = {1, 2, 3};
//        int[] arr5 = Arrays.copyOf(arr4, arr4.length);
        // Arrays.copyOf(): 카피할 원본 배열, 카피할 범위 지정 (시작값 0으로 고정)

//        arr5[1] = 43;
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(Arrays.toString(arr5));

        // 다차원 배열
        int[][] arr6 = {
                {1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}
        };

//        System.out.println(arr6[1][1]);

        // ex) 배열을 정렬하기
        int[] arr7 = {5, 76, 2, 4, 1, 6, 33};
        int[] arr8 = Arrays.copyOf(arr7, arr7.length);

//        Arrays.sort(arr7);
//        System.out.println(Arrays.toString(arr7));

        for (int i = 0; i < arr8.length; i++) {
            boolean completeFlg = true; // 배열 돌게하는 플래그 추가
            System.out.print(Arrays.toString(arr8));
            for (int j = 0; j < (arr8.length - 1 - i); j++) {
                if (arr8[j] > arr8[j + 1]) { // 스왑
                    int tmp = arr8[j];
                    arr8[j] = arr8[j + 1];
                    arr8[j + 1] = tmp;
                    completeFlg = false; // 플래그 값 바꿈
                }
                System.out.print(j);
            }
            System.out.println();
            if (completeFlg) { // 불필요한 반복 없애는 처리
                break;
            }
        }
    }
}