package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.PharmacyService;

//controller class which does the mapping of the application
@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	@Autowired
	PharmacyService ps;
	
	//to get the total price of all the drugs
	@RequestMapping("/price")
	public double getPrice() {
		return ps.getTotalPrice();
	}
	
	//method to get all the drug is the pharmacy
	@RequestMapping("/drugs")
	public List<String> getDrugs(){
		return ps.getAllDrugNames();
	}
}
