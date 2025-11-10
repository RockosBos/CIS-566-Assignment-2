import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordTester {
	public static void main(String[] args)
    {

		Word90Version w90 = new Word90Version();
		Word00Version w00 = new Word00Version();
		Word10Version w10 = new Word10Version();
		Word21Version w21 = new Word21Version();

		String inputFile = "./input/config.txt";
		File file = new File(inputFile);

		try (Scanner myReader = new Scanner(file)) {
      		while (myReader.hasNextLine()) {
        		String data = myReader.nextLine();
        		System.out.println(data);

				switch (data) {
					case "Word90":
						Word90Version w90_iteration = Word90Version.w90Instance();
						if(w90_iteration != null){
							w90_iteration.WordTest();
						}
						else{
							System.out.println("Unable to run test, more than 2 instances of " + data + " have been created.");
						}
						break;
					case "Word00":
						Word00Version w00_iteration = Word00Version.w00Instance();
						if(w00_iteration != null){
							w00_iteration.WordTest();
						}
						else{
							System.out.println("Unable to run test, more than 2 instances of " + data + " have been created.");
						}
						break;
					case "Word10":
						Word10Version w10_iteration = Word10Version.w10Instance();
						if(w10_iteration != null){
							w10_iteration.WordTest();
						}
						else{
							System.out.println("Unable to run test, more than 2 instances of " + data + " have been created.");
						}
						break;
					case "Word21":
						Word21Version w21_iteration = Word21Version.w21Instance();
						if(w21_iteration != null){
							w21_iteration.WordTest();
						}
						else{
							System.out.println("Unable to run test, more than 2 instances of " + data + " have been created.");
						}
						break;
				
					default:
						System.out.println("Invalid entry in text file - " + data + " is not a valid entry");
						break;
				}
      		}
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
     		e.printStackTrace();
    	}
    }
}
