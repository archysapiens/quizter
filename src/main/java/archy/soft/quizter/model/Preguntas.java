package archy.soft.quizter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Preguntas {

	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String pregunta;
	@Column
    private int tipo_respuesta;
	@Column
	private char status;
	@Column
	private String fecha_actualizacion;  
	@Column
	private int tema_id; 
	@Column
	private int users_id;       
	
	
}