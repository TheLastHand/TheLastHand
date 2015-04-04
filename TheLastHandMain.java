
import java.awt.Color;



public class TheLastHandMain extends JFrame {

	static TheLastHandMain mainWindowFrame;
	private JPanel mainWindowPanel;
	
	private JFrame gameWindowFrame;
	private JPanel gameWindowPanel;
	
	private JRadioButton earthDeck;
	private JRadioButton fireDeck;
	private JRadioButton glacierDeck;
	private JRadioButton natureDeck;
	private JRadioButton underworldDeck;
	private JRadioButton waterDeck;
	
	private ButtonGroup allButtons;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindowFrame = new TheLastHandMain();
					mainWindowFrame.setVisible(true);
					mainWindowFrame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TheLastHandMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 550);
		mainWindowPanel = new JPanel();
		mainWindowPanel.setBackground(Color.GRAY);
		mainWindowPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainWindowPanel);
		mainWindowPanel.setLayout(null);
		
		
		JButton deckChooser = new JButton("Choose your deck");
		deckChooser.setBackground(Color.CYAN);
		deckChooser.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if(earthDeck.isSelected() == true){
					mainWindowFrame.setVisible(true);
					mainWindowFrame.dispose();
				}
				
				else if(fireDeck.isSelected() == true){
					mainWindowFrame.setVisible(true);
					mainWindowFrame.dispose();
				}
				
				else if(glacierDeck.isSelected() == true){
					mainWindowFrame.setVisible(true);
					mainWindowFrame.dispose();
				}
				
				else if(natureDeck.isSelected() == true){
					mainWindowFrame.setVisible(true);
					mainWindowFrame.dispose();
				}
				
				else if(underworldDeck.isSelected() == true){
					mainWindowFrame.setVisible(true);
					mainWindowFrame.dispose();
				}
				
				else if(waterDeck.isSelected() == true){
					mainWindowFrame.setVisible(true);
					mainWindowFrame.dispose();
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Please choose a desk", "Uppss", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		deckChooser.setBounds(500, 414, 156, 23);
		
		earthDeck = new JRadioButton();
		earthDeck.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\earthdeck.jpg"));
		earthDeck.setMargin(new Insets(0, 0, 0, 0));
		earthDeck.setBorder(null);
		earthDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		earthDeck.setBounds(40, 111, 171, 237);
		
		fireDeck = new JRadioButton();
		fireDeck.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\firedeck.jpg"));
		fireDeck.setMargin(new Insets(0, 0, 0, 0));
		fireDeck.setBorder(null);
		fireDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fireDeck.setBounds(220, 111, 171, 237);
		
		glacierDeck = new JRadioButton();
		glacierDeck.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\glacierdeck.jpg"));
		glacierDeck.setMargin(new Insets(0, 0, 0, 0));
		glacierDeck.setBorder(null);
		glacierDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		glacierDeck.setBounds(400, 111, 171, 237);
		
		natureDeck = new JRadioButton();
		natureDeck.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\naturedeck.jpg"));
		natureDeck.setMargin(new Insets(0, 0, 0, 0));
		natureDeck.setBorder(null);
		natureDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		natureDeck.setBounds(580, 111, 171, 237);
		
		underworldDeck = new JRadioButton();
		underworldDeck.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\underworlddeck.jpg"));
		underworldDeck.setMargin(new Insets(0, 0, 0, 0));
		underworldDeck.setBorder(null);
		underworldDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		underworldDeck.setBounds(760, 111, 171, 237);
		
		waterDeck = new JRadioButton();
		waterDeck.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\waterdeck.jpg"));
		waterDeck.setMargin(new Insets(0, 0, 0, 0));
		waterDeck.setBorder(null);
		waterDeck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		waterDeck.setBounds(940, 111, 171, 237);
		
		mainWindowPanel.add(earthDeck);
		mainWindowPanel.add(fireDeck);
		mainWindowPanel.add(glacierDeck);
		mainWindowPanel.add(natureDeck);
		mainWindowPanel.add(underworldDeck);
		mainWindowPanel.add(waterDeck);
		
		mainWindowPanel.add(deckChooser);
		
		//create AllButtons group and add decks to this group
		allButtons = new ButtonGroup();
		allButtons.add(earthDeck);
		allButtons.add(fireDeck);
		allButtons.add(glacierDeck);
		allButtons.add(natureDeck);
		allButtons.add(underworldDeck);
		allButtons.add(waterDeck);
		
		
		
	}
}
