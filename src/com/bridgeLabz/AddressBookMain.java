package com.bridgeLabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management System");
     AddressBook addressBook = new AddressBook();
     addressBook.addNewContact();
        System.out.println(addressBook.list);
    }
}
