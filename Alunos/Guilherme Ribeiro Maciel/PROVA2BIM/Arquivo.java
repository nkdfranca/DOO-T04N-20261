package MySeries;

import java.util.ArrayList;
import java.util.List;

public class Arquivo{
	private String usuario;
	private List<Show> series = new ArrayList<>();
	
	public Arquivo() {
		
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public List<Show> getSeries() {
		return series;
	}
	
	public void setSeries1(Show series) {
		this.series.add(series);
	}
	
	public void setSeries(ArrayList<Show> series) {
		this.series = series;
	}
	
	public void AllSeries() {
		for(int i = 0; i < series.size(); i++) {
			System.out.println(getSeries().get(i).getName());
		}
	}
	
	public String resumo() {
		return "Usuario: " + getUsuario() + ", Serie: " + getSeries().get(0).getName();
	}
}
