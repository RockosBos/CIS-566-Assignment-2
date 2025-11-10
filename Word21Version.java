public class Word21Version extends WordVersion{
	private static Word21Version w21Instance_1;
	private static Word21Version w21Instance_2;

	public static Word21Version w21Instance(){
		if(w21Instance_1 == null){
			w21Instance_1 = new Word21Version();
			return w21Instance_1;
		}
		else if(w21Instance_2 == null){
			w21Instance_2 = new Word21Version();
			return w21Instance_2;
		}
		else{
			return null;
		}

	}

	public void WordTest(){
		System.out.println("Word 21 button tested successfully");
		System.out.println("Word 21 panel tested successfully");
		System.out.println("Word 21 textbox tested successfully");
	}
}
