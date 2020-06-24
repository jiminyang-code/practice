import java.util.Scanner;

public class RectApp { 

	public static void main(String[] args) { 
		Rectangle rect = new Rectangle();

		Scanner scanner = new Scanner(System.in);
		System.out.println(">>");

		rect.width = scanner.nextDouble();
		rect.height = scanner.nextDouble();
		System.out.println(rect.getArea());

	}

}

class Rectangle {
	double width;

	double height;

	public double getArea() {
		return width * height;
	}
}