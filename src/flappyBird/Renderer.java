package flappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel{
	private static final long serialVersionUID = 1L;
    @Override
    public void paint(Graphics g) {
    	// TODO Auto-generated method stub
    	super.paint(g);
    	FlappyBird.flappybird.repaint(g);
    }
}
