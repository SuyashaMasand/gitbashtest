package Assignments;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadDataFromCSVFile {
	public static void main(String[] args) throws CsvValidationException, IOException {
		CSVReader reader = new CSVReader(new FileReader("./csvfile.csv"));
		String[] str = reader.readNext();
		
		for(String s: str) {
			System.out.println(s);
		}
	}
}
