import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
class GameDemo 
{
	static int x=250,y=1,x1,y1;
	static Can c1 = null;
	public static void main(String args[]){
	JFrame jf = new JFrame("Game");
	jf.setLayout(new BorderLayout());
	jf.setSize(500,500);
	Panel pl = new Panel();
	jf.add(pl,"South");
	JButton jb = new JButton (" << ");
	JButton jb1 = new JButton (" >> ");
	pl.add(jb);
	pl.add(jb1);
	c1 = new Can();
	jf.add(c1);
	jb.addActionListener(new XYZ());
	jb1.addActionListener(new XYZ());
	jf.setVisible(true);
	
	
	
	}//main function

static class XYZ implements ActionListener
{
	public void actionPerformed(ActionEvent ae) {
		JButton bt = (JButton)ae.getSource();
		String s1 =bt.getText();
		if(s1.equals(" << ")) {
			x = x-15;
		}else{
			x = x+15;
		}//if else for controlling
		c1.repaint();
	}//action event close	
	
} //ActionListener class ends

static class Brick
{
	int x,y;
	Color col;
	
	Brick(int x, int y, Color col){
		this.x = x;
		this.y = y;
		this.col = col;
		
		
	}
}

static class Can extends Canvas implements Runnable
{
	
	int r1=10,g1=110,b1=10;
	
	ArrayList<Brick> bricks = new ArrayList<>();
	
	Can(){
		Thread t1 =new Thread(this);
		t1.start();
		
	}//constructor end
	
	public void paint(Graphics g){
		for(Brick b: bricks){
			
			g.setColor(b.col);
			g.fillRect(b.x,b.y,20,20);
			
		}
		
		Color col = new Color(r1,g1,b1);
		g.setColor(col);
		g.fillRect(x,y,20,20);
		
		
		
		
	}//paint method
	
	public void run(){
		while (true)
		{
			if(y<400){
				y = y+2;
				try{
					Thread.sleep(80);
					repaint();
				}catch(Exception e){}//try-catch end
			}
			else{
				Color col = new Color(r1,g1,b1);
				bricks.add(new Brick(x,y,col));
				
				
			x = (int)(Math.random()*400);
			y =1;
			r1 = (int)(Math.random()*250);
			g1 = (int)(Math.random()*250);
			b1 = (int)(Math.random()*250);
			
			repaint();

		}//if condition end
	}//infinite loop end
}//run method end
} //thread class end
}//gamedemo class end

// task is to stop bricks at bottom