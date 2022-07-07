package by.itstep.vikvik.javalessons.lesson22.model.entity;

public class MarkNote {
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    private double mark;

    public MarkNote() {
        mark = 4;
    }

    public MarkNote(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= MIN_MARK && mark <= MAX_MARK) {
            this.mark = mark;
        }
    }
}