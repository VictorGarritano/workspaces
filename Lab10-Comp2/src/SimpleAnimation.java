import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {

	private int x;
	private int y;
	private int width;
	private int height;
	private int radius;
	int passoX = 5;
	int passoY = 5;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(drawPanel);
		frame.setSize(width, height);
		frame.setVisible(true);

		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			x += passoX;
			y += passoY;
			drawPanel.repaint();
			try {
				Thread.sleep(50);
			} catch (Exception ex) {

			}
		}
	}

	@SuppressWarnings("serial")
	class MyDrawPanel extends JPanel {

		public void paintComponent(Graphics g) {
			g.setColor(Color.black);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);
			Color color = new Color(red, green, blue);
			g.setColor(color);
			double diagonal = Math.sqrt((this.getX() * this.getX())
					+ this.getY() * this.getY());
			if (x + diagonal >= width || x + diagonal <= 0) {
				passoX *= -1;
				// Completar isso para os 4 casos possíveis
			}
			if (y + diagonal >= height || y + diagonal <= 0) {
				passoY *= -1;
			}
			if (x + radius >= width || x + radius <= 0) {
				passoX *= -1;
			}
			if (y + radius >= height || y + radius <= 0) {
				passoY *= -1;
			}
			g.fillOval(x, y, getRadius(), getRadius());
		}
	}
}
