
public class TargetThread extends Thread {
	
	public void run()
	{
		try
		{
			while(Program.i>0)
			{
				Thread.sleep(30);
				Program.x = Program.target.getX();
				if(Program.x>=400)
					Program.x=10;
				else
					Program.x=Program.x+10;
				Program.target.setBounds(Program.x,40,100,20);
				
                              //  if(Program.target)
                                
				if(Program.j==40)
				{
					if(Program.x>=95 && Program.x<=195 || Program.x>=195 && Program.x<=295)
					{
				
                                            Program.sc++;
						Program.score.setText("Score:"+Program.sc);
                                                
					}
					
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
