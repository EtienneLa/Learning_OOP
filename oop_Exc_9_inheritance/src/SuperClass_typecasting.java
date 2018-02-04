public class SuperClass_typecasting {

    public static void main(String[] args) {

        //Human h1 = new Student(); // valid
        //Student s1 = new Human(); not valid
        //Human h2 = new Human();
        //Student s1 = h2;  not valid
        //Student s1 = (Student)h2; not valid (throws exception)

        Human h = new Human();
        System.out.println(h instanceof  Human); //true
        Human h1 = new Student();
        System.out.println(h1 instanceof Student); //true
        Human h2 = new Human();
        System.out.println(h2 instanceof Student); //false

       if(h1 instanceof Student) {
           Student s = (Student)h1;
       }



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
