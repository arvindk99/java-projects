public class thoughtArea extends Brain{
	public static String focus(String mood)
	{
		if(mood.equalsIgnoreCase("Angry"))
		{
			return "Medium";
		}
		else if (mood.equalsIgnoreCase("Happy"))
		{
			return "Low";
		}
		else if (mood.equalsIgnoreCase("Sad"))
		{
			return "High";
		}
		else
		{
			return null;
		}
	}
	public static String concentration(String mood)
	{
		if(mood.equalsIgnoreCase("Angry"))
		{
			return "Low";
		}
		else if (mood.equalsIgnoreCase("Happy"))
		{
			return "High";
		}
		else if (mood.equalsIgnoreCase("Sad"))
		{
			return "Medium";
		}
		else
		{
			return null;
		}
	}
}
