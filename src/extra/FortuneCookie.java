package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class FortuneCookie {
	
	JButton button = new JButton();
	
	public static void main(String[] args) {
		FortuneCookie one = new FortuneCookie();
		one.showButton();
	
		
	}
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.add(button);
		button.addActionListener((ActionListener) this);
		
		Random random = new Random();
		int rand = random.nextInt(5);;
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "You will be rich!");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "You will be rich!");
		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "You will be rich!");
		}else if(rand==5) {
			JOptionPane.showMessageDialog(null, "You will be rich!");
		}
		frame.pack();
	}
	

	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()==button) {
		}
		JOptionPane.showMessageDialog(null, "Woohoooo!");
		}
	
	
}

