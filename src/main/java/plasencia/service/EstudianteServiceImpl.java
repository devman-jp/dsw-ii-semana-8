package plasencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import plasencia.model.Estudiante;
import plasencia.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService{

	@Autowired
	private EstudianteRepository repository;
	
	@Override
	public List<Estudiante> listarEstudiantes() {
		return repository.findAll();
	}

	@Override
	public Estudiante obtenerEstudiante(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
