package Edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class EduDateTime {
    public static void main(String[] args) {
        // 날짜 : LocalDate Class
        LocalDate nowDate = LocalDate.now();
        // 현재 날짜
        System.out.println(nowDate);
        // 연도
        System.out.println(nowDate.getYear());
        // 월 영어
        System.out.println(nowDate.getYear());
        // 월 숫자
        System.out.println(nowDate.getMonthValue());
        // 날짜
        System.out.println(nowDate.getDayOfMonth());
        // 요일 영어
        System.out.println(nowDate.getDayOfWeek());
        // 요일 숫자 (0: 일요일 ~ 6: 토요일)
        System.out.println(nowDate.getDayOfWeek().getValue());
        // 해당 달의 일 수
        System.out.println(nowDate.lengthOfYear());
        // 해당 연도의 일 수
        System.out.println(nowDate.lengthOfYear());

        // 시간 : LocalTime Class
        LocalTime nowTime = LocalTime.now();
        // 현재 시간 (밀리초X 나노초 단위)
        System.out.println(nowTime);
        // 시
        System.out.println(nowTime.getHour());
        // 분
        System.out.println(nowTime.getMinute());
        // 초
        System.out.println(nowTime.getSecond());
        // 나노초
        System.out.println(nowTime.getNano());

        // 날짜 + 시간 : LocalDateTime
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        // 포맷
        System.out.println(nowDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        // 날짜 일수 차이 비교
        LocalDateTime nowDateTime2 = LocalDateTime.of(2024, 2, 24, 12, 00, 00);
        System.out.println(nowDateTime2);

        long DateCompare = nowDateTime.until(nowDateTime2, ChronoUnit.DAYS);
        System.out.println(DateCompare);
        System.out.println(Math.abs(DateCompare));

        // 단순 과거, 미래 비교
        boolean boo = nowDateTime.isBefore(nowDateTime2);
        boolean boo2 = nowDateTime.isAfter(nowDateTime2);
        boolean boo3 = nowDateTime.isEqual(nowDateTime2);
        System.out.println(boo);
        System.out.println(boo2);
        System.out.println(boo3);

        // 해당 달의 마지막 일
        LocalDateTime tmp = nowDateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(tmp);
        System.out.println(tmp.getDayOfMonth());

        // 요일, 월 한국어로 출력
        // 요일, 월 한국어로 출력
        String koreanDay = nowDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN);
        String koreanMonth = nowDateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.KOREAN);
        System.out.println(koreanDay);
        System.out.println(koreanMonth);
    }
}
