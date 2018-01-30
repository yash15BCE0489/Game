import java.awt.*;
import java.awt.event.*;

public class Program {

	static Frame f;
	static Button target,tank;
	static Label timer;
	static Label score;
	static int x;
	static int i;
	static int sc;
	static int j ;
        
	
	Program()
	{
		f = new Frame();
		target = new Button();
		target.setBackground(Color.black);
		tank = new Button();
		tank.setBackground(Color.red);
		f.setLayout(null);
                
		
		tank.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				BulletThread t = new BulletThread();
				
				t.start();
			}
		});
		timer = new Label("120");
		score = new Label("Score:0");
		target.setBounds(10,40,100,20);
		tank.setBounds(180,360,40,40);
		score.setBounds(10, 360, 50, 40);
		timer.setBounds(360, 360, 40, 40);
		f.add(timer);
		f.add(target);
		f.add(tank);
		f.add(score);
		f.setVisible(true);
                f.setTitle("TARGET GAME");
                f.setResizable(false);
		f.setBounds(10,10,400, 400); 
		TimerThread t1 = new TimerThread();
		t1.start();
		TargetThread t2 = new TargetThread();
		t2.start();
		
                f.addWindowListener(new WindowListener()
				{
					public void windowClosing(WindowEvent e)
					{
                                            t1.stop();
                                          
                                            f.dispose();
					}

					@Override
					public void windowActivated(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void windowClosed(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void windowDeactivated(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void windowDeiconified(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void windowIconified(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void windowOpened(WindowEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
		
	}
	
	public static void main(String ar[])
	{
		Program p = new Program();
	}
}
