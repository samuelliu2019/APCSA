
public class Grade {
	private double value;
	public Grade()
	{
		setGrade(100);
	}
	public Grade (int in)
	{
		setGrade(in);
	}
	public void setGrade(int i)
	{
		value = i;
	}
	public String getLetterGrade()
	{
		if(value >= 90 && value <= 100)
		{
			return "A";
		}
		if(value >= 80 && value <= 90)
		{
			return "B";
		}
		if(value >= 70 && value <= 80)
		{
			return "C";
		}
		if(value >= 60 && value <= 70)
		{
			return "D";
		}
		return "F";
	}
	public double getNumericGrade()
	{
		return value;
	}
	public String toString()
	{
		return value + "\n" + getLetterGrade();
	}
}
