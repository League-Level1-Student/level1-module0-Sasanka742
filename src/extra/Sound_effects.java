package extra;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_effects implements ActionListener {

	public static void main(String[] args) {
		Sound_effects sound = new Sound_effects();
		sound.showButton();
	}
	AudioClip sound;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Next Sound Effect");
		
		
		private void showButton() {
		frame.setSize(500, 500);
		frame.setVisible(true);
		button.addActionListener(this);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		}
		
		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JButton buttonPressed = (JButton) arg0.getSource();
			if(arg0.getSource()==button){
				int rand = new Random().nextInt(3);
				if(rand==1) {
					playSound("/Level1-Module0/src/extra/152355__supermatt1896__cat-rats-drum-loop.wav");
				}else if(rand==2) {
					playSound("/Level1-Module0/src/extra/152355__supermatt1896__cat-rats-drum-loop.wav");
				}
			}
		}
		
		private void playSound(String soundFile) { 
		     try {
		          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		          sound.play();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
	
}
