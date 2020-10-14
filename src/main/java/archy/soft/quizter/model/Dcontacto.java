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
@Table(name="dcontacto")
public class Dcontacto {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false, length = 256)
	private String contacto;
	
	@Column(nullable=false, length = 1)
	private char estatus;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date fecha_actuali;
	
	@ManyToOne
	@JoinColumn(name = "Catalogo_contacto_id")
	Cat_contac cat_contac;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	users users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	public Date getFecha_actuali() {
		return fecha_actuali;
	}

	public void setFecha_actuali(Date fecha_actuali) {
		this.fecha_actuali = fecha_actuali;
	}

	public Cat_contac getCat_contac() {
		return cat_contac;
	}

	public void setCat_contac(Cat_contac cat_contac) {
		this.cat_contac = cat_contac;
	}

	public users getUsers() {
		return users;
	}

	public void setUsers(users users) {
		this.users = users;
	}
	
	

}
