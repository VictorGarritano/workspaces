package classes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SimpleGUI1 {

	JButton button = new JButton("Click me!");
	JFrame frame = new JFrame("Gran Janela");
	JPanel panel = new JPanel();

	public void go() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel, BorderLayout.SOUTH);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				button.setText("I've been clicked");
			}
		});
		panel.add(button);

		frame.pack();
		frame.setSize(400, 400);
		frame.setVisible(true);

	}
}
