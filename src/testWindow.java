import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class testWindow {
	public static void main(String[] args) {
		
		Window win = new Window("テストウィンドウ",400,300);
		win.add(new DrawCanvas());
		win.setVisible(true);
		
	}

}

class Window extends JFrame{
	public Window(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}

class DrawCanvas extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 50, 50);
		g.fillRect(200, 100, 50, 50);
	}
}
