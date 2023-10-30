package blackBox;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        System.out.println("1");
        b1.record(false,false,5);

        System.out.println("2");
        b1.record(true,false,3);

        System.out.println("3");
        b1.record(true,true,5); // default와 같은 변수값

        System.out.println("default");
        b1.record();


    }
}
