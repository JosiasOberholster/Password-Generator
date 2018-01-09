package com.JosiasOberholster;

public class SLPasswordGenerator 
{
	public static void main(String[] args)
	{
		new SLPasswordGenerator().Break();
	}
	
	private String[] upperCase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private String[] lowerCase = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	private String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
	
	public void Break()
	{
		int x;
		int y = 9;
		
		int upperCaseLength = upperCase.length;
		int lowerCaseLength = lowerCase.length;
		int numbersLength = numbers.length;
			
		for(x = 0; x < y; x++)
		{
			int upperCaseRand = (int)(Math.random()* upperCaseLength);
			int lowerCaseRand = (int)(Math.random()* lowerCaseLength);
			int numbersRand = (int)(Math.random()* numbersLength);	
			
			String upperCaseRes = upperCase[upperCaseRand];
			String lowerCaseRes = lowerCase[lowerCaseRand];
			String numbersRes = numbers[numbersRand];
			
			int whichRand = (int) Math.ceil(Math.random()* 3);
			String whichString = Integer.toString(whichRand);
			
			if(whichString.equals("1"))
			{
				System.out.print(upperCaseRes);
			}
			else if(whichString.equals("2"))
			{
				System.out.print(lowerCaseRes);
			}
			else if(whichString.equals("3"))
			{
				System.out.print(numbersRes);
			}
		}
	}
}
