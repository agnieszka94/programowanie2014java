package pl.edu.uj.tcs.programowanie12.exceptionstrycatchfinally;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
/** 
 * An example of how to handle resource (like a file) when a communication can fail.
 * 
 * @author marcin
 *
 */
public class Class19ResourceOldStyle {

	static class Resource {
		static Random rG = new Random();

		Resource() throws FileNotFoundException {
			System.out.println("Opening file");
			if (rG.nextBoolean())
				throw new FileNotFoundException();
			System.out.println("File succesfully open");
		}

		void read() throws IOException {
			System.out.println("Reading from file");
			if (rG.nextBoolean())
				throw new IOException("Cannot read");
			System.out.println("Reading succesfull");
		}
		public void close() throws IOException {
			System.out.println("Closing file");
			if (rG.nextBoolean())
				throw new IOException("Cannot close");
			System.out.println("File closed succesfully");
			
		}
	}

	public static void main(String[] args) {
		try {
			Resource r = new Resource();
			try {
				r.read();
			} finally {
				r.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("FAIL: the file was not found");
		} catch (IOException e) {
			System.out.println("FAIL: communication with file failed.");
		}
	}

}
