package myPaint;

import java.awt.*;
import java.awt.event.*;
public class MyPaint extends Frame implements MouseMotionListener{

	
	MyPaint(){
		addMouseMotionListener(this);
		
		setSize(1000, 1000);
		setLayout(null);
		setVisible(true);
				
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPaint();
	}
	@Override
	public void mouseDragged(MouseEvent e) {  
	    Graphics g=getGraphics();  
	    g.setColor(Color.black);  
	    g.fillOval(e.getX(),e.getY(),20,20);  
	} 
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
