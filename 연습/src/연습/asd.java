package ����;

import java.util.*;

public class asd {
	// 2017.05.24
	static Scanner sc;
	static Random rn;

	static String[] card = new String[7];
	static String[] cardNum = new String[7];

	static int top = 0, onePair = 0, twoPair = 0, triple = 0, straight = 0, flush = 0, fullHouse = 0, fourCard = 0;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		rn = new Random();

		String[][] cardDeck = new String[4][13];

		int[] shape = new int[4];
		int[] number = new int[13];

		String tmp = "";
		int ranNum = 0, cnge = 0, grade = 0, straightChk = 0, backST = 0;

		cardDeckSet(cardDeck, ranNum, tmp);

		System.out.println("\n==================== Poker Game ====================");
		System.out.println("     ī����ӿ��� �긮���� ������ ������ �� ���Ͽ� ");
		System.out.println("    ��Ŀ�� ������ ��ä�� £�� ������, ������ �ְ� ���� ");
		System.out.println("   ���õ��� ���п� ������ ��ġ�� ����ִ� �����̴�.");
		System.out.println("   ��? ī�� �̱� <Enter>");

		
		for (int q = 0; q < 7; q++) {
			ranNum = rn.nextInt(4);
			sc.nextLine();

			card[q] = cardDeck[ranNum][q];
			cardNum[q] = cardDeck[ranNum][q];

			cnge = Integer.parseInt(card[q].substring(1, card[q].length()));
			switch (cnge) {
			case 11:
				card[q] = card[q].replace(card[q].substring(1, 3), "J");
				break;
			case 12:
				card[q] = card[q].replace(card[q].substring(1, 3), "Q");
				break;
			case 13:
				card[q] = card[q].replace(card[q].substring(1, 3), "K");
				break;
			case 14:
				card[q] = card[q].replace(card[q].substring(1, 3), "A");
				break;
			}
			System.out.println((q + 1) + "��° ī��_" + card[q]);
		} // My Card Set

		for (int q = 0; q < 7; q++) {
			switch (card[q].substring(0, 1)) {
			case "��":
				shape[0]++;
				break;
			case "��":
				shape[1]++;
				break;
			case "��":
				shape[2]++;
				break;
			case "��":
				shape[3]++;
				break;
			}
			if (shape[0] >= 5)
				flush = 4;
			else if (shape[1] >= 5)
				flush = 3;
			else if (shape[2] >= 5)
				flush = 2;
			else if (shape[3] >= 5)
				flush = 1;
			if (flush >= 1 && grade <= 6) {
				grade = 6;
			}
		} // flush check

		for (int q = 0; q < 7; q++) {
			cnge = Integer.parseInt(cardNum[q].substring(1, cardNum[q].length()));
			number[cnge - 2]++;
		} // number �迭�� ī���� ���ڰ��� ���� �־���

		for (int q = 0; q < 9; q++) {
			for (int w = q; w < q + 5; w++) {
				if (number[w] >= 1) {
					straightChk++;
				}
				if (q == 0 && w <= 3 && straightChk >= 4 && number[12] >= 1) {
					straight = 14;
					backST = 1;
					if (grade <= 5) {
						grade = 5;
					}
				} // �� ��Ʈ����Ʈ ����
			} // ���� for
			if (straightChk >= 5) {
				straight = q + 6;

				if (grade <= 5) {
					grade = 5;
				}
			}
			straightChk = 0;
		} // straight check

		for (int q = 0; q < 13; q++) {
			if (number[q] == 4) {
				fourCard = q + 2;

				if (grade <= 8)
					grade = 8;
			} else if (triple >= 1 && onePair >= 1) {
				fullHouse = triple;
				if (grade <= 7)
					grade = 7;
			} else if (number[q] == 3) {
				triple = q + 2;
				if (grade <= 4)
					grade = 4;
			} else if (onePair >= 1 && number[q] == 2 && twoPair == 0) {
				twoPair = q + 2;
				if (grade <= 3)
					grade = 3;
			} else if (onePair >= 1 && number[q] == 2 && twoPair >= 1) {
				onePair = twoPair;
				twoPair = q + 2;
				if (grade <= 3)
					grade = 3;
			} // 3��� ����
			else if (number[q] == 2 && grade != 3) { // ����!!!!!!! �� �κ��� ���� �߿��� && grade < 5
				onePair = q + 2;
				if (grade <= 2)
					grade = 2;
			} // ���� ��÷�Ǹ� ������ �״�� �ֱ����� ����
			else if (number[q] == 1) {
				top = q + 2;
				if (grade <= 1)
					grade = 1;
			}
		} // ��,�����,Ʈ����,Ǯ�Ͽ콺,��ī�� Ȯ��

		System.out.println("\n������� <Enter>");
		sc.nextLine();

		System.out.print("\n����� ��: ");
		for (int q = 0; q < 7; q++) {
			if (q != 0 && q != 7) {
				System.out.print("__");
			}
			System.out.print(card[q]);
		}

		System.out.println("\n");
		switch (grade) {
		case 1:
			System.out.println("����� " + gradeResult(top) + " <Top> �Դϴ�.");
			break;
		case 2:
			System.out.println("����� " + gradeResult(onePair) + " <One Pair> �Դϴ�.");
			break;
		case 3:
			System.out.println("����� " + gradeResult(twoPair) + gradeResult(onePair) + " <Two Pair> �Դϴ�.");
			break;
		case 4:
			System.out.println("����� " + gradeResult(triple) + " <Triple> �Դϴ�.");
			break;
		case 5:
			System.out.print("����� " + gradeResult(straight));
			if (straight == 14 && backST == 0) {
				System.out.print("Mountain ");
			} else if (backST == 1) {
				System.out.print("Back ");
			}
			System.out.println("<Straight> �Դϴ�.");
			break;
		case 6:
			System.out.print("����� ");
			switch (flush) {
			case 4:
				System.out.print(flush("��"));
				break;
			case 3:
				System.out.print(flush("��"));
				break;
			case 2:
				System.out.print(flush("��"));
				break;
			case 1:
				System.out.print(flush("��"));
				break;
			}
			System.out.println(" <Flush> �Դϴ�.");
			break;
		case 7:
			System.out.println("����� " + gradeResult(fullHouse) + gradeResult(onePair) + " <FullHouse> �Դϴ�.");
			break;
		case 8:
			System.out.println("����� " + gradeResult(fourCard) + " <FourCard> �Դϴ�.");
			break;
		}
		sc.close();
	}// main

	private static String gradeResult(int grade) {
		String tmp = "";
		for (int q = 0; q < 7; q++) {
			if (cardNum[q].substring(1, cardNum[q].length()).equals("" + grade)) {
				tmp += card[q] + " ";
			}
		}
		return tmp;
	} // Grade Result

	private static String flush(String shape) {
		String tmp = "";
		for (int q = 0; q < 7; q++) {
			if (cardNum[q].substring(0, 1).equals(shape)) {
				tmp += card[q] + " ";
			}
		}
		return tmp;
	} // flush result

	private static void cardDeckSet(String[][] cardDeck, int random, String tmp) {
		for (int q = 0; q < 13; q++) {
			cardDeck[0][q] = "��" + (q + 2);
			cardDeck[1][q] = "��" + (q + 2);
			cardDeck[2][q] = "��" + (q + 2);
			cardDeck[3][q] = "��" + (q + 2);
		} // CardDeck set
		for (int q = 0; q < 4; q++) {
			for (int w = 0; w < 100; w++) {
				random = rn.nextInt(12) + 1;
				tmp = cardDeck[q][random];
				cardDeck[q][random] = cardDeck[q][0];
				cardDeck[q][0] = tmp;
			}
		} // CardDeck Mix
	} // CardDeck set and Mix

}// class