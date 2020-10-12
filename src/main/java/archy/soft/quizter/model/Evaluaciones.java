package archy.soft.quizter.model;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "evaluaciones")
public class Evaluaciones {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true, nullable = false)
	private int respuesta;
	@Column(unique = true, nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar fecha_aplicacion;
	@Column(unique = true , nullable = true)
	@Temporal(TemporalType.DATE)
	private Calendar fecha_evaluacion;
	@ManyToOne
	@JoinColumn(name = "id_respuesta" , nullable = false)
	private Respuestas respuestas;   
	
	@ManyToOne
	@JoinColumn(name = "preguntas_id", nullable = false)
	private Preguntas preguntas; 
	@Column(unique = true, nullable = true, length = 1)
	private char inciso;   
	@ManyToOne
	@JoinColumn(name = "examen_id", unique = true, nullable = false)
	private Examen examen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(int respuesta) {
		this.respuesta = respuesta;
	}
	public Calendar getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(Calendar fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public Calendar getFecha_evaluacion() {
		return fecha_evaluacion;
	}
	public void setFecha_evaluacion(Calendar fecha_evaluacion) {
		this.fecha_evaluacion = fecha_evaluacion;
	}
	public Respuestas getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(Respuestas respuestas) {
		this.respuestas = respuestas;
	}
	public Preguntas getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(Preguntas preguntas) {
		this.preguntas = preguntas;
	}
	public char getInciso() {
		return inciso;
	}
	public void setInciso(char inciso) {
		this.inciso = inciso;
	}
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
}
