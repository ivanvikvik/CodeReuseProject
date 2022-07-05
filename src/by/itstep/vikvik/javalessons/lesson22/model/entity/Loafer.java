package by.itstep.vikvik.javalessons.lesson22.model.entity;

public class Loafer {
    private static double amount;

    private String name;
    private int age;
    private double inactivityPeriod;
    private boolean alive;

    public Loafer() {
    }

    public Loafer(String name, int age, double inactivityPeriod, boolean alive) {
        this.name = name;
        this.age = age;
        this.inactivityPeriod = inactivityPeriod;
        this.alive = alive;
    }

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(double amount) {
        Loafer.amount = amount;
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

    public double getInactivityPeriod() {
        return inactivityPeriod;
    }

    public void setInactivityPeriod(double inactivityPeriod) {
        this.inactivityPeriod = inactivityPeriod;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getInfo() {
        return "Loafer - " + name + ": age = " + age
                + ", inactivity period = " + inactivityPeriod
                + ", is alive = " + (alive ? "yes" : "no");
    }
}
