package archy.soft.quizter.model;



import java.util.Date;

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
@Table(name="domicilio")
public class Domicilio {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false, length = 256)
	private String calle;
	
	@Column(nullable=false, length = 64)
	private String numero;
	
	@Column(nullable=false, length = 64)
	private String numero_int;
	
	@Column(nullable=false, length = 256)
	private String colonia;
	
	@Column(nullable=false, length = 256)
	private String mpio;
	
	@Column(nullable=false, length = 5)
	private char cp;
	
	@Column(nullable=false, length = 128)
	private String estado;
	
	@Column(nullable=false)
	private char estatus;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_actualizacion;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	users users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero_int() {
		return numero_int;
	}

	public void setNumero_int(String numero_int) {
		this.numero_int = numero_int;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMpio() {
		return mpio;
	}

	public void setMpio(String mpio) {
		this.mpio = mpio;
	}

	public char getCp() {
		return cp;
	}

	public void setCp(char cp) {
		this.cp = cp;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}

	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}

	public users getUsers() {
		return users;
	}

	public void setUsers(users users) {
		this.users = users;
	}

	
	
	
}
