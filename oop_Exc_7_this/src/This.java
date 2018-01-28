public class This {

    public static void main(String[] args) {

        Test test = new Test();
        test.display();
        System.out.println("test = " + test);

        test.num = 20;
        test.display();

    }
}

class Test {

    int num = 1;

    public void display() {

        int num = 5;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println("this keyword = "+ this);
    }
}
