package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jack_in_the_Box implements ActionListener{
	public static String pic = "jackInTheBox.png";

	public static void main(String[] args) {
		Jack_in_the_Box one = new Jack_in_the_Box();
		
		one.showPicture(pic);
	}
	int counter=0;
	JLabel imageLabel;
	AudioClip sound;
	JButton button = new JButton("Surprise");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	private void showPicture(String fileName) { 
	     try {
	          imageLabel = createLabelImage(fileName);
	          frame.setSize(500,500);
	          frame.setVisible(true);
	          button.addActionListener(this);
	          panel.add(button);
	          frame.add(panel);
	          frame.pack();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private void showPic() {
		
        panel.add(imageLabel);
        frame.add(panel);
        playSound("152355__supermatt1896__cat-rats-drum-loop.wav");
        frame.pack();
		
	}
	
	
	
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
			counter++;
			if(counter==5) {
				showPic();
			}
			
		}
			
}
