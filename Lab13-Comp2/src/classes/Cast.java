package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Cast {
	private ArrayList<Personagem> castList = new ArrayList<>();
	private String arqName;
	private File file;

	public ArrayList<Personagem> getCastList() {
		return castList;
	}

	public void setCastList(ArrayList<Personagem> castList) {
		this.castList = castList;
	}

	public String getArqName() {
		return arqName;
	}

	public void setArqName(String arqName) {
		this.arqName = arqName;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String toString() {
		String str = new String();
		Iterator<Personagem> itr = castList.iterator();
		while (itr.hasNext()) {
			Personagem element = itr.next();
			str += element.toString();
			str += "\n";
		}

		return str;
	}

	public void readPersonagens() {
		try {
			file = new File(arqName);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			int lidos = 0;
			System.out.println("Lendo...\n");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				addPersonagem(line);
				lidos++;
			}
			System.out.println("\nJá li " + lidos + " personagens...");
			reader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addPersonagem(String lineToParse) {
		// TODO Auto-generated method stub
		String[] tokens = lineToParse.split("/");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(tokens[3]));
		c.set(Calendar.MONTH, Integer.parseInt(tokens[4]));
		c.set(Calendar.YEAR, Integer.parseInt(tokens[5]));
		Personagem nextPersonagem = new Personagem(tokens[0],
				Double.parseDouble(tokens[1]), Integer.parseInt(tokens[2]), c);
		castList.add(nextPersonagem);
	}
}
