package com.example.csd_proj2;

public class Contact {

    String name;
    String mail_id;

    public Contact(String name, String mail_id) {
        this.name = name;
        this.mail_id = mail_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }
}
