package archy.soft.quizter.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity(name="dcontacto")
public class Dcontacto {
	
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

}
