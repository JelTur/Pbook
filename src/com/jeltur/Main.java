package com.jeltur;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        while (true) {
            UI.showMenu();
            int userChoice = UI.getUserChoice();
            switch (userChoice) {
                case UI.MENU_CHOICE_SHOW_ALL:
                    {
                        ArrayList<Contact> contacts = phonebook.getAll();
                        UI.printArray(contacts);
                    }
                    break;
                case UI.MENU_CHOICE_SEARCH:
                    {
                        String searchCriteria = UI.getSearchCriteria();
                        ArrayList<Contact> contacts = phonebook.search(searchCriteria);
                        UI.printArray(contacts);
                    }
                    break;
                case UI.MENU_CHOICE_ADD:
                    Contact newContact = UI.getNewContact();
                    Contact addedContact = phonebook.add(newContact);
                    UI.printContact(addedContact);
                    break;
                case UI.MENU_CHOICE_DELETE:
                    String deleteSurname = UI.getDeleteSurname();
                    ArrayList<Contact> deletedContacts = phonebook.deleteBySurname(deleteSurname);
                    UI.printArray(deletedContacts);
                    break;
                case UI.MENU_CHOICE_EXIT:
                    System.exit(0);
            }
        }
    }
}
