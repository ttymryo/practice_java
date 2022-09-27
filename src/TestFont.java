import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFont {
	public static void main(String[] args) {
		GameWindow gw = new GameWindow("ですとウィンドウ",400,300);
		gw.add(new DrawCanvas1());
		gw.setVisible(true);
	}
}

class GameWindow extends JFrame{
	
	public GameWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}

class DrawCanvas1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponents(g);;
		g.drawString("あいうえお",150,150);
	}
}