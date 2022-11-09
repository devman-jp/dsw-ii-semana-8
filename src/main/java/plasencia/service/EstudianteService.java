package plasencia.service;

import java.util.List;

import plasencia.model.Estudiante;

public interface EstudianteService {

	List<Estudiante> listarEstudiantes();
	Estudiante obtenerEstudiante(Integer id);
	
}
