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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contacto_usuarios")
public class ContactoUsuario {
	
	@Id
<<<<<<< HEAD
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
=======
>>>>>>> ddf02acce94ba684eaa3d9d03791578890a53b00
	private int idCont;
	@ManyToOne
	@JoinColumn(name = "catalogo_contactov1_id")
	private CatalogoContacto contac;
	
	@ManyToOne
	@JoinColumn(name = "usuariosv1_id")
	private Usuariov1 user;

	public int getIdCont() {
		return idCont;
	}

	public void setIdCont(int idCont) {
		this.idCont = idCont;
	}

	public CatalogoContacto getContac() {
		return contac;
	}

	public void setContac(CatalogoContacto contac) {
		this.contac = contac;
	}

	public Usuariov1 getUser() {
		return user;
	}

	public void setUser(Usuariov1 user) {
		this.user = user;
	}

}
