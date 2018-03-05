package it.pippe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pippe.dao.DipendenteDAO;
import it.pippe.entity.Dipendente;
import it.pippe.mapper.DipendenteMapper;
import it.pippe.mapper.DipendenteMapperImplements;
import it.pippe.model.DipendenteDto;

@Service("dipendenteService")
public class DipendenteServiceImpl implements DipendenteService {

	@Autowired
	DipendenteDAO dao;

	public void saveOrUpdate(DipendenteDto entityDto) {
		Dipendente entity= DipendenteMapper.INSTANCE.toEntity(entityDto);
		dao.saveOrUpdate(entity);
	}

	public List<DipendenteDto> getAll() {
		List<Dipendente> dipendenti=dao.getAll();
		DipendenteMapperImplements mapp= new DipendenteMapperImplements();
		return mapp.toDto(dipendenti);
	}

	public DipendenteDto get(Long id) {
		Dipendente dipendente=dao.get(id);
		DipendenteDto entityDto= DipendenteMapper.INSTANCE.toDto(dipendente);
		return entityDto;
	}

	public void remove(DipendenteDto entityDto) {
		Dipendente entity= DipendenteMapper.INSTANCE.toEntity(entityDto);
		dao.remove(entity);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public DipendenteDto getDipendenteById(long id) {
		Dipendente dipendente=dao.getDipendenteById(id);
		DipendenteDto entityDto= DipendenteMapper.INSTANCE.toDto(dipendente);
		return entityDto;
	}



	

}
