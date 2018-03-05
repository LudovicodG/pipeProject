package it.pippe.model;

import java.util.List;

public class DipendenteDto {

	private long matricola;
	private String nome;
	private String cognome;
	private String ruolo;
	private String e_mail;
	private List<AttivitaDto> listA;
	public long getMatricola() {
		return matricola;
	}
	public void setMatricola(long matricola) {
		this.matricola = matricola;
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
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public List<AttivitaDto> getListA() {
		return listA;
	}
	public void setListA(List<AttivitaDto> listA) {
		this.listA = listA;
	}
	@Override
	public String toString() {
		return "DipendenteDto [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo
				+ ", e_mail=" + e_mail + ", listA=" + listA + "]";
	}
	public DipendenteDto(long matricola, String nome, String cognome, String ruolo, String e_mail,
			List<AttivitaDto> listA) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.e_mail = e_mail;
		this.listA = listA;
	}
	public DipendenteDto() {
		super();
	}
	
	
	

}
