package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jack_in_the_Box implements ActionListener{
	public static void main(String[] args) {
		Jack_in_the_Box one = new Jack_in_the_Box();
		one.showPicture("jackInTheBox.png");
	}
	
	JButton button = new JButton("Surprise");
	
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setSize(500,500);
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.add(button);
	          button.addActionListener(this);
	          frame.pack();
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		int counter =0;
		while(e.getSource()==button) {
			counter++;
			if(counter==5) {
				showPicture("jackInTheBox.png");
				break;
			}
			
		}
		
	}
}
