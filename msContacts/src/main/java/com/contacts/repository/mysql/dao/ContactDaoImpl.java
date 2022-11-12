package com.contacts.repository.mysql.dao;

import com.contacts.entity.mysql.ContactEntity;
import com.contacts.repository.mysql.jpa.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDao {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public void addContact (ContactEntity contactEntity) {
        contactRepository.save(contactEntity);
    }

    @Override
    public ContactEntity getContact (String email) {
        return contactRepository.findByEmail(email);
    }

    @Override
    public List<ContactEntity> getContacts () {
        return contactRepository.findAll();
    }

    @Override
    public void deleteContact (String email) {
        contactRepository.deleteFromEmail(email);
    }

    @Override
    public void deleteContact (int contactId) {
        contactRepository.deleteById(contactId);
    }

    @Override
    public ContactEntity getContact (int contactId) {
        return contactRepository.findById(contactId).orElse(null);
    }

    @Override
    public void updateContact (ContactEntity contactEntity) {
        contactRepository.save(contactEntity);
    }
}
