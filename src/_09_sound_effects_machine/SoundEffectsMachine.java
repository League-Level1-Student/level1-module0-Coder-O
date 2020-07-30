package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	public void run() {
		JFrame frame = new JFrame();
		JPanel pannel = new JPanel();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        frame.setVisible(true);
        pannel.add(button1);
        pannel.add(button2);
        pannel.add(button3);
        pannel.add(button4);
        button1.setText("sawing-wood-daniel_simon.wav");
        button2.setText("sawing-wood-daniel_simon.wav");
        button3.setText("sawing-wood-daniel_simon.wav");
        button4.setText("sawing-wood-daniel_simon.wav");
        frame.add(pannel);
        frame.pack();
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		
		playSound(button.getText());
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
}
