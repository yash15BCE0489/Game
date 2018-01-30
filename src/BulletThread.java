import java.awt.Button;

public class BulletThread extends Thread{
	
	public void run()
	{
		try
		{
			Button b = new Button();
			b.setBounds(195,360,10,10);
			Program.f.add(b);
			for(Program.j=360;Program.j>=0;Program.j=Program.j-10)
			{
				b.setBounds(195, Program.j, 10, 10);
				Thread.sleep(40);
			}
			
		}
		catch(Exception e)
		{
			
		}
	}

}
