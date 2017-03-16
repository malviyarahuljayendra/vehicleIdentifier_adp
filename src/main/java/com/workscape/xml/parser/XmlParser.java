package com.workscape.xml.parser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.workscape.model.Vehicles;

public class XmlParser {
	
	public Vehicles parseXml(String filePath) {
		Vehicles vehicles= null;
		try {  
			   
	        File file = new File(filePath);  
	        JAXBContext jaxbContext = JAXBContext.newInstance(Vehicles.class);  
	   
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
	        vehicles= (Vehicles) jaxbUnmarshaller.unmarshal(file);  
	          
	      } catch (JAXBException e) {  
	        e.printStackTrace();  
	      } 
		return vehicles;
	}
}
