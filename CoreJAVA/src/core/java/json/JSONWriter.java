/*
	TASK: 	To create doc. with structure:
	[
		Employee[
				Name[
					FirstName: Akshay
					LastName: Lad
				]
				Email: akshaylad2000@gmail.com
		]
			
	] 
	
*/
package core.java.json;

import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileWriter;

import org.json.simple.*;

public class JSONWriter {
	
	// Function is used to save the JSON Object to a JSON file.
	public void saveToFile(String filepath, JSONObject jsonFile) {
		try (PrintWriter outToFile = new PrintWriter(new FileWriter(filepath))) {
			outToFile.write(jsonFile.toString());
			System.out.println("done writing");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	/*
	TASK: 	To create doc. with structure:
	[
		Employee[
				Name[
					FirstName: Akshay
					LastName: Lad
				],
				Email: demo@gmail.com,
				Probation Status: true/false,
				Work Experience: 2.3yrs,
				Any Disability: Eye Vision/NULL
		]
	] 
	*/
	
	
	static public JSONObject employeeDetails(	String firstName, String lastName, 
												String email, int id, 
												double workExperience, boolean onProbation, 
												String disability) {
		JSONObject jsonEmployee = new JSONObject();
		JSONObject jsonName = new JSONObject();
	
		jsonName.put("FirstName", firstName);
		jsonName.put("LastName", lastName);
		
		jsonEmployee.put("Probation Status", onProbation);
		jsonEmployee.put("Any Disability", disability);
		jsonEmployee.put("Work Experience", workExperience);
		jsonEmployee.put("Email ID", email);
		jsonEmployee.put("Name", jsonName);
		jsonEmployee.put("id", id);		
		
		return jsonEmployee;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject akshay = JSONWriter.employeeDetails("Akshay", "Lad", "demo@gamil.com", 2341, 3.5, false, null);
		JSONObject raj = JSONWriter.employeeDetails("Raj", "Shah", "demo4@gamil.com", 24641, 3.7, true, "Eye Vision");
		JSONObject rohan = JSONWriter.employeeDetails("Rohan", "Joe", "demo11@gamil.com", 1641, 1.5, false, null);
		
		//Creating an JSON Array to store all employee details
		JSONArray empList = new JSONArray();
		empList.addAll(Arrays.asList(akshay, raj, rohan));
		
		System.out.println("Array list of all employees is: \n" + empList);
		
		

	}

}
