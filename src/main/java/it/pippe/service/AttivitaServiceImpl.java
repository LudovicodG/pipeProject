package it.pippe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.pippe.dao.AttivitaDAO;
import it.pippe.entity.Attivita;
import it.pippe.mapper.AttivitaMapper;
import it.pippe.mapper.AttivitaMapperImplements;
import it.pippe.model.AttivitaDto;

@Service("serviceAttivita")
public class AttivitaServiceImpl implements AttivitaService {

	@Autowired
	AttivitaDAO dao;

	public void saveOrUpdate(AttivitaDto entityDto) {
		Attivita entity= AttivitaMapper.INSTANCE.toEntity(entityDto);
		dao.saveOrUpdate(entity);
	}

	public List<AttivitaDto> getAll() {
//		List<Attivita> attivita = dao.getAll();		
//		return AttivitaMapper.INSTANCE.toDto(attivita);
		
		List<Attivita> attivita=dao.getAll();
		AttivitaMapperImplements att= new AttivitaMapperImplements();
		return att.toDto(attivita);
		
		
	}

	public AttivitaDto get(Long id) {
		Attivita attivita = dao.get(id);
		AttivitaDto entityDto = AttivitaMapper.INSTANCE.toDto(attivita);
		return entityDto;
	}

	public void remove(AttivitaDto entityDto) {
		Attivita attivita= AttivitaMapper.INSTANCE.toEntity(entityDto);
		dao.remove(attivita);
	}

	public void remove(Long id) {
		dao.remove(id);
	}

	public AttivitaDto getAttivitaById(long id) {
		Attivita attivita = dao.getAttivitaById(id);
		AttivitaDto entityDto = AttivitaMapper.INSTANCE.toDto(attivita);
		return entityDto;
	}

}
