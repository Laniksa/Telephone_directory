package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {
    public static HashMap<String, ArrayList<Contact>> note;
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static Scanner scan;

    public PhoneBook(String group, ArrayList<Contact> contacts){
        note = new HashMap<>();
        note.put(group, contacts);
    }

    public static void recordGroup() {
        int num = 0;
        while (num != 2){
            scan = new Scanner(System.in);
            System.out.println("Введите название группы");
            String group = scan.nextLine();
            new PhoneBook(group, recordContact(group));

            System.out.println("Добавить еще одну группу с контактами?\n 1.Да \n 2.Нет");
            num = scan.nextInt();
        }
        System.out.println( note.toString());

    }

    public static ArrayList<Contact> recordContact(String group) {

        int num = 0;
        while (num !=2) {
            scan = new Scanner(System.in);
            System.out.println("Введите имя контакта");
            String name = scan.nextLine();

            System.out.println("Введите номер контакта");
            int number = scan.nextInt();

            contacts.add(new Contact(name, number));
            System.out.println(contacts.toString() + " записан.\n Добавить еще один контакт в группу " + group + "? \n 1.Да\n 2.Нет");
            num = scan.nextInt();
        }

        System.out.println("Запись контактов завершена!");

        return contacts;


    }


    @Override
    public String toString() {
        return super.toString();
    }
}

