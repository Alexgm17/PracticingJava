package com.contacts.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactDTO {
    @JsonProperty("contactId")
    private Integer contactId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private Integer email;

    @JsonProperty("age")
    private Integer age;
}
