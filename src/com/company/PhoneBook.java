package com.company;

import java.util.HashMap;
import java.util.List;


public class PhoneBook {
    private static HashMap<String, List<Contact>> contactGroup;
    private List<Group> groups;


    public PhoneBook(){
        contactGroup = new HashMap<String, List<Contact>>();

    }
    public void createGroup(String name){
        Group group = new Group(name);
        groups.add(group);
    }

    public void addContactToGroup(String nameGroup, Contact contact){
        for(Group group : groups){
            if(group.getName().equals(nameGroup)){
                group.addContact(contact);
                contactGroup.put(nameGroup, group.getContacts());// под вопросом
            }
        }
    }

}

