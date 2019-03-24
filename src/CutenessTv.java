import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	JButton showDucks = new JButton("Ducks");
	JButton showFrog = new JButton("Frog ");
	JButton showUnicorn = new JButton("Unicorn");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		CutenessTv tv = new CutenessTv();
		tv.showAnimal();
	}
	private void showAnimal() {
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		showDucks.addActionListener(this);
		showFrog.addActionListener(this);
		showUnicorn.addActionListener(this);
		panel.add(showDucks);
		panel.add(showFrog);
		panel.add(showUnicorn);
		frame.add(panel);
		frame.pack();	
	}
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(arg0.getSource()==showDucks){
			showDucks();
		}else if(arg0.getSource()==showFrog){
			showFrog();
		}else if(arg0.getSource()==showUnicorn) {
			showFluffyUnicorns();
		}
	}
}
