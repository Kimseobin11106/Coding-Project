using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        Debug.Log("Hello Unity");
        // 1 . 변수
        int level = 5; // 정수형 데이터
        float strength = 15.5f; // 숫자형 데이터 뒤에 f를 꼭 붙일것
        string playername = "나검사"; // 문자형 데이터 "큰 따옴표" 붙이기
        bool isFullLevel = false; // 논리형 데이터 참인가 거짓인가만 들어감

        Debug.Log("검사의 이름은?");
        Debug.Log(playername);
        Debug.Log("검사의 레벨은?");
        Debug.Log(level);
        Debug.Log("용사의 힘은?");
        Debug.Log(strength);
        Debug.Log("용사는 만렙인가?");
        Debug.Log(isFullLevel);

        //2. 그룹형 변수
        string[] monsters = { "슬라임" , "사막뱀" , "악마" }; // 그룹형 변수 []중괄호랑 {}대괄호 사용
        int[] monsterLevel = new int[3]; // 정수 그룹형 변수
        monsterLevel[0] = 1;
        monsterLevel[1] = 6;
        monsterLevel[2] = 19;


        Debug.Log("현재 맵에 존재하는 몬스터");
        Debug.Log(monsters[0]);
        Debug.Log(monsters[1]);
        Debug.Log(monsters[2]);

        Debug.Log("현재 맵에 존재하는 몬스터의 레벨");
        Debug.Log(monsterLevel[0]);
        Debug.Log(monsterLevel[1]);
        Debug.Log(monsterLevel[2]);
        // 리스트 기능이 추가된 가변형 그룹형 변수 
        List<string> items = new List<string>();
        items.Add("생명물약30");
        items.Add("마나물약30");

        Debug.Log("가지고 있는 아이템");
        Debug.Log(items[0]);
        Debug.Log(items[1]);    

        // 1번째 아이템 삭제 
        items.RemoveAt(0); 

        // 여기서 만약에 첫번째 아이템을 삭제했는데 [1] 2번째 아이템을 불러 내려한다면 index 오류가 뜬다. 
        // Debug.Log(items[0]); (X)
        // Debug.Log(items[1]); (X)
        
        // Debug.Log(items[0]); (O)

    }
}
    
