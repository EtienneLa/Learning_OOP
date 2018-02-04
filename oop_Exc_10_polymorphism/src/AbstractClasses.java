public class AbstractClasses {

    public static void main(String[] args) {

        MySuperClass test = new MySubClass();
        test.printInfo();
        test.sayWord();
    }
}

abstract class MySuperClass {

    private String word = "Hello";

    public void sayWord() {
        System.out.println(word);
    }
    abstract public void printInfo();
}

class MySubClass extends MySuperClass {

    @Override
    public void printInfo() {
        System.out.println("Bye");
    }
}
