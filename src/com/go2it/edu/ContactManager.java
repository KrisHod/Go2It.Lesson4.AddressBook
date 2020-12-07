package com.go2it.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    private static List<Contact> contactList = new ArrayList<>();

    public static List<Contact> getContactList() {
        return contactList;
    }

    public static void setContactList(List<Contact> contactList) {
        ContactManager.contactList = contactList;
    }

    public static void chooseMenuOption() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1 to add contact \nenter 2 to edit contact \nenter 3 to delete contact " +
                "\nenter 4 to view list of all contacts \nenter 5 to find a contact by full name " +
                "\nenter 6 to view contacts that live in particular city \nenter 7 to exit");
        byte choice = input.nextByte();
        if (choice > 0 && choice < 8) {
            switch (choice) {
                case 1:
                    addContact();
                    chooseAnotherMenuOption();
                    break;
                case 2:
                   // editContact();
                    chooseAnotherMenuOption();
                    break;
                case 3:
                  //  deleteContact();
                    chooseAnotherMenuOption();
                    break;
                case 4:
                  //  viewListOfAllContacts();
                    chooseAnotherMenuOption();
                    break;
                case 5:
                  //  findContactByFullName();
                    chooseAnotherMenuOption();
                    break;
                case 6:
                  //  viewContactsInCity();
                    chooseAnotherMenuOption();
                    break;
                case 7:
                    System.out.println("Thank you. Good bye!");
                    break;
            }
        }
    }

    public static void chooseAnotherMenuOption() {
        Scanner in = new Scanner(System.in);
        byte choice;
        System.out.println("Do you want to continue to work with program? \nPress 1 to continue \nPress 2 to exit");
        choice = in.nextByte();
        if (choice == 1) {
            chooseMenuOption();
        } else if (choice == 2) {
            System.out.println("Thank you. Good bye!");
        } else {
            System.out.println("Invalid choice");
            chooseAnotherMenuOption();
        }
    }

    public static void addContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first name");
        String firstName = in.next();
        System.out.println("Please enter the last name");
        String lastName = in.next();
        System.out.println("Please enter the home phone");
        String homePhone = in.next();
        System.out.println("Please enter the work home");
        String workPhone = in.next();
        System.out.println("Please enter the street info");
        String streetInfo1 = in.next();
        System.out.println("Please enter additional street info");
        String streetInfo2 = in.next();
        System.out.println("Please enter a city");
        String city = in.next();
        System.out.println("Please enter a postal code");
        String postalCode = in.next();
        System.out.println("Please enter a province");
        String province = in.next();
        System.out.println("Please enter a country");
        String country = in.next();
        System.out.println("Please enter an email");
        String email = in.next();
        System.out.println("Please enter day of the birth");
        int day = in.nextInt();
        System.out.println("Please enter month of the birth");
        int month = in.nextInt();
        System.out.println("Please enter year of the birth");
        int year = in.nextInt();
        System.out.println("You can enter your notes there");
        String notes = in.next();
        contactList.add(new Contact(firstName, lastName,homePhone, workPhone,
                new Address(streetInfo1, streetInfo1, city, postalCode, province, country),
                email, new MyDate(day, month, year), notes));
        System.out.println("You've added " + contactList.get(contactList.size()-1).toString());
    }

    public static void editContact(){

    }

    public static void deleteContact(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first name");
        String firstName = in.next();
        System.out.println("Please enter the last name");
        String lastName = in.next();
        System.out.println("Please enter the home phone");
        String homePhone = in.next();
        contactList.removeIf(list -> list.getFirstName().equals(firstName) && list.getLastName().equals(lastName) && list.getHomePhone().equals(homePhone));
    }
}
