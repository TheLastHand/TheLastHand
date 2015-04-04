import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Deck extends JButton {
	
	private Deck deck;
	
	public void putImageToDeck(String imagePlace){
		deck.setIcon(new ImageIcon(imagePlace));
		
	}
}

