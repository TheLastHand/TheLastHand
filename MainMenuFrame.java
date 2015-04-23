import java.awt.Insets;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainMenuFrame {

	protected static boolean keyboardVisibility = false;
	protected static JFrame mainMenuFrame = new JFrame("The Last Hand");
	protected static JPanel gameWindowPanel;
	public static JButton newGameButton = new JButton();
	public static JButton exitButton = new JButton();


	/**
	 * @wbp.parser.entryPoint
	 */
	public static void mainMenuFrame() throws IOException {
	
		ImagePanel mainMenuPanel = new ImagePanel(
				new ImageIcon(MainMenuFrame.class
						.getResource("/images/background.jpg"))
						.getImage());
		mainMenuPanel.setBounds(0, 0, 984, 682);

		mainMenuFrame.setSize(1000, 720);
		mainMenuFrame.setLocationRelativeTo(null);
		mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainMenuFrame.getContentPane().setLayout(null);

		mainMenuFrame.setVisible(true);

		mainMenuPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainMenuFrame.getContentPane().add(mainMenuPanel);
		mainMenuPanel.setLayout(null);
		
		newGameButton.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/images/newgame.png")));
		newGameButton.setBounds(425, 274, 140, 70);
		newGameButton.setMargin(new Insets(0, 0, 0, 0));
		mainMenuPanel.add(newGameButton);
		
		exitButton.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/images/exit.png")));
		exitButton.setBounds(425, 361, 140, 70);
		exitButton.setMargin(new Insets(0, 0, 0, 0));
		mainMenuPanel.add(exitButton);

		mainMenuFrame.repaint();
		ActionAppointment.frameRecall();
		
	}
}



