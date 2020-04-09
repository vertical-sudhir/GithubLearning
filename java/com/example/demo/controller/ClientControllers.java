/*package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Client;
import com.example.demo.repository.ClientRepository;

@RestController
public class ClientControllers {

	@Autowired
	ClientRepository clientrepo;
	
	
	@GetMapping("/creatclients")
	public String createClients()
	{
		
		Client c1 = new Client("from client controller", "Atkire");
		Client c2 = new Client("from client controller", "Sudhir");
  		
		
		clientrepo.save(c1);
		clientrepo.save(c2);
		
		return "Client Created";
	}
	
//	@GetMapping("/clients")
	@RequestMapping(value="/clients", method = RequestMethod.GET, 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}) 
	public List<Client> getClients()
	{
		return (List<Client>)clientrepo.findAll();
	}

    @RequestMapping(value = "/newclients", method = RequestMethod.POST)
	public String createNewClient1(@RequestBody Client client)
	{
	   clientrepo.save(client);
		
		return "New User Created...";
	}

	
	@RequestMapping(value = "/newclients1", method = RequestMethod.POST)
	public ResponseEntity<Client> createNewClient(@RequestBody Client client)
	{
	   Client newlycreated =	clientrepo.save(client);
		
		ResponseEntity res = new ResponseEntity<Client>(newlycreated, HttpStatus.CREATED);
		return res;
	}
	
	@RequestMapping(value = "/newclients1", method = RequestMethod.PATCH)
	public ResponseEntity<Client> updateClient(@RequestBody Client client)
	{
	    Client newlycreated =	clientrepo.save(client);
		
		ResponseEntity res = new ResponseEntity<Client>(newlycreated, HttpStatus.ACCEPTED);
		return res;
	}

	@RequestMapping(value = "/newclients1/{abc}/{xyz}", method = RequestMethod.PATCH)
	public ResponseEntity<Client> updateClientById(@PathVariable(name = "abc") Long id, @PathVariable(name="xyz") String firstname, @RequestBody Client client)
	{
		client.setId(id);
		client.setName(firstname);
		Client updatedclient =	clientrepo.save(client);
		
		ResponseEntity res = new ResponseEntity<Client>(updatedclient, HttpStatus.ACCEPTED);
		return res;
	}

	@RequestMapping(value = "/newclients2/{abc}/{xyz}", method = RequestMethod.PATCH)
	public ResponseEntity<Client> updateClientByIdIfExist(@PathVariable(name = "abc") Long id, @PathVariable(name="xyz") String firstname, @RequestBody Client client)
	{
		
		if(clientrepo.existsById(id))
		{
			System.out.println("In If..****************************************");
			client.setId(id);
			client.setName(firstname);
			Client updatedclient =	clientrepo.save(client);
			
			ResponseEntity res = new ResponseEntity<Client>(updatedclient, HttpStatus.ACCEPTED);
			return res;
		}
		
		else
		{
			System.out.println("in else*************************************************");
			ResponseEntity res = new ResponseEntity<Client>(client, HttpStatus.NOT_FOUND);
			return res;
		}
	}

	
	@RequestMapping(value = "/newclients2/{abc}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteClientByIdIfExist(@PathVariable(name = "abc") Long id)
	{
		
		if(clientrepo.existsById(id))
		{
			System.out.println("In If..Delete****************************************");
			clientrepo.deleteById(id);
			
			
			ResponseEntity res = new ResponseEntity<String>("Client Deleted", HttpStatus.OK);
			return res;
		}
		
		else
		{
			System.out.println("in else Delete*************************************************");
			ResponseEntity res = new ResponseEntity<String>("Client Not Found", HttpStatus.NOT_FOUND);
			return res;
		}
	}

}
*/