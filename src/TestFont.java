import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFont {
	public static void main(String[] args) {
		GameWindow gw = new GameWindow("ですとウィンドウ",400,300);
		gw.add(new DrawCanvas1());
		gw.setVisible(true);
		gw.add(new DrawCanvas2());
//		gw.setVisible(true);
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
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		Font font1 = new Font("ＭＳ Ｐゴシック", Font.PLAIN,12);
		g.setFont(font1);
		g.drawString("あいうえお",150,50);
		
		Font font2 = new Font("HGP行書体",Font.BOLD,20);
		g.setFont(font2);
		g.drawString("あいうえお",150,100);
		
		Font font3 = new Font("HGP創英角ﾎﾟｯﾌﾟ体",Font.ITALIC,30);
		g.setFont(font3);
		g.drawString("あいうえお", 150, 150);
		
		String str = "あいうえお";
		
		g.setFont(font1);
		FontMetrics fm = g.getFontMetrics(font1);
		
		int width = fm.stringWidth(str);
		int height = fm.getHeight();
		
		g.drawString("幅=" + width, 10,120);
		g.drawString("高さ=" + height,10,135);
		
		g.drawString(str,  20, 160);
		
		g.drawRect(20,160-height,width,height);
		
	}
}

class DrawCanvas2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawLine(100, 100, 300, 100);
		Graphics2D g2 = (Graphics2D)g;
		
		BasicStroke bs1 = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
		g2.setStroke(bs1);
		g.drawLine(100, 150, 300, 150);
		
		BasicStroke bs2 = new BasicStroke(5,BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, new float[] {6}, 0);
		g2.setStroke(bs2);
		g.drawLine(100, 200, 300, 200);
	}
}