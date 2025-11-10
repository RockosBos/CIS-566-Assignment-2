public class Word00Version extends WordVersion{
	private static Word00Version w00Instance_1;
	private static Word00Version w00Instance_2;

	public static Word00Version w00Instance(){
		if(w00Instance_1 == null){
			w00Instance_1 = new Word00Version();
			return w00Instance_1;
		}
		else if(w00Instance_2 == null){
			w00Instance_2 = new Word00Version();
			return w00Instance_2;
		}
		else{
			return null;
		}

	}

	public void WordTest(){
		System.out.println("Word 00 button tested successfully");
		System.out.println("Word 00 panel tested successfully");
		System.out.println("Word 00 textbox tested successfully");
	}
}
