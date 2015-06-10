package fdi.ucm.proyect.server;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: JPATAbleRegistro
 *
 */
@Entity

public class JPATableRegistro implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "registro")
	private String Registro;
	
	@Column(name = "fecha",nullable=true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date Fecha;
	private static final long serialVersionUID = 1L;

	public JPATableRegistro() {
		super();
	}   
	

	/**
	 * @param registro
	 * @param fecha
	 */
	public JPATableRegistro(String registro, Date fecha) {
		super();
		Registro = registro;
		Fecha = fecha;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getRegistro() {
		return this.Registro;
	}

	public void setRegistro(String Registro) {
		this.Registro = Registro;
	}   
	public Date getFecha() {
		return this.Fecha;
	}

	public void setFecha(Date Fecha) {
		this.Fecha = Fecha;
	}
   
}
