package classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Personagem {
	private String name;
	private double power;
	private int level;
	private Calendar dateOfBirth;
	private Date data;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Personagem(String name, double power, int level, Calendar dateOfBirth) {
		this.name = name;
		this.power = power;
		this.level = level;
		this.dateOfBirth = dateOfBirth;
	}

	public Date converteCalendarParaDate(Calendar c) {
		return data = dateOfBirth.getTime();
	}

	public String converteDateParaSimpleDateFormat(Date date) {
		return sdf.format(date);
	}

	@Override
	public String toString() {
		return "Name: "
				+ name
				+ "; power: "
				+ Double.toString(power)
				+ "; level: "
				+ Integer.toString(level)
				+ ", birth: "
				+ converteDateParaSimpleDateFormat(converteCalendarParaDate(dateOfBirth));
	}
}
