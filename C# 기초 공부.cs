using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class C#Subject : MonoBehaviour
{    
    int health = 30; //전역변수 *함수 참고  
    string title = "전설의";
    string playername = "나검사";
    int level = 5; 
    float strength = 15.5f;
    int exp = 1500;
    int health = 30;
    int mana = 25;
    bool isFullLevel = false;

    // Start is called before the first frame update
    void Start()
    {
        Debug.Log("Hello Unity");
        // 1 . 변수
        int level = 5; // 정수형 데이터
        float strength = 15.5f; // 숫자형 데이터 뒤에 f를 꼭 붙일것
        string playername = "나검사"; // 문자형 데이터 "큰 따옴표" 붙이기
        bool isFullLevel = false; // 논리형 데이터 참인가 거짓인가만 들어감

        Debug.Log("검사의 이름은?" + playername);
        Debug.Log("검사의 레벨은?" + level);
        Debug.Log("용사의 힘은?" + strength);
        Debug.Log("용사는 만렙인가?" + isFullLevel);
       
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
        
        // 3. 연산자
        int exp = 1500;


        exp = 1500 + 320;
        exp = exp - 10;
        level = exp / 300;
        strength = level * 3.1f;
        
        Debug.Log("캐릭터의 총 경험치는?");
        Debug.Log(exp);
        Debug.Log("캐릭터의 레벨은?");
        Debug.Log(level);
        Debug.Log("캐릭터의 힘은?");
        Debug.Log(strength);
        
        int nextExp = 300 - (exp % 300); // 정수형
        Debug.Log("다음 레벨까지 남은 경험치는?");
        Debug.Log(nextExp);
        
        string title = "근면성실의"; // 문자형
        Debug.Log("캐릭터의 이름은?");
        Debug.Log(title + " " + playername);
        
        int fullLevel = 100; // 정수형 
        isFullLevel = level == fullLevel; 
        Debug.Log("캐릭터는 최대레벨을 찍었습니까?" + isFullLevel); // False 값 
        
        bool isEndTutorial = level > 10; // 논리형
        Debug.Log("튜토리얼을 마친 유저입니까?" + isEndTutorial); // False 값 
        
        int health = 30;
        int mana = 15;
        // bool isBadCondition = health <= 50 && mana <= 20; and 연산자 모두 true 일때 true
        bool isBadCondition = health <= 50 || mana <= 20; // or 연산자 하나만 true 여도 true 
        Debug.Log("캐릭터의 상태가 나쁩니까?" + isBadCondition);

        string condition = isBadCondition ? "나쁨" : "좋음"; // = (조건) ? A : B = 조건이 참(true)일때 A를 출력 : 조건이 거짓(false)일때 B를 출력 
        Debug.Log("캐릭터의 상태가 나쁩니까?" + condition);
        
        // 4. 조건문
        
        // if (조건) {
        //     로직
        // } 
        // else(앞에 if가 실행되지 않으면 실행) {
        //     로직
        // }    
        if (condition == "나쁨") {
            Debug.Log("플레이어의 상태가 나쁘니 아이템을 사용하세요.");
        }
        else {
            Debug.Log("플레이어 상태가 좋습니다.");
        }      

        if (isBadCondition && items[0] == "생명물약30") {
            items.RemoveAt(0);
            health += 30;
            Debug.Log("생명포션30을 사용하였습니다.");
        }
        else if (isBadCondition && items[0] == "마나물약30") {
            items.RemoveAt[0];
            mana += 30;
            Debug.Log("마나포션30을 사용하였습니다.");
        }      
        // else if (앞에 if가 실행되지 않을때, 그리고 조건을 포함한 else = if와 거의 동일)

        // switch (변수) {
        //    case 값1:
        //        break;
        //    case 값2:
        //        break;
        //    case 값3:
        //        break;  
        // }
        
        switch (monsters[1]) {
            case "슬라임":
            case "사막뱀": // 콜론 표시 조심하기 / 같은 로직을 실행할 때 바로 아래에 case 문구만 적어주면 됨 
                Debug.Log("소형 몬스터가 출현!");
                break; // 반복하지 않고 빠져나가기
            case "악마":
                Debug.Log("중형 몬스터가 출현!");
                break;
            case "골렘":
                Debug.Log("대형 몬스터가 출현!"); 
                break;  
            default: // 모든 case를 통과한 후 실행
                Debug.Log("??? 몬스터가 출현!");
                break;
         }
        
        // 6. 반복문
        while(health > 0) { // 조건 
            health--; // health(생명력) -1씩 감소 (0이 될때까지)
            if (health > 0) {
                Debug.Log("독 데미지를 입었습니다." + health);
            }
            else; 
                Debug.Log("You Died");
            
            if (health == 10) {
                Debug.Log("해독제를 사용합니다.");
                break;
            }
        }  
        for (int count=0 ; count<10 ; count++) { // (연산될 변수 ; 조건 ; 연산)
            health++;
            Debug.Log("붕대로 치료 중... " + health); 


        }
        for (int index = 0; index < monsters.Length; index++) { // 그룹형 변수 길이 .Length(배열) /  .Count(리스트)
            Debug.Log("용사는" + monsters[index] + "에게" + // for문에서는 변수를 번지수로 사용한다.
                Battle(monsterLevel[index])); 
                // 함수를 이용하여 몬스터에 따라서 전투 결과가 나오게 된다.

        }
        foreach (string monster in monsters) { // forreach : for의 그룹형 변수 탐색 특화
            Debug.Log("이 지역에 있는 몬스터: " + monster);
            // 그룹형 변수에 있는 변수를 하나씩 끄집어 내어서 중괄호 안으로 넣는 방식이다.
        }
        
       // 함수 쓰는법
        health = Heal(health); // Heal(함수) <- 변수를 받고있다 = 매개변수
       // 값을 반환할 필요 없는 함수 만드는 법
        

    }

    // 7. 함수 Function (메소드)
    int Heal(int currenthealth) // 내뱉는 자료형 함수(이 함수가 받을 변수) int(숫자형) Heal(int health캐릭터의 체력)
    {
        currenthealth += 10;
        Debug.Log("힐을 받았습니다." + currenthealth);
        return currenthealth; // 함수가 값을 반환할때 사용
        // 함수의 매개변수 이름은 집어 넣을 실제 변수의 이름과 꼭 같을 필요는 없습니다.
    }
    void Heal() // 반환 데이터가 없는 함수 타입 
    {
        health += 10; // 여기서 health 는 void start 에 들어가있는 지역변수(함수 안에서 선언된 변수)기에 여기서 health를 찾을 수 없게 됨.
        // = 그렇기에 전역 변수(함수 바깥에 선언된 변수)로 지정해야 된다.
        Debug.Log("힐을 받았습니다." + health);
    }
    string Battle(int monsterLevel)
    {
        string result;
        if (level >= monsterLevel) // 레벨에 따른 조건  
            result = "이겼습니다.";
        else    
            result = "졌습니다.";
        

        return result; // 반환 
            


    }
}
