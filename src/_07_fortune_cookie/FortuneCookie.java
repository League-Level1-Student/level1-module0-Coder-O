package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.setVisible(true);
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int rand = new Random().nextInt(5);
		
		if(rand == 0) {
			JOptionPane.showMessageDialog(null, "You will likely exist sometime in the near future.");
		} else if(rand == 1) {
			JOptionPane.showMessageDialog(null, "You will likely breath sometime in the near future.");
		} else if(rand == 2) {
			JOptionPane.showMessageDialog(null, "You will likely be alive sometime in the near future.");
		} else if(rand == 3) {
			JOptionPane.showMessageDialog(null, "You will likely finish reading this statement sometime in the near future.");
		} else if(rand == 4) {
			JOptionPane.showMessageDialog(null, "You will likely die sometime in the future.");
		}
	}

}
