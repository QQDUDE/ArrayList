import java.util.ArrayList;


public class arraylistpractice
	{
		static double highTemp,lowTemp;
		static int counter =0;
		public static void main(String[] args)
			{
				ArrayList <Double>myArray = new ArrayList<Double>();
				myArray.add(101.9);
				myArray.add(98.5);
				myArray.add(97.1);
				myArray.add(103.3);
				myArray.add(102.0);
				myArray.add(99.1);
				myArray.add(98.3);
				myArray.add(98.7);
				myArray.add(99.9);
				myArray.add(101.1);
			for (Object degrees : myArray)
				{
					System.out.println(degrees + " :degrees fahrenheit");
				}
			for(int i=0; i < myArray.size(); i++)
						{
							if ((double)myArray.get(i) > 98.6)
								{
									counter++;
									System.out.println(myArray.get(i)+ " :fever");
								}
						
						}
				System.out.println("there are " + counter + " fevers.");
				for(int i=0; i < myArray.size(); i++)
					{
						
							{
								System.out.println(((myArray.get(i)-32)/1.8) + " degerees celsius ");
							}
					}
				for (int i=0; i < myArray.size(); i++)
					{
						if (myArray.get(i) < 98.6)
							{
								System.out.println(myArray.get(i) + " Normal temperature.");
							}
					}
				highTemp=myArray.get(0);
				lowTemp=myArray.get(0);
			
			for(int i=0; i < myArray.size(); i++)
			
				{
					
					if (highTemp < myArray.get(i))
						{
							highTemp = myArray.get(i);	
						}
					
					if (lowTemp > myArray.get(i))
						{
							lowTemp = myArray.get(i);	
						}
					
				}
			System.out.println("The highest temp is :" + highTemp);
			System.out.println("The lowest temp is :" + lowTemp);
			
			}
		
		}
