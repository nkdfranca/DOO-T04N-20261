package MySeries;

import java.util.ArrayList;

public class Arquivo {
	public String usuario;
	
	public ArrayList<ArrayList<Show>> series = new ArrayList<>();
	
	public Arquivo() {
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public ArrayList<ArrayList<Show>> getSeries() {
		return series;
	}
	
	public void setSeries(ArrayList<Show> series) {
		this.series.add(series);
	}
	
	public String resumo() {
		return "Usuario: " + getUsuario() + ", Serie: " + series.get(0).get(0).getName();
	}
}
