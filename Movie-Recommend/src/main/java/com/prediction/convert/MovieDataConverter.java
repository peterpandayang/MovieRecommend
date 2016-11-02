package com.prediction.convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class MovieDataConverter {

	
	
	
	
	/**
	 * Convert raw data to the data that we could use.
	 * @param args
	 */
	
	public void convert(String path){
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedWriter writer = new BufferedWriter(new FileWriter("data/movie.txt"));
			
			String line;
			while((line = br.readLine()) != null){
				
				String[] values = line.split("\\t", -1);
				writer.write(values[0] + "," + values[1] + "," + values[2] + "\n");
				
			}
			br.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("convertion starts...");
		MovieDataConverter converter = new MovieDataConverter();
		converter.convert("data/u.data");

	}

}
