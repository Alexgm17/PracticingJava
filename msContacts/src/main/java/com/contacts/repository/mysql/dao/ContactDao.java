package com.contacts.repository.mysql.dao;

import com.contacts.entity.mysql.ContactEntity;

import java.util.List;

public interface ContactDao {
    void addContact(ContactEntity contactEntity);

    ContactEntity getContact(String email);

    List<ContactEntity> getContacts();

    void deleteContact(String email);

    void deleteContact(int contactId);

    ContactEntity getContact(int contactId);

    void updateContact(ContactEntity contactEntity);
}
