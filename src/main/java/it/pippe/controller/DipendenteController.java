package it.pippe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import it.pippe.entity.Dipendente;
import it.pippe.model.AttivitaDto;
import it.pippe.model.DipendenteDto;
import it.pippe.service.AttivitaService;
import it.pippe.service.DipendenteService;


@Controller
public class DipendenteController {

	@Autowired
	DipendenteService dipendenteService;
	
	@Autowired
	AttivitaService attivitaService;

	@RequestMapping(value = "/dipendenti")
	public String mapping(ModelMap model) {
		// Istanziazione della classe DAO
		List<DipendenteDto> dipendente = dipendenteService.getAll();
		model.addAttribute("dipendente", dipendente);

		return "leggiDipendente";

	}

	@RequestMapping(value = { "/addDipendente" }, method = RequestMethod.GET)
	public String newDipendente(ModelMap model) {
		DipendenteDto dipendente = new DipendenteDto();
		List<AttivitaDto> attivita = attivitaService.getAll();
		model.addAttribute("attivita", attivita);
		model.addAttribute("dipendente", dipendente);
		return "addDipendente";
	}

	// Aggiungi Dipendenti
	@RequestMapping(value = "/addDipendente", method = RequestMethod.POST)
	public String addDipendente(@ModelAttribute("dipendente") DipendenteDto dipendente) {
		dipendenteService.saveOrUpdate(dipendente);
		return "welcome";
	}

	@RequestMapping(value = { "/updateDipendente" }, method = RequestMethod.GET)
	public String updateAttivita(@RequestParam("matricola") long matricola, ModelMap model) {
		DipendenteDto dipendente = new DipendenteDto();
		dipendente = dipendenteService.getDipendenteById(matricola);
		model.addAttribute("dipendente", dipendente);
		return "addDipendente";
	}

	@RequestMapping(value = { "/deleteDipendente" }, method = RequestMethod.GET)
	public String deleteAttivita(@RequestParam("matricola") long matricola, ModelMap model) {
		DipendenteDto dipendente = new DipendenteDto();
		dipendente = dipendenteService.getDipendenteById(matricola);
		model.addAttribute("dipendente", dipendente);
		dipendenteService.remove(dipendente);
		return "welcome";
	}

}
