import java.io.*;
import java.util.*;

public class FileIO {
	//FileIO has two main instance variables fname, and a boolean caled DEBUG
	private String fname = null;
	private boolean DEBUG = true;

	public FileIO(String fname) {
		//Initializing the FileIO constructor
		this.fname = fname;
	}

	public Franchise readData() {
		//Here we create a Franchise object
		//a1 contains all the data that we have collected by creating a Franchise object
		Franchise a1 = null;
		int counter = 0;
		try {
			//Looks for a text file with the name of fname
			FileReader file = new FileReader(fname);
			//buff is the small piece of memory for file processing 
			BufferedReader buff = new BufferedReader(file);
			String temp;
			//boolean checking if you have reached the end of the file
			boolean eof = false;
			while (!eof) {
				//iterating through the file, one line at a time to the buffer
				String line = buff.readLine();
				//Counter for the number of lines
				counter++;
				if (line == null)
					//Found the end of the file
					eof = true;
				else {
					if (DEBUG)
						//printing out the line that we just iterated through
						System.out.println("Reading" + line);
					//Saving the line into the temp variable for processing
					if (counter == 1) {
						temp = line;
						//parsing the temp variable as an integer
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							//prints out how many stores were created
							System.out.println("d  " + a1.numberofstores());
					}
					//Skipping over the header for the day of the week title
					if (counter == 2)
						;
					
					if (counter > 2) {
						//builds a store from the data from the line read
						  	int x = buildStore(a1, (counter-3), line);
							if (DEBUG)
								//prints store number and the number of weeks read
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							if (DEBUG)
							{	
								System.out.println("Data read:");
								
								//prints the data that was read
								a1.getStores(counter-3).printdata();
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		
		//Takes a line and breaks into smaller instances to find the prices and store them
		StringTokenizer st = new StringTokenizer(temp);
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
		    	 s1 = st.nextToken();
		    	 //Setting each token as a float
		         sale = Float.parseFloat(s1);
		         //storing them in a 2d-array salesbyweek[][]
	        	 tstore.setsaleforweekdayintersection(week, day, sale);
	         }
	         week++;
	    }
	    //returns how many weeks worth of data was created
		a1.setStores(tstore, counter);
	    return week; 
	}
}
