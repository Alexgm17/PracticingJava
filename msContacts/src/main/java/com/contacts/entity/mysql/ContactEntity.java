package com.contacts.entity.mysql;

import javax.persistence.*;

@Entity
@Table (name = "contact")
public class ContactEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "contact_id")
    private int contactId;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "email")
    private String email;

    @Column (name = "age")
    private int age;

    public ContactEntity () {
    }

    public ContactEntity (String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public ContactEntity (int contactId, String name, String email) {
        this.contactId = contactId;
        this.name = name;
        this.email = email;
    }

    public ContactEntity (int contactId, String name, String email, int age) {
        this.contactId = contactId;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public int getContactId () {
        return contactId;
    }

    public void setContactId (int contactId) {
        this.contactId = contactId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public int getAge () {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }
}

