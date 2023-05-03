package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Contact> contacts = new ArrayList<>();
    public static Scanner scan;

    public static void recordGroup() {
        scan = new Scanner(System.in);
        System.out.println("Введите название группы");
        String group = scan.nextLine();
        addContact();

        PhoneBook.note.put(group, contacts);

    }

    public static void recordContact() {

        System.out.println("Введите имя контакта");
        String name = scan.nextLine();

        System.out.println("Введите номер контакта");
        int number = scan.nextInt();

        contacts.add(new Contact(name, number));


    }


    public static boolean addContact() {
        int num;
        while (true) {
            System.out.println("Добавить еще один контакт?\n" +
                    "1.Да \n" +
                    "2.Нет");
            num = scan.nextInt();
            switch(num){
                case 1:
                    recordContact();
                case 2:
                    System.out.println("Запись контактов завершена");
                    return false;

            }
        }
    }


        public static void main (String[]args){
            recordGroup();

        }
    }
