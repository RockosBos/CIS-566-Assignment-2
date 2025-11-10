public class Word10Version extends WordVersion{
	private static Word10Version w10Instance_1;
	private static Word10Version w10Instance_2;

	public static Word10Version w10Instance(){
		if(w10Instance_1 == null){
			w10Instance_1 = new Word10Version();
			return w10Instance_1;
		}
		else if(w10Instance_2 == null){
			w10Instance_2 = new Word10Version();
			return w10Instance_2;
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
