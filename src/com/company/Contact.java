package com.company;

public class Contact {
private String name;
private int number;

public Contact(String name, int number){
    this.name = name;
    this.number = number;

}

    @Override
    public String toString() {
        return "Контакт: " +
                "Имя " + name + '\'' +
                "Номер =" + number;
    }
}
