package services;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Person;

@Service
public class PersonService {
	Hashtable <String, Person> map = new Hashtable<String, Person>();
	
	//constructor for person service
	//adds 2 persons to hashtable
	public PersonService() {
		Person p = new Person();
		Person p2 = new Person();
		p.setId("1");
		p.setFirstName("samarth");
		p.setLastName("manjunath");
		p.setAge(25);
		map.put("1", p);
		
		p2.setId("2");
		p2.setFirstName("akshatha");
		p2.setLastName("chandrashekar");
		p2.setAge(25);
		map.put("2", p2);
	}
	
	//if the person ID is present, return the details of person
	public Person getPerson(String id) {
		if(map.containsKey(id)) 
			return map.get(id);
		else
			return null;
	}
	
	public Hashtable<String, Person> getAll(){
		return map;
	}
}
