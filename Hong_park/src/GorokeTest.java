public class GorokeTest {
	int i[] = {1,2,3,4,5,6,7,8,9,10};
  public static void main(String[] args) {
	 
	  
    /* 1. TOP 3 ����ɸ� ��ü�� ���弼��. */
    Goroke pizza = new Goroke("����",1000);
    Goroke yachae = new Goroke("��ä",800);
    Goroke pot = new Goroke("��",500);
    /* 2. ����� ������ ����ϼ���. */
    System.out.println(pizza.str());
    System.out.println(yachae.str());
    System.out.println(pot.str());
  
}
}

class Goroke {
  // �ʵ�
  String name;
  int price;
  // ������
  Goroke(String n, int p) {
    name = n;
    price = p;
  }
  // �޼ҵ�
  String str() {
    return String.format("Goroke { name: %s, price: %d�� }", name, price);
  }
}