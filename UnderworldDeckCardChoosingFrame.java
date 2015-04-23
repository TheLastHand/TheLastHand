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

public class UnderworldDeckCardChoosingFrame {

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

	private static final JButton absenthia = new JButton();
	private static final JButton ancientdemonic = new JButton();
	private static final JButton angelofdeath = new JButton();
	private static final JButton armorofthedarksoul = new JButton();
	private static final JButton arpetios = new JButton();
	private static final JButton badhabit = new JButton();
	private static final JButton badluck = new JButton();
	private static final JButton bladeofdarklord = new JButton();
	private static final JButton bloodcholic = new JButton();
	private static final JButton boatmanofdarkness = new JButton();
	private static final JButton callfromdarkness = new JButton();
	private static final JButton cunningman = new JButton();
	private static final JButton darkmagic = new JButton();
	private static final JButton darkreflection = new JButton();
	private static final JButton demonic = new JButton();
	private static final JButton devilsadvocat = new JButton();
	private static final JButton fatalbonds = new JButton();
	private static final JButton fear = new JButton();
	private static final JButton gorillaofhell = new JButton();
	private static final JButton hellhounds = new JButton();
	private static final JButton hpbonus = new JButton();
	private static final JButton hpbonus2 = new JButton();
	private static final JButton hpbonus3 = new JButton();
	private static final JButton hpbonus4 = new JButton();
	private static final JButton illusion = new JButton();
	private static final JButton kahkasso = new JButton();
	private static final JButton khaduun = new JButton();
	private static final JButton khultzar = new JButton();
	private static final JButton lordfear = new JButton();
	private static final JButton manabonus = new JButton();
	private static final JButton manabonus2 = new JButton();
	private static final JButton manaregeneration = new JButton();
	private static final JButton manaregeneration2 = new JButton();
	private static final JButton manaregeneration3 = new JButton();
	private static final JButton normorepain = new JButton();
	private static final JButton pickpocket = new JButton();
	private static final JButton poisonofdarkness = new JButton();
	private static final JButton psychkick = new JButton();
	private static final JButton purgatory = new JButton();
	private static final JButton quatsiah = new JButton();
	private static final JButton rasputin = new JButton();
	private static final JButton sacredritual = new JButton();
	private static final JButton servantofdarklord = new JButton();
	private static final JButton shieldofdarkness = new JButton();
	private static final JButton shiku = new JButton();
	private static final JButton snakehead = new JButton();
	private static final JButton soulreaper = new JButton();
	private static final JButton spiderking = new JButton();
	private static final JButton steelofhell = new JButton();
	private static final JButton suiciderskull = new JButton();
	private static final JButton surrogates = new JButton();
	private static final JButton thefirstofpagans = new JButton();
	private static final JButton throneofdarkness = new JButton();
	private static final JButton unknown = new JButton();
	private static final JButton upsidedown = new JButton();
	private static final JButton voodoo = new JButton();
	private static final JButton zitoki = new JButton();
	private static final JButton zombieinvasion = new JButton();

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void CardChoosingFrame() throws IOException {
		ImagePanel gameWindowPanel = new ImagePanel(
				new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworlddeckbackground.jpg"))
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

		absenthia.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/absenthia.jpg")));
		absenthia.setBounds(20, 11, 80, 111);
		cardRepresentationPanel1.add(absenthia);

		ancientdemonic.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/ancientdemonic.jpg")));
		ancientdemonic.setBounds(120, 11, 80, 111);
		cardRepresentationPanel1.add(ancientdemonic);

		angelofdeath.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/angelofdeath.jpg")));
		angelofdeath.setBounds(221, 11, 80, 111);
		cardRepresentationPanel1.add(angelofdeath);

		armorofthedarksoul.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/armorofthedarksoul.jpg")));
		armorofthedarksoul.setBounds(324, 11, 80, 111);
		cardRepresentationPanel1.add(armorofthedarksoul);

		arpetios.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/arpetios.jpg")));
		arpetios.setBounds(422, 11, 80, 111);
		cardRepresentationPanel1.add(arpetios);

		badhabit.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/badhabit.jpg")));
		badhabit.setBounds(522, 11, 80, 111);
		cardRepresentationPanel1.add(badhabit);

		badluck.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/badluck.jpg")));
		badluck.setBounds(20, 138, 80, 111);
		cardRepresentationPanel1.add(badluck);

		bladeofdarklord.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/bladeofdarklord.jpg")));
		bladeofdarklord.setBounds(120, 138, 80, 111);
		cardRepresentationPanel1.add(bladeofdarklord);

		bloodcholic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/bloodcholic.jpg")));
		bloodcholic.setBounds(221, 138, 80, 111);
		cardRepresentationPanel1.add(bloodcholic);

		boatmanofdarkness.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/boatmanofdarkness.jpg")));
		boatmanofdarkness.setBounds(324, 138, 80, 111);
		cardRepresentationPanel1.add(boatmanofdarkness);

		callfromdarkness.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/callfromdarkness.jpg")));
		callfromdarkness.setBounds(422, 138, 80, 111);
		cardRepresentationPanel1.add(callfromdarkness);

		cunningman.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/cunningman.jpg")));
		cunningman.setBounds(522, 138, 80, 111);
		cardRepresentationPanel1.add(cunningman);

		darkmagic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/darkmagic.jpg")));
		darkmagic.setBounds(20, 264, 80, 111);
		cardRepresentationPanel1.add(darkmagic);

		darkreflection.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/darkreflection.jpg")));
		darkreflection.setBounds(120, 264, 80, 111);
		cardRepresentationPanel1.add(darkreflection);

		demonic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/demonic.jpg")));
		demonic.setBounds(221, 264, 80, 111);
		cardRepresentationPanel1.add(demonic);

		devilsadvocat.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/devilsadvocat.jpg")));
		devilsadvocat.setBounds(324, 264, 80, 111);
		cardRepresentationPanel1.add(devilsadvocat);

		fatalbonds.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/fatalbonds.jpg")));
		fatalbonds.setBounds(422, 264, 80, 111);
		cardRepresentationPanel1.add(fatalbonds);

		fear.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/fear.jpg")));
		fear.setBounds(522, 264, 80, 111);
		cardRepresentationPanel1.add(fear);

		gorillaofhell.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/gorillaofhell.jpg")));
		gorillaofhell.setBounds(20, 11, 80, 111);
		cardRepresentationPanel2.add(gorillaofhell);

		hellhounds.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/hellhounds.jpg")));
		hellhounds.setBounds(120, 11, 80, 111);
		cardRepresentationPanel2.add(hellhounds);

		hpbonus.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/hpbonus.jpg")));
		hpbonus.setBounds(221, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus);

		hpbonus2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/hpbonus2.jpg")));
		hpbonus2.setBounds(324, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus2);

		hpbonus3.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/hpbonus3.jpg")));
		hpbonus3.setBounds(422, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus3);

		hpbonus4.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/hpbonus4.jpg")));
		hpbonus4.setBounds(522, 11, 80, 111);
		cardRepresentationPanel2.add(hpbonus4);

		illusion.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/illusion.jpg")));
		illusion.setBounds(20, 138, 80, 111);
		cardRepresentationPanel2.add(illusion);

		kahkasso.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/kahkasso.jpg")));
		kahkasso.setBounds(120, 138, 80, 111);
		cardRepresentationPanel2.add(kahkasso);

		khaduun.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/khaduun.jpg")));
		khaduun.setBounds(221, 138, 80, 111);
		cardRepresentationPanel2.add(khaduun);

		khultzar.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/khultzar.jpg")));
		khultzar.setBounds(324, 138, 80, 111);
		cardRepresentationPanel2.add(khultzar);

		lordfear.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/lordfear.jpg")));
		lordfear.setBounds(422, 138, 80, 111);
		cardRepresentationPanel2.add(lordfear);

		manabonus.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/manabonus.jpg")));
		manabonus.setBounds(522, 138, 80, 111);
		cardRepresentationPanel2.add(manabonus);

		manabonus2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/manabonus2.jpg")));
		manabonus2.setBounds(20, 264, 80, 111);
		cardRepresentationPanel2.add(manabonus2);

		manaregeneration.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/manaregeneration.jpg")));
		manaregeneration.setBounds(120, 264, 80, 111);
		cardRepresentationPanel2.add(manaregeneration);

		manaregeneration2.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/manaregeneration2.jpg")));
		manaregeneration2.setBounds(221, 264, 80, 111);
		cardRepresentationPanel2.add(manaregeneration2);

		manaregeneration3.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/manaregeneration3.jpg")));
		manaregeneration3.setBounds(324, 264, 80, 111);
		cardRepresentationPanel2.add(manaregeneration3);

		normorepain.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/normorepain.jpg")));
		normorepain.setBounds(422, 264, 80, 111);
		cardRepresentationPanel2.add(normorepain);

		pickpocket.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/pickpocket.jpg")));
		pickpocket.setBounds(522, 264, 80, 111);
		cardRepresentationPanel2.add(pickpocket);

		poisonofdarkness.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/poisonofdarkness.jpg")));
		poisonofdarkness.setBounds(20, 11, 80, 111);
		cardRepresentationPanel3.add(poisonofdarkness);

		psychkick.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/psychkick.jpg")));
		psychkick.setBounds(120, 11, 80, 111);
		cardRepresentationPanel3.add(psychkick);

		purgatory.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/purgatory.jpg")));
		purgatory.setBounds(221, 11, 80, 111);
		cardRepresentationPanel3.add(purgatory);

		quatsiah.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/quatsiah.jpg")));
		quatsiah.setBounds(324, 11, 80, 111);
		cardRepresentationPanel3.add(quatsiah);

		rasputin.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/rasputin.jpg")));
		rasputin.setBounds(422, 11, 80, 111);
		cardRepresentationPanel3.add(rasputin);

		sacredritual.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/sacredritual.jpg")));
		sacredritual.setBounds(522, 11, 80, 111);
		cardRepresentationPanel3.add(sacredritual);

		servantofdarklord.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/servantofdarklord.jpg")));
		servantofdarklord.setBounds(20, 138, 80, 111);
		cardRepresentationPanel3.add(servantofdarklord);

		shieldofdarkness.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/shieldofdarkness.jpg")));
		shieldofdarkness.setBounds(120, 138, 80, 111);
		cardRepresentationPanel3.add(shieldofdarkness);

		shiku.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/shiku.jpg")));
		shiku.setBounds(221, 138, 80, 111);
		cardRepresentationPanel3.add(shiku);

		snakehead.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/snakehead.jpg")));
		snakehead.setBounds(324, 138, 80, 111);
		cardRepresentationPanel3.add(snakehead);

		soulreaper.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/soulreaper.jpg")));
		soulreaper.setBounds(422, 138, 80, 111);
		cardRepresentationPanel3.add(soulreaper);

		spiderking.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/spiderking.jpg")));
		spiderking.setBounds(522, 138, 80, 111);
		cardRepresentationPanel3.add(spiderking);

		steelofhell.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/steelofhell.jpg")));
		steelofhell.setBounds(20, 264, 80, 111);
		cardRepresentationPanel3.add(steelofhell);

		suiciderskull.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/suiciderskull.jpg")));
		suiciderskull.setBounds(120, 264, 80, 111);
		cardRepresentationPanel3.add(suiciderskull);

		surrogates.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/surrogates.jpg")));
		surrogates.setBounds(221, 264, 80, 111);
		cardRepresentationPanel3.add(surrogates);

		thefirstofpagans.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/thefirstofpagans.jpg")));
		thefirstofpagans.setBounds(324, 264, 80, 111);
		cardRepresentationPanel3.add(thefirstofpagans);

		throneofdarkness.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/throneofdarkness.jpg")));
		throneofdarkness.setBounds(422, 264, 80, 111);
		cardRepresentationPanel3.add(throneofdarkness);

		unknown.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/unknown.jpg")));
		unknown.setBounds(522, 264, 80, 111);
		cardRepresentationPanel3.add(unknown);

		upsidedown.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/upsidedown.jpg")));
		upsidedown.setBounds(20, 11, 80, 111);
		cardRepresentationPanel4.add(upsidedown);

		voodoo.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/voodoo.jpg")));
		voodoo.setBounds(120, 11, 80, 111);
		cardRepresentationPanel4.add(voodoo);

		zitoki.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
				.getResource("/images/underworld/zitoki.jpg")));
		zitoki.setBounds(221, 11, 80, 111);
		cardRepresentationPanel4.add(zitoki);

		zombieinvasion.setIcon(new ImageIcon(
				UnderworldDeckCardChoosingFrame.class
						.getResource("/images/underworld/zombieinvasion.jpg")));
		zombieinvasion.setBounds(324, 11, 80, 111);
		cardRepresentationPanel4.add(zombieinvasion);

		absenthia.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/absenthiab.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		ancientdemonic.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/ancientdemonicb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		angelofdeath.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/angelofdeathb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		armorofthedarksoul.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/armorofthedarksoulb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		arpetios.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/arpetiosb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		badhabit.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/badhabitb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		badluck.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/badluckb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		bladeofdarklord.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/bladeofdarklordb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		bloodcholic.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/bloodcholicb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		boatmanofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/boatmanofdarknessb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		callfromdarkness.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/callfromdarknessb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		cunningman.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/cunningmanb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		darkmagic.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/darkmagicb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		darkreflection.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/darkreflectionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		demonic.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/demonicb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		devilsadvocat.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/devilsadvocatb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fatalbonds.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/fatalbondsb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		fear.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/fearb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		gorillaofhell.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/gorillaofhellb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hellhounds.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hellhoundsb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus4b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		illusion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/illusionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		kahkasso.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/kahkassob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		khaduun.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/khaduunb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		khultzar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/khultzarb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		lordfear.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/lordfearb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manabonusb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manabonus2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manaregenerationb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		manaregeneration2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manaregeneration2b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		manaregeneration3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manaregeneration3b.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		normorepain.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/normorepainb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		pickpocket.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/pickpocketb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		poisonofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/poisonofdarknessb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		psychkick.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/psychkickb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		purgatory.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/purgatoryb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		quatsiah.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/quatsiahb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		rasputin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/rasputinb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		sacredritual.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/sacredritualb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		servantofdarklord.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/servantofdarklordb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shieldofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/shieldofdarknessb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		shiku.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/shikub.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		snakehead.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/snakeheadb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		soulreaper.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/soulreaperb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		spiderking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/spiderkingb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		steelofhell.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/steelofhellb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		suiciderskull.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/suiciderskullb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		surrogates.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/surrogatesb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		thefirstofpagans.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/thefirstofpagansb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		throneofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/throneofdarknessb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		unknown.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/unknownb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		upsidedown.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/upsidedownb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		voodoo.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/voodoob.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		zitoki.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/zitokib.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});
		zombieinvasion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent mEvt) {
				biggerVersionButton.setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/zombieinvasionb.jpg")));
				biggerVersionButton.setVisible(true);

			}
		});

		
		absenthia.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/absenthia.jpg")));
				selectedCard1.setVisible(true);
				key++;
				absenthia.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		
		ancientdemonic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/ancientdemonic.jpg")));
				selectedCard1.setVisible(true);
				key++;
				ancientdemonic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		angelofdeath.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/angelofdeath.jpg")));
				selectedCard1.setVisible(true);
				key++;
				angelofdeath.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		armorofthedarksoul.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/armorofthedarksoul.jpg")));
				selectedCard1.setVisible(true);
				key++;
				armorofthedarksoul.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		arpetios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/arpetios.jpg")));
				selectedCard1.setVisible(true);
				key++;
				arpetios.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		badhabit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/badhabit.jpg")));
				selectedCard1.setVisible(true);
				key++;
				badhabit.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		badluck.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/badluck.jpg")));
				selectedCard1.setVisible(true);
				key++;
				badluck.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		bladeofdarklord.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/bladeofdarklord.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bladeofdarklord.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		bloodcholic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/bloodcholic.jpg")));
				selectedCard1.setVisible(true);
				key++;
				bloodcholic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		boatmanofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/boatmanofdarkness.jpg")));
				selectedCard1.setVisible(true);
				key++;
				boatmanofdarkness.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		callfromdarkness.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/callfromdarkness.jpg")));
				selectedCard1.setVisible(true);
				key++;
				callfromdarkness.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		cunningman.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/cunningman.jpg")));
				selectedCard1.setVisible(true);
				key++;
				cunningman.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		darkmagic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/darkmagic.jpg")));
				selectedCard1.setVisible(true);
				key++;
				darkmagic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		darkreflection.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/darkreflection.jpg")));
				selectedCard1.setVisible(true);
				key++;
				darkreflection.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		demonic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/demonic.jpg")));
				selectedCard1.setVisible(true);
				key++;
				demonic.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		devilsadvocat.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/devilsadvocat.jpg")));
				selectedCard1.setVisible(true);
				key++;
				devilsadvocat.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		fatalbonds.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/fatalbonds.jpg")));
				selectedCard1.setVisible(true);
				key++;
				fatalbonds.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		fear.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/fear.jpg")));
				selectedCard1.setVisible(true);
				key++;
				fear.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		gorillaofhell.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/gorillaofhell.jpg")));
				selectedCard1.setVisible(true);
				key++;
				gorillaofhell.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		hellhounds.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hellhounds.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hellhounds.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		hpbonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		hpbonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		hpbonus3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus3.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		hpbonus4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/hpbonus4.jpg")));
				selectedCard1.setVisible(true);
				key++;
				hpbonus4.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		illusion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/illusion.jpg")));
				selectedCard1.setVisible(true);
				key++;
				illusion.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		kahkasso.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/kahkasso.jpg")));
				selectedCard1.setVisible(true);
				key++;
				kahkasso.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		khaduun.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/khaduun.jpg")));
				selectedCard1.setVisible(true);
				key++;
				khaduun.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});

		khultzar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/khultzar.jpg")));
				selectedCard1.setVisible(true);
				key++;
				khultzar.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		lordfear.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/lordfear.jpg")));
				selectedCard1.setVisible(true);
				key++;
				lordfear.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		manabonus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manabonus.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		manabonus2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manabonus2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manabonus2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		manaregeneration.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manaregeneration.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		manaregeneration2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manaregeneration2.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration2.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});

		manaregeneration3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/manaregeneration3.jpg")));
				selectedCard1.setVisible(true);
				key++;
				manaregeneration3.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		normorepain.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/normorepain.jpg")));
				selectedCard1.setVisible(true);
				key++;
				normorepain.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		pickpocket.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/pickpocket.jpg")));
				selectedCard1.setVisible(true);
				key++;
				pickpocket.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		poisonofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/poisonofdarkness.jpg")));
				selectedCard1.setVisible(true);
				key++;
				poisonofdarkness.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		psychkick.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/psychkick.jpg")));
				selectedCard1.setVisible(true);
				key++;
				psychkick.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		purgatory.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/purgatory.jpg")));
				selectedCard1.setVisible(true);
				key++;
				purgatory.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		quatsiah.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/quatsiah.jpg")));
				selectedCard1.setVisible(true);
				key++;
				quatsiah.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		rasputin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/rasputin.jpg")));
				selectedCard1.setVisible(true);
				key++;
				rasputin.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		sacredritual.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/sacredritual.jpg")));
				selectedCard1.setVisible(true);
				key++;
				sacredritual.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		servantofdarklord.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/servantofdarklord.jpg")));
				selectedCard1.setVisible(true);
				key++;
				servantofdarklord.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		shieldofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/shieldofdarkness.jpg")));
				selectedCard1.setVisible(true);
				key++;
				shieldofdarkness.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));
			}
		});
		shiku.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/shiku.jpg")));
				selectedCard1.setVisible(true);
				key++;
				shiku.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		snakehead.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/snakehead.jpg")));
				selectedCard1.setVisible(true);
				key++;
				snakehead.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		soulreaper.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/soulreaper.jpg")));
				selectedCard1.setVisible(true);
				key++;
				soulreaper.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		spiderking.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/spiderking.jpg")));
				selectedCard1.setVisible(true);
				key++;
				spiderking.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		steelofhell.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/steelofhell.jpg")));
				selectedCard1.setVisible(true);
				key++;
				steelofhell.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		suiciderskull.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/suiciderskull.jpg")));
				selectedCard1.setVisible(true);
				key++;
				suiciderskull.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		surrogates.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/surrogates.jpg")));
				selectedCard1.setVisible(true);
				key++;
				surrogates.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		thefirstofpagans.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/thefirstofpagans.jpg")));
				selectedCard1.setVisible(true);
				key++;
				thefirstofpagans.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		throneofdarkness.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/throneofdarkness.jpg")));
				selectedCard1.setVisible(true);
				key++;
				throneofdarkness.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		unknown.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/unknown.jpg")));
				selectedCard1.setVisible(true);
				key++;
				unknown.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		upsidedown.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/upsidedown.jpg")));
				selectedCard1.setVisible(true);
				key++;
				upsidedown.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		voodoo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/voodoo.jpg")));
				selectedCard1.setVisible(true);
				key++;
				voodoo.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		zitoki.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/zitoki.jpg")));
				selectedCard1.setVisible(true);
				key++;
				zitoki.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});
		zombieinvasion.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mEvt) {
				selectedCards[key].setIcon(new ImageIcon(
						UnderworldDeckCardChoosingFrame.class
								.getResource("/images/underworld/zombieinvasion.jpg")));
				selectedCard1.setVisible(true);
				key++;
				zombieinvasion.setIcon(new ImageIcon(UnderworldDeckCardChoosingFrame.class
						.getResource("/images/backofdeck.png")));

			}
		});

	}
}
