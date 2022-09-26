import javax.swing.JFrame;
public class testWindow {
	public static void main(String[] args) {
		
		new Window("テストウィンドウ",400,300);
	}

}

class Window extends JFrame{
	public Window(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
