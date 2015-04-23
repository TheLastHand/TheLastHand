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

public class WaterDeckCardChoosingFrame {

	protected static boolean keyboardVisibility = false;
	protected static JFrame cardChoosingFrame = new JFrame("The Last Hand");
	protected static JPanel gameWindowPanel;
	protected static JButton choose = new JButton("choose!");
	public static JPanel cardRepresentationPanel1 = new JPanel();
	public static JPanel cardRepresentationPanel2 = new JPanel();
	public static JPanel cardRepresentationPanel3 = new JPanel();
	public static JPanel cardRepresentationPanel4 = new JPanel();
	protected static JPanel biggerCardPanel = new JPanel();
	protected static JPanel selectedCardPanel = new JPanel();
	protected static JPanel chatPanel = new JPanel();

	static final JButton panel1arrowRight = new JButton();
	static final JButton panel2arrowRight = new JButton();
	static final JButton panel3arrowRight = new JButton();
	static final JButton panel2arrowLeft = new JButton();
	static final JButton panel3arrowLeft = new JButton();
	static final JButton panel4arrowLeft = new JButton();
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

	public static final String[] allcards = { "azbalgur", "babywhale",
		"bigmouth", "blurry", "boilinghot", "corrosea", "duranza", "flood",
		"flyingturkman", "giantshrimp", "godlike", "gurratso",
		"horseofkelpie", "hpbonus", "hpbonus2", "hpbonus3", "hpbonus4",
		"hunterinthewater", "keskeha", "ladyofthedeepsea", "leak",
		"livingtsunami", "manabonus", "manabonus2", "manaregeneration",
		"manaregeneration2", "manaregeneration3", "medidation", "metantu",
		"mirror", "mosesthedivine", "mrjellybean", "mrtutza", "onthewater",
		"pontus", "poolcleaning", "poseidon", "redoctopus", "reflection",
		"riforius", "rockyshark", "secondchance", "seizetheordinary",
		"shapeless", "shieldofwater", "sunkenman", "timesofnoah",
		"trixota", "ultimatepiranha", "virginmermaid", "vortex",
		"waterandthemoon", "whirlpool", "whirlpool2", "zetsiyus" };

	private static final JButton azbalgur = new JButton();
	private static final JButton babywhale = new JButton();
	private static final JButton bigmouth = new JButton();
	private static final JButton blurry = new JButton();
	private static final JButton boilinghot = new JButton();
	private static final JButton corrosea = new JButton();
	private static final JButton duranza = new JButton();
	private static final JButton flood = new JButton();
	private static final JButton flyingturkman = new JButton();
	private static final JButton giantshrimp = new JButton();
	private static final JButton godlike = new JButton();
	private static final JButton gurratso = new JButton();
	private static final JButton horseofkelpie = new JButton();
	private static final JButton hpbonus = new JButton();
	private static final JButton hpbonus2 = new JButton();
	private static final JButton hpbonus3 = new JButton();
	private static final JButton hpbonus4 = new JButton();
	private static final JButton hunterinthewater = new JButton();
	private static final JButton keskeha = new JButton();
	private static final JButton ladyofthedeepsea = new JButton();
	private static final JButton leak = new JButton();
	private static final JButton livingtsunami = new JButton();
	private static final JButton manabonus = new JButton();
	private static final JButton manabonus2 = new JButton();
	private static final JButton manaregeneration = new JButton();
	private static final JButton manaregeneration2 = new JButton();
	private static final JButton manaregeneration3 = new JButton();
	private static final JButton medidation = new JButton();
	private static final JButton metantu = new JButton();
	private static final JButton mirror = new JButton();
	private static final JButton mosesthedivine = new JButton();
	private static final JButton mrjellybean = new JButton();
	private static final JButton mrtutza = new JButton();
	private static final JButton onthewater = new JButton();
	private static final JButton pontus = new JButton();
	private static final JButton poolcleaning = new JButton();
	private static final JButton poseidon = new JButton();
	private static final JButton redoctopus = new JButton();
	private static final JButton reflection = new JButton();
	private static final JButton riforius = new JButton();
	private static final JButton rockyshark = new JButton();
	private static final JButton secondchance = new JButton();
	private static final JButton seizetheordinary = new JButton();
	private static final JButton shapeless = new JButton();
	private static final JButton shieldofwater = new JButton();
	private static final JButton sunkenman = new JButton();
	private static final JButton timesofnoah = new JButton();
	private static final JButton trixota = new JButton();
	private static final JButton ultimatepiranha = new JButton();
	private static final JButton virginmermaid = new JButton();
	private static final JButton vortex = new JButton();
	private static final JButton waterandthemoon = new JButton();
	private static final JButton whirlpool = new JButton();
	private static final JButton whirlpool2 = new JButton();
	private static final JButton zetsiyus = new JButton();
	

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void CardChoosingFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/waterdeckbackground.jpg"))
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
		
		cardRepresentationPanel4.setLayout(null);
		cardRepresentationPanel4.setBackground(new Color(0, 0, 0, 0));
		cardRepresentationPanel4.setBounds(0, 0, 624, 440);
		gameWindowPanel.add(cardRepresentationPanel4);
		cardRepresentationPanel4.setVisible(false);		

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

		panel3arrowRight.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/arrowRight.png")));
		panel3arrowRight.setBounds(481, 393, 46, 48);
		panel3arrowRight.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel3.add(panel3arrowRight);

		panel4arrowLeft.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/arrowLeft.png")));
		panel4arrowLeft.setBounds(71, 393, 46, 48);
		panel4arrowLeft.setMargin(new Insets(0, 0, 0, 0));
		cardRepresentationPanel4.add(panel4arrowLeft);


		azbalgur.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/azbalgur.jpg")));
		azbalgur.setBounds(20, 11, 80, 111);
		cardRepresentationPanel1.add(azbalgur);

		babywhale.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/babywhale.jpg")));
		babywhale.setBounds(120, 11, 80, 111);
		cardRepresentationPanel1.add(babywhale);

		bigmouth.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/bigmouth.jpg")));
		bigmouth.setBounds(221, 11, 80, 111);
		cardRepresentationPanel1.add(bigmouth);

		blurry.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/blurry.jpg")));
		blurry.setBounds(324, 11, 80, 111);
		cardRepresentationPanel1.add(blurry);

		boilinghot.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/boilinghot.jpg")));
		boilinghot.setBounds(422, 11, 80, 111);
		cardRepresentationPanel1.add(boilinghot);

		corrosea.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/corrosea.jpg")));
		corrosea.setBounds(522, 11, 80, 111);
		cardRepresentationPanel1.add(corrosea);

		duranza.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/duranza.jpg")));
		duranza.setBounds(20, 138, 80, 111);
		cardRepresentationPanel1.add(duranza);

		flood.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/flood.jpg")));
		flood.setBounds(120, 138, 80, 111);
		cardRepresentationPanel1.add(flood);

		flyingturkman.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/flyingturkman.jpg")));
		flyingturkman.setBounds(221, 138, 80, 111);
		cardRepresentationPanel1.add(flyingturkman);

		giantshrimp.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/giantshrimp.jpg")));
		giantshrimp.setBounds(324, 138, 80, 111);
		cardRepresentationPanel1.add(giantshrimp);

		godlike.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/godlike.jpg")));
		godlike.setBounds(422, 138, 80, 111);
		cardRepresentationPanel1.add(godlike);

		gurratso.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/gurratso.jpg")));
		gurratso.setBounds(522, 138, 80, 111);
		cardRepresentationPanel1.add(gurratso);

		horseofkelpie.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/horseofkelpie.jpg")));
		horseofkelpie.setBounds(20, 264, 80, 111);
		cardRepresentationPanel1.add(horseofkelpie);

		hpbonus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/hpbonus.jpg")));
		hpbonus.setBounds(120, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus);

		hpbonus2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/hpbonus2.jpg")));
		hpbonus2.setBounds(221, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus2);

		hpbonus3.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/hpbonus3.jpg")));
		hpbonus3.setBounds(324, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus3);

		hpbonus4.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/hpbonus4.jpg")));
		hpbonus4.setBounds(422, 264, 80, 111);
		cardRepresentationPanel1.add(hpbonus4);

		hunterinthewater.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/hunterinthewater.jpg")));
		hunterinthewater.setBounds(522, 264, 80, 111);
		cardRepresentationPanel1.add(hunterinthewater);

		keskeha.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/keskeha.jpg")));
		keskeha.setBounds(20, 11, 80, 111);
		cardRepresentationPanel2.add(keskeha);

		ladyofthedeepsea.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/ladyofthedeepsea.jpg")));
		ladyofthedeepsea.setBounds(120, 11, 80, 111);
		cardRepresentationPanel2.add(ladyofthedeepsea);

		leak.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/leak.jpg")));
		leak.setBounds(221, 11, 80, 111);
		cardRepresentationPanel2.add(leak);

		livingtsunami.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/livingtsunami.jpg")));
		livingtsunami.setBounds(324, 11, 80, 111);
		cardRepresentationPanel2.add(livingtsunami);

		manabonus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/manabonus.jpg")));
		manabonus.setBounds(422, 11, 80, 111);
		cardRepresentationPanel2.add(manabonus);

		manabonus2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/manabonus2.jpg")));
		manabonus2.setBounds(522, 11, 80, 111);
		cardRepresentationPanel2.add(manabonus2);

		manaregeneration.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/manaregeneration.jpg")));
		manaregeneration.setBounds(20, 138, 80, 111);
		cardRepresentationPanel2.add(manaregeneration);

		manaregeneration2.setIcon(new ImageIcon(
				WaterDeckCardChoosingFrame.class
						.getResource("/images/water/manaregeneration2.jpg")));
		manaregeneration2.setBounds(120, 138, 80, 111);
		cardRepresentationPanel2.add(manaregeneration2);

		manaregeneration3.setIcon(new ImageIcon(
				WaterDeckCardChoosingFrame.class
						.getResource("/images/water/manaregeneration3.jpg")));
		manaregeneration3.setBounds(221, 138, 80, 111);
		cardRepresentationPanel2.add(manaregeneration3);

		medidation.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/medidation.jpg")));
		medidation.setBounds(324, 138, 80, 111);
		cardRepresentationPanel2.add(medidation);

		metantu.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/metantu.jpg")));
		metantu.setBounds(422, 138, 80, 111);
		cardRepresentationPanel2.add(metantu);

		mirror.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/mirror.jpg")));
		mirror.setBounds(522, 138, 80, 111);
		cardRepresentationPanel2.add(mirror);

		mosesthedivine.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/mosesthedivine.jpg")));
		mosesthedivine.setBounds(20, 264, 80, 111);
		cardRepresentationPanel2.add(mosesthedivine);

		mrjellybean.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/mrjellybean.jpg")));
		mrjellybean.setBounds(120, 264, 80, 111);
		cardRepresentationPanel2.add(mrjellybean);

		mrtutza.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/mrtutza.jpg")));
		mrtutza.setBounds(221, 264, 80, 111);
		cardRepresentationPanel2.add(mrtutza);

		onthewater.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/onthewater.jpg")));
		onthewater.setBounds(324, 264, 80, 111);
		cardRepresentationPanel2.add(onthewater);

		pontus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/pontus.jpg")));
		pontus.setBounds(422, 264, 80, 111);
		cardRepresentationPanel2.add(pontus);

		poolcleaning.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/poolcleaning.jpg")));
		poolcleaning.setBounds(522, 264, 80, 111);
		cardRepresentationPanel2.add(poolcleaning);

		poseidon.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/poseidon.jpg")));
		poseidon.setBounds(20, 11, 80, 111);
		cardRepresentationPanel3.add(poseidon);

		redoctopus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/redoctopus.jpg")));
		redoctopus.setBounds(120, 11, 80, 111);
		cardRepresentationPanel3.add(redoctopus);

		reflection.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/reflection.jpg")));
		reflection.setBounds(221, 11, 80, 111);
		cardRepresentationPanel3.add(reflection);

		riforius.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/riforius.jpg")));
		riforius.setBounds(324, 11, 80, 111);
		cardRepresentationPanel3.add(riforius);

		rockyshark.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/rockyshark.jpg")));
		rockyshark.setBounds(422, 11, 80, 111);
		cardRepresentationPanel3.add(rockyshark);

		secondchance.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/secondchance.jpg")));
		secondchance.setBounds(522, 11, 80, 111);
		cardRepresentationPanel3.add(secondchance);

		seizetheordinary.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/seizetheordinary.jpg")));
		seizetheordinary.setBounds(20, 138, 80, 111);
		cardRepresentationPanel3.add(seizetheordinary);

		shapeless.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/shapeless.jpg")));
		shapeless.setBounds(120, 138, 80, 111);
		cardRepresentationPanel3.add(shapeless);

		shieldofwater.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/shieldofwater.jpg")));
		shieldofwater.setBounds(221, 138, 80, 111);
		cardRepresentationPanel3.add(shieldofwater);

		sunkenman.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/sunkenman.jpg")));
		sunkenman.setBounds(324, 138, 80, 111);
		cardRepresentationPanel3.add(sunkenman);

		timesofnoah.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/timesofnoah.jpg")));
		timesofnoah.setBounds(422, 138, 80, 111);
		cardRepresentationPanel3.add(timesofnoah);

		trixota.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/trixota.jpg")));
		trixota.setBounds(522, 138, 80, 111);
		cardRepresentationPanel3.add(trixota);

		ultimatepiranha.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/ultimatepiranha.jpg")));
		ultimatepiranha.setBounds(20, 264, 80, 111);
		cardRepresentationPanel3.add(ultimatepiranha);

		virginmermaid.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/virginmermaid.jpg")));
		virginmermaid.setBounds(120, 264, 80, 111);
		cardRepresentationPanel3.add(virginmermaid);

		vortex.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/vortex.jpg")));
		vortex.setBounds(221, 264, 80, 111);
		cardRepresentationPanel3.add(vortex);

		waterandthemoon.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/waterandthemoon.jpg")));
		waterandthemoon.setBounds(324, 264, 80, 111);
		cardRepresentationPanel3.add(waterandthemoon);

		whirlpool.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/whirlpool.jpg")));
		whirlpool.setBounds(422, 264, 80, 111);
		cardRepresentationPanel3.add(whirlpool);

		whirlpool2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/whirlpool2.jpg")));
		whirlpool2.setBounds(522, 264, 80, 111);
		cardRepresentationPanel3.add(whirlpool2);

		zetsiyus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
				.getResource("/images/water/zetsiyus.jpg")));
		zetsiyus.setBounds(20, 11, 80, 111);
		cardRepresentationPanel4.add(zetsiyus);
		

		azbalgur.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/azbalgurb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		babywhale.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/babywhaleb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		bigmouth.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/bigmouthb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		blurry.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/blurryb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		boilinghot.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/boilinghotb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		corrosea.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/corroseab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		duranza.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/duranzab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		flood.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/floodb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		flyingturkman.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/flyingturkmanb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		giantshrimp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/giantshrimpb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		godlike.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/godlikeb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		gurratso.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/gurratsob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		horseofkelpie.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/horseofkelpieb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus4b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hunterinthewater.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hunterinthewaterb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		keskeha.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/keskehab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ladyofthedeepsea.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/ladyofthedeepseab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		leak.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/leakb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		livingtsunami.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/livingtsunamib.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manabonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manabonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manaregenerationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manaregeneration2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manaregeneration3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		medidation.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/medidationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		metantu.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/metantub.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		mirror.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mirrorb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		mosesthedivine.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mosesthedivineb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		mrjellybean.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mrjellybeanb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		mrtutza.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mrtutzab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		onthewater.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/onthewaterb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		pontus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/pontusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		poolcleaning.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/poolcleaningb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		poseidon.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/poseidonb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		redoctopus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/redoctopusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		reflection.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/reflectionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		riforius.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/riforiusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rockyshark.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/rockysharkb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		secondchance.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/secondchanceb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		seizetheordinary.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/seizetheordinaryb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shapeless.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/shapelessb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shieldofwater.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/shieldofwaterb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sunkenman.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/sunkenmanb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		timesofnoah.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/timesofnoahb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		trixota.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/trixotab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ultimatepiranha.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/ultimatepiranhab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		virginmermaid.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/virginmermaidb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		vortex.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/vortexb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		waterandthemoon.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/waterandthemoonb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		whirlpool.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/whirlpoolb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		whirlpool2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/whirlpool2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		zetsiyus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/zetsiyusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		
		
		azbalgur.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/azbalgur.jpg")));
				selectedCard1.setVisible(true);
				key++;
				azbalgur.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		
		babywhale.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/babywhale.jpg")));
				selectedCard1.setVisible(true);
				key++;
				babywhale.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		bigmouth.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/bigmouth.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bigmouth.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		blurry.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/blurry.jpg")));
				selectedCard1.setVisible(true);
				key++;
				blurry.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		boilinghot.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/boilinghot.jpg")));
				selectedCard1.setVisible(true);
				key++;
				boilinghot.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		corrosea.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/corrosea.jpg")));
				selectedCard1.setVisible(true);
				key++;
				corrosea.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		duranza.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/duranza.jpg")));
				selectedCard1.setVisible(true);
				key++;
				duranza.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		flood.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/flood.jpg")));
				selectedCard1.setVisible(true);
				key++;
				flood.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		flyingturkman.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/flyingturkman.jpg")));
				selectedCard1.setVisible(true);
				key++;
				flyingturkman.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		giantshrimp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/giantshrimp.jpg")));
				selectedCard1.setVisible(true);
				key++;
				giantshrimp.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		godlike.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/godlike.jpg")));
				selectedCard1.setVisible(true);
				key++;
				godlike.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		gurratso.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/gurratso.jpg")));
				selectedCard1.setVisible(true);
				key++;
				gurratso.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		horseofkelpie.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/horseofkelpie.jpg")));
				selectedCard1.setVisible(true);
				key++;
				horseofkelpie.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus3.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hpbonus4.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus4.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		hunterinthewater.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/hunterinthewater.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hunterinthewater.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		keskeha.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/keskeha.jpg")));
				selectedCard1.setVisible(true);
				key++;
				keskeha.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		ladyofthedeepsea.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/ladyofthedeepsea.jpg")));
				selectedCard1.setVisible(true);
				key++;
				ladyofthedeepsea.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		leak.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/leak.jpg")));
				selectedCard1.setVisible(true);
				key++;
				leak.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		livingtsunami.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/livingtsunami.jpg")));
				selectedCard1.setVisible(true);
				key++;
				livingtsunami.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manabonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manabonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		manaregeneration.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manaregeneration.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		manaregeneration2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manaregeneration2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		manaregeneration3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/manaregeneration3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration3.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});

		medidation.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/medidation.jpg")));
				selectedCard1.setVisible(true);
				key++;
				medidation.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		metantu.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/metantu.jpg")));
				selectedCard1.setVisible(true);
				key++;
				metantu.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		mirror.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mirror.jpg")));
				selectedCard1.setVisible(true);
				key++;
				mirror.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		mosesthedivine.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mosesthedivine.jpg")));
				selectedCard1.setVisible(true);
				key++;
				mosesthedivine.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		mrjellybean.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mrjellybean.jpg")));
				selectedCard1.setVisible(true);
				key++;
				mrjellybean.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		mrtutza.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/mrtutza.jpg")));
				selectedCard1.setVisible(true);
				key++;
				mrtutza.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});

		onthewater.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/onthewater.jpg")));
				selectedCard1.setVisible(true);
				key++;
				onthewater.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		pontus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/pontus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				pontus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		poolcleaning.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/poolcleaning.jpg")));
				selectedCard1.setVisible(true);
				key++;
				poolcleaning.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		poseidon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/poseidon.jpg")));
				selectedCard1.setVisible(true);
				key++;
				poseidon.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		redoctopus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/redoctopus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				redoctopus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		reflection.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/reflection.jpg")));
				selectedCard1.setVisible(true);
				key++;
				reflection.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		riforius.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/riforius.jpg")));
				selectedCard1.setVisible(true);
				key++;
				riforius.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		rockyshark.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/rockyshark.jpg")));
				selectedCard1.setVisible(true);
				key++;
				rockyshark.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		secondchance.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/secondchance.jpg")));
				selectedCard1.setVisible(true);
				key++;
				secondchance.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		seizetheordinary.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/seizetheordinary.jpg")));
				selectedCard1.setVisible(true);
				key++;
				seizetheordinary.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		shapeless.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/shapeless.jpg")));
				selectedCard1.setVisible(true);
				key++;
				shapeless.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		shieldofwater.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/shieldofwater.jpg")));
				selectedCard1.setVisible(true);
				key++;
				shieldofwater.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		sunkenman.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/sunkenman.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sunkenman.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		timesofnoah.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/timesofnoah.jpg")));
				selectedCard1.setVisible(true);
				key++;
				timesofnoah.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		trixota.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/trixota.jpg")));
				selectedCard1.setVisible(true);
				key++;
				trixota.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		ultimatepiranha.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/ultimatepiranha.jpg")));
				selectedCard1.setVisible(true);
				key++;
				ultimatepiranha.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		virginmermaid.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/virginmermaid.jpg")));
				selectedCard1.setVisible(true);
				key++;
				virginmermaid.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		vortex.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/vortex.jpg")));
				selectedCard1.setVisible(true);
				key++;
				vortex.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		waterandthemoon.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/waterandthemoon.jpg")));
				selectedCard1.setVisible(true);
				key++;
				waterandthemoon.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		whirlpool.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/whirlpool.jpg")));
				selectedCard1.setVisible(true);
				key++;
				whirlpool.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		whirlpool2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/whirlpool2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				whirlpool2.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		zetsiyus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						WaterDeckCardChoosingFrame.class
								.getResource("/images/water/zetsiyus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				zetsiyus.setIcon(new ImageIcon(WaterDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		
		

	}
}
