

public class verifica {
	 String nome;
	 int annoNascita;
	
	
	

public verifica (String nome, int annoNascita) {
	this.nome=nome;
	this.annoNascita=annoNascita;
}

public verifica() {
this.nome="christian";
this.annoNascita=2006;
}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getAnnoNascita() {
	return annoNascita;
}

public void setAnnoNascita(int annoNascita) {
	this.annoNascita = annoNascita;
}

public String toString() {
	return "verifica [nome: " + nome + ", annoNascita: " + annoNascita + "]";
}
}


