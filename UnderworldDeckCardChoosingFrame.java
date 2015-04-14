import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UnderworldDeckCardChoosingFrame {

	protected static boolean keyboardVisibility = false;
	protected static JFrame cardChoosingFrame = new JFrame("The Last Hand");
	protected static JPanel gameWindowPanel;
	protected static JButton choose = new JButton("choose!");
	public static JPanel cardRepresentationPanel1 = new JPanel();
	public static JPanel cardRepresentationPanel2 = new JPanel();
	public static JPanel cardRepresentationPanel3 = new JPanel();
	protected static JPanel biggerCardPanel = new JPanel();
	protected static JPanel selectedCardPanel = new JPanel();
	protected static JPanel chatPanel = new JPanel();

	static final JButton panel1arrowRight = new JButton();
	static final JButton panel2arrowRight = new JButton();
	static final JButton panel2arrowLeft = new JButton();
	static final JButton panel3arrowLeft = new JButton();
	static final JButton playButton = new JButton();

	private static final JButton selectedCard1 = new JButton();
	private static final JButton selectedCard2 = new JButton();
	private static final JButton selectedCard3 = new JButton();
	private static final JButton selectedCard4 = new JButton();
	private static final JButton selectedCard5 = new JButton();
	private static final JButton selectedCard6 = new JButton();
	private static final JButton selectedCard7 = new JButton();
	private static final JButton selectedCard8 = new JButton();
	private static final JButton replacementCard1 = new JButton();
	private static final JButton replacementCard2 = new JButton();
	private static final JButton replacementCard3 = new JButton();
	private static final JButton replacementCard4 = new JButton();
	private static final JButton biggerVersionButton = new JButton();

	private static final JButton adam = new JButton();
	private static final JButton ancientracoon = new JButton();
	private static final JButton atmosphere = new JButton();
	private static final JButton buriedarmy = new JButton();
	private static final JButton champ = new JButton();
	private static final JButton dolza = new JButton();
	private static final JButton earthhole = new JButton();
	private static final JButton earthquake = new JButton();
	private static final JButton eclipse = new JButton();
	private static final JButton elderdynosaur = new JButton();
	private static final JButton embedded = new JButton();
	private static final JButton fatlord = new JButton();
	private static final JButton formofmud = new JButton();
	private static final JButton fornax = new JButton();
	private static final JButton gortag = new JButton();
	private static final JButton greatabsorbation = new JButton();
	private static final JButton groundshaker = new JButton();
	private static final JButton gruntag = new JButton();
	private static final JButton guardianofgolems = new JButton();
	private static final JButton hpbonus = new JButton();
	private static final JButton hpbonus2 = new JButton();
	private static final JButton hpbonus3 = new JButton();
	private static final JButton hpbonus4 = new JButton();
	private static final JButton hpbonus5 = new JButton();
	private static final JButton kraken = new JButton();
	private static final JButton lieutenantturtle = new JButton();
	private static final JButton lycanranger = new JButton();
	private static final JButton manabonus = new JButton();
	private static final JButton manofdust = new JButton();
	private static final JButton meteora = new JButton();
	private static final JButton nuxia = new JButton();
	private static final JButton reflection = new JButton();
	private static final JButton reflection2 = new JButton();
	private static final JButton rhachor = new JButton();
	private static final JButton robotsoldier = new JButton();
	private static final JButton rocky = new JButton();
	private static final JButton rorox = new JButton();
	private static final JButton rustybull = new JButton();
	private static final JButton shaker = new JButton();
	private static final JButton shieldofbereth = new JButton();
	private static final JButton skorka = new JButton();
	private static final JButton sorktangthesleepy = new JButton();
	private static final JButton splitter = new JButton();
	private static final JButton stuckinthesand = new JButton();
	private static final JButton thegreatmammoth = new JButton();
	private static final JButton trochkar = new JButton();
	private static final JButton untouchable = new JButton();
	private static final JButton zildar = new JButton();

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void CardChoosingFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/earthdeckbackground.jpg"))
						.getImage());

		cardChoosingFrame.setSize(1000, 720);
		cardChoosingFrame.setLocationRelativeTo(null);
		cardChoosingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cardChoosingFrame.getContentPane().setLayout(null);

		cardChoosingFrame.setVisible(true);

		gameWindowPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		cardChoosingFrame.getContentPane().add(gameWindowPanel);
		gameWindowPanel.setLayout(null);

		biggerVersionButton.setVisible(false);

		biggerCardPanel.setBounds(619, 0, 365, 440);
		biggerCardPanel.setLayout(null);
		gameWindowPanel.add(biggerCardPanel);

		biggerVersionButton.setBounds(31, 11, 300, 418);
		biggerCardPanel.add(biggerVersionButton);
		biggerCardPanel.setBackground(new Color(0, 0, 0, 0));

		selectedCardPanel.setBounds(0, 442, 624, 229);
		gameWindowPanel.add(selectedCardPanel);
		selectedCardPanel.setLayout(null);
		selectedCardPanel.setBackground(new Color(0, 0, 0, 0));
		selectedCard1.setBounds(75, 11, 80, 111);

		selectedCardPanel.add(selectedCard1);
		selectedCard2.setBounds(122, 11, 80, 111);

		selectedCardPanel.add(selectedCard2);
		selectedCard3.setBounds(165, 11, 80, 111);

		selectedCardPanel.add(selectedCard3);
		selectedCard4.setBounds(212, 11, 80, 111);

		selectedCardPanel.add(selectedCard4);
		selectedCard5.setBounds(255, 11, 80, 111);

		selectedCardPanel.add(selectedCard5);
		selectedCard6.setBounds(302, 11, 80, 111);

		selectedCardPanel.add(selectedCard6);
		selectedCard7.setBounds(345, 11, 80, 111);

		selectedCardPanel.add(selectedCard7);
		selectedCard8.setBounds(392, 11, 80, 111);

		selectedCardPanel.add(selectedCard8);
		replacementCard1.setBounds(75, 129, 80, 111);

		selectedCardPanel.add(replacementCard1);
		replacementCard2.setBounds(122, 129, 80, 111);

		selectedCardPanel.add(replacementCard2);
		replacementCard3.setBounds(165, 129, 80, 111);

		selectedCardPanel.add(replacementCard3);
		replacementCard4.setBounds(212, 129, 80, 111);

		selectedCardPanel.add(replacementCard4);

		selectedCard1.setVisible(false);
		selectedCard2.setVisible(false);
		selectedCard3.setVisible(false);
		selectedCard4.setVisible(false);
		selectedCard5.setVisible(false);
		selectedCard6.setVisible(false);
		selectedCard7.setVisible(false);
		selectedCard8.setVisible(false);
		replacementCard1.setVisible(false);
		replacementCard2.setVisible(false);
		replacementCard3.setVisible(false);
		replacementCard4.setVisible(false);

		chatPanel.setBounds(619, 442, 376, 229);
		gameWindowPanel.add(chatPanel);
		chatPanel.setBackground(new Color(0, 0, 0, 0));

		cardRepresentationPanel1.setBounds(0, 0, 624, 440);
		gameWindowPanel.add(cardRepresentationPanel1);

		cardRepresentationPanel1.setLayout(null);
		cardRepresentationPanel1.setBackground(new Color(0, 0, 0, 0));

		cardRepresentationPanel2.setLayout(null);
		cardRepresentationPanel2.setBackground(new Color(0, 0, 0, 0));
		cardRepresentationPanel2.setBounds(0, 0, 624, 440);
		gameWindowPanel.add(cardRepresentationPanel2);
		cardRepresentationPanel2.setVisible(false);
	
		cardRepresentationPanel3.setLayout(null);
		cardRepresentationPanel3.setBackground(new Color(0, 0, 0, 0));
		cardRepresentationPanel3.setBounds(0, 0, 624, 440);
		gameWindowPanel.add(cardRepresentationPanel3);
		cardRepresentationPanel3.setVisible(false);		

		playButton.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/playButton.png")));
		playButton.setBounds(514, 178, 100, 40);
		selectedCardPanel.add(playButton);
		
		panel1arrowRight.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/arrowRight.png")));
		panel1arrowRight.setBounds(481, 393, 46, 48);
		panel1arrowRight.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel1.add(panel1arrowRight);
		
		panel2arrowLeft.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/arrowLeft.png")));
		panel2arrowLeft.setBounds(71, 393, 46, 48);
		panel2arrowLeft.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel2.add(panel2arrowLeft);
		
		panel2arrowRight.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/arrowRight.png")));
		panel2arrowRight.setBounds(481, 393, 46, 48);
		panel2arrowRight.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel2.add(panel2arrowRight);
		
		
		panel3arrowLeft.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/arrowLeft.png")));
		panel3arrowLeft.setBounds(71, 393, 46, 48);
		panel3arrowLeft.setMargin(new Insets(0, 0, 0, 0));

		cardRepresentationPanel3.add(panel3arrowLeft);
		
		
		adam.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/adam.jpg")));
		adam.setBounds(20, 11, 80, 111);
		cardRepresentationPanel1.add(adam);
		
		ancientracoon.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/ancientracoon.jpg")));
		ancientracoon.setBounds(120, 11, 80, 111);
		cardRepresentationPanel1.add(ancientracoon);
		
		atmosphere.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/atmosphere.jpg")));
		atmosphere.setBounds(221, 11, 80, 111);
		cardRepresentationPanel1.add(atmosphere);
		
		buriedarmy.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/buriedarmy.jpg")));
		buriedarmy.setBounds(324, 11, 80, 111);
		cardRepresentationPanel1.add(buriedarmy);
		
		champ.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/champ.jpg")));
		champ.setBounds(422, 11, 80, 111);
		cardRepresentationPanel1.add(champ);
		
		dolza.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/dolza.jpg")));
		dolza.setBounds(522, 11, 80, 111);
		cardRepresentationPanel1.add(dolza);
		
		earthhole.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/earthhole.jpg")));
		earthhole.setBounds(20, 138, 80, 111);
		cardRepresentationPanel1.add(earthhole);
		
		earthquake.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/earthquake.jpg")));
		earthquake.setBounds(120, 138, 80, 111);
		cardRepresentationPanel1.add(earthquake);

		eclipse.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/eclipse.jpg")));
		eclipse.setBounds(221, 138, 80, 111);
		cardRepresentationPanel1.add(eclipse);

		elderdynosaur.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/elderdynosaur.jpg")));
		elderdynosaur.setBounds(324, 138, 80, 111);
		cardRepresentationPanel1.add(elderdynosaur);

		embedded.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/embedded.jpg")));
		embedded.setBounds(422, 138, 80, 111);
		cardRepresentationPanel1.add(embedded);

		fatlord.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/fatlord.jpg")));
		fatlord.setBounds(522, 138, 80, 111);
		cardRepresentationPanel1.add(fatlord);

		formofmud.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/formofmud.jpg")));
		formofmud.setBounds(20, 264, 80, 111);
		cardRepresentationPanel1.add(formofmud);

		fornax.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/fornax.jpg")));
		fornax.setBounds(120, 264, 80, 111);
		cardRepresentationPanel1.add(fornax);

		gortag.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/gortag.jpg")));
		gortag.setBounds(221, 264, 80, 111);
		cardRepresentationPanel1.add(gortag);

		greatabsorbation.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/greatabsorbation.jpg")));
		greatabsorbation.setBounds(324, 264, 80, 111);
		cardRepresentationPanel1.add(greatabsorbation);

		groundshaker.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/groundshaker.jpg")));
		groundshaker.setBounds(422, 264, 80, 111);
		cardRepresentationPanel1.add(groundshaker);

		gruntag.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/gruntag.jpg")));
		gruntag.setBounds(522, 264, 80, 111);
		cardRepresentationPanel1.add(gruntag);

		guardianofgolems.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/guardianofgolems.jpg")));
		guardianofgolems.setBounds(20, 11, 80, 111);
		cardRepresentationPanel2.add(guardianofgolems);

		hpbonus.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/hpbonus.jpg")));
		hpbonus.setBounds(120, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus);

		hpbonus2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/hpbonus2.jpg")));
		hpbonus2.setBounds(221, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus2);

		hpbonus3.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/hpbonus3.jpg")));
		hpbonus3.setBounds(324, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus3);

		hpbonus4.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/hpbonus4.jpg")));
		hpbonus4.setBounds(422, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus4);

		hpbonus5.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/hpbonus5.jpg")));
		hpbonus5.setBounds(522, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus5);
		
		kraken.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/kraken.jpg")));
		kraken.setBounds(20, 138, 80, 111);
		cardRepresentationPanel2.add(kraken);

		lieutenantturtle.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/lieutenantturtle.jpg")));
		lieutenantturtle.setBounds(120, 138, 80, 111);
		cardRepresentationPanel2.add(lieutenantturtle);

		lycanranger.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/lycanranger.jpg")));
		lycanranger.setBounds(221, 138, 80, 111);
		cardRepresentationPanel2.add(lycanranger);

		manabonus.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/manabonus.jpg")));
		manabonus.setBounds(324, 138, 80, 111);
		cardRepresentationPanel2.add(manabonus);

		manofdust.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/manofdust.jpg")));
		manofdust.setBounds(422, 138, 80, 111);
		cardRepresentationPanel2.add(manofdust);

		meteora.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/meteora.jpg")));
		meteora.setBounds(522, 138, 80, 111);
		cardRepresentationPanel2.add(meteora);

		nuxia.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/nuxia.jpg")));
		nuxia.setBounds(20, 264, 80, 111);
		cardRepresentationPanel2.add(nuxia);

		reflection.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/reflection.jpg")));
		reflection.setBounds(120, 264, 80, 111);
		cardRepresentationPanel2.add(reflection);

		reflection2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/reflection2.jpg")));
		reflection2.setBounds(221, 264, 80, 111);
		cardRepresentationPanel2.add(reflection2);

		rhachor.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/rhachor.jpg")));
		rhachor.setBounds(324, 264, 80, 111);
		cardRepresentationPanel2.add(rhachor);

		robotsoldier.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/robotsoldier.jpg")));
		robotsoldier.setBounds(422, 264, 80, 111);
		cardRepresentationPanel2.add(robotsoldier);

		rocky.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/rocky.jpg")));
		rocky.setBounds(522, 264, 80, 111);
		cardRepresentationPanel2.add(rocky);

		rorox.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/rorox.jpg")));
		rorox.setBounds(20, 11, 80, 111);
		cardRepresentationPanel3.add(rorox);

		rustybull.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/rustybull.jpg")));
		rustybull.setBounds(120, 11, 80, 111);
		cardRepresentationPanel3.add(rustybull);

		shaker.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/shaker.jpg")));
		shaker.setBounds(221, 11, 80, 111);
		cardRepresentationPanel3.add(shaker);

		shieldofbereth.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/shieldofbereth.jpg")));
		shieldofbereth.setBounds(324, 11, 80, 111);
		cardRepresentationPanel3.add(shieldofbereth);

		skorka.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/skorka.jpg")));
		skorka.setBounds(422, 11, 80, 111);
		cardRepresentationPanel3.add(skorka);

		sorktangthesleepy.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/earth/sorktangthesleepy.jpg")));
		sorktangthesleepy.setBounds(522, 11, 80, 111);
		cardRepresentationPanel3.add(sorktangthesleepy);

		splitter.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/splitter.jpg")));
		splitter.setBounds(20, 138, 80, 111);
		cardRepresentationPanel3.add(splitter);

		stuckinthesand.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/stuckinthesand.jpg")));
		stuckinthesand.setBounds(120, 138, 80, 111);
		cardRepresentationPanel3.add(stuckinthesand);

		thegreatmammoth.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/thegreatmammoth.jpg")));
		thegreatmammoth.setBounds(221, 138, 80, 111);
		cardRepresentationPanel3.add(thegreatmammoth);

		trochkar.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/trochkar.jpg")));
		trochkar.setBounds(324, 138, 80, 111);
		cardRepresentationPanel3.add(trochkar);

		untouchable.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/untouchable.jpg")));
		untouchable.setBounds(422, 138, 80, 111);
		cardRepresentationPanel3.add(untouchable);

		zildar.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/earth/zildar.jpg")));
		zildar.setBounds(522, 138, 80, 111);
		cardRepresentationPanel3.add(zildar);

		adam.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/adamb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ancientracoon.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/ancientracoonb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		atmosphere.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/atmosphereb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		buriedarmy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/buriedarmyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		champ.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/champb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		dolza.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/dolzab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		earthhole.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/earthholeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		earthquake.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/earthquakeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		eclipse.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/eclipseb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		elderdynosaur.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/elderdynosaurb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		embedded.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/embeddedb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fatlord.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/fatlordb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		formofmud.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/formofmudb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fornax.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/fornaxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		gortag.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/gortagb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		greatabsorbation.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/greatabsorbationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		groundshaker.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/groundshakerb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		gruntag.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/gruntagb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		guardianofgolems.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/guardianofgolemsb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/hpbonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/hpbonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/hpbonus3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/hpbonus4b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/hpbonus5b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		kraken.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/krakenb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		lieutenantturtle.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/lieutenantturtleb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		lycanranger.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/lycanrangerb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/manabonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manofdust.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/manofdustb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		meteora.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/meteorab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		nuxia.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/nuxiab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		reflection.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/reflectionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		reflection2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/reflection2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		rhachor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/rhachorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		robotsoldier.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/robotsoldierb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rocky.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/rockyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rorox.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/roroxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rustybull.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/rustybullb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shaker.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/shakerb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shieldofbereth.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/shieldofberethb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		skorka.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/skorkab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sorktangthesleepy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/sorktangthesleepyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		splitter.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/splitterb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		stuckinthesand.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/stuckinthesandb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thegreatmammoth.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/thegreatmammothb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		trochkar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/trochkarb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		untouchable.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/untouchableb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		zildar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/earth/zildarb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

	}
}

class ImagePanel extends JPanel {

	private Image img;

	public ImagePanel(ImageIcon imageIcon) {
		this(new ImageIcon().getImage());
	}

	public ImagePanel(Image img) {
		this.img = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}
