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
@Table(name = "respuestas")
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
	public int getId_respuesta() {
		return id_respuesta;
	}
	public void setId_respuesta(int id_respuesta) {
		this.id_respuesta = id_respuesta;
	}
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	public char getTipo_opcion() {
		return tipo_opcion;
	}
	public void setTipo_opcion(char tipo_opcion) {
		this.tipo_opcion = tipo_opcion;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public Calendar getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	public void setFecha_actualizacion(Calendar fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}
	public Preguntas getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(Preguntas preguntas) {
		this.preguntas = preguntas;
	}	

}
