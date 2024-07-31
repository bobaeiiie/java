package Edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EduStream {
    public static void main(String[] args) {
        // ***** 스트림이란?
        // 원시 방법
        List<String> list = new ArrayList<>();
        list.add("김밥");
        list.add("소고기");
        list.add("백반");
        list.add("소고기불고기");

//        for (String str : list) {
//            System.out.println(str);
//        }

        // 스트림
        // List로 스트림 객체 생성
        Stream<String> stream = list.stream(); // List에 기본적으로 stream() 메소드를 가지고 있음
        stream.filter(str -> str.startsWith("소고기"))
                .forEach(System.out::println);

        // 배열
        int[] arr = {5, 4, 7, 1, 2, 3, 5, 1, 5, 7, 6};
        // int 배열로 스트림 생성
        IntStream intStream = Arrays.stream(arr);
        intStream.sorted()
                .distinct()
                .forEach(System.out::println);
    }
}
