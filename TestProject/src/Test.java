import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.UUID;

import com.google.gson.Gson;
import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

class Movie {

	String title;
	String producer;
	int number;
	String image;

	public Movie(String title, String producer, int number, String image) {
		this.title = title;
		this.producer = producer;
		this.number = number;
		this.image = image;
	}
}

public class Test {

	final static String path = "image/";
	final static int SIZE = 10;
	final static int WIDTH = 200;
	final static int HEIGHT = 120;
	final static String link = "https://picsum.photos/"+WIDTH+"/"+HEIGHT;

	public static void main(String[] args) throws Exception {
		run();
	}

	public static void request(InputStream is, OutputStream os, String fileName) {
		try {
			URL url = new URL(link);
			is = url.openStream();
			os = new FileOutputStream(path + fileName);
			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
				os.write(b, 0, length);
				for (int i = 0; i < (int) (Math.random() * 5); i++) {
					System.out.print(".");
				}
			}
			System.out.println(fileName + " download complete");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getImage() {
		InputStream is = null;
		OutputStream os = null;
		String fileName = UUID.randomUUID().toString() + ".jpg";
		try {
			request(is, os, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(is, os);
		}
		return fileName;
	}

	public static void close(InputStream is, OutputStream os) {
		try {
			if (os != null) {
				os.close();
			}
			if (is != null) {
				is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void run() {
		ArrayList<Movie> movieList = new ArrayList<>();
		for (int i = 0; i < SIZE; i++) {
			Lorem lorem = new LoremIpsum();
			String title = lorem.getTitle(1);
			String name = lorem.getFirstName();
			Movie movie = new Movie(title, name, i, getImage());
			movieList.add(movie);
		}
		toGson(movieList);

	}

	public static void toGson(ArrayList<Movie> movieList) {
		Gson gson = new Gson();
		String json = gson.toJson(movieList);
		setFormatString(json);
	}

	public static void setFormatString(String json) {
		json = json.replace("[", "[\n");
		json = json.replace("{", "    {");
		json = json.replace("]", "\n]\n");
		json = json.replace("},", "},\n");
		System.out.println(json);
	}

}
