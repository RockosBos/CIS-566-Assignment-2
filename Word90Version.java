public class Word90Version extends WordVersion {
	private static Word90Version w90Instance_1;
	private static Word90Version w90Instance_2;

	public static Word90Version w90Instance(){
		if(w90Instance_1 == null){
			System.out.println("W90 Instance 1 Created");
			w90Instance_1 = new Word90Version();
			return w90Instance_1;
		}
		else if(w90Instance_2 == null){
			System.out.println("W90 Instance 2 Created");
			w90Instance_2 = new Word90Version();
			return w90Instance_2;
		}
		else{
			return null;
		}

	}
}
