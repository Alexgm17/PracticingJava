package com.contacts.service.impl;

import com.contacts.entity.mysql.ContactEntity;
import com.contacts.repository.mysql.dao.ContactDao;
import com.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

 @Service
public class ContactServiceImpl implements ContactService {

     @Autowired
     ContactDao contactDao;

    @Override
    public boolean addContact (ContactEntity contactEntity) {
        if (contactDao.getContact(contactEntity.getContactId())==null) {
            contactDao.addContact(contactEntity);
            return true;
        }
        return false;
    }

    @Override
    public List<ContactEntity> getContacts () {
        return contactDao.getContacts();
    }

    @Override
    public boolean updateContact (ContactEntity contactEntity) {
        if (contactDao.getContact(contactEntity.getContactId())!=null) {
            contactDao.updateContact(contactEntity);
            return true;
        }
        return false;

    }

    @Override
    public boolean deleteContact (int contactId) {
        if (contactDao.getContact(contactId)!=null) {
            contactDao.deleteContact(contactId);
            return true;
        }
        return false;
    }

    @Override
    public ContactEntity findContact (int contactId) {
        return contactDao.getContact(contactId);
    }
}
