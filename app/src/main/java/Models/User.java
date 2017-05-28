package Models;

import java.security.PublicKey;

/**
 * Created by fozersahin on 6.5.2017.
 */

public class User {

    private String id = null;
    private String name ;
    private String surname ;
    private String mail ;
    private String number ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User(String id , String name , String surname , String number , String mail ){

        setId(id);
        setName(name);
        setSurname(surname);
        setNumber(number);
        setMail(mail);


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
