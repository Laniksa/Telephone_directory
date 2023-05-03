package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Contact> contacts = new ArrayList<>();
    public static Scanner scan;

    public static void recordGroup(List<Contact> contacts) {
        scan = new Scanner(System.in);
        System.out.println("Введите название группы");
        String group = scan.nextLine();

        PhoneBook.note.put(group, contacts);

    }

    public static boolean recordContact() {
        while (true) {
            System.out.println("Введите имя контакта");
            String name = scan.nextLine();
            System.out.println("Введите номер контакта");
            int number = scan.nextInt();

            contacts.add(new Contact(name, number));
            System.out.println("Добавить еще один контакт?\n" +
                    "1.Да" +
                    "2.Нет");
            int num = scan.nextInt();
            if(num == 1){
                return true;
            }else{
                System.out.println("Запись контактов завершена");
                return false;
            }
        }

    }


    public static void main(String[] args) {
        //record();
    }
}
