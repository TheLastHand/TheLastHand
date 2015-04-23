import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DeckChoosingFrame {

	protected static JFrame deckChoosingFrame = new JFrame("The Last Hand");
	protected static JButton earthDeckButton = new JButton();
	protected static JButton fireDeckButton = new JButton();
	protected static JButton glacierDeckButton = new JButton();
	protected static JButton natureDeckButton = new JButton();
	protected static JButton underworldDeckButton = new JButton();
	protected static JButton waterDeckButton = new JButton();
	protected static JButton biggerVersionButton = new JButton();
	protected static JButton btnNewButton = new JButton();

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void deckChoosingFrame() throws IOException {
		ImagePanel deckChoosingPanel = new ImagePanel(
				new ImageIcon(DeckChoosingFrame.class
						.getResource("/images/background.jpg")).getImage());

		deckChoosingFrame.setSize(1000, 720);
		deckChoosingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		deckChoosingFrame.setLocationRelativeTo(null);
		deckChoosingFrame.getContentPane().setLayout(null);
		deckChoosingPanel.setBounds(0, 0, 984, 682);
		deckChoosingFrame.getContentPane().add(deckChoosingPanel);
		deckChoosingPanel.setLayout(null);
		deckChoosingFrame.setVisible(true);

		JPanel deckRepresentationPanel = new JPanel();
		deckRepresentationPanel.setBounds(0, 0, 621, 541);
		deckChoosingPanel.add(deckRepresentationPanel);
		deckRepresentationPanel.setLayout(null);
		deckRepresentationPanel.setBackground(new Color(0, 0, 0, 0));

		earthDeckButton.setIcon(new ImageIcon(DeckChoosingFrame.class
				.getResource("/images/earthdeck.jpg")));
		earthDeckButton.setBounds(20, 25, 170, 237);
		deckRepresentationPanel.add(earthDeckButton);

		fireDeckButton.setIcon(new ImageIcon(DeckChoosingFrame.class
				.getResource("/images/firedeck.jpg")));
		fireDeckButton.setBounds(222, 25, 170, 237);
		deckRepresentationPanel.add(fireDeckButton);

		glacierDeckButton.setIcon(new ImageIcon(DeckChoosingFrame.class
				.getResource("/images/glacierdeck.jpg")));
		glacierDeckButton.setBounds(423, 25, 170, 237);
		deckRepresentationPanel.add(glacierDeckButton);

		natureDeckButton.setIcon(new ImageIcon(DeckChoosingFrame.class
				.getResource("/images/naturedeck.jpg")));
		natureDeckButton.setBounds(20, 293, 170, 237);
		deckRepresentationPanel.add(natureDeckButton);

		underworldDeckButton.setIcon(new ImageIcon(DeckChoosingFrame.class
				.getResource("/images/underworlddeck.jpg")));
		underworldDeckButton.setBounds(222, 293, 170, 237);
		deckRepresentationPanel.add(underworldDeckButton);

		waterDeckButton.setIcon(new ImageIcon(DeckChoosingFrame.class
				.getResource("/images/waterdeck.jpg")));
		waterDeckButton.setBounds(423, 293, 170, 237);
		deckRepresentationPanel.add(waterDeckButton);

		JPanel biggerVersionPanel = new JPanel();
		biggerVersionPanel.setBounds(621, 0, 363, 437);
		deckChoosingPanel.add(biggerVersionPanel);
		biggerVersionPanel.setLayout(null);
		biggerVersionPanel.setBackground(new Color(0, 0, 0, 0));

		biggerVersionButton.setBounds(38, 11, 300, 418);
		biggerVersionPanel.add(biggerVersionButton);

		JPanel chatPanel = new JPanel();
		chatPanel.setBounds(623, 437, 361, 245);
		deckChoosingPanel.add(chatPanel);
		chatPanel.setBackground(new Color(0, 0, 0, 0));

		btnNewButton
				.setIcon(new ImageIcon(DeckChoosingFrame.class
						.getResource("/images/appstore.png")));
		btnNewButton.setBounds(396, 585, 200, 62);
		deckChoosingPanel.add(btnNewButton);
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setBorder(null);

		
		biggerVersionButton.setVisible(false);

		
	
		
		earthDeckButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton
						.setIcon(new ImageIcon(
								DeckChoosingFrame.class
								.getResource("/images/earthdeckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fireDeckButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton
						.setIcon(new ImageIcon(DeckChoosingFrame.class
								.getResource("/images/firedeckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		glacierDeckButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton
						.setIcon(new ImageIcon(DeckChoosingFrame.class
								.getResource("/images/glacierdeckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		natureDeckButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton
						.setIcon(new ImageIcon(DeckChoosingFrame.class
								.getResource("/images/naturedeckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		underworldDeckButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton
						.setIcon(new ImageIcon(DeckChoosingFrame.class
								.getResource("/images/underworlddeckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		waterDeckButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton
						.setIcon(new ImageIcon(DeckChoosingFrame.class
								.getResource("/images/waterdeckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					String command = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe http://inciswf.com/127283744663.swf ";

					Runtime.getRuntime().exec(command);
				} catch (Exception ex) {
					System.out.println("cannot execute command. " + ex);
				}
			}
		});
		
		
		deckChoosingFrame.repaint();

	}
}

