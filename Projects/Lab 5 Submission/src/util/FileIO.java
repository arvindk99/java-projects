package util;
import java.io.*;
import java.util.*;

	//Reads the file and builds student array.
	//Open the file using FileReader Object.
	//In a loop read a line using readLine method.
	//Tokenize each line using StringTokenizer Object
	//Each token is converted from String to Integer using parseInt method
	//Value is then saved in the right property of Student Object.

class FileIO{
	
	static int student = 0;
	
	Student [] readFile(String filename, Student [] stu) {
		int counter = 0;
		try {
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
				while (!eof) {
					String line = buff.readLine();
					if (line == null) {
						eof = true;
					}
					else {
						stu[counter] = new Student();
						StringTokenizer st = new StringTokenizer(line);
						while (st.hasMoreTokens()) {
							int x = Integer.parseInt(st.nextToken());
							stu[counter].setSID(x);
							int students[] = new int[5];
							for(int a = 0; a < 5; a++)
							{
								students[a] = x;
							}
							stu[counter].setScores(students);
						}
					
					}
					counter++;
			}
			buff.close();
		}
		catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return stu;
		
	
	}

}