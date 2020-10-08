package archy.soft.quizter.model;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "evaluaciones")
public class Evaluaciones {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int respuesta;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_aplicacion;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_evaluacion;
	@ManyToOne
	@JoinColumn(name = "respuestas_id_respuestas")
	Respuestas respuestas;   
	@ManyToOne
	@JoinColumn(name = "preguntas_id")
	Preguntas preguntas; 
	@Column
	private char inciso;   
	@ManyToOne
	@JoinColumn(name = "examen_id")
	Examen examen;


}
