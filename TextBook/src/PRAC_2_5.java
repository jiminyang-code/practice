import java.util.Scanner;

public class PRAC_2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int time = scanner.nextInt(); //�����Է�
		int second = time % 60; //������ 60���� ������������ ��
		int minute = (time / 60) % 60; //������60���γ��� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; //�װɴٽ� 60���� ���� �������� �ð�
		
		System.out.println(time + "�ʴ�");
		System.out.print(second + "�ð�,");
		System.out.print(minute + "��,");
		System.out.print(hour + "���Դϴ�.");
	    scanner.close();
	    
	}

}
