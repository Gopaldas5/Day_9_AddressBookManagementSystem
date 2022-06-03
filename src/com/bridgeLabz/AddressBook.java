package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
//    Contact contact;
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> list = new ArrayList();

 public void addNewContact(){
     System.out.println("Enter the First Name:- ");
     String firstName = scanner.next();
     System.out.println("Enter the Last Name:- ");
     String lastname = scanner.next();
     System.out.println("Enter the Address :- ");
     String address = scanner.next();
     System.out.println("Enter the Name of city:- ");
     String city = scanner.next();
     System.out.println("Enter the Name of State:- ");
     String state = scanner.next();
     System.out.println("Enter the pin code:- ");
     String pin = scanner.next();
     System.out.println("Enter the phone number:- ");
     String phoneNumber = scanner.next();
     System.out.println("Enter the Email:-");
     String email = scanner.next();
     Contact contact = new Contact(firstName,lastname,address, city, state, pin, phoneNumber, email );
     list.add(contact);
 }
 public void editContact(){
     System.out.println("Please Enter the name first to edit :-");
     String editName = scanner.next();
     for(Contact contact:list){
         if(contact.getFirstName().equals(editName)){
             contact.editExistingContact();
         }

     }

 }
 public void deleteContact(){
     System.out.println("Enter the name first to delete:-");
     String deleteName = scanner.next();
     for(Contact contact:list){
         if(contact.getFirstName().equals(deleteName)){
             contact.deleteExistingContact();
         }
     }
 }
}
