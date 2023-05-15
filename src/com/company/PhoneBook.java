package com.company;

import java.util.ArrayList;
import java.util.HashMap;


public class PhoneBook {
    public static HashMap<String, ArrayList<Contact>> note;

    public PhoneBook(String group, ArrayList<Contact> contact){
        note = new HashMap<>();
        note.put(group, contact);
    }

    @Override
    public String toString() {
        return note.toString();
    }
}

