package net.ishukone.perplexedtheta;

import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// vars
		JFrame frame = new JFrame("mainWindow");
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		JButton okButton = new JButton("ok");
		JButton cancelButton = new JButton("cancel");
		JLabel label = new JLabel("Hello, world!");

		// set default close behaviour
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				//call another method in the same class which will close this Jframe
				frame.dispose();
			}
		});
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent event) {
				//call another method in the same class which will close this Jframe
				frame.dispose();
			}
		});

		// add ok / cancel
		panel.add(okButton);
		panel.add(cancelButton);

		// add label
		textArea.append("Hello, world!\n");

		// set window panel settings
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		// render window
		frame.setPreferredSize(new Dimension(640, 480));
		frame.pack();
		frame.setVisible(true);

		return;
	}
}
