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

public class NatureDeckCardChoosingFrame {

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

	private static int key = 0;
	private static final JButton[] selectedCards = new JButton[12];
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

	private static final JButton bangurath = new JButton();
	private static final JButton belutax = new JButton();
	private static final JButton callofnature = new JButton();
	private static final JButton centaur = new JButton();
	private static final JButton charm = new JButton();
	private static final JButton corruption = new JButton();
	private static final JButton deeproots = new JButton();
	private static final JButton elvengirl = new JButton();
	private static final JButton fathurux = new JButton();
	private static final JButton forestgin = new JButton();
	private static final JButton greatcare = new JButton();
	private static final JButton greenhippi = new JButton();
	private static final JButton halusination = new JButton();
	private static final JButton harmonicconvergence = new JButton();
	private static final JButton hpbonus = new JButton();
	private static final JButton hpbonus2 = new JButton();
	private static final JButton hpbonus3 = new JButton();
	private static final JButton hpbonus4 = new JButton();
	private static final JButton hpregeneration = new JButton();
	private static final JButton hurrican = new JButton();
	private static final JButton ladytheforest = new JButton();
	private static final JButton liquidleaves = new JButton();
	private static final JButton magicmushroom = new JButton();
	private static final JButton malfurion = new JButton();
	private static final JButton manabonus = new JButton();
	private static final JButton manabonus2 = new JButton();
	private static final JButton manaregeneration = new JButton();
	private static final JButton manaregeneration2 = new JButton();
	private static final JButton manaregeneration3 = new JButton();
	private static final JButton motherofnature = new JButton();
	private static final JButton mrcrocodile = new JButton();
	private static final JButton naturalzombie = new JButton();
	private static final JButton naturalzone = new JButton();
	private static final JButton naturetransporter = new JButton();
	private static final JButton protectoroftherealm = new JButton();
	private static final JButton rangerofthevalley = new JButton();
	private static final JButton rebirth = new JButton();
	private static final JButton rootsinthedeep = new JButton();
	private static final JButton rotrek = new JButton();
	private static final JButton shepherd = new JButton();
	private static final JButton shieldofnature = new JButton();
	private static final JButton solidarity = new JButton();
	private static final JButton souloflife = new JButton();
	private static final JButton spiritoftheforest = new JButton();
	private static final JButton stoyax = new JButton();
	private static final JButton thc = new JButton();
	private static final JButton thealmighty = new JButton();
	private static final JButton thegreathoot = new JButton();
	private static final JButton timesofdinosaurs = new JButton();
	private static final JButton treeboy = new JButton();
	private static final JButton undyingspirit = new JButton();
	private static final JButton weezy = new JButton();
	private static final JButton whole = new JButton();
	private static final JButton woodenwoman = new JButton();

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void CardChoosingFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/naturedeckbackground.jpg"))
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
		
		selectedCard1.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard1.setBounds(75, 11, 80, 111);
		
		selectedCardPanel.add(selectedCard1);
		selectedCard2.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard2.setBounds(122, 11, 80, 111);

		selectedCardPanel.add(selectedCard2);
		selectedCard3.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard3.setBounds(165, 11, 80, 111);

		selectedCardPanel.add(selectedCard3);
		selectedCard4.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard4.setBounds(212, 11, 80, 111);

		selectedCardPanel.add(selectedCard4);
		selectedCard5.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard5.setBounds(255, 11, 80, 111);

		selectedCardPanel.add(selectedCard5);
		selectedCard6.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard6.setBounds(302, 11, 80, 111);

		selectedCardPanel.add(selectedCard6);
		selectedCard7.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard7.setBounds(345, 11, 80, 111);

		selectedCardPanel.add(selectedCard7);
		selectedCard8.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		selectedCard8.setBounds(392, 11, 80, 111);

		
		selectedCards[0] = selectedCard1;
		selectedCards[1] = selectedCard2;
		selectedCards[2] = selectedCard3;
		selectedCards[3] = selectedCard4;
		selectedCards[4] = selectedCard5;
		selectedCards[5] = selectedCard6;
		selectedCards[6] = selectedCard7;
		selectedCards[7] = selectedCard8;
		selectedCards[8] = replacementCard1;
		selectedCards[9] = replacementCard2;
		selectedCards[10] = replacementCard3;
		selectedCards[11] = replacementCard4;
						
		selectedCardPanel.add(selectedCard8);
		
		replacementCard1.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		replacementCard1.setBounds(75, 129, 80, 111);
		selectedCardPanel.add(replacementCard1);
		
		replacementCard2.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		replacementCard2.setBounds(122, 129, 80, 111);
		selectedCardPanel.add(replacementCard2);
		
		replacementCard3.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		replacementCard3.setBounds(165, 129, 80, 111);
		selectedCardPanel.add(replacementCard3);
		
		replacementCard4.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class.getResource("/images/backofdeck.png")));
		replacementCard4.setBounds(212, 129, 80, 111);
		selectedCardPanel.add(replacementCard4);
		
		
		selectedCard1.setVisible(true);
		selectedCard2.setVisible(true);
		selectedCard3.setVisible(true);
		selectedCard4.setVisible(true);
		selectedCard5.setVisible(true);
		selectedCard6.setVisible(true);
		selectedCard7.setVisible(true);
		selectedCard8.setVisible(true);
		replacementCard1.setVisible(true);
		replacementCard2.setVisible(true);
		replacementCard3.setVisible(true);
		replacementCard4.setVisible(true);

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

		playButton.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/playButton.png")));
		playButton.setBounds(514, 178, 100, 40);
		selectedCardPanel.add(playButton);
		
		panel1arrowRight.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/arrowRight.png")));
		panel1arrowRight.setBounds(481, 393, 46, 48);
		panel1arrowRight.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel1.add(panel1arrowRight);
		
		panel2arrowLeft.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/arrowLeft.png")));
		panel2arrowLeft.setBounds(71, 393, 46, 48);
		panel2arrowLeft.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel2.add(panel2arrowLeft);
		
		panel2arrowRight.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/arrowRight.png")));
		panel2arrowRight.setBounds(481, 393, 46, 48);
		panel2arrowRight.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel2.add(panel2arrowRight);
		
		
		panel3arrowLeft.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/arrowLeft.png")));
		panel3arrowLeft.setBounds(71, 393, 46, 48);
		panel3arrowLeft.setMargin(new Insets(0, 0, 0, 0));

		cardRepresentationPanel3.add(panel3arrowLeft);

		bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/bangurath.jpg")));
		bangurath.setBounds(20, 11, 80, 111);
		cardRepresentationPanel1.add(bangurath);

		belutax.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/belutax.jpg")));
		belutax.setBounds(120, 11, 80, 111);
		cardRepresentationPanel1.add(belutax);

		callofnature.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/callofnature.jpg")));
		callofnature.setBounds(221, 11, 80, 111);
		cardRepresentationPanel1.add(callofnature);

		centaur.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/centaur.jpg")));
		centaur.setBounds(324, 11, 80, 111);
		cardRepresentationPanel1.add(centaur);

		charm.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/charm.jpg")));
		charm.setBounds(422, 11, 80, 111);
		cardRepresentationPanel1.add(charm);

		corruption.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/corruption.jpg")));
		corruption.setBounds(522, 11, 80, 111);
		cardRepresentationPanel1.add(corruption);

		deeproots.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/deeproots.jpg")));
		deeproots.setBounds(20, 138, 80, 111);
		cardRepresentationPanel1.add(deeproots);

		elvengirl.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/elvengirl.jpg")));
		elvengirl.setBounds(120, 138, 80, 111);
		cardRepresentationPanel1.add(elvengirl);

		fathurux.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/fathurux.jpg")));
		fathurux.setBounds(221, 138, 80, 111);
		cardRepresentationPanel1.add(fathurux);

		forestgin.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/forestgin.jpg")));
		forestgin.setBounds(324, 138, 80, 111);
		cardRepresentationPanel1.add(forestgin);

		greatcare.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/greatcare.jpg")));
		greatcare.setBounds(422, 138, 80, 111);
		cardRepresentationPanel1.add(greatcare);

		greenhippi.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/greenhippi.jpg")));
		greenhippi.setBounds(522, 138, 80, 111);
		cardRepresentationPanel1.add(greenhippi);

		halusination.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/halusination.jpg")));
		halusination.setBounds(20, 264, 80, 111);
		cardRepresentationPanel1.add(halusination);

		harmonicconvergence
				.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/harmonicconvergence.jpg")));
		harmonicconvergence.setBounds(120, 264, 80, 111);
		cardRepresentationPanel1.add(harmonicconvergence);

		hpbonus.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/hpbonus.jpg")));
		hpbonus.setBounds(221, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus);

		hpbonus2.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/hpbonus2.jpg")));
		hpbonus2.setBounds(324, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus2);

		hpbonus3.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/hpbonus3.jpg")));
		hpbonus3.setBounds(422, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus3);

		hpbonus4.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/hpbonus4.jpg")));
		hpbonus4.setBounds(522, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus4);

		hpregeneration.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/hpregeneration.jpg")));
		hpregeneration.setBounds(20, 11, 80, 111);
		cardRepresentationPanel2.add(hpregeneration);

		hurrican.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/hurrican.jpg")));
		hurrican.setBounds(120, 11, 80, 111);
		cardRepresentationPanel2.add(hurrican);

		ladytheforest.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/ladytheforest.jpg")));
		ladytheforest.setBounds(221, 11, 80, 111);
		cardRepresentationPanel2.add(ladytheforest);

		liquidleaves.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/liquidleaves.jpg")));
		liquidleaves.setBounds(324, 11, 80, 111);
		cardRepresentationPanel2.add(liquidleaves);

		magicmushroom.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/magicmushroom.jpg")));
		magicmushroom.setBounds(422, 11, 80, 111);
		cardRepresentationPanel2.add(magicmushroom);

		malfurion.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/malfurion.jpg")));
		malfurion.setBounds(522, 11, 80, 111);
		cardRepresentationPanel2.add(malfurion);

		manabonus.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/manabonus.jpg")));
		manabonus.setBounds(20, 138, 80, 111);
		cardRepresentationPanel2.add(manabonus);

		manabonus2.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/manabonus2.jpg")));
		manabonus2.setBounds(120, 138, 80, 111);
		cardRepresentationPanel2.add(manabonus2);

		manaregeneration.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/manaregeneration.jpg")));
		manaregeneration.setBounds(221, 138, 80, 111);
		cardRepresentationPanel2.add(manaregeneration);

		manaregeneration2.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/manaregeneration2.jpg")));
		manaregeneration2.setBounds(324, 138, 80, 111);
		cardRepresentationPanel2.add(manaregeneration2);

		manaregeneration3.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/manaregeneration3.jpg")));
		manaregeneration3.setBounds(422, 138, 80, 111);
		cardRepresentationPanel2.add(manaregeneration3);

		motherofnature.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/motherofnature.jpg")));
		motherofnature.setBounds(522, 138, 80, 111);
		cardRepresentationPanel2.add(motherofnature);

		mrcrocodile.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/mrcrocodile.jpg")));
		mrcrocodile.setBounds(20, 264, 80, 111);
		cardRepresentationPanel2.add(mrcrocodile);

		naturalzombie.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/naturalzombie.jpg")));
		naturalzombie.setBounds(120, 264, 80, 111);
		cardRepresentationPanel2.add(naturalzombie);

		naturalzone.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/naturalzone.jpg")));
		naturalzone.setBounds(221, 264, 80, 111);
		cardRepresentationPanel2.add(naturalzone);

		naturetransporter.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/naturetransporter.jpg")));
		naturetransporter.setBounds(324, 264, 80, 111);
		cardRepresentationPanel2.add(naturetransporter);

		protectoroftherealm
				.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/protectoroftherealm.jpg")));
		protectoroftherealm.setBounds(422, 264, 80, 111);
		cardRepresentationPanel2.add(protectoroftherealm);

		rangerofthevalley.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/rangerofthevalley.jpg")));
		rangerofthevalley.setBounds(522, 264, 80, 111);
		cardRepresentationPanel2.add(rangerofthevalley);

		rebirth.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/rebirth.jpg")));
		rebirth.setBounds(20, 11, 80, 111);
		cardRepresentationPanel3.add(rebirth);

		rootsinthedeep.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/rootsinthedeep.jpg")));
		rootsinthedeep.setBounds(120, 11, 80, 111);
		cardRepresentationPanel3.add(rootsinthedeep);

		rotrek.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/rotrek.jpg")));
		rotrek.setBounds(221, 11, 80, 111);
		cardRepresentationPanel3.add(rotrek);

		shepherd.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/shepherd.jpg")));
		shepherd.setBounds(324, 11, 80, 111);
		cardRepresentationPanel3.add(shepherd);

		shieldofnature.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/shieldofnature.jpg")));
		shieldofnature.setBounds(422, 11, 80, 111);
		cardRepresentationPanel3.add(shieldofnature);

		solidarity.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/solidarity.jpg")));
		solidarity.setBounds(522, 11, 80, 111);
		cardRepresentationPanel3.add(solidarity);

		souloflife.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/souloflife.jpg")));
		souloflife.setBounds(20, 138, 80, 111);
		cardRepresentationPanel3.add(souloflife);

		spiritoftheforest.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/spiritoftheforest.jpg")));
		spiritoftheforest.setBounds(120, 138, 80, 111);
		cardRepresentationPanel3.add(spiritoftheforest);

		stoyax.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/stoyax.jpg")));
		stoyax.setBounds(221, 138, 80, 111);
		cardRepresentationPanel3.add(stoyax);

		thc.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/thc.jpg")));
		thc.setBounds(324, 138, 80, 111);
		cardRepresentationPanel3.add(thc);

		thealmighty.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/thealmighty.jpg")));
		thealmighty.setBounds(422, 138, 80, 111);
		cardRepresentationPanel3.add(thealmighty);

		thegreathoot.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/thegreathoot.jpg")));
		thegreathoot.setBounds(522, 138, 80, 111);
		cardRepresentationPanel3.add(thegreathoot);

		timesofdinosaurs.setIcon(new ImageIcon(
				NatureDeckCardChoosingFrame.class
						.getResource("/images/nature/timesofdinosaurs.jpg")));
		timesofdinosaurs.setBounds(20, 264, 80, 111);
		cardRepresentationPanel3.add(timesofdinosaurs);

		treeboy.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/treeboy.jpg")));
		treeboy.setBounds(120, 264, 80, 111);
		cardRepresentationPanel3.add(treeboy);

		undyingspirit.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/undyingspirit.jpg")));
		undyingspirit.setBounds(221, 264, 80, 111);
		cardRepresentationPanel3.add(undyingspirit);

		weezy.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/weezy.jpg")));
		weezy.setBounds(324, 264, 80, 111);
		cardRepresentationPanel3.add(weezy);

		whole.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/whole.jpg")));
		whole.setBounds(422, 264, 80, 111);
		cardRepresentationPanel3.add(whole);

		woodenwoman.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
				.getResource("/images/nature/woodenwoman.jpg")));
		woodenwoman.setBounds(522, 264, 80, 111);
		cardRepresentationPanel3.add(woodenwoman);

		bangurath.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/bangurathb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		belutax.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/belutaxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		callofnature.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/callofnatureb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		centaur.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/centaurb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		charm.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/charmb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		corruption.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/corruptionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		deeproots.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/deeprootsb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		elvengirl.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/elvengirlb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fathurux.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/fathuruxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		forestgin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/forestginb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		greatcare.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/greatcareb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		greenhippi.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/greenhippib.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		halusination.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/halusinationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		harmonicconvergence.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/harmonicconvergenceb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus4b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpregeneration.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpregenerationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hurrican.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hurricanb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ladytheforest.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/ladytheforestb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		liquidleaves.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/liquidleavesb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		magicmushroom.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/magicmushroomb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		malfurion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/malfurionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manabonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manabonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manaregenerationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		manaregeneration2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manaregeneration2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manaregeneration3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		motherofnature.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/motherofnatureb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		mrcrocodile.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/mrcrocodileb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		naturalzombie.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/naturalzombieb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		naturalzone.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/naturalzoneb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		naturetransporter.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/naturetransporterb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		protectoroftherealm.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/protectoroftherealmb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rangerofthevalley.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rangerofthevalleyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rebirth.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rebirthb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rootsinthedeep.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rootsinthedeepb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rotrek.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rotrekb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shepherd.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/shepherdb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shieldofnature.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/shieldofnatureb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		solidarity.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/solidarityb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		souloflife.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/souloflifeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		spiritoftheforest.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/spiritoftheforestb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		stoyax.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/stoyaxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thc.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/thcb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thealmighty.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/thealmightyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thegreathoot.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/thegreathootb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		timesofdinosaurs.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/timesofdinosaursb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		treeboy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/treeboyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		undyingspirit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/undyingspiritb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		weezy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/weezyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		whole.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/wholeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		woodenwoman.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/woodenwomanb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		
		bangurath.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/bangurath.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		
		belutax.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/belutax.jpg")));
				selectedCard1.setVisible(true);
				key++;
				belutax.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		callofnature.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/callofnature.jpg")));
				selectedCard1.setVisible(true);
				key++;
				callofnature.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		centaur.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/centaur.jpg")));
				selectedCard1.setVisible(true);
				key++;
				centaur.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		charm.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/charm.jpg")));
				selectedCard1.setVisible(true);
				key++;
				charm.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		corruption.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/corruption.jpg")));
				selectedCard1.setVisible(true);
				key++;
				corruption.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		deeproots.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/deeproots.jpg")));
				selectedCard1.setVisible(true);
				key++;
				deeproots.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		elvengirl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/elvengirl.jpg")));
				selectedCard1.setVisible(true);
				key++;
				elvengirl.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		fathurux.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/fathurux.jpg")));
				selectedCard1.setVisible(true);
				key++;
				fathurux.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		forestgin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/forestgin.jpg")));
				selectedCard1.setVisible(true);
				key++;
				forestgin.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		greatcare.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/greatcare.jpg")));
				selectedCard1.setVisible(true);
				key++;
				greatcare.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		greenhippi.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/greenhippi.jpg")));
				selectedCard1.setVisible(true);
				key++;
				greenhippi.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		halusination.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/halusination.jpg")));
				selectedCard1.setVisible(true);
				key++;
				halusination.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		harmonicconvergence.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/harmonicconvergence.jpg")));
				selectedCard1.setVisible(true);
				key++;
				harmonicconvergence.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus2.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus3.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpbonus4.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus4.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpregeneration.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hpregeneration.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpregeneration.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hurrican.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/hurrican.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hurrican.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		ladytheforest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/ladytheforest.jpg")));
				selectedCard1.setVisible(true);
				key++;
				ladytheforest.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		liquidleaves.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/liquidleaves.jpg")));
				selectedCard1.setVisible(true);
				key++;
				liquidleaves.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		magicmushroom.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/magicmushroom.jpg")));
				selectedCard1.setVisible(true);
				key++;
				magicmushroom.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		malfurion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/malfurion.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manabonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manabonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manaregeneration.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manaregeneration.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});

		manaregeneration2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manaregeneration2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration2.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		manaregeneration3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/manaregeneration3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration3.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		motherofnature.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/motherofnature.jpg")));
				selectedCard1.setVisible(true);
				key++;
				motherofnature.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		mrcrocodile.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/mrcrocodile.jpg")));
				selectedCard1.setVisible(true);
				key++;
				mrcrocodile.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		naturalzombie.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/naturalzombie.jpg")));
				selectedCard1.setVisible(true);
				key++;
				naturalzombie.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		naturalzone.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/naturalzone.jpg")));
				selectedCard1.setVisible(true);
				key++;
				naturalzone.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});

		naturetransporter.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/naturetransporter.jpg")));
				selectedCard1.setVisible(true);
				key++;
				naturetransporter.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		protectoroftherealm.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/protectoroftherealm.jpg")));
				selectedCard1.setVisible(true);
				key++;
				protectoroftherealm.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		rangerofthevalley.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rangerofthevalley.jpg")));
				selectedCard1.setVisible(true);
				key++;
				rangerofthevalley.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		rebirth.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rebirth.jpg")));
				selectedCard1.setVisible(true);
				key++;
				rebirth.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		rootsinthedeep.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rootsinthedeep.jpg")));
				selectedCard1.setVisible(true);
				key++;
				rootsinthedeep.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		rotrek.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/rotrek.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		shepherd.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/shepherd.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		shieldofnature.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/shieldofnature.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		solidarity.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/solidarity.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		souloflife.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/souloflife.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		spiritoftheforest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/spiritoftheforest.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bangurath.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		stoyax.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/stoyax.jpg")));
				selectedCard1.setVisible(true);
				key++;
				stoyax.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		thc.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/thc.jpg")));
				selectedCard1.setVisible(true);
				key++;
				thc.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		thealmighty.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/thealmighty.jpg")));
				selectedCard1.setVisible(true);
				key++;
				thealmighty.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		thegreathoot.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/thegreathoot.jpg")));
				selectedCard1.setVisible(true);
				key++;
				thegreathoot.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		timesofdinosaurs.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/timesofdinosaurs.jpg")));
				selectedCard1.setVisible(true);
				key++;
				timesofdinosaurs.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		treeboy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/treeboy.jpg")));
				selectedCard1.setVisible(true);
				key++;
				treeboy.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		undyingspirit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/undyingspirit.jpg")));
				selectedCard1.setVisible(true);
				key++;
				undyingspirit.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		weezy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/weezy.jpg")));
				selectedCard1.setVisible(true);
				key++;
				weezy.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		whole.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/whole.jpg")));
				selectedCard1.setVisible(true);
				key++;
				whole.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		woodenwoman.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						NatureDeckCardChoosingFrame.class
								.getResource("/images/nature/woodenwoman.jpg")));
				selectedCard1.setVisible(true);
				key++;
				woodenwoman.setIcon(new ImageIcon(NatureDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});

	}
}
