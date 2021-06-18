package Set;

public class Serie implements Comparable<Serie>{

	private String nome;
	private String genero;
	private int tempoDeEpsodio;
	
	public Serie(String nome, String genero, int tempoDeEpsodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoDeEpsodio = tempoDeEpsodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTempoDeEpsodio() {
		return tempoDeEpsodio;
	}

	public void setTempoDeEpsodio(int tempoDeEpsodio) {
		this.tempoDeEpsodio = tempoDeEpsodio;
	}

	@Override
	public String toString() {
		return "Serie [nome= " + nome + ", genero= " + genero + ", tempoDeEpsodio= " + tempoDeEpsodio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + tempoDeEpsodio;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempoDeEpsodio != other.tempoDeEpsodio)
			return false;
		return true;
	}

	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoDeEpsodio(), serie.getTempoDeEpsodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}else {
			return this.getGenero().compareTo(serie.getGenero());
		}
	}
}
