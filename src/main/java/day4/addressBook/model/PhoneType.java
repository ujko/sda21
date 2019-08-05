package day4.addressBook.model;

public enum PhoneType {
    MOBILE("Telefon komorkowy"),
    HOME("Telefon domowy"),
    WORK("Telefon do pracy");

    private String type;

    PhoneType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
