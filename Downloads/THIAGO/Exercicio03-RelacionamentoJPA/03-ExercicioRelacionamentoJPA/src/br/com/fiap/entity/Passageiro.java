package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(allocationSize = 1,name = "passageiro",sequenceName = "seq_passageiro")
public class Passageiro {
	@Id
	@GeneratedValue(generator = "passageiro",strategy = GenerationType.SEQUENCE)
	@Column(name="cd_passageiro")
	private int codigo;
	@Column(name="nm_passageiro")
	private String nome;
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar data;
	@Column(name="ds_genero")
	private String genero;
	
	
	//relacionamento 
	@OneToMany(mappedBy = "passageiro",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Corrida corrida;
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
