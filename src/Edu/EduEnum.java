package Edu;

public class EduEnum {
    public static void main(String[] args) {
        EnumDays monday = EnumDays.MONDAY;
        System.out.println(monday);
        System.out.println(monday == EnumDays.MONDAY);
        System.out.println(monday == EnumDays.TUESDAY);
        System.out.println(monday.ordinal());
//        System.out.println(EnumDays.TUESDAY.ordinal());
        System.out.println(EnumDays.MONDAY.getDay());
        System.out.println(EnumDays.WEDNESDAY.getIntDay());
    }
}

// 기존 방식
// 1. 클래스
//class FinalDays {
//    public static final int MONDAY = 1;
//    public static final int TUESDAY = 2;
//}
// 2. 인터페이스
//interface FinalDaysInterface {
//    int MONDAY = 1;
//    int TUESDAY = 2;
//}/zhe

// 열거형 방식 : 순서 존재
enum EnumDays {
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY;
    SUNDAY("일요일", 0), MONDAY("월요일", 1), TUESDAY("화요일", 2), WEDNESDAY("수요일", 3);

    // 상수 문자열 저장 필드
    private final String day; // 상수 외 다른 멤버 존재 시 상수 끝에 세미콜론 필요
    private final int intDay;

    // 싱글톤 생성자
    private EnumDays(String day, int intDay) {
        this.day = day;
        this.intDay = intDay;
    }

    // 필드 day를 리턴해주는 Getter
    // 외부에서 접근해서 바꿀 수 없되 day 값을 쓸 수는 있게 하기 위함
    public String getDay() {
        return day;
    }
    public int getIntDay() {
        return intDay;
    }
}

// 자체 클래스 상수 방식
class Enum {
    public static final Enum SUNDAY = new Enum();
    public static final Enum MONDAY = new Enum();
}