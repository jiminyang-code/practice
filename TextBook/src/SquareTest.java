public class SquareTest {
  public static void main(String[] args) {
    /* ��ü ���� */
    Square sqr = new Square();
    /* �ʵ� �ʱ�ȭ(�� ����) */
//    sqr.length = 4;
    /* ��� ��� */
    System.out.printf("�� ���� ���̰�  %d�� ���簢���� ���� : %d",sqr.length,sqr.getSquare());
  }
}

/* ���簢�� Ŭ���� ���� */
class Square {
  int length;
  public int getSquare() {
	  return length * length;
  }
}