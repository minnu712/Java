package excelread;

import java.io.IOException;
public class ExcelReadMain {

	

		public static void main(String[] args) throws IOException {
			
			String s=ExcelRead.readStringData(0, 0);
			System.out.println(s);
			String s1=ExcelRead.readIntegerData(0, 1);
			System.out.println(s1);
			String s2=ExcelRead.readStringData(1, 0);
			System.out.println(s2);
			

		}

	}