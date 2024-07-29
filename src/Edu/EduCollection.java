package Edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class EduCollection {
    public static void main(String[] args) {
        // ArratList Class
        // 선언
        ArrayList<String> list = new ArrayList<>(); // <String>(capacity) 생략됨

        // 지정 및 삽입
        list.add("D");
        list.add("A");
        list.add("B");
        list.add("C");

        // 출력
        System.out.println(list.toString());
        // 특정 인덱스 선택 출력
        System.out.println(list.get(3));

        // 삭제
        list.remove(2);
        System.out.println(list.toString());

        // 정렬
        Collections.sort(list);
        System.out.println(list.toString());

        // LinkedList Class
        LinkedList<String> linkedList = new LinkedList<>();
//        List<String> linkedList = new LinkedList<>(); // List 타입으로도 받을 수 있다.
        linkedList.add("D");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("---");
        System.out.println(linkedList.toString());
    }
}
