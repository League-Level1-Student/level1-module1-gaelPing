package _07_binary_converter;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_converter {
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();

	void button() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(rightButton);
		panel.add(leftButton);
		panel.add(text);

	}
}