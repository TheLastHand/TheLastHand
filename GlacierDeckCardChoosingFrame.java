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

public class GlacierDeckCardChoosingFrame {

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

	private static final JButton avalanche = new JButton();
	private static final JButton betrux = new JButton();
	private static final JButton cubic = new JButton();
	private static final JButton dancerontheice = new JButton();
	private static final JButton dragonofthenorth = new JButton();
	private static final JButton dulgor = new JButton();
	private static final JButton fhilta = new JButton();
	private static final JButton fireoffrost = new JButton();
	private static final JButton freezingeye = new JButton();
	private static final JButton frozenarmor = new JButton();
	private static final JButton frozendragon = new JButton();
	private static final JButton frozenreaction = new JButton();
	private static final JButton fursang = new JButton();
	private static final JButton girloficeland = new JButton();
	private static final JButton glacialhero = new JButton();
	private static final JButton gurasso = new JButton();
	private static final JButton hpbonus = new JButton();
	private static final JButton hpbonus2 = new JButton();
	private static final JButton hpbonus3 = new JButton();
	private static final JButton hurrostic = new JButton();
	private static final JButton iceflection = new JButton();
	private static final JButton icegolem = new JButton();
	private static final JButton icehole = new JButton();
	private static final JButton iceicebaby = new JButton();
	private static final JButton icerain = new JButton();
	private static final JButton iceshards = new JButton();
	private static final JButton icewolf = new JButton();
	private static final JButton iturbe = new JButton();
	private static final JButton letso = new JButton();
	private static final JButton manabonus = new JButton();
	private static final JButton manabonus2 = new JButton();
	private static final JButton monzy = new JButton();
	private static final JButton nomadziya = new JButton();
	private static final JButton rageofmamuts = new JButton();
	private static final JButton sacredcrystal = new JButton();
	private static final JButton santaspirit = new JButton();
	private static final JButton santasvisit = new JButton();
	private static final JButton shieldofice = new JButton();
	private static final JButton sitorius = new JButton();
	private static final JButton storghar = new JButton();
	private static final JButton therealemperor = new JButton();
	private static final JButton thiefoficeland = new JButton();
	private static final JButton uthulga = new JButton();
	private static final JButton voziac = new JButton();
	private static final JButton wolvex = new JButton();
	private static final JButton xalyaandforish = new JButton();
	private static final JButton zecse = new JButton();
	private static final JButton zithar = new JButton();
	

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void CardChoosingFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/glacierdeckbackground.jpg"))
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

		avalanche.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/avalanche.jpg")));
		avalanche.setBounds(20, 11, 80, 111);
		cardRepresentationPanel1.add(avalanche);

		betrux.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/betrux.jpg")));
		betrux.setBounds(120, 11, 80, 111);
		cardRepresentationPanel1.add(betrux);

		cubic.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/cubic.jpg")));
		cubic.setBounds(221, 11, 80, 111);
		cardRepresentationPanel1.add(cubic);

		dancerontheice.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/dancerontheice.jpg")));
		dancerontheice.setBounds(324, 11, 80, 111);
		cardRepresentationPanel1.add(dancerontheice);

		dragonofthenorth.setIcon(new ImageIcon(
				GlacierDeckCardChoosingFrame.class
						.getResource("/images/glacier/dragonofthenorth.jpg")));
		dragonofthenorth.setBounds(422, 11, 80, 111);
		cardRepresentationPanel1.add(dragonofthenorth);

		dulgor.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/dulgor.jpg")));
		dulgor.setBounds(522, 11, 80, 111);
		cardRepresentationPanel1.add(dulgor);

		fhilta.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/fhilta.jpg")));
		fhilta.setBounds(20, 138, 80, 111);
		cardRepresentationPanel1.add(fhilta);

		fireoffrost.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/fireoffrost.jpg")));
		fireoffrost.setBounds(120, 138, 80, 111);
		cardRepresentationPanel1.add(fireoffrost);

		freezingeye.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/freezingeye.jpg")));
		freezingeye.setBounds(221, 138, 80, 111);
		cardRepresentationPanel1.add(freezingeye);

		frozenarmor.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/frozenarmor.jpg")));
		frozenarmor.setBounds(324, 138, 80, 111);
		cardRepresentationPanel1.add(frozenarmor);

		frozendragon.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/frozendragon.jpg")));
		frozendragon.setBounds(422, 138, 80, 111);
		cardRepresentationPanel1.add(frozendragon);

		frozenreaction.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/frozenreaction.jpg")));
		frozenreaction.setBounds(522, 138, 80, 111);
		cardRepresentationPanel1.add(frozenreaction);

		fursang.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/fursang.jpg")));
		fursang.setBounds(20, 264, 80, 111);
		cardRepresentationPanel1.add(fursang);

		girloficeland.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/girloficeland.jpg")));
		girloficeland.setBounds(120, 264, 80, 111);
		cardRepresentationPanel1.add(girloficeland);

		glacialhero.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/glacialhero.jpg")));
		glacialhero.setBounds(221, 264, 80, 111);
		cardRepresentationPanel1.add(glacialhero);

		gurasso.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/gurasso.jpg")));
		gurasso.setBounds(324, 264, 80, 111);
		cardRepresentationPanel1.add(gurasso);

		hpbonus.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/hpbonus.jpg")));
		hpbonus.setBounds(422, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus);

		hpbonus2.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/hpbonus2.jpg")));
		hpbonus2.setBounds(522, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus2);

		hpbonus3.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/hpbonus3.jpg")));
		hpbonus3.setBounds(20, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus3);

		hurrostic.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/hurrostic.jpg")));
		hurrostic.setBounds(120, 11, 80, 111);
		cardRepresentationPanel2.add(hurrostic);

		iceflection.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/iceflection.jpg")));
		iceflection.setBounds(221, 11, 80, 111);
		cardRepresentationPanel2.add(iceflection);

		icegolem.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/icegolem.jpg")));
		icegolem.setBounds(324, 11, 80, 111);
		cardRepresentationPanel2.add(icegolem);

		icehole.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/icehole.jpg")));
		icehole.setBounds(422, 11, 80, 111);
		cardRepresentationPanel2.add(icehole);

		iceicebaby.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/iceicebaby.jpg")));
		iceicebaby.setBounds(522, 11, 80, 111);
		cardRepresentationPanel2.add(iceicebaby);

		icerain.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/icerain.jpg")));
		icerain.setBounds(20, 138, 80, 111);
		cardRepresentationPanel2.add(icerain);

		iceshards.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/iceshards.jpg")));
		iceshards.setBounds(120, 138, 80, 111);
		cardRepresentationPanel2.add(iceshards);

		icewolf.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/icewolf.jpg")));
		icewolf.setBounds(221, 138, 80, 111);
		cardRepresentationPanel2.add(icewolf);

		iturbe.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/iturbe.jpg")));
		iturbe.setBounds(324, 138, 80, 111);
		cardRepresentationPanel2.add(iturbe);

		letso.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/letso.jpg")));
		letso.setBounds(422, 138, 80, 111);
		cardRepresentationPanel2.add(letso);

		manabonus.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/manabonus.jpg")));
		manabonus.setBounds(522, 138, 80, 111);
		cardRepresentationPanel2.add(manabonus);

		manabonus2.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/manabonus2.jpg")));
		manabonus2.setBounds(20, 264, 80, 111);
		cardRepresentationPanel2.add(manabonus2);

		monzy.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/monzy.jpg")));
		monzy.setBounds(120, 264, 80, 111);
		cardRepresentationPanel2.add(monzy);

		nomadziya.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/nomadziya.jpg")));
		nomadziya.setBounds(221, 264, 80, 111);
		cardRepresentationPanel2.add(nomadziya);

		rageofmamuts.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/rageofmamuts.jpg")));
		rageofmamuts.setBounds(324, 264, 80, 111);
		cardRepresentationPanel2.add(rageofmamuts);

		sacredcrystal.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/sacredcrystal.jpg")));
		sacredcrystal.setBounds(422, 264, 80, 111);
		cardRepresentationPanel2.add(sacredcrystal);

		santaspirit.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/santaspirit.jpg")));
		santaspirit.setBounds(522, 264, 80, 111);
		cardRepresentationPanel2.add(santaspirit);

		santasvisit.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/santasvisit.jpg")));
		santasvisit.setBounds(20, 11, 80, 111);
		cardRepresentationPanel3.add(santasvisit);

		shieldofice.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/shieldofice.jpg")));
		shieldofice.setBounds(120, 11, 80, 111);
		cardRepresentationPanel3.add(shieldofice);

		sitorius.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/sitorius.jpg")));
		sitorius.setBounds(221, 11, 80, 111);
		cardRepresentationPanel3.add(sitorius);

		storghar.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/storghar.jpg")));
		storghar.setBounds(324, 11, 80, 111);
		cardRepresentationPanel3.add(storghar);

		therealemperor.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/therealemperor.jpg")));
		therealemperor.setBounds(422, 11, 80, 111);
		cardRepresentationPanel3.add(therealemperor);

		thiefoficeland.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/thiefoficeland.jpg")));
		thiefoficeland.setBounds(522, 11, 80, 111);
		cardRepresentationPanel3.add(thiefoficeland);

		uthulga.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/uthulga.jpg")));
		uthulga.setBounds(20, 138, 80, 111);
		cardRepresentationPanel3.add(uthulga);

		voziac.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class.getResource("/images/glacier/voziac.jpg")));
		voziac.setBounds(120, 138, 80, 111);
		cardRepresentationPanel3.add(voziac);

		wolvex.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/wolvex.jpg")));
		wolvex.setBounds(221, 138, 80, 111);
		cardRepresentationPanel3.add(wolvex);

		xalyaandforish.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/xalyaandforish.jpg")));
		xalyaandforish.setBounds(324, 138, 80, 111);
		cardRepresentationPanel3.add(xalyaandforish);

		zecse.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
				.getResource("/images/glacier/zecse.jpg")));
		zecse.setBounds(422, 138, 80, 111);
		cardRepresentationPanel3.add(zecse);

		

		avalanche.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/avalancheb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		betrux.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/betruxb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		cubic.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/cubicb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		dancerontheice.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/dancerontheiceb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		dragonofthenorth.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/dragonofthenorthb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		dulgor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/dulgorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fhilta.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/fhiltab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fireoffrost.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/fireoffrostb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		freezingeye.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/freezingeyeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		frozenarmor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/frozenarmorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		frozendragon.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/frozendragonb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		frozenreaction.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/frozenreactionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fursang.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/fursangb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		girloficeland.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/girloficelandb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		glacialhero.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/glacialherob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		gurasso.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/gurassob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hpbonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hpbonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hpbonus3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hurrostic.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hurrosticb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		iceflection.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceflectionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		icegolem.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icegolemb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		icehole.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceholeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		iceicebaby.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceicebabyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		icerain.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icerainb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		iceshards.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceshardsb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		icewolf.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icewolfb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		iturbe.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iturbeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		letso.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/letsob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/manabonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/manabonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		monzy.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/monzyb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		nomadziya.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/nomadziyab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		rageofmamuts.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/rageofmamutsb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sacredcrystal.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/sacredcrystalb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		santaspirit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/santaspiritb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		santasvisit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/santasvisitb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shieldofice.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/shieldoficeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sitorius.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/sitoriusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		storghar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/storgharb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		therealemperor.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/therealemperorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thiefoficeland.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/thiefoficelandb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		uthulga.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/uthulgab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		voziac.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/voziacb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		wolvex.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/wolvexb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		xalyaandforish.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/xalyaandforishb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		zecse.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/zecseb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		zithar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/zitharb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		
		avalanche.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/avalanche.jpg")));
				selectedCard1.setVisible(true);
				key++;
				avalanche.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		betrux.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/betrux.jpg")));
				selectedCard1.setVisible(true);
				key++;
				betrux.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		cubic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/cubic.jpg")));
				selectedCard1.setVisible(true);
				key++;
				cubic.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		dancerontheice.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/dancerontheice.jpg")));
				selectedCard1.setVisible(true);
				key++;
				dancerontheice.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		dragonofthenorth.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/dragonofthenorth.jpg")));
				selectedCard1.setVisible(true);
				key++;
				dragonofthenorth.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		dulgor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/dulgor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				dulgor.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		fhilta.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/fhilta.jpg")));
				selectedCard1.setVisible(true);
				key++;
				fhilta.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		fireoffrost.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/fireoffrost.jpg")));
				selectedCard1.setVisible(true);
				key++;
				fireoffrost.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		freezingeye.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/freezingeye.jpg")));
				selectedCard1.setVisible(true);
				key++;
				freezingeye.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		frozenarmor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/frozenarmor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				frozenarmor.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		frozendragon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/frozendragon.jpg")));
				selectedCard1.setVisible(true);
				key++;
				frozendragon.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		frozenreaction.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/frozenreaction.jpg")));
				selectedCard1.setVisible(true);
				key++;
				frozenreaction.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		fursang.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/fursang.jpg")));
				selectedCard1.setVisible(true);
				key++;
				fursang.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		girloficeland.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/girloficeland.jpg")));
				selectedCard1.setVisible(true);
				key++;
				girloficeland.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		glacialhero.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/glacialhero.jpg")));
				selectedCard1.setVisible(true);
				key++;
				glacialhero.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		gurasso.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/gurasso.jpg")));
				selectedCard1.setVisible(true);
				key++;
				gurasso.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hpbonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hpbonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus2.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hpbonus3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus3.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		hurrostic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/hurrostic.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hurrostic.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		iceflection.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceflection.jpg")));
				selectedCard1.setVisible(true);
				key++;
				iceflection.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		icegolem.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icegolem.jpg")));
				selectedCard1.setVisible(true);
				key++;
				icegolem.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		icehole.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icehole.jpg")));
				selectedCard1.setVisible(true);
				key++;
				icehole.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		iceicebaby.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceicebaby.jpg")));
				selectedCard1.setVisible(true);
				key++;
				iceicebaby.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		icerain.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icerain.jpg")));
				selectedCard1.setVisible(true);
				key++;
				icerain.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		iceshards.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iceshards.jpg")));
				selectedCard1.setVisible(true);
				key++;
				iceshards.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		icewolf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/icewolf.jpg")));
				selectedCard1.setVisible(true);
				key++;
				icewolf.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});

		iturbe.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/iturbe.jpg")));
				selectedCard1.setVisible(true);
				key++;
				iturbe.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		letso.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/letso.jpg")));
				selectedCard1.setVisible(true);
				key++;
				letso.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/manabonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/manabonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus2.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		monzy.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/monzy.jpg")));
				selectedCard1.setVisible(true);
				key++;
				monzy.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		nomadziya.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/nomadziya.jpg")));
				selectedCard1.setVisible(true);
				key++;
				nomadziya.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});

		rageofmamuts.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/rageofmamuts.jpg")));
				selectedCard1.setVisible(true);
				key++;
				rageofmamuts.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		sacredcrystal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/sacredcrystal.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sacredcrystal.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		santaspirit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/santaspirit.jpg")));
				selectedCard1.setVisible(true);
				key++;
				santaspirit.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		santasvisit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/santasvisit.jpg")));
				selectedCard1.setVisible(true);
				key++;
				santasvisit.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		shieldofice.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/shieldofice.jpg")));
				selectedCard1.setVisible(true);
				key++;
				shieldofice.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		sitorius.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/sitorius.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sitorius.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		storghar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/storghar.jpg")));
				selectedCard1.setVisible(true);
				key++;
				storghar.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		therealemperor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/therealemperor.jpg")));
				selectedCard1.setVisible(true);
				key++;
				therealemperor.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		thiefoficeland.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/thiefoficeland.jpg")));
				selectedCard1.setVisible(true);
				key++;
				thiefoficeland.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		uthulga.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/uthulga.jpg")));
				selectedCard1.setVisible(true);
				key++;
				uthulga.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		voziac.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/voziac.jpg")));
				selectedCard1.setVisible(true);
				key++;
				voziac.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		wolvex.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/wolvex.jpg")));
				selectedCard1.setVisible(true);
				key++;
				wolvex.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		xalyaandforish.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/xalyaandforish.jpg")));
				selectedCard1.setVisible(true);
				key++;
				xalyaandforish.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});
		zecse.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/zecse.jpg")));
				selectedCard1.setVisible(true);
				key++;
				zecse.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();

			}
		});
		zithar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						GlacierDeckCardChoosingFrame.class
								.getResource("/images/glacier/zithar.jpg")));
				selectedCard1.setVisible(true);
				key++;
				zithar.setIcon(new ImageIcon(GlacierDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
				SoundEffect.selectingEffect();


			}
		});

	}
}
