package archy.soft.quizter.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "examen")
public class Examen {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
	//@Column
	//private int user_id; 
	
	//@ManyToOne
    //@JoinColumn(name = "users_id")
	//Users users;

}
