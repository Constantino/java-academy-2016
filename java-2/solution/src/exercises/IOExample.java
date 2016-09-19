package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOExample {

	public static void main(String[] args){
		
		char characterToCount = args[0].charAt(0);
		int counter = 0;
		
		FileReader reader = null;
		
		String filePath = new File("").getAbsolutePath();
		
		try 
		{
			
			
			reader = new FileReader(filePath+"/data.dat");
			BufferedReader buffer = new BufferedReader(reader);
			
			String line;
			
			try {
				while( (line = buffer.readLine()) != null){
					for(char c : line.toCharArray()){
						if(c == characterToCount){
							counter++;
						}
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			if(reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		String output = characterToCount+" appears "+counter+" time(s)";
		
		PrintWriter writer = null;
		
		try {
			
			writer = new PrintWriter(new FileWriter(filePath+"/output.dat"));
			
			System.out.println(output);
			writer.println(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer != null){
				writer.close();
			}
		}
		
	}
	
}
