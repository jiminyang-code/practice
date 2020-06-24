public class SongTest {
	public static void main(String[] args) {
		// ��ü ����
		Song s0 = new Song("����� ��", "������");
		Song s1 = new Song("���", "�����");
		Song s2 = new Song("���", "�ڿϱ�");

		// ��ü �迭 ����
		Song[] songs = { s0, s1, s2 };

		// ��� �迭 �� ��ü ���
		for (int i = 0; i < songs.length; i++) {
			System.out.println(songs[i].toStr());
		}
	}
}

class Song {
	// �ʵ�
	String name;
	String singer;

	// ������
	public Song(String n, String s) {
		name = n;
		singer = s;
	}

	// �޼ҵ�
	String toStr() {
		return String.format("Song { name: %s, singer: %s }", name, singer);
	}
}