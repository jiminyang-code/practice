
public class BicycleTest {

	public static void main(String[] args) {
		//��ü������ �ʱ�ȭ
		bicycle b1 = new bicycle("�θ�2",21.74,899000);
		bicycle b2 = new bicycle("�ž�2",12.57,495000);
		
		//��ü�������
        System.out.printf("bicycle {%s, %.2fkg, %d��}\n", b1.name,b1.weight,b1.price);
	    System.out.printf("bicycle {%s, %.2fkg, %d��}\n",b2.name,b2.weight,b2.price);
	}

}

class bicycle {
	//�ʵ�
	String name;
	double weight;
	int price;
	
	//������ -- �Ķ���͸� ���� �ʱ�ȭ
	bicycle(String n,double w,int p) {
		name = n;
		weight = w;
		price = p;	
	}
}