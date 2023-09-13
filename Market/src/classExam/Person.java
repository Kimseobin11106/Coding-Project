package classExam;

public class Person {

    public final String name;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
//      p1.name = "장발장"; = 상수 처리로 인해 직접 접근 불가
        System.out.println(p1.getName());
    }
}
