import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyBotton {
	public static void main(String args[]){
		JFrame w=new JFrame();
		w.setSize(300, 400);
		
		MyPanel mp=new MyPanel();
		w.add(mp);
		
		w.addMouseListener(mp);
		mp.addMouseListener(mp);
		
		w.setVisible(true);
	}

}
class MyPanel extends Panel implements MouseListener{
	boolean b=true;
	public void paint(Graphics g){
		super.paint(g);
		
		if(b){
			g.setColor(Color.WHITE);
			g.drawLine(30, 30, 80, 30);
			g.drawLine(30, 30, 30, 50);
			g.setColor(Color.black);
			g.drawLine(30, 50, 80, 50);
			g.drawLine(80, 30, 80, 50);
		}else{
			g.setColor(Color.black);
			
			g.drawLine(30, 30, 80, 30);
			g.drawLine(30, 30, 30, 50);
			g.setColor(Color.WHITE);
			g.drawLine(30, 50, 80, 50);
			g.drawLine(80, 30, 80, 50);
			
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getX()>30&&arg0.getX()<80&&arg0.getY()>30&&arg0.getY()<50){
			
			b =false;
			repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		b=true;
		repaint();
	}
}