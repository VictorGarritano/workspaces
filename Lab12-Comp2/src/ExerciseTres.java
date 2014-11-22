import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class ExerciseTres {
	
	JFrame frame = new JFrame("Button CheckBox");
	JButton botao = new JButton("Start!");
	ArrayList<JCheckBox> myCB = new ArrayList<>();
	GridLayout grid = new GridLayout(1, 16);
	
	public void go() {
		JPanel panel1 = new JPanel(grid);
		JPanel panel2 = new JPanel(grid);
		frame.add(BorderLayout.NORTH, botao);

		for (int i = 0; i < 16; i++) {
			panel1.add(new Label(Integer.toString(i)));
			myCB.add(new JCheckBox());
			panel2.add(myCB.get(i));

		}

		frame.add(BorderLayout.CENTER, panel1);
		frame.add(BorderLayout.SOUTH, panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 80);
		frame.setVisible(true);

		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < myCB.size(); i++) {
					if (myCB.get(i).isSelected()) {
						System.out.println("CheckBox " + i + " is selected.");
					}
				}
			}
		});
	}
}