package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static Scanner scan;

    public static void recordGroup() {
        scan = new Scanner(System.in);
        System.out.println("Введите название группы");
        String group = scan.nextLine();
        addPhoneBook(group, recordContact());
    }

    public static ArrayList<Contact> recordContact() {

        int num = 0;
        while (num !=2) {
            scan = new Scanner(System.in);
            System.out.println("Введите имя контакта");
            String name = scan.nextLine();

            System.out.println("Введите номер контакта");
            int number = scan.nextInt();

            contacts.add(new Contact(name, number));
            System.out.println(contacts.toString() + " записан.\n Добавить еще один контакт? \n 1.Да\n 2.Нет");
            num = scan.nextInt();
        }
        System.out.println("Запись контактов завершена!");

        return contacts;


    }

    public static void addPhoneBook(String group, ArrayList<Contact> contacts){
        //PhoneBook phoneBook = new PhoneBook (group, (ArrayList<Contact>) contacts);
        PhoneBook.note.put(group,contacts);
        printContactsGroups();
    }


//    public static boolean addContact() {
//        int num;
//        while (true) {
//            System.out.println("Добавить еще один контакт?\n" +
//                    "1.Да \n" +
//                    "2.Нет");
//            num = scan.nextInt();
//            switch (num) {
//                case 1:
//                    recordContact();
//                    break;
//                case 2:
//                    System.out.println("Запись контактов завершена");
//
//                    return false;
//
//            }
//        }
//    }
//
//    public static void conclusionContact(){
//        for (Contact people : contacts){
//            System.out.println(people);
//        }
//    }
//
    public static void printContactsGroups() {
        PhoneBook.note.forEach((key, value) -> System.out.println(key + " : " + value.toString()));
    }


    public static void main(String[] args) {
        recordGroup();
        //conclusionContact();
       // printContactsGroups();
//        recordContact();



        }
    }

