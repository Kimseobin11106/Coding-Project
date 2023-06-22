package games.word;

import java.util.Scanner;

public class Player {
	
	Scanner sc = new Scanner(System.in);
	
	public String name;
	public String word;
	
	public String writeWord() {
		word = sc.next();
		return word;
	}
	
	public boolean chkSuccess(char lastChar) {
		// 예 : 아버지 -> String은 인덱스를 가지기 때문에 아(0) 버(1) 지(2)
		// charAt() 메소드를 통해 해당 인덱스의 문자를 가지고 올 수 있다.
		if (lastChar == word.charAt(0)) {
			return true;
		} else {
			return false;
		}
		
	}

}
