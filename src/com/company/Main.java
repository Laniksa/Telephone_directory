package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {

    public static boolean menu (){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Введите пункт меню: \n" +
                    "1. Создать группу \n" +
                    "2. Распечатать все группы \n" +
                    "3. Создать контакт \n" +
                    "4. Распечатать вcе контакты \n" +
                    "5. Записать контакт в группу \n" +
                    "6. Выход из программы ");
            int num = scan.nextInt();
            switch (num){

                case 1:
                    PhoneBook.recordGroup();
                case 2:
                    PhoneBook.printAllGroups();
                case 3:
                    //
                case 4:
                    //
                case 5:
                    System.out.println("Ведите название группы: ");
                    String groupName = scan.nextLine();
                    System.out.println("Ведите контакт: ");

//                    if (PhoneBook.contacts.contains(contactName)){
//                        PhoneBook.recordingContactInDifferentGroups(groupName,contactName);
//                    }

                    System.out.println("Ведите имя контакта: ");
                    String contactName = scan.nextLine();
                    System.out.println("Ведите номер контакта: ");
                    int contactNumber = scan.nextInt();
                    PhoneBook.recordingContactInDifferentGroups(groupName, new Contact(contactName,contactNumber));// А если контакт уже создан?

            }
        }

    }


    public static void main(String[] args) {
        Contact contact1 = new Contact("Ваня", 888);
        Contact contact2 = new Contact("Аня", 8998);
        Contact contact3 = new Contact("Саня", 669);
        Contact contact4 = new Contact("Ланя", 767);




        }
    }

