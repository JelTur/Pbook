package com.jeltur;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        while (true) {
            UI.showMenu();
            int userChoice = UI.getUserChoice();
            switch (userChoice) {
                case UI.MENU_CHOICE_SHOW_ALL:
                    ArrayList contacts = Phonebook.getAll();
                    UI.printArray(contacts);
                    break;
                case UI.MENU_CHOICE_SEARCH:
                    String searchCriteria = UI.getSearchCriteria();
                    ArrayList contacts = Phonebook.search(searchCriteria);
                    UI.printArray(contacts);
                    break;
                case UI.MENU_CHOICE_ADD:
                    String newContact = UI.getNewContact();
                    String addedContact = Phonebook.add(newContact);
                    UI.printContact(addedContact);
                    break;
                case UI.MENU_CHOICE_DELETE:
                    String deleteSurname = UI.getDeleteSurname();
                    ArrayList deletedContacts = Phonebook.deleteBySurname(deleteSurname);
                    UI.printArray(deletedContacts);
                    break;
                case UI.MENU_CHOICE_EXIT:
                    System.exit(0);
            }
        }
    }
}
