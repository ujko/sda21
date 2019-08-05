package day4.enumTest;

public enum Znak {
    DODAWANIE,
    ODEJMOWANIE,
    DZIELENIE,
    MNOZENIE,
    RESZTA_Z_DZIELENIA,
    DZIELENIE_ULAMKI;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
