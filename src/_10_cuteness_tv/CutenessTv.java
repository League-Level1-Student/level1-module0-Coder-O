package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {
	public void run() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton duckButton = new JButton();
		JButton frogButton = new JButton();
		JButton unicornButton = new JButton();
		duckButton.setText("Duck");
		frogButton.setText("Frog");
		unicornButton.setText("Unicorn");
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(unicornButton);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		duckButton.addActionListener(this);
		frogButton.addActionListener(this);
		unicornButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed.getText().equals("Duck")) {
			showDucks();
		} else if(buttonPressed.getText().equals("Frog")) {
			showFrog();
		} else if(buttonPressed.getText().equals("Unicorn")) {
			showFluffyUnicorns();
		}
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
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
