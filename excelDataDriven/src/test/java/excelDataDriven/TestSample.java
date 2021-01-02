package excelDataDriven;

import java.io.IOException;

public class TestSample {

	public static void main(String[] args) {
		try {
			System.out.println(DataDriven.getData("testdata", "Testcases", "Purchase"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
