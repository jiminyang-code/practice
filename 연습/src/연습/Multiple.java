package ����;

public class Multiple {
	public static void main(String[] args) {
		double r = 7.0;
		double h = 5.0;
		double pi = 3.14;
		double result = pi(r, h, pi);
		System.out.printf("�������� %.1f, ���̰� %.1f�� ������� ���� : %.1f", r, h, pi);
	}

	public static double pi(double r, double h, double pi) {
		double result;
		result = pi * r * r * h;
		return result;
	}

}
