package by.itstep.vikvik.javalessons.lesson22.model.entity;

public class Student extends Human {
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;

    private double mark = 4;

        // default constructor (with no args)
    public Student() {
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }

    // full constructor with params/args
    public Student(String name, int age, double mark, boolean alive) {
//        setName(name);
//        setAge(age);
//        setAlive(alive);
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;
    }

    // copy-constructor
    public Student(Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }


//    public void setAge(int age) {
//        if (age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE) {
//            this.age = age;
//        }
//    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }
    }

    public String getInfo() {
        return "Student - " + name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "no");
//        return "Student - " + getName() + ": age = " + getAge()
//                + ", mark = " + mark
//                + ", is alive = " + (isAlive() ? "yes" : "no");
    }
}