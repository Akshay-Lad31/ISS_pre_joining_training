package core.java.file.handling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * File read and write operation
 */
public class FileIOOperations {
	
	//Method to write to a given file.
	static public void writeToFile(String file, String message) {
		//Try to open and write to a file
		try {
			//Open given file. If not present, create a new file.
            FileWriter writer = new java.io.FileWriter(file, true);
            System.out.println("File created or old file will be appended!");
            //Create a buffer writer to write inside the file.
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
            //On a new line, write the given message.
            bufferedWriter.newLine();
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.write("Closing the file now.");
            
            //Close the writer file after writing.
            bufferedWriter.close();
	    
        } 
		//If error occurs print it.
		catch (IOException e) {
	    	e.printStackTrace();
	        }
		
	}
	
	static public void readFile(String file) {
		//Open the said file from filepath
		try (FileReader reader = new FileReader(file)) {
		    int character;
		    //Read over each character format  he file.
		    while ((character = reader.read()) != -1) {
		    	//Print the characters.
		        System.out.print((char) character);
		    }
		} 
		//If exception occurs, print it.
		catch (IOException e) {
		    e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filepath = "C:\\Users\\Akshay Lad\\JAVA\\CoreJAVA\\src\\core\\java\\file\\handling\\demoText.txt";
		
		FileIOOperations.writeToFile(filepath, "Hello reader, this is a test. writing to file");
		FileIOOperations.readFile(filepath);
		
		

	}


}
