package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Contact> contacts = new ArrayList<>();
    public static Scanner scan;
public static void record (){
    scan = new Scanner(System.in);
    System.out.println("Введите название группы");
    String group = scan.nextLine();


        System.out.println("Введите имя контакта");
        String name = scan.nextLine();
        System.out.println("Введите номер контакта");
        int number = scan.nextInt();

        contacts.add(new Contact(name, number));


        PhoneBook.note.put(group, contacts);

}


    public static void main(String[] args) {
	record();
    }
}
