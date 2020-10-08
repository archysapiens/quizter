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

@Entity(name = "preguntas")
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
	@Temporal(TemporalType.DATE)
	private Calendar fecha_actualizacion;
	@ManyToOne
	@JoinColumn(name = "tema_id")
	Tema tema;
	
	@ManyToOne
    @JoinColumn(name = "users_id")
    Users users; 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public int getTipo_respuesta() {
		return tipo_respuesta;
	}
	public void setTipo_respuesta(int tipo_respuesta) {
		this.tipo_respuesta = tipo_respuesta;
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
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	

	     
	
	
}