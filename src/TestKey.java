import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TestKey {
	public static void main(String[] args) {
		TestWindow5 gw = new TestWindow5("てすとウィンドウ",400,300);
		gw.setVisible(true);
	}
}

class TestWindow5 extends JFrame implements KeyListener {
	public TestWindow5(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch ( e.getKeyCode()) {
		case KeyEvent.VK_UP:
			System.out.println("上が押されました");
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("スペースがおされました");
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("Enterがおされました");
			break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			System.out.println("上が話されました");
			break;
		case KeyEvent.VK_SPACE:
			System.out.println("スペースが離されました");
			break;
		case KeyEvent.VK_ENTER:
			System.out.println("Enterが話されました");
			break;
		}
	}
}