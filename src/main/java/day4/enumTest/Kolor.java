package day4.enumTest;

public enum Kolor {
    RED("czerwony"),
    YELLOW("zolty"),
    BLACK("czarny");

    private String kolor;
    Kolor(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }
}
