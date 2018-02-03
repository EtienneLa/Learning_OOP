public class SuperClass_referenceVariable {

    public static void main(String[] args) {

        Human h1 = new Student(); // valid
        //Student s1 = new Human(); not valid
    }
}

class Human {

    String name;
    String address;
    int age;
}

class Student extends Human {

    int id;
    double marks;
}
