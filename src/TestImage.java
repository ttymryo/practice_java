import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class TestImage{
	public static void main(String[] args) {
		GameWindow4 gw = new GameWindow4("テストウィンドウ",1100,1100);
		DrawCanvas4 dc = new DrawCanvas4();
		gw.setResizable(false);
		gw.add(dc);
		gw.setVisible(true);
	}
}
class GameWindow4 extends JFrame{
 
	public GameWindow4(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
	}
}
class DrawCanvas4 extends JPanel{
	Image img = Toolkit.getDefaultToolkit().getImage("src/test3.jpg");
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//画像の表示
		g.drawImage(img, 0, 0, this);
	}
}