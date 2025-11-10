import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordTester {
	public static void main(String[] args)
    {
		Word90Version w90_1 = null;
		Word90Version w90_2 = null;
		Word00Version w00_1 = null;
		Word00Version w00_2 = null;
		Word10Version w01_1 = null;
		Word10Version w01_2 = null;
		Word21Version w21_1 = null;
		Word21Version w21_2 = null;

		String inputFile = "./input/config.txt";
		File file = new File(inputFile);

		try (Scanner myReader = new Scanner(file)) {
      		while (myReader.hasNextLine()) {
        		String data = myReader.nextLine();
        		System.out.println(data);

				switch (data) {
					case "Word90":
						if(w90_1 == null){
							w90_1 = new Word90Version();
							
						}
						else if(w90_2 == null){

						}
						else{

						}
						break;
					case "Word00":
						
						break;
					case "Word10":
						
						break;
					case "Word21":
						
						break;
				
					default:
						break;
				}
      		}
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
     		e.printStackTrace();
    	}
    }
}
