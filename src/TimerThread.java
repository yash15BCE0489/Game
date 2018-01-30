import javax.swing.*;
public class TimerThread extends Thread {
	public void run(){
		try
		{
			int n=0;
                        
                        {for(Program.i=50;Program.i>=0;Program.i--)
			{
			n=0;	
                            Program.timer.setText(""+Program.i);
				this.sleep(1000);
                            n++;    
				
			}
			
                        {JOptionPane.showMessageDialog(null,"Game Over");}}
		}
		catch(Exception e)
		{
			
		}
	}

}
