package archy.soft.quizter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class users {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false, length = 128)
	private String nombre;
	
	@Column(nullable=false, length = 128)
	private String app;
	
	@Column(nullable=false, length = 128)
	private String apm;
	
	@Column(nullable=false, length = 13)
	private char rfc;
	
	@Column(nullable=false, length = 18)
	private char curp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public char getRfc() {
		return rfc;
	}

	public void setRfc(char rfc) {
		this.rfc = rfc;
	}

	public char getCurp() {
		return curp;
	}

	public void setCurp(char curp) {
		this.curp = curp;
	}
	
	

}
