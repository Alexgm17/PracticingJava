package com.contacts.repository.mysql.jpa;

import com.contacts.entity.mysql.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

    ContactEntity findByEmail(String email);

    @Transactional
    @Modifying
    @Query("DELETE FROM ContactEntity c WHERE c.email=?1")
    void deleteFromEmail(String email);
}
