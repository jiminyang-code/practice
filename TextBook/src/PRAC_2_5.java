import java.util.Scanner;

public class PRAC_2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int time = scanner.nextInt(); //정수입력
		int second = time % 60; //정수를 60으로 나눈나머지는 초
		int minute = (time / 60) % 60; //정수를60으로나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; //그걸다시 60으로 나눈 나머지는 시간
		
		System.out.println(time + "초는");
		System.out.print(second + "시간,");
		System.out.print(minute + "분,");
		System.out.print(hour + "초입니다.");
	    scanner.close();
	    
	}

}
