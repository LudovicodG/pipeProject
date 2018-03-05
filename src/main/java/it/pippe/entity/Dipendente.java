package it.pippe.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import it.pippe.model.DipendenteDto;

@Entity
@Table(name = "dipendenti")

public class Dipendente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private long matricola;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "ruolo")
	private String ruolo;
	
	@Column(name="e_mail")
	private String e_mail;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "dipendenti_attivita", joinColumns = { @JoinColumn(name = "matricola") }, inverseJoinColumns = {
			@JoinColumn(name = "id") })
	private List<Attivita> attivita;

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

	public List<Attivita> getAttivita() {
		return attivita;
	}

	public void setAttivita(List<Attivita> attivita) {
		this.attivita = attivita;
	}

//	@Override
//	public String toString() {
//		return matricola + ","+  nome + ","+  cognome + ","+  ruolo
//				+ ","+  e_mail + ","  + attivita ;
//	}
	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo
				+ ", e_mail=" + e_mail + ", attivita=" + attivita + "]";
	}
	
	public Dipendente(long matricola, String nome, String cognome, String ruolo, String e_mail,
			List<Attivita> attivita) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.e_mail = e_mail;
		this.attivita = attivita;
	}

	public Dipendente() {
		super();
	}
	
	public Dipendente(DipendenteDto dipendenteDto) {
		super();
		
	}






}
