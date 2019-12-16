import java.io.*;
public class Brain {

	public static String awareness(String mood) {
		
		if(mood.equalsIgnoreCase("Angry"))
		{
			return "High";
		}
		else if (mood.equalsIgnoreCase("Happy"))
		{
			return "Medium";
		}
		else if (mood.equalsIgnoreCase("Sad"))
		{
			return "Low";
		}
		else
		{
			return null;
		}
	}
	
}
