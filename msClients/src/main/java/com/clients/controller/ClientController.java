package com.clients.controller;

import com.clients.service.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ClientController {

    @Autowired
    RestTemplate template;

    String url="http://localhost:8017";

    @GetMapping (value="/clients/{name}/{email}/{age}", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Client> addClient(@PathVariable ("name") String name, @PathVariable("email") String email, @PathVariable("age") int age){
        Client client=new Client(name,email,age);
        template.postForLocation(url+"/contacts/addContact", client);
        Client[] clients=template.getForObject(url+"/contacts", Client[].class);
        return Arrays.asList(clients);
    }

    @GetMapping(value="/clients/{age1}/{age2}", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Client> findAges(@PathVariable("age1") int age1, @PathVariable("age2") int age2){
        Client[] clients=template.getForObject(url+"/contacts", Client[].class);
        return Arrays.stream(clients)
                .filter(c->c.getAge()>=age1&&c.getAge()<=age2)
                .collect(Collectors.toList());
    }
}
