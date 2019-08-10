package day4.addressBook.model;

import java.io.Serializable;

public class Phone implements Serializable {
    private String phoneNumber;
    private PhoneType phoneType;

    public Phone(String phoneNumber, PhoneType phoneType) {
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", phoneType=" + phoneType.getType() +
                '}';
    }
}
