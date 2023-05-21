package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {







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

        PhoneBook.recordGroup();



        }
    }

