package classExam;

//  파라미터로 정수 배열 intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드 computerAverage를 작성하시오.
class AverageFinder {
    double computerAverage(int[] intArray) {
        int sum = 0;

//      foreach 문 : 배열할 때 주로 사용하기
        for(int num : intArray) {
            sum += num;
        }
        return (double)sum / intArray.length;
    }
}

public class Ex01 {
    public static void main(String[] args) {


//      테스트1
        AverageFinder af = new AverageFinder();
        int[] testArray1 = {3,7,3};
        System.out.println(af.computerAverage(testArray1));
    }
}
