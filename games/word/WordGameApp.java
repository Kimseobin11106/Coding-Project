package games.word;

import java.util.Scanner;

public class WordGameApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String startWord = "성일정보고";
		
		System.out.println("끝말잇기 게임을 시작합니다!");
		System.out.print("게임에 참여하는 인원은 몇명입니까? >>");
		
		int playerNum = sc.nextInt();
		
		// 문자열 타입의 배열 strArr 3칸짜리 만들어라!!
		String strArr[] = new String[3];
		// Player 클래스도 String 처럼 참조형 변수로 볼 수 있다!!
		// 문자열 타입의 배열을 만들듯이 Player 타입의 배열도 만들 수 있다!!
		Player play[] = new Player[playerNum]; // 엄청 중요한 개념!!
		
		for (int i=0; i<play.length; i++) {
			System.out.print("참가자의 이름을 입력하세요 >>");
			play[i] = new Player();
			play[i].name = sc.next();
			
		}
		
		System.out.printf("시작하는 단어는 %s 입니다.\n", startWord);
		
		int i=0, j=0;
		while(true) {
			
			i = j % playerNum;
			
			int lastIndex = startWord.length() - 1;
			char lastChar = startWord.charAt(lastIndex);
			
			System.out.println(play[i].name + " >> ");
			play[i].writeWord();
			
			boolean counting = play[i].chkSuccess(lastChar);
			
			if (counting == false) {
				System.out.println(play[i].name + "님이 졌습니다.");
				break;
			}
			
			startWord = play[i].word;
			j++;
			
		}
		
		sc.close();
 		
	}

}
