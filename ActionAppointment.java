import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ActionAppointment {
	public static String frame;
	public static String path;

	public static void frameRecall() {

		MainMenuFrame.newGameButton.setActionCommand("newGameButton");
		MainMenuFrame.newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();

				if (command.equals("newGameButton")) {
					try {
						DeckChoosingFrame.deckChoosingFrame();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					MainMenuFrame.mainMenuFrame.dispose();
				}
			}
		});
		DeckChoosingFrame.earthDeckButton.setActionCommand("earthDeckButton");
		DeckChoosingFrame.earthDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("earthDeckButton")) {
							try {
								EarthDeckCardChoosingFrame.CardChoosingFrame();
								// playSound();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.waterDeckButton.setActionCommand("waterDeckButton");
		DeckChoosingFrame.waterDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("waterDeckButton")) {
							try {
								WaterDeckCardChoosingFrame.CardChoosingFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.natureDeckButton.setActionCommand("natureDeckButton");
		DeckChoosingFrame.natureDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("natureDeckButton")) {
							try {
								NatureDeckCardChoosingFrame.CardChoosingFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();

						}
					}
				});
		DeckChoosingFrame.fireDeckButton.setActionCommand("fireDeckButton");
		DeckChoosingFrame.fireDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("fireDeckButton")) {
							try {
								FireDeckCardChoosingFrame.CardChoosingFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.glacierDeckButton
				.setActionCommand("glacierDeckButton");
		DeckChoosingFrame.glacierDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("glacierDeckButton")) {
							try {
								GlacierDeckCardChoosingFrame
										.CardChoosingFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});
		DeckChoosingFrame.underworldDeckButton
				.setActionCommand("underworldDeckButton");
		DeckChoosingFrame.underworldDeckButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("underworldDeckButton")) {
							try {
								UnderworldDeckCardChoosingFrame
										.CardChoosingFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							DeckChoosingFrame.deckChoosingFrame.dispose();
						}
					}
				});

		EarthDeckCardChoosingFrame.panel1arrowRight
				.setActionCommand("nextButton");
		EarthDeckCardChoosingFrame.panel1arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("nextButton")) {
							EarthDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(false);
							EarthDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		EarthDeckCardChoosingFrame.panel2arrowRight
				.setActionCommand("panel2arrowRight");
		EarthDeckCardChoosingFrame.panel2arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowRight")) {
							EarthDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							EarthDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		EarthDeckCardChoosingFrame.panel2arrowLeft
				.setActionCommand("panel2arrowLeft");
		EarthDeckCardChoosingFrame.panel2arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowLeft")) {
							EarthDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							EarthDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(true);

						}
					}
				});
		EarthDeckCardChoosingFrame.panel3arrowLeft
				.setActionCommand("panel3arrowLeft");
		EarthDeckCardChoosingFrame.panel3arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowLeft")) {
							EarthDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							EarthDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});

		EarthDeckCardChoosingFrame.playButton.setActionCommand("playButton");
		EarthDeckCardChoosingFrame.playButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("playButton")) {
							try {
								GameProcessFrame.gameProcessFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							};
							EarthDeckCardChoosingFrame.cardChoosingFrame
									.dispose();
						}
					}
				});
		

		FireDeckCardChoosingFrame.panel1arrowRight
				.setActionCommand("panel1arrowRight");
		FireDeckCardChoosingFrame.panel1arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel1arrowRight")) {
							FireDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(false);
							FireDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		FireDeckCardChoosingFrame.panel2arrowRight
				.setActionCommand("panel2arrowRight");
		FireDeckCardChoosingFrame.panel2arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowRight")) {
							FireDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							FireDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		FireDeckCardChoosingFrame.panel2arrowLeft
				.setActionCommand("panel2arrowLeft");
		FireDeckCardChoosingFrame.panel2arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowLeft")) {
							FireDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							FireDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(true);

						}
					}
				});
		FireDeckCardChoosingFrame.panel3arrowLeft
				.setActionCommand("panel3arrowLeft");
		FireDeckCardChoosingFrame.panel3arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowLeft")) {
							FireDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							FireDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});

		FireDeckCardChoosingFrame.playButton.setActionCommand("playButton");
		FireDeckCardChoosingFrame.playButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("playButton")) {
							try {
								GameProcessFrame.gameProcessFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							FireDeckCardChoosingFrame.cardChoosingFrame
									.dispose();
						}
					}
				});

	
		GlacierDeckCardChoosingFrame.panel1arrowRight
				.setActionCommand("nextButton");
		GlacierDeckCardChoosingFrame.panel1arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("nextButton")) {
							GlacierDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(false);
							GlacierDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		GlacierDeckCardChoosingFrame.panel2arrowRight
				.setActionCommand("panel2arrowRight");
		GlacierDeckCardChoosingFrame.panel2arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowRight")) {
							GlacierDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							GlacierDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		GlacierDeckCardChoosingFrame.panel2arrowLeft
				.setActionCommand("panel2arrowLeft");
		GlacierDeckCardChoosingFrame.panel2arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowLeft")) {
							GlacierDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							GlacierDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(true);

						}
					}
				});
		GlacierDeckCardChoosingFrame.panel3arrowLeft
				.setActionCommand("panel3arrowLeft");
		GlacierDeckCardChoosingFrame.panel3arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowLeft")) {
							GlacierDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							GlacierDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});

		GlacierDeckCardChoosingFrame.playButton.setActionCommand("playButton");
		GlacierDeckCardChoosingFrame.playButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("playButton")) {
							try {
								GameProcessFrame.gameProcessFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							GlacierDeckCardChoosingFrame.cardChoosingFrame
									.dispose();
						}
					}
				});
	

		NatureDeckCardChoosingFrame.panel1arrowRight
				.setActionCommand("nextButton");
		NatureDeckCardChoosingFrame.panel1arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("nextButton")) {
							NatureDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(false);
							NatureDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		NatureDeckCardChoosingFrame.panel2arrowRight
				.setActionCommand("panel2arrowRight");
		NatureDeckCardChoosingFrame.panel2arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowRight")) {
							NatureDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							NatureDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		NatureDeckCardChoosingFrame.panel2arrowLeft
				.setActionCommand("panel2arrowLeft");
		NatureDeckCardChoosingFrame.panel2arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowLeft")) {
							NatureDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							NatureDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(true);

						}
					}
				});
		NatureDeckCardChoosingFrame.panel3arrowLeft
				.setActionCommand("panel3arrowLeft");
		NatureDeckCardChoosingFrame.panel3arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowLeft")) {
							NatureDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							NatureDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});

		NatureDeckCardChoosingFrame.playButton.setActionCommand("playButton");
		NatureDeckCardChoosingFrame.playButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("playButton")) {
							try {
								GameProcessFrame.gameProcessFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							NatureDeckCardChoosingFrame.cardChoosingFrame
									.dispose();
						}
					}
				});
	

		WaterDeckCardChoosingFrame.panel1arrowRight
				.setActionCommand("nextButton");
		WaterDeckCardChoosingFrame.panel1arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("nextButton")) {
							WaterDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(false);
							WaterDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		WaterDeckCardChoosingFrame.panel2arrowRight
				.setActionCommand("panel2arrowRight");
		WaterDeckCardChoosingFrame.panel2arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowRight")) {
							WaterDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							WaterDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		WaterDeckCardChoosingFrame.panel2arrowLeft
				.setActionCommand("panel2arrowLeft");
		WaterDeckCardChoosingFrame.panel2arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowLeft")) {
							WaterDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							WaterDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(true);

						}
					}
				});
		WaterDeckCardChoosingFrame.panel3arrowLeft
				.setActionCommand("panel3arrowLeft");
		WaterDeckCardChoosingFrame.panel3arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowLeft")) {
							WaterDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							WaterDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		WaterDeckCardChoosingFrame.panel3arrowRight
				.setActionCommand("panel3arrowRight");
		WaterDeckCardChoosingFrame.panel3arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowRight")) {
							WaterDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							WaterDeckCardChoosingFrame.cardRepresentationPanel4
									.setVisible(true);

						}
					}
				});
		WaterDeckCardChoosingFrame.panel4arrowLeft
				.setActionCommand("panel4arrowLeft");
		WaterDeckCardChoosingFrame.panel4arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel4arrowLeft")) {
							WaterDeckCardChoosingFrame.cardRepresentationPanel4
									.setVisible(false);
							WaterDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		WaterDeckCardChoosingFrame.playButton.setActionCommand("playButton");
		WaterDeckCardChoosingFrame.playButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("playButton")) {
							try {
								GameProcessFrame.gameProcessFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							WaterDeckCardChoosingFrame.cardChoosingFrame
									.dispose();
						}
					}
				});
		

		UnderworldDeckCardChoosingFrame.panel1arrowRight
				.setActionCommand("nextButton");
		UnderworldDeckCardChoosingFrame.panel1arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("nextButton")) {
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(false);
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		UnderworldDeckCardChoosingFrame.panel2arrowRight
				.setActionCommand("panel2arrowRight");
		UnderworldDeckCardChoosingFrame.panel2arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowRight")) {
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		UnderworldDeckCardChoosingFrame.panel2arrowLeft
				.setActionCommand("panel2arrowLeft");
		UnderworldDeckCardChoosingFrame.panel2arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel2arrowLeft")) {
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(false);
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel1
									.setVisible(true);

						}
					}
				});
		UnderworldDeckCardChoosingFrame.panel3arrowLeft
				.setActionCommand("panel3arrowLeft");
		UnderworldDeckCardChoosingFrame.panel3arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowLeft")) {
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel2
									.setVisible(true);

						}
					}
				});
		UnderworldDeckCardChoosingFrame.panel3arrowRight
				.setActionCommand("panel3arrowRight");
		UnderworldDeckCardChoosingFrame.panel3arrowRight
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel3arrowRight")) {
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(false);
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel4
									.setVisible(true);

						}
					}
				});
		UnderworldDeckCardChoosingFrame.panel4arrowLeft
				.setActionCommand("panel4arrowLeft");
		UnderworldDeckCardChoosingFrame.panel4arrowLeft
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("panel4arrowLeft")) {
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel4
									.setVisible(false);
							UnderworldDeckCardChoosingFrame.cardRepresentationPanel3
									.setVisible(true);

						}
					}
				});

		UnderworldDeckCardChoosingFrame.playButton
				.setActionCommand("playButton");
		UnderworldDeckCardChoosingFrame.playButton
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String command = e.getActionCommand();

						if (command.equals("playButton")) {
							try {
								GameProcessFrame.gameProcessFrame();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							UnderworldDeckCardChoosingFrame.cardChoosingFrame
									.dispose();
						}
					}
				});
		

		MainMenuFrame.exitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				MainMenuFrame.mainMenuFrame.dispose();
			}
		});

	}

	public static void playSound() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File((ActionAppointment.class
							.getResource("musics/sigurros.wav")).toURI()));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

}
