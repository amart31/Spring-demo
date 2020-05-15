package com.andy.springpractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fileFortuneService")
public class FileFortuneService implements FortuneService {

	private String fileName = "/springpractice/src/fortunes.properties";
	private List<String> theFortunes;
	
	private Random r = new Random();
	
	public FileFortuneService() {
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		//initialize array list
		theFortunes = new ArrayList<String>();
		
		//read fortunes file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
			theFortunes.add(tempLine);
			
		}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	


	@Override
	public String getFortune() {
		//pick a random string from array
		 int index  = r.nextInt(theFortunes.size());
		 
		 String tempFortune = theFortunes.get(index);
		 
		
		return tempFortune;
	}

}
