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

public class FireDeckCardChoosingFrame {

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

	private static final JButton angelofvutrag = new JButton();
	private static final JButton burningaemadillo = new JButton();
	private static final JButton criticaldamage = new JButton();
	private static final JButton danceoffire = new JButton();
	private static final JButton deerthemightest = new JButton();
	private static final JButton dragonofflames = new JButton();
	private static final JButton elderreptile = new JButton();
	private static final JButton explosion = new JButton();
	private static final JButton firearmor = new JButton();
	private static final JButton firegolem = new JButton();
	private static final JButton firewall = new JButton();
	private static final JButton firewolf = new JButton();
	private static final JButton flamefusion = new JButton();
	private static final JButton flameguard = new JButton();
	private static final JButton flamethrower = new JButton();
	private static final JButton frodo = new JButton();
	private static final JButton furcius = new JButton();
	private static final JButton ginger = new JButton();
	private static final JButton hot = new JButton();
	private static final JButton hpbonus = new JButton();
	private static final JButton hpbonus2 = new JButton();
	private static final JButton hpbonus3 = new JButton();
	private static final JButton hyusha = new JButton();
	private static final JButton iseeyou = new JButton();
	private static final JButton kingofthumbor = new JButton();
	private static final JButton kingofwrath = new JButton();
	private static final JButton knightofthumbor = new JButton();
	private static final JButton kockhar = new JButton();
	private static final JButton lava = new JButton();
	private static final JButton litmua = new JButton();
	private static final JButton lordofflames = new JButton();
	private static final JButton manabonus = new JButton();
	private static final JButton manabonus2 = new JButton();
	private static final JButton meanor = new JButton();
	private static final JButton nomercy = new JButton();
	private static final JButton patrux = new JButton();
	private static final JButton presence = new JButton();
	private static final JButton realburst = new JButton();
	private static final JButton sengard = new JButton();
	private static final JButton sheila = new JButton();
	private static final JButton shieldinflames = new JButton();
	private static final JButton sindor = new JButton();
	private static final JButton skyscream = new JButton();
	private static final JButton thisgirlisonfire = new JButton();
	private static final JButton ticano = new JButton();
	private static final JButton turcox = new JButton();
	private static final JButton welder = new JButton();

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void CardChoosingFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/firedeckbackground.jpg"))
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

		selectedCard1.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard1.setBounds(75, 11, 80, 111);

		selectedCardPanel.add(selectedCard1);
		selectedCard2.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard2.setBounds(122, 11, 80, 111);

		selectedCardPanel.add(selectedCard2);
		selectedCard3.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard3.setBounds(165, 11, 80, 111);

		selectedCardPanel.add(selectedCard3);
		selectedCard4.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard4.setBounds(212, 11, 80, 111);

		selectedCardPanel.add(selectedCard4);
		selectedCard5.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard5.setBounds(255, 11, 80, 111);

		selectedCardPanel.add(selectedCard5);
		selectedCard6.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard6.setBounds(302, 11, 80, 111);

		selectedCardPanel.add(selectedCard6);
		selectedCard7.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		selectedCard7.setBounds(345, 11, 80, 111);

		selectedCardPanel.add(selectedCard7);
		selectedCard8.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
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

		replacementCard1.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		replacementCard1.setBounds(75, 129, 80, 111);
		selectedCardPanel.add(replacementCard1);

		replacementCard2.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		replacementCard2.setBounds(122, 129, 80, 111);
		selectedCardPanel.add(replacementCard2);

		replacementCard3.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
		replacementCard3.setBounds(165, 129, 80, 111);
		selectedCardPanel.add(replacementCard3);

		replacementCard4.setIcon(new ImageIcon(EarthDeckCardChoosingFrame.class
				.getResource("/images/backofdeck.png")));
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

		angelofvutrag.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/angelofvutrag.jpg")));
		angelofvutrag.setBounds(20, 11, 80, 111);
		cardRepresentationPanel1.add(angelofvutrag);

		burningaemadillo.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/burningaemadillo.jpg")));
		burningaemadillo.setBounds(120, 11, 80, 111);
		cardRepresentationPanel1.add(burningaemadillo);

		criticaldamage.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/criticaldamage.jpg")));
		criticaldamage.setBounds(221, 11, 80, 111);
		cardRepresentationPanel1.add(criticaldamage);

		danceoffire.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/danceoffire.jpg")));
		danceoffire.setBounds(324, 11, 80, 111);
		cardRepresentationPanel1.add(danceoffire);

		deerthemightest.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/deerthemightest.jpg")));
		deerthemightest.setBounds(422, 11, 80, 111);
		cardRepresentationPanel1.add(deerthemightest);

		dragonofflames.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/dragonofflames.jpg")));
		dragonofflames.setBounds(522, 11, 80, 111);
		cardRepresentationPanel1.add(dragonofflames);

		elderreptile.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/elderreptile.jpg")));
		elderreptile.setBounds(20, 138, 80, 111);
		cardRepresentationPanel1.add(elderreptile);

		explosion.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/explosion.jpg")));
		explosion.setBounds(120, 138, 80, 111);
		cardRepresentationPanel1.add(explosion);

		firearmor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/firearmor.jpg")));
		firearmor.setBounds(221, 138, 80, 111);
		cardRepresentationPanel1.add(firearmor);

		firegolem.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/firegolem.jpg")));
		firegolem.setBounds(324, 138, 80, 111);
		cardRepresentationPanel1.add(firegolem);

		firewall.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/firewall.jpg")));
		firewall.setBounds(422, 138, 80, 111);
		cardRepresentationPanel1.add(firewall);

		firewolf.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/firewolf.jpg")));
		firewolf.setBounds(522, 138, 80, 111);
		cardRepresentationPanel1.add(firewolf);

		flamefusion.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/flamefusion.jpg")));
		flamefusion.setBounds(20, 264, 80, 111);
		cardRepresentationPanel1.add(flamefusion);

		flameguard.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/flameguard.jpg")));
		flameguard.setBounds(120, 264, 80, 111);
		cardRepresentationPanel1.add(flameguard);

		flamethrower.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/flamethrower.jpg")));
		flamethrower.setBounds(221, 264, 80, 111);
		cardRepresentationPanel1.add(flamethrower);

		frodo.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/frodo.jpg")));
		frodo.setBounds(324, 264, 80, 111);
		cardRepresentationPanel1.add(frodo);

		furcius.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/furcius.jpg")));
		furcius.setBounds(422, 264, 80, 111);
		cardRepresentationPanel1.add(furcius);

		ginger.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/ginger.jpg")));
		ginger.setBounds(522, 264, 80, 111);
		cardRepresentationPanel1.add(ginger);

		hot.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/hot.jpg")));
		hot.setBounds(20, 11, 80, 111);
		cardRepresentationPanel2.add(hot);

		hpbonus.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/hpbonus.jpg")));
		hpbonus.setBounds(120, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus);

		hpbonus2.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/hpbonus2.jpg")));
		hpbonus2.setBounds(221, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus2);

		hpbonus3.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/hpbonus3.jpg")));
		hpbonus3.setBounds(324, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus3);

		hyusha.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/hyusha.jpg")));
		hyusha.setBounds(422, 11, 80, 111);
		cardRepresentationPanel2.add(hyusha);

		iseeyou.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/iseeyou.jpg")));
		iseeyou.setBounds(522, 11, 80, 111);
		cardRepresentationPanel2.add(iseeyou);

		kingofthumbor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/kingofthumbor.jpg")));
		kingofthumbor.setBounds(20, 138, 80, 111);
		cardRepresentationPanel2.add(kingofthumbor);

		kingofwrath.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/kingofwrath.jpg")));
		kingofwrath.setBounds(120, 138, 80, 111);
		cardRepresentationPanel2.add(kingofwrath);

		knightofthumbor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/knightofthumbor.jpg")));
		knightofthumbor.setBounds(221, 138, 80, 111);
		cardRepresentationPanel2.add(knightofthumbor);

		kockhar.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/kockhar.jpg")));
		kockhar.setBounds(324, 138, 80, 111);
		cardRepresentationPanel2.add(kockhar);

		lava.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/lava.jpg")));
		lava.setBounds(422, 138, 80, 111);
		cardRepresentationPanel2.add(lava);

		litmua.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/litmua.jpg")));
		litmua.setBounds(522, 138, 80, 111);
		cardRepresentationPanel2.add(litmua);

		lordofflames.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/lordofflames.jpg")));
		lordofflames.setBounds(20, 264, 80, 111);
		cardRepresentationPanel2.add(lordofflames);

		manabonus.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/manabonus.jpg")));
		manabonus.setBounds(120, 264, 80, 111);
		cardRepresentationPanel2.add(manabonus);

		manabonus2.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/manabonus2.jpg")));
		manabonus2.setBounds(221, 264, 80, 111);
		cardRepresentationPanel2.add(manabonus2);

		meanor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/meanor.jpg")));
		meanor.setBounds(324, 264, 80, 111);
		cardRepresentationPanel2.add(meanor);

		nomercy.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/nomercy.jpg")));
		nomercy.setBounds(422, 264, 80, 111);
		cardRepresentationPanel2.add(nomercy);

		patrux.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/patrux.jpg")));
		patrux.setBounds(522, 264, 80, 111);
		cardRepresentationPanel2.add(patrux);

		presence.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/presence.jpg")));
		presence.setBounds(20, 11, 80, 111);
		cardRepresentationPanel3.add(presence);

		realburst.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/realburst.jpg")));
		realburst.setBounds(120, 11, 80, 111);
		cardRepresentationPanel3.add(realburst);

		sengard.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/sengard.jpg")));
		sengard.setBounds(221, 11, 80, 111);
		cardRepresentationPanel3.add(sengard);

		sheila.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/sheila.jpg")));
		sheila.setBounds(324, 11, 80, 111);
		cardRepresentationPanel3.add(sheila);

		shieldinflames.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/shieldinflames.jpg")));
		shieldinflames.setBounds(422, 11, 80, 111);
		cardRepresentationPanel3.add(shieldinflames);

		sindor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/sindor.jpg")));
		sindor.setBounds(522, 11, 80, 111);
		cardRepresentationPanel3.add(sindor);

		skyscream.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/skyscream.jpg")));
		skyscream.setBounds(20, 138, 80, 111);
		cardRepresentationPanel3.add(skyscream);

		thisgirlisonfire.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/thisgirlisonfire.jpg")));
		thisgirlisonfire.setBounds(120, 138, 80, 111);
		cardRepresentationPanel3.add(thisgirlisonfire);

		ticano.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/ticano.jpg")));
		ticano.setBounds(221, 138, 80, 111);
		cardRepresentationPanel3.add(ticano);

		turcox.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/turcox.jpg")));
		turcox.setBounds(324, 138, 80, 111);
		cardRepresentationPanel3.add(turcox);

		welder.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
				.getResource("/images/fire/welder.jpg")));
		welder.setBounds(422, 138, 80, 111);
		cardRepresentationPanel3.add(welder);

		angelofvutrag.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/angelofvutragb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		burningaemadillo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/burningaemadillob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		criticaldamage.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/criticaldamageb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		danceoffire.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/danceoffireb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		deerthemightest.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/deerthemightestb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		dragonofflames.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/dragonofflamesb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		elderreptile.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/elderreptileb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		explosion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/explosionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		firearmor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firearmorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		firegolem.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firegolemb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		firewall.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firewallb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		firewolf.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firewolfb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		flamefusion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/flamefusionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		flameguard.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/flameguardb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		flamethrower.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/flamethrowerb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		frodo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/frodob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		furcius.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/furciusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ginger.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/gingerb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hot.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hotb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hpbonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hpbonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hpbonus3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hyusha.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hyushab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		iseeyou.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/iseeyoub.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		kingofthumbor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/kingofthumborb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		kingofwrath.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/kingofwrathb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		knightofthumbor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/knightofthumborb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		kockhar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/kockharb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		lava.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/lavab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		litmua.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/litmuab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		lordofflames.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/lordofflamesb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/manabonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/manabonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		meanor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/meanorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		nomercy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/nomercyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		patrux.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/patruxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		presence.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/presenceb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		realburst.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/realburstb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sengard.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/sengardb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sheila.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/sheilab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shieldinflames.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/shieldinflamesb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sindor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/sindorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		skyscream.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/skyscreamb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thisgirlisonfire.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/thisgirlisonfireb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ticano.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/ticanob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		turcox.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/turcoxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		welder.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/welderb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		angelofvutrag.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/angelofvutrag.jpg")));
				selectedCard1.setVisible(true);
				key++;
				angelofvutrag.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		burningaemadillo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/burningaemadillo.jpg")));
				selectedCard1.setVisible(true);
				key++;
				burningaemadillo.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		criticaldamage.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/criticaldamage.jpg")));
				selectedCard1.setVisible(true);
				key++;
				criticaldamage.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		danceoffire.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/danceoffire.jpg")));
				selectedCard1.setVisible(true);
				key++;
				danceoffire.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		deerthemightest.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/deerthemightest.jpg")));
				selectedCard1.setVisible(true);
				key++;
				deerthemightest.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		dragonofflames.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/dragonofflames.jpg")));
				selectedCard1.setVisible(true);
				key++;
				dragonofflames.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		elderreptile.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/elderreptile.jpg")));
				selectedCard1.setVisible(true);
				key++;
				elderreptile.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		explosion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/explosion.jpg")));
				selectedCard1.setVisible(true);
				key++;
				explosion.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}

		});
		firearmor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firearmor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				firearmor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		firegolem.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firegolem.jpg")));
				selectedCard1.setVisible(true);
				key++;
				firegolem.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		firewall.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firewall.jpg")));
				selectedCard1.setVisible(true);
				key++;
				firewall.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		firewolf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/firewolf.jpg")));
				selectedCard1.setVisible(true);
				key++;
				firewolf.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		flamefusion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/flamefusion.jpg")));
				selectedCard1.setVisible(true);
				key++;
				flamefusion.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		flameguard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/flameguard.jpg")));
				selectedCard1.setVisible(true);
				key++;
				flameguard.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		flamethrower.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/flamethrower.jpg")));
				selectedCard1.setVisible(true);
				key++;
				flamethrower.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		frodo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/frodo.jpg")));
				selectedCard1.setVisible(true);
				key++;
				frodo.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		furcius.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/furcius.jpg")));
				selectedCard1.setVisible(true);
				key++;
				furcius.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		ginger.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/ginger.jpg")));
				selectedCard1.setVisible(true);
				key++;
				ginger.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hot.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hot.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hot.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hpbonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hpbonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus2.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hpbonus3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus3.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hyusha.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/hyusha.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hyusha.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		iseeyou.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/iseeyou.jpg")));
				selectedCard1.setVisible(true);
				key++;
				iseeyou.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		kingofthumbor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/kingofthumbor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				kingofthumbor.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		kingofwrath.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/kingofwrath.jpg")));
				selectedCard1.setVisible(true);
				key++;
				kingofwrath.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		knightofthumbor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/knightofthumbor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				knightofthumbor.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});

		kockhar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/kockhar.jpg")));
				selectedCard1.setVisible(true);
				key++;
				kockhar.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		lava.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/lava.jpg")));
				selectedCard1.setVisible(true);
				key++;
				lava.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		litmua.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/litmua.jpg")));
				selectedCard1.setVisible(true);
				key++;
				litmua.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		lordofflames.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/lordofflames.jpg")));
				selectedCard1.setVisible(true);
				key++;
				lordofflames.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/manabonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/manabonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus2.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});

		meanor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/meanor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				meanor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		nomercy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/nomercy.jpg")));
				selectedCard1.setVisible(true);
				key++;
				nomercy.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		patrux.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/patrux.jpg")));
				selectedCard1.setVisible(true);
				key++;
				patrux.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		presence.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/presence.jpg")));
				selectedCard1.setVisible(true);
				key++;
				presence.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		realburst.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/realburst.jpg")));
				selectedCard1.setVisible(true);
				key++;
				realburst.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		sengard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/sengard.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sengard.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		sheila.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/sheila.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sheila.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		shieldinflames.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/shieldinflames.jpg")));
				selectedCard1.setVisible(true);
				key++;
				shieldinflames.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		sindor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/sindor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sindor.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		skyscream.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/skyscream.jpg")));
				selectedCard1.setVisible(true);
				key++;
				skyscream.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		thisgirlisonfire.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/thisgirlisonfire.jpg")));
				selectedCard1.setVisible(true);
				key++;
				thisgirlisonfire.setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		ticano.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/ticano.jpg")));
				selectedCard1.setVisible(true);
				key++;
				ticano.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		turcox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/turcox.jpg")));
				selectedCard1.setVisible(true);
				key++;
				turcox.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		welder.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						FireDeckCardChoosingFrame.class
								.getResource("/images/fire/welder.jpg")));
				selectedCard1.setVisible(true);
				key++;
				welder.setIcon(new ImageIcon(FireDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
	}
}
