import java.awt.Color;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class GameProcessFrame {

	protected static boolean keyboardVisibility = false;
	protected static JFrame cardChoosingFrame = new JFrame("The Last Hand");
	protected static JPanel gameWindowPanel;
	
	private static final JButton player2card1 = new JButton();
	private static final JButton player2card2 = new JButton();
	private static final JButton player2card3 = new JButton();
	private static final JButton player2card4 = new JButton();
	private static final JButton player2card5 = new JButton();
	private static final JButton player2card6 = new JButton();
	private static final JButton player2card7 = new JButton();
	private static final JButton player2card8 = new JButton();
	private static final JButton player2HeroButton = new JButton();
	private static final JButton player1HeroButton = new JButton();
	private static final JButton player1card1 = new JButton();
	private static final JButton player1card2 = new JButton();
	private static final JButton player1card3 = new JButton();
	private static final JButton player1card4 = new JButton();
	private static final JButton player1card5 = new JButton();
	private static final JButton player1card6 = new JButton();
	private static final JButton player1card7 = new JButton();
	private static final JButton player1card8 = new JButton();

	
	private static final JPanel player1DeckPanel = new JPanel();
	private static final JPanel player2deckPanel = new JPanel();
	private static final JPanel player2PlayingDeckPanel = new JPanel();
	private static final JPanel player1PlayingDeckPanel = new JPanel();
	private static final JPanel player2HeroPanel = new JPanel();
	private static final JPanel player1HeroPanel = new JPanel();
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void gameProcessFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(GameProcessFrame.class
						.getResource("/images/background.jpg"))
						.getImage());
		gameWindowPanel.setLocation(0, 0);

		cardChoosingFrame.setSize(1000, 720);
		cardChoosingFrame.setLocationRelativeTo(null);
		cardChoosingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardChoosingFrame.getContentPane().setLayout(null);

		cardChoosingFrame.setVisible(true);

		gameWindowPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		cardChoosingFrame.getContentPane().add(gameWindowPanel);
		gameWindowPanel.setLayout(null);
		
		player2deckPanel.add(player2card1);
		player2deckPanel.add(player2card2);
		player2deckPanel.add(player2card3);
		player2deckPanel.add(player2card4);
		player2deckPanel.add(player2card5);	
		player2deckPanel.add(player2card6);	
		player2deckPanel.add(player2card7);	
		player2deckPanel.add(player2card8);
		player1card1.setIcon(new ImageIcon(GameProcessFrame.class.getResource("/images/fire/danceoffire.jpg")));
			
		player1DeckPanel.add(player1card1);	
		player1DeckPanel.add(player1card2);		
		player1DeckPanel.add(player1card3);	
		player1DeckPanel.add(player1card4);	
		player1DeckPanel.add(player1card5);	
		player1DeckPanel.add(player1card6);	
		player1DeckPanel.add(player1card7);	
		player1DeckPanel.add(player1card8);
		
		

		player1DeckPanel.setBackground(new Color(0, 0, 0, 0));
		player2deckPanel.setBackground(new Color(0, 0, 0, 0));
		player2PlayingDeckPanel.setBackground(new Color(0, 0, 0, 0));
		player1PlayingDeckPanel.setBackground(new Color(0, 0, 0, 0));
		player2HeroPanel.setBackground(new Color(0, 0, 0, 0));
		player1HeroPanel.setBackground(new Color(0, 0, 0, 0));

		
		
		player2HeroPanel.setBounds(0, 0, 194, 249);
		gameWindowPanel.add(player2HeroPanel);
		player2HeroPanel.setLayout(null);
		player2HeroButton.setIcon(new ImageIcon(GameProcessFrame.class.getResource("/images/glacierdeck.jpg")));
		
		player2HeroButton.setBounds(0, 0, 170, 237);
		player2HeroPanel.add(player2HeroButton);
	
		player1HeroPanel.setLayout(null);
		player1HeroPanel.setBounds(0, 432, 194, 249);
		gameWindowPanel.add(player1HeroPanel);
		player1HeroButton.setIcon(new ImageIcon(GameProcessFrame.class.getResource("/images/firedeck.jpg")));
		
		player1HeroButton.setBounds(0, 11, 169, 237);
		player1HeroPanel.add(player1HeroButton);
		
		player1DeckPanel.setBounds(192, 531, 791, 150);
		gameWindowPanel.add(player1DeckPanel);
		player1DeckPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		player2PlayingDeckPanel.setBounds(192, 366, 791, 150);
		gameWindowPanel.add(player2PlayingDeckPanel);
		player2PlayingDeckPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		player1PlayingDeckPanel.setBounds(192, 189, 791, 150);
		gameWindowPanel.add(player1PlayingDeckPanel);
		player1PlayingDeckPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		player2deckPanel.setBounds(192, 0, 791, 150);
		gameWindowPanel.add(player2deckPanel);
		player2deckPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		


	}
}
