package day8.enumTest;

public enum Kolor {
    RED(255,0,0),
    YELLOW(255,222,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    WHITE(255,255,255);

    Kolor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    private int r;
    private int g;
    private int b;

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
