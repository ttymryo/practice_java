import java.awt.Font;
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
		super.paintComponents(g);
		Font font1 = new Font("ＭＳ Ｐゴシック", Font.PLAIN,12);
		g.setFont(font1);
		g.drawString("あいうえお",150,50);
		
		Font font2 = new Font("HGP行書体",Font.BOLD,20);
		g.setFont(font2);
		g.drawString("あいうえお",150,100);
		
		Font font3 = new Font("HGP創英角ﾎﾟｯﾌﾟ体",Font.ITALIC,30);
		g.setFont(font3);
		g.drawString("あいうえお", 150, 150);
	}
}