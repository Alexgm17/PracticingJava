package com.contacts.service;

import com.contacts.entity.mysql.ContactEntity;

import java.util.List;

public interface ContactService {

    public boolean addContact(ContactEntity contactEntity);
    public List<ContactEntity> getContacts();
    public boolean updateContact(ContactEntity contactEntity);
    public boolean deleteContact(int contactId);
    public ContactEntity findContact(int contactId);
}
