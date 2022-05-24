
public class Runner
	{

		public static void main(String[] args)
			{
			int ranNum = 0;
			int [] [] myMatrix= new int [6][6];
			for(int r = 0; r < myMatrix.length; r++)
				{
				//System.out.println(" ");
				for(int c = 0; c < myMatrix[0].length; c++ )
					{
					ranNum = (int)(Math.random()*90)+10;
					myMatrix[r][c] =ranNum;
					//System.out.print(" ");
					//System.out.print(ranNum);
					
					}
				}
			for(int r3 = 0; r3 < myMatrix.length; r3++)
				{
				System.out.println(" ");
				for(int c3 = 0; c3 < myMatrix[0].length; c3++ )
					{
					//ranNum = (int)(Math.random()*90)+10;
					//myMatrix[r][c] =ranNum;
					System.out.print(" ");
					System.out.print(myMatrix[r3][c3]);
					
					
					}
				}
			System.out.println(" ");
			int highestNum=0;
			for(int r2 = 0; r2 < myMatrix.length; r2++)
				{
				for(int c2 = 0; c2 < myMatrix[0].length; c2++)
					{
						if(highestNum <= myMatrix[r2][c2])
							{
							highestNum = myMatrix[r2][c2];
							}
					}
				}
			
			System.out.println("The Highest Number is: " + highestNum);

			}

	}
