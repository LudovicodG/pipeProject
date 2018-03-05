package it.pippe.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "attivita")
public class Attivita {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "inizio")
	private LocalDate inizio;
	@Column(name = "fine")
	private LocalDate fine;
	@Column(name = "descrizione")
	private String descrizione;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="attivita")
	private List<Dipendente> dipendenti;
	
	private String dipendente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getInizio() {
		return inizio;
	}

	public void setInizio(LocalDate inizio) {
		this.inizio = inizio;
	}

	public LocalDate getFine() {
		return fine;
	}

	public void setFine(LocalDate fine) {
		this.fine = fine;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(List<Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}

//	@Override
//	public String toString() {
//		return  id + "," +  nome + "," + inizio + ","+  fine + ","+ descrizione + ","+ dipendenti;
//	}
	@Override
	public String toString() {
		return "Attivita [id=" + id + ", nome=" + nome + ", inizio=" + inizio + ", fine=" + fine + ", descrizione="
				+ descrizione + ", dipendenti=" + dipendenti + ", dipendente=" + dipendente + "]";
	}
	public Attivita(long id, String nome, LocalDate inizio, LocalDate fine, String descrizione, List<Dipendente> dipendenti) {
		super();
		this.id = id;
		this.nome = nome;
		this.inizio = inizio;
		this.fine = fine;
		this.descrizione = descrizione;
		this.dipendenti = dipendenti;
	}

	public Attivita() {
		super();
	}

	public String getDipendente() {
		return dipendente;
	}

	public void setDipendente(String dipendente) {
		this.dipendente = dipendente;
	}



}
