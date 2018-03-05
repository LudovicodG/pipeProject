package it.pippe.model;


import java.util.List;

public class AttivitaDto {
 
private String id;
private String nome;
private String inizio;
private String fine;
private String descrizione;
private List<DipendenteDto> listD ;

public AttivitaDto() {
	super();
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getInizio() {
	return inizio;
}

public void setInizio(String inizio) {
	this.inizio = inizio;
}

public String getFine() {
	return fine;
}

public void setFine(String fine) {
	this.fine = fine;
}

public String getDescrizione() {
	return descrizione;
}

public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}

public List<DipendenteDto> getListD() {
	return listD;
}

public void setListD(List<DipendenteDto> listD) {
	this.listD = listD;
}

@Override
public String toString() {
	return "AttivitaDto [id=" + id + ", nome=" + nome + ", inizio=" + inizio + ", fine=" + fine + ", descrizione="
			+ descrizione + ", listD=" + listD + "]";
}

public AttivitaDto(String id, String nome, String inizio, String fine, String descrizione, List<DipendenteDto> listD) {
	super();
	this.id = id;
	this.nome = nome;
	this.inizio = inizio;
	this.fine = fine;
	this.descrizione = descrizione;
	this.listD = listD;
}



}
