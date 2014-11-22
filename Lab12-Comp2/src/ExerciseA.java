//Nessa classe temos os exercicios 1 e 2 ( no cÃ³digo esta a ultima configuracao desejada no 2, mas eu ja
//testei as outras e tudo funcionou ...

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class ExerciseA {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		JButton botao1 = new JButton("botao1");
		JButton botao2 = new JButton("botao2");
		panel.add(botao2);
		frame.add(botao1);
		frame.add(BorderLayout.SOUTH, panel);
		frame.add(BorderLayout.NORTH, botao1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}
}