package org.dodridge.alan;

public class Nested {

	public static void main(String[] args) {

		String asterixes = "", line = "";
		
		for (int i=0; i<3; i++){
			asterixes = asterixes + "*";
			for (int j=1; j<11; j++){
				line = line + asterixes + j;
				if (j<10) line = line + ", ";
			}
			System.out.println(line);
			line = "";
		}

	}

}
