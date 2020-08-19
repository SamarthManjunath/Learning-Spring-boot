package services;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Cricketers;

@Service
public class CricketerService {
	Hashtable <String, Cricketers> table = new Hashtable<String, Cricketers>();
	
	public CricketerService() {
		Cricketers c1 = new Cricketers();
		c1.setName("sachin");
		c1.setRuns(10000);
		c1.setWickets(250);
		table.put("1", c1);
		
		Cricketers c2 = new Cricketers();
		c2.setName("sehwag");
		c2.setRuns(6000);
		c2.setWickets(100);
		table.put("2", c2);
		
		Cricketers c3 = new Cricketers();
		c3.setName("dhoni");
		c3.setRuns(8000);
		c3.setWickets(1);
		table.put("3", c3);
	}
	
	//to retrieve all the cricketers
	public Hashtable<String, Cricketers> getAllCricketers(){
		return table;
	}
	
	
	//to retrieve a specific cricketer
	public Cricketers getCricketer(String id) {
		if(table.containsKey(id))
			return table.get(id);
		else
			return null;
				
	}

}
