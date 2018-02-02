public class Oop_Inheritance {

    public static void main(String[] args) {

        StudentSpeaker studSpeaker = new StudentSpeaker("Max Mustermann", 16, 79.6, 11);

        studSpeaker.getInfo();
    }
}

class Person {

    String name;
    int age;
}

class Pupil extends Person {

    double gradeAverage;
}

class StudentSpeaker extends Pupil {

    private int academicYear;

    StudentSpeaker(String name, int age, double gradeAverage, int academicYear) {
        this.name = name;
        this.age = age;
        this.gradeAverage = gradeAverage;
        this.academicYear = academicYear;
    }

    void getInfo() {

        System.out.println(this.name + ", " + this.age + " years old, " + this.gradeAverage + " avrg, " + this.academicYear + "th grade.");
    }
}

