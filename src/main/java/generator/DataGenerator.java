package generator;

import generator.account.AccountDetailsGenerator;
import generator.contacts.ContactsGenerator;
import generator.documents.DocumentGenerator;
import generator.person.PersonGenerator;

public class DataGenerator {

    static private PersonGenerator personGenerator;
    static private DocumentGenerator documentGenerator;
    static private AccountDetailsGenerator accountDetailsGenerator;

    static private ContactsGenerator contactsGenerator;

    public static PersonGenerator persons(){
        if(personGenerator == null){
            personGenerator = new PersonGenerator();
        }
        return personGenerator;
    }

    public static DocumentGenerator documents(){
        if(documentGenerator == null){
            documentGenerator = new DocumentGenerator();
        }
        return documentGenerator;
    }

    public static AccountDetailsGenerator accountDetails(){
        if(accountDetailsGenerator == null){
            accountDetailsGenerator = new AccountDetailsGenerator();
        }
        return accountDetailsGenerator;
    }


    public static ContactsGenerator contacts(){
        if(contactsGenerator == null){
            contactsGenerator = new ContactsGenerator();
        }
        return contactsGenerator;
    }

}
