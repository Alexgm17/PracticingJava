package com.contacts.controller;

import com.contacts.entity.mysql.ContactEntity;
import com.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping(value="contacts",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ContactEntity> getContacts(){
        return contactService.getContacts();
    }

    @GetMapping(value="contacts/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ContactEntity getContact(@PathVariable("id") int id){
        return contactService.findContact(id);
    }

    @PostMapping (value="contacts/addContact",produces = MediaType.APPLICATION_JSON_VALUE)
    public String saveContact(@RequestBody ContactEntity contactEntity){
        return String.valueOf(contactService.addContact(contactEntity));
    }

    @PutMapping (value="contacts/updateContact",produces = MediaType.APPLICATION_JSON_VALUE)
    public String updateContact(@RequestBody ContactEntity contactEntity){
        return String.valueOf(contactService.updateContact(contactEntity));
    }

    @DeleteMapping (value="contacts/deleteById/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteContact(@PathVariable("id") int contactId){
        return String.valueOf(contactService.deleteContact(contactId));
    }

}
