public class HeroTest {
	public static void main(String[] args) {
		// ��ü ����
		Hero ironMan = new Hero("���̾��", 80);
		Hero thanos = new Hero("Ÿ�뽺", 160);
		Hero thor = new Hero("�丣", 150);
		Hero groot = new Hero("�׷�Ʈ", 40);

		// ��� ��ü ������ ���
		System.out.println(ironMan.toStr());
		System.out.println(thanos.toStr());
		System.out.println(thor.toStr());
		System.out.println(groot.toStr());
	}
}

// Hero Ŭ����
class Hero {
	// �ʵ�
	String name;
	int hp;

	// ������
	Hero(String n,int h) {
		/* 2. �ʵ� ���� �ʱ�ȭ�ϼ���. */
		name = n;
		hp = h;
	}

	// �޼ҵ�
	String toStr() {
		return String.format("Hero { name: %s, hp: %d }", name, hp);
	}
}