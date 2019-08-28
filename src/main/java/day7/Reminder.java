package day7;

public class Reminder {
    private int s;
    private static Reminder reminder;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    private Reminder() {
    }

    public static Reminder getInstance() {
        if (reminder == null) {
            reminder = new Reminder();
        }
        return reminder;
    }
}