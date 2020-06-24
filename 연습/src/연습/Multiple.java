package 연습;

public class Multiple {
	public static void main(String[] args) {
		double r = 7.0;
		double h = 5.0;
		double pi = 3.14;
		double result = pi(r, h, pi);
		System.out.printf("반지름이 %.1f, 높이가 %.1f인 원기둥의 부피 : %.1f", r, h, pi);
	}

	public static double pi(double r, double h, double pi) {
		double result;
		result = pi * r * r * h;
		return result;
	}

}
