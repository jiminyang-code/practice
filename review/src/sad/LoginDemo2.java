package sad;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0]; // ÀÔ·Â°ª
		String password = args[1];
		if (id.contentEquals("egoing")) {
			if (password.equals("111111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}

	}

	
}
