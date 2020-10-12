package archy.soft.quizter.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "privilegios")
public class Privilegio {
	@Id
	private int id; 
	private String estatus;
	@Temporal(TemporalType.DATE)
	private Calendar fecha_actualizacion;
	
	@ManyToOne
	@JoinColumn(name = "users_id")
	private users user;
	
	@ManyToOne
	@JoinColumn(name = "roles_id")
	private Rol rol;
	
	@ManyToOne
	@JoinColumn(name = "modulos_id")
	private Modulo modul;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Calendar getFecha_actualizacion() {
		return fecha_actualizacion;
	}

	public void setFecha_actualizacion(Calendar fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}

	public users getUser() {
		return user;
	}

	public void setUser(users user) {
		this.user = user;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Modulo getModul() {
		return modul;
	}

	public void setModul(Modulo modul) {
		this.modul = modul;
	}

	
}
