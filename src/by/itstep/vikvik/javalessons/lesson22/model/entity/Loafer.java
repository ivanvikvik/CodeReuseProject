package by.itstep.vikvik.javalessons.lesson22.model.entity;

public class Loafer extends Human {
    private static double amount;

    private double inactivityPeriod;

    public Loafer() {
    }

    public Loafer(String name, int age, double inactivityPeriod, boolean alive) {
//        setName(name);
//        setAge(age);
//        setAlive(alive);
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

    public double getInactivityPeriod() {
        return inactivityPeriod;
    }

    public void setInactivityPeriod(double inactivityPeriod) {
        this.inactivityPeriod = inactivityPeriod;
    }

    public String getInfo() {
        return "Loafer - " + name + ": age = " + age
                + ", inactivity period = " + inactivityPeriod
                + ", is alive = " + (alive ? "yes" : "no");

//        return "Loafer - " + getName() + ": age = " + getAge()
//                + ", inactivity period = " + inactivityPeriod
//                + ", is alive = " + (isAlive() ? "yes" : "no");
    }
}
