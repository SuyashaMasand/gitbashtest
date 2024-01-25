package practise;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSON_Test {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader filepath = new FileReader(".\\src\\test\\resources\\jsonReader.json");
		
		//create object for jasonpar which comes from json simple 
		//json parser is used to read/write data from json formatted file.
		//parsing - converting any language from any language to json 
		
		JSONParser jsonp= new JSONParser();
		Object obj = jsonp.parse(filepath);
		//read data from JSON file 
		JSONObject map = (JSONObject) obj;
		
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
	}
	

}
