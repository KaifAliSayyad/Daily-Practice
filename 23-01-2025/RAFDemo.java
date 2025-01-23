import java.io.*;

public class RAFDemo{
	public static void main(String[] args){

		try{
			RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw");
			
			System.out.println("Reading from input.txt. ");
			String line = null;
			while((line = raf.readLine()) != null){
				System.out.println(line);
			}

			raf.seek(0);
			raf.seek(15);

			System.out.println("\n\nReading from input.txt after seeking. ");
			line = null;
			while((line = raf.readLine()) != null){
				System.out.println(line);
			}

			System.out.println("\n\nWriting to input.txt. ");
			raf.seek(10);
			raf.writeBytes("\nHello World.....\n");
			
			//Printing contents of "input.txt"
			line = null;
			raf.seek(0);
			while((line = raf.readLine()) != null){
				System.out.println(line);
			}
			/* Here we can observe that it replaces the characters while writing. */
			
			System.out.println("\n\nWriting to input.txt at the end. ");
			raf.seek(raf.length());
			raf.writeBytes("\nWriting at the end.....\n");
			
			//Printing contents of "input.txt"
			line = null;
			raf.seek(0);
			while((line = raf.readLine()) != null){
				System.out.println(line);
			}
			raf.close();

			
			//Writing to different destinations using PrintWriter

			//PrintWriter pw = new PrintWriter(System.out);

			//PrintWriter pw = new PrintWriter(new File("input.txt"));
			/* The above writer will remove all the contents from the file, therefore we will use FileOutputStream class with append mode = true*/

			PrintWriter pw = new PrintWriter(new FileOutputStream("input.txt", true));

			pw.print("Hello Everybody");
			/* Doing just this won't print to console, because anything written or received is first stored in buffer, Therefore to send the data to it's destination, we need to flush the buffer. */

			pw.flush();
		
			pw.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}