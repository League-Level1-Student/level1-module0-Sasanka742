package extra;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class FortuneCookie implements ActionListener{
	
	public static void main(String[] args) {
		FortuneCookie one = new FortuneCookie();
		one.showButton();
	}
	JButton button = new JButton("Fortune");
	
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		
		frame.pack();
	}
	

	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if(arg0.getSource()==button) {
			int rand = new Random().nextInt(6);
			JOptionPane.showMessageDialog(null, "Woohoo!");
			if(rand==1) {
				JOptionPane.showMessageDialog(null, "You will be rich!");
			}else if(rand==2) {
				JOptionPane.showMessageDialog(null, "You will become a billionaire!");
			}else if(rand==3) {
				JOptionPane.showMessageDialog(null, "You will win the lottery!");
			}else if(rand==4) {
				JOptionPane.showMessageDialog(null, "You will invent a time machine!");
			}else if(rand==5) {
				JOptionPane.showMessageDialog(null, "You will find a fortune cookie that says about your future!");
			}
		}
		
	}
	
}

