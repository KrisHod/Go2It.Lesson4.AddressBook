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
                    editContact();
                    chooseAnotherMenuOption();
                    break;
                case 3:
                    deleteContact();
                    chooseAnotherMenuOption();
                    break;
                case 4:
                    viewListOfAllContacts();
                    chooseAnotherMenuOption();
                    break;
                case 5:
                    findContactByFullName();
                    chooseAnotherMenuOption();
                    break;
                case 6:
                    viewContactsInCity();
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
        System.out.println("Please enter the work phone");
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
        contactList.add(new Contact(firstName, lastName, homePhone, workPhone,
                new Address(streetInfo1, streetInfo1, city, postalCode, province, country),
                email, new MyDate(day, month, year), notes, contactList.size()));
        System.out.println("You've added " + contactList.get(contactList.size() - 1).toString());
    }

    public static void editContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first name of contact that you want to edit");
        String firstName = in.next();
        System.out.println("Please enter the last name of contact that you want to edit");
        String lastName = in.next();
        System.out.println("Please enter the home phone of contact that you want to edit");
        String homePhone = in.next();
        for (Contact arr : contactList) {
            if (arr.getFirstName().equals(firstName) && arr.getLastName().equals(lastName) && arr.getHomePhone().equals(homePhone)) {
                System.out.println("Please enter what do you want to change. Enter 1 to edit the first name \nenter 2 to edit the last name " +
                        "\nenter 3 to edit the home phone \nenter 4 to edit the work phone \nenter 5 to edit the street info " +
                        "\nenter 6 to edit the additional street info \nenter 7 to edit a city \nenter 8 to edit a postal code " +
                        "\nenter 9 to edit a province \nenter 10 to edit a country \nenter 11 to edit an email \nenter 12 to edit day of the birth " +
                        "\nenter 13 to edit month of the birth \nenter 14 to edit year of the birth \nenter 15 to edit notes");
                byte choice = in.nextByte();
                if (choice > 0 && choice < 16) {
                    switch (choice) {
                        case 1:
                            System.out.println("Please enter new name");
                            String newName = in.next();
                            arr.setFirstName(newName);

                    }
                }
            } else{
                System.out.println("There is no contact with such data");
            }
        }
    }

    public static void deleteContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first name");
        String firstName = in.next();
        System.out.println("Please enter the last name");
        String lastName = in.next();
        System.out.println("Please enter the home phone");
        String homePhone = in.next();
        contactList.removeIf(list -> list.getFirstName().equals(firstName) && list.getLastName().equals(lastName) && list.getHomePhone().equals(homePhone));
    }

    public static void viewListOfAllContacts() {
        System.out.println(contactList.toString());
    }

    public static void findContactByFullName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first name of contact that you want to find");
        String firstName = in.next();
        System.out.println("Please enter the last name of contact that you want to find");
        String lastName = in.next();
        for (Contact arr : contactList) {
            if (arr.getFirstName().equals(firstName) && arr.getLastName().equals(lastName)) {
                System.out.println(arr.toString());
            } else {
                System.out.println("There is no contact with this full name");
            }
        }
    }

    public static void viewContactsInCity() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the city whose contacts you want to see");
        String city = in.next();
        for (Contact arr : contactList) {
            if (arr.getHomeAddress().city.equals(city)) {
                System.out.println(arr.toString());
            } else {
                System.out.println("There are no contacts with addresses in this city");
            }
        }
    }


}
