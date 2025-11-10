import Components.WordButton;
import Components.WordPanel;
import Components.WordTextBox;

public abstract class WordVersion {
	private WordButton button = new WordButton();
	private WordPanel panel = new WordPanel();
	private WordTextBox textBox = new WordTextBox();

	public void WordTest(){
		System.out.println("button");
		System.out.println("panel");
		System.out.println("textbox");
	}
}
