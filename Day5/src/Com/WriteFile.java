//1. checked exception
package Com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class WriteFile {
	public static void main(String args[]) throws FileNotFoundException {
		File file1 = new File("E://file.txt");

		FileReader fr = new FileReader(file1);
	}

}
