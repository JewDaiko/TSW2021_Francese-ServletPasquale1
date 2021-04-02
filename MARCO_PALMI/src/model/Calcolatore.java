package model;

public class Calcolatore 
{
	public Calcolatore(double x , double y)
	{
		altezza = y;
		base = x;
	}
	
	public double getArea()
	{
		return base*altezza;
	}
	
	private double base;
	private double altezza;
}
