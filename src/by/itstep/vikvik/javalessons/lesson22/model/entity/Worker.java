package by.itstep.vikvik.javalessons.lesson22.model.entity;

public class Worker {
    private String name;
    private int age;
    private double salary;
    //
    private boolean alive;

    public Worker() {
    }

    public Worker(String name, int age, double salary, boolean alive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getInfo() {
        return "Worker - " + name + ": age = " + age
                + ", salary = " + salary
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
