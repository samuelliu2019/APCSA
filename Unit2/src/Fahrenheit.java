//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
 		celsius = (double)5/9*(fahrenheit - 32);
		//add code to convert fahrenheit to celsius
		return celsius;
	}

	public void print()
	{
		System.out.println(fahrenheit + " degrees Fahrenheit == " +(String.format("%.2f",getCelsius())) + " degrees Celsius");
	}
}