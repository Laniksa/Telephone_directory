package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {
    public static HashMap<String, ArrayList<Contact>> phoneBook;
    public static ArrayList<Contact> contacts = new ArrayList<>();
    public static Scanner scan;

    public PhoneBook(String group, ArrayList<Contact> contacts){
        phoneBook = new HashMap<>();
        phoneBook.put(group, contacts);
    }

    public static void recordGroup() { // Создаем группу без контактов
            scan = new Scanner(System.in);
            System.out.println("Введите название группы");
            String group = scan.nextLine();
            new PhoneBook(group, null);
    }
    public static void printAllGroups(){          // печатаем все ключи
        System.out.println(phoneBook.keySet());
    }

    public static void recordingContactInDifferentGroups(String group, Contact contact){
        if(phoneBook.containsKey(group)){
            phoneBook.get(group).add(contact);// get возвращает значение ключа, т.е наш ArrayList<Contact> contacts
        }else {
            ArrayList<Contact> contacts = new ArrayList<>();
            contacts.add(contact);
            phoneBook.put(group,contacts);

        }
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

