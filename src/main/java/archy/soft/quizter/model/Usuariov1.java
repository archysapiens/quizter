package archy.soft.quizter.model;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
import javax.persistence.Entity;
>>>>>>> ddf02acce94ba684eaa3d9d03791578890a53b00
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuariosv1")
public class Usuariov1 {

	@Id
<<<<<<< HEAD
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	@Column
	private String app;
	@Column
	private String apm;
	@Column
	private char rfc;
	@Column
	private char curp;
	
=======
	private int id;
	private String nombre;
	private String app;
	private String apm;
	private char rfc;
	private char curp;
>>>>>>> ddf02acce94ba684eaa3d9d03791578890a53b00
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
