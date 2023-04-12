package chap_02;

public class _04_Operator4 {
	
	public static void main(String[] args) {
		// 논리 연산자
		boolean 치킨 = true;
		boolean 피자 = true;
		boolean 탕수육 = true;
		
		System.out.println(치킨 && 피자 && 탕수육); // 최고의 식단 -> 모두 true 일 때만 true [&&은 and]
		System.out.println(치킨 || 피자 || 탕수육); // 괜찮은 식단 -> 하나라도 true이면 true [||은 or] 
		
		
		// And 연산
		System.out.println((5 > 3) && (3 > 1)); // true && true -> true 
		System.out.println((5 < 3) && (3 > 1)); // false 인 순간 뒤에 연산은 하지 않고 false
		// Or 연산
		System.out.println((5 > 3) || (3 > 1)); // true || true -> true 
		System.out.println((5 < 3) || (3 > 1)); // false || true -> true
		System.out.println((5 < 3) || (3 < 1)); // false || false -> false
		
		
		// System.out.println(1 < 3 < 5); 묶어서 쓰는 수식은 불가능하다.
		System.out.println((1 < 3) && (3 < 5)); // 쓸거면 && 연산자를 사용한다.
		
		// 논리 부정 연산자
		System.out.println(!true); // false [! 부정]
		System.out.println(!false); // true
		System.out.println(!(5 == 5)); // 5 == 5 = true !를 붙이면서 반댓값 false 를 준다.
		System.out.println(!(5 == 3)); // true 
		
	}

}
