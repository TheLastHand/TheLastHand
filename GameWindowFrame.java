import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.naming.event.EventContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class GameWindowFrame extends JFrame {

	static JPanel gameWindowPanel;
	static GameWindowFrame gameWindowFrame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gameWindowFrame= new GameWindowFrame();
					gameWindowFrame.setVisible(true);
					gameWindowFrame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameWindowFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360, 720);
		gameWindowPanel = new JPanel();
		gameWindowPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(gameWindowPanel);
		gameWindowPanel.setLayout(null);
		
		bringDesk(1);
	}

	public void bringDesk(int deskNumber) {
		if (deskNumber == 1) {
			int x = 20;
			int y = 20;
			int imageNumber = 1;
			for(int i = 1; i<= 3;i++){
				for(int j = 1; j<=9; j++){
					System.out.println("IMAGE NUMBER" + imageNumber);
					
				JButton btnNewButton = new JButton();
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\earth\\" + imageNumber + ".jpg"));
				btnNewButton.setBounds(x, y, 140, 180);
				GicikButtonHandler handler = new GicikButtonHandler();
				btnNewButton.addMouseListener(handler);
				
				handler.setImageNumber(imageNumber);
				handler.setImageX(x);
				handler.setImageY(y);
				gameWindowPanel.add(btnNewButton);
				x += 150;
				imageNumber += 1;
				}
				x = 20;
				y += 200;
				if(imageNumber == 28){
					break;
				}
			}
//			int x = 35;
//			int y = 25;
//			for (int i = 1; i <= 27; i++) {
//				JRadioButton earthDeck = new JRadioButton();
//				earthDeck.setIcon(new ImageIcon(
//						"C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\earth\\"
//								+ i + "jpg"));
//				earthDeck.setMargin(new Insets(0, 0, 0, 0));
//				earthDeck.setBorder(null);
//				gameWindowPanel.add(earthDeck);		
//			}
		}

		if (deskNumber == 2) {
			int x = 35;
			int y = 25;
			for (int i = 1; i <= 27; i++) {
				JRadioButton earthDeck = new JRadioButton();
				earthDeck.setIcon(new ImageIcon(
						"C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\fire\\"
								+ i + "jpg"));
				earthDeck.setMargin(new Insets(0, 0, 0, 0));
				earthDeck.setBorder(null);

			}
		} else if (deskNumber == 3) {
			int x = 35;
			int y = 25;
			for (int i = 1; i <= 27; i++) {
				JRadioButton earthDeck = new JRadioButton();
				earthDeck.setIcon(new ImageIcon(
						"C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\glacier\\"
								+ i + "jpg"));
				earthDeck.setMargin(new Insets(0, 0, 0, 0));
				earthDeck.setBorder(null);

			}
		} else if (deskNumber == 4) {
			int x = 35;
			int y = 25;
			for (int i = 1; i <= 27; i++) {
				JRadioButton earthDeck = new JRadioButton();
				earthDeck.setIcon(new ImageIcon(
						"C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\nature\\"
								+ i + "jpg"));
				earthDeck.setMargin(new Insets(0, 0, 0, 0));
				earthDeck.setBorder(null);

			}
		} else if (deskNumber == 5) {
			int x = 35;
			int y = 25;
			for (int i = 1; i <= 27; i++) {
				JRadioButton earthDeck = new JRadioButton();
				earthDeck.setIcon(new ImageIcon(
						"C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\underworld\\"
								+ i + "jpg"));
				earthDeck.setMargin(new Insets(0, 0, 0, 0));
				earthDeck.setBorder(null);

			}
		} else if (deskNumber == 6) {
			int x = 35;
			int y = 25;
			for (int i = 1; i <= 27; i++) {
				JRadioButton earthDeck = new JRadioButton();
				earthDeck.setIcon(new ImageIcon(
						"C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\water\\"
								+ i + "jpg"));
				earthDeck.setMargin(new Insets(0, 0, 0, 0));
				earthDeck.setBorder(null);

			}
		}

	}

}
class GicikButtonHandler extends MouseAdapter {
	int imageNumber = 0;
	int imageX = 0;
	int imageY = 0;
	
	JButton bigger = new JButton();

	//zumlama
	//buyutme
	public void mouseEntered(MouseEvent event) {
		bigger.setBounds(GameWindowFrame.gameWindowFrame.getWidth()/2, GameWindowFrame.gameWindowFrame.getHeight()/2, 375, 525);
		bigger.setIcon(new ImageIcon("C:\\Users\\student\\Desktop\\Workspace\\TheLastHand\\src\\earth\\" + imageNumber + "b.jpg"));
		GameWindowFrame.gameWindowPanel.add(bigger);
		GameWindowFrame.gameWindowPanel.repaint();
	}
	
	//cıkma
	@Override
	public void mouseExited(MouseEvent event) {
		GameWindowFrame.gameWindowPanel.remove(bigger);
		GameWindowFrame.gameWindowPanel.repaint();
	}
	public void setImageX(int x) {
		this.imageX = x;
	}
	public int getImageX() {
		return imageX;
	}
	public void setImageY(int y) {
		this.imageY = y;
	}
	public int getImageY() {
		return imageY;
	}
	public void setImageNumber(int number){
		imageNumber = number;
	}
	
	public int getNumber(){
		return imageNumber;
	}
}
