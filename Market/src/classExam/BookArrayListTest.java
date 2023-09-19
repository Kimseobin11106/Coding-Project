package classExam;

import java.util.ArrayList;

public class BookArrayListTest {
    public static void main(String[] args) {
//      ArrayList 선언문 (new 뒤 ArrayList<>(); 는 공백으로 표시해도 된다.)
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어린왕자", "생택쥐페리"));

//      출력 방법
//      library.get(0).showBookInfo();
//      library.get(1).showBookInfo();

//      ArrayList 는 length 대신 size 함수를 사용한다.
        for (int i=0; i<library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }

//      foreach 문
//      for (Book book : library) {
//          book.showBookInfo();
//      }
    }
}
