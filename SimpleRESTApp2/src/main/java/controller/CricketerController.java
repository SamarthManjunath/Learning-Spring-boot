package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Cricketers;
import services.CricketerService;

@RestController
@RequestMapping("/cricketer")
public class CricketerController {
	@Autowired
	CricketerService cs;
	
	@RequestMapping("/all")
	public Hashtable<String,Cricketers> getAll(){
		return cs.getAllCricketers();
	}
	
	@RequestMapping("{id}")
	public Cricketers getInfo(@PathVariable("id") String id) {
		return cs.getCricketer(id);
	}
	
	
	
	
}
