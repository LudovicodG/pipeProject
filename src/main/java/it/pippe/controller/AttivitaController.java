package it.pippe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.pippe.entity.Attivita;
import it.pippe.entity.Dipendente;
import it.pippe.model.AttivitaDto;
import it.pippe.model.DipendenteDto;
import it.pippe.service.AttivitaService;
import it.pippe.service.DipendenteService;

@Controller
public class AttivitaController {

	@Autowired
	AttivitaService attivitaService;
	@Autowired
	DipendenteService dipendenteService;

	@RequestMapping(value = "/attivita")
	public String mapping(ModelMap model) {

		List<AttivitaDto> attivita = attivitaService.getAll();
		model.addAttribute("attivita", attivita);

		return "leggiAttivita";
	}

	@RequestMapping(value = "/addAttivita", method = RequestMethod.GET)
	public String newAttivita(ModelMap model , @ModelAttribute("listDipendenti") List<DipendenteDto> listId) {
		Attivita attivita = new Attivita();
		model.addAttribute("attivita", attivita);
		
		return "addAttivita";
	}

	// Aggiungi Attivita
	@RequestMapping(value = "/addAttivita", method = RequestMethod.POST)
	public String addAttivita(@ModelAttribute("attivita") AttivitaDto attivita) {

		List<DipendenteDto> list=dipendenteService.getAll();
		//attivita.setListaDipendenti(list);
		attivitaService.saveOrUpdate(attivita);
		return "welcome";
	}

	@RequestMapping(value = { "/updateAttivita" }, method = RequestMethod.GET)
	public String updateAttivita(@RequestParam("id") long id, ModelMap model) {
		AttivitaDto attivita = new AttivitaDto();
		attivita = attivitaService.getAttivitaById(id);
		model.addAttribute("attivita", attivita);
		return "addAttivita";
	}

	@RequestMapping(value = { "/deleteAtt" }, method = RequestMethod.GET)
	public String deleteAttivita(@RequestParam("id") long id, ModelMap model) {
		AttivitaDto attivita = new AttivitaDto();
		attivita = attivitaService.getAttivitaById(id);
		model.addAttribute("attivita", attivita);
		attivitaService.remove(attivita);
		return "welcome";
	}

	@ModelAttribute("listDipendenti")
	public List<DipendenteDto> listStato() {
		return dipendenteService.getAll();
	}

}
