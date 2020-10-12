package archy.soft.quizter.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity(name="domicilio")
//@Table(name="domicilio")
public class Domicilio {
	
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

	
	
	
}
