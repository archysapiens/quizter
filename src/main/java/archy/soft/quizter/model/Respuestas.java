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


@Entity(name = "respuestas")
public class Respuestas {
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_respuesta;
	@Column
	private String opcion;
	@Column
	private char tipo_opcion;
	@Column
	private char status;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_actualizacion;  
	@ManyToOne
	@JoinColumn(name = "preguntas_id")
	Preguntas preguntas;
	
	
}
