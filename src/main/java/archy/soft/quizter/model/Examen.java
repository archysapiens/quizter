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
@Table(name = "examen")
public class Examen {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examen_id;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_aplicacion;
	@Column
    private int tiempo_limite;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_hora_inicio;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_hora_fin;  
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_vigencia_inicio; 
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_vigencia_fin;                    
	@Column
	private int resultado;  
	@Column
	private char status; 
	@Column
	private int user_id2;                    
	@ManyToOne
    @JoinColumn(name = "users_id")
	Usuariov1 usuariov1;
	public int getExamen_id() {
		return examen_id;
	}
	public void setExamen_id(int examen_id) {
		this.examen_id = examen_id;
	}
	public Calendar getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(Calendar fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public int getTiempo_limite() {
		return tiempo_limite;
	}
	public void setTiempo_limite(int tiempo_limite) {
		this.tiempo_limite = tiempo_limite;
	}
	public Calendar getFecha_hora_inicio() {
		return fecha_hora_inicio;
	}
	public void setFecha_hora_inicio(Calendar fecha_hora_inicio) {
		this.fecha_hora_inicio = fecha_hora_inicio;
	}
	public Calendar getFecha_hora_fin() {
		return fecha_hora_fin;
	}
	public void setFecha_hora_fin(Calendar fecha_hora_fin) {
		this.fecha_hora_fin = fecha_hora_fin;
	}
	public Calendar getFecha_vigencia_inicio() {
		return fecha_vigencia_inicio;
	}
	public void setFecha_vigencia_inicio(Calendar fecha_vigencia_inicio) {
		this.fecha_vigencia_inicio = fecha_vigencia_inicio;
	}
	public Calendar getFecha_vigencia_fin() {
		return fecha_vigencia_fin;
	}
	public void setFecha_vigencia_fin(Calendar fecha_vigencia_fin) {
		this.fecha_vigencia_fin = fecha_vigencia_fin;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public int getUser_id2() {
		return user_id2;
	}
	public void setUser_id2(int user_id2) {
		this.user_id2 = user_id2;
	}
	public Usuariov1 getUsuariosv1() {
		return usuariov1;
	}
	public void setUsuariosv1(Usuariov1 usuariov1) {
		this.usuariov1 = usuariov1;
	}
}
