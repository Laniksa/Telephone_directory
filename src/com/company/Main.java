package com.company;

public class Main {



    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.createGroup("Друзья");
        phoneBook.createGroup("Работа");

        Contact contact1 = new Contact("Pasha", 9798798);
        Contact contact2 = new Contact("Vova", 980988);
        Contact contact3 = new Contact("Olya", 9998798);
        Contact contact4 = new Contact("Roma", 980977);

        phoneBook.addContactToGroup("Друзья",contact1);
        phoneBook.addContactToGroup("Работа",contact2);
        phoneBook.addContactToGroup("Друзья",contact3);
        phoneBook.addContactToGroup("Работа",contact4);







        }
    }

