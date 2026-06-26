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
	
	public void setSeries(List<Show> list) {
		this.series = list  != null ? new ArrayList<>(list) : new ArrayList<>();
	}
	
	public String resumo() {
		return "Usuario: " + getUsuario() + ", tamanho da lista: " + getSeries().size();
	}
}
