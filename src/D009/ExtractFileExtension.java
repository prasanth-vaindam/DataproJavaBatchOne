package D009;

public class ExtractFileExtension {

	public static void main(String[] args) {
		String file = "photo.jpg";

		int pos = file.indexOf(".");

		String extension = file.substring(pos + 1);

		System.out.println(extension);
		

	}

}
