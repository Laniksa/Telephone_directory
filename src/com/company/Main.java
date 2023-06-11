package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {


    public static void printContactsGroups() {
        PhoneBook.phoneBook.forEach((key, value) -> System.out.println(key + " : " + value.toString()));
    }


    public static void main(String[] args) {

        //PhoneBook.record();



        }
    }

