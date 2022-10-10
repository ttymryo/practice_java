
public class sample01 {
	public static void main(String[] args) {
		int c = 0;
		System.out.println("文字を入力してください");
		
		try {
			c = System.in.read();
		}catch(Exception e) {
			
		}
		
		System.out.println("押されたキーは" + c + "です");
	}

}
