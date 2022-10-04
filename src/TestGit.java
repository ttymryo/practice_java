import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;

import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class TestGit{
	public static void main(String[] args) {
		GameWindow5 gw = new GameWindow5("テストウィンドウ",400,300);
		gw.add(new DrawCanvas5());
		gw.setVisible(true);
	}
}
 
//ウィンドウクラス
class GameWindow5 extends JFrame{
	public GameWindow5(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
	}
}
 
class DrawCanvas5 extends JPanel{
	LinearGradientPaint p = new LinearGradientPaint(
			0
			, 0
			, 300
			, 200
			, new float[] {
					0.0f
					, 0.5f
					, 1.0f
			}
			, new Color[] {
					new Color(255, 0, 0)
					, new Color(0, 255, 0, 100)
					, Color.BLUE
			}
	);
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
 
		g2.setPaint(p);
 
		g.fillOval(0, 0, 300, 200);
	}
}