package service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import model.Pharmacy;

@Service
public class PharmacyService {
	Hashtable <String, Pharmacy> table = new Hashtable<>();
	
	//constructor to add the drugs and ID to the database
	public PharmacyService() {
		Pharmacy ph1 = new Pharmacy();
		ph1.setDrugName("drug1");
		ph1.setDrugPrice(100.00);
		table.put("1", ph1);
		
		Pharmacy ph2 = new Pharmacy();
		ph2.setDrugName("vicks");
		ph2.setDrugPrice(10.00);
		table.put("2", ph2);
		
		Pharmacy ph3 = new Pharmacy();
		ph3.setDrugName("centrizine");
		ph3.setDrugPrice(20.99);
		table.put("3", ph3);
	}
	
	//method to get the total price of drugs
	public double getTotalPrice() {
		//iterating the table
		Set<String> keys = table.keySet();
		double result = 0;
		for(String key : keys) {
			result += table.get(key).getDrugPrice();
		}
		return result;
	}
	
	//method to get all the drug names
	public List<String> getAllDrugNames(){
		Set<String> keys = table.keySet();
		List<String> list = new ArrayList<>();
		for(String key : keys) {
			list.add(table.get(key).getDrugName());
		}
		return list;
	}

}
