package main_hm;
import java.util.Objects;

public class Persona {
	private int eta;
	private String nome;
	private String cognome;
	public Persona(int eta, String nome, String cognome) {
		super();
		this.eta = eta;
		this.nome = nome;
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Persona [eta=" + eta + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cognome, eta, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cognome, other.cognome) && eta == other.eta && Objects.equals(nome, other.nome);
	}
	
	
}
