import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class SoundEffect {

	
	public static void selectingEffect() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File((ActionAppointment.class
							.getResource("musics/selectingeffect.wav")).toURI()));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
	
	public static void arrowsound() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File((ActionAppointment.class
							.getResource("musics/arrowsound.wav")).toURI()));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
	public static void clicksound() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File((ActionAppointment.class
							.getResource("musics/clicksound.wav")).toURI()));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
}
