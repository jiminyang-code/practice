
public class DrinkTest {

	public static void main(String[] args) {
		Drink d1 = new Drink("��ī��", 800);
		Drink d2 = new Drink("��ī��", 1000);

		System.out.println(d1.toStr());
		System.out.println(d2.toStr());
	}

}

class Drink {
	String name;
	int price;

	Drink() {

	}

	Drink(String n, int p) {
		name = n;
		price = p;
	}

	String toStr() {
		return String.format("Drink { name: %s, price: %d }", name, price);
	}
}