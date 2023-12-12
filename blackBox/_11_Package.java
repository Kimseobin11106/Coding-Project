package blackBox;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 : Java 클래스들을 비슷한 것들끼리 정리해주는 하나의 폴더

        // 랜덤 클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 : (범위) : " + random.nextInt(10)); // 0이상 10미만의 정수형 값
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수값
        System.out.println("랜덤 실수 : " + random.nextDouble(10.0)); // 0.0 이상 10.0 미만의 실수

        // 5.0이상 10.0 미만의 실수를 뽑으려면?

        System.out.println("랜덤 실수 : (5.0이상 10.0미만) " + random.nextDouble(5.0,10.0));

        // 로또 번호 뽑기!! 1 ~ 45
        System.out.println("로또 번호 뽑기 (1 ~ 45) : " + random.nextInt(1,45+1));

        // Math, Scanner, StringButter, StringBuilder, ... 수학 함수, 입력 불러오는 함수, 문자열 함수 등
        // BigInteger, BigDecimal, ... 큰 정수, 실수
        // LocalData, LocalTime, LocalDateTime, ... 날짜 데이터

    }
}
