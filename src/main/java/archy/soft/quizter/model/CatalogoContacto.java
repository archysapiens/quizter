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
@Table(name = "catalogo_contactov1")
public class CatalogoContacto {
	
	@Id
<<<<<<< HEAD
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
=======
	private int id;
>>>>>>> ddf02acce94ba684eaa3d9d03791578890a53b00
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
