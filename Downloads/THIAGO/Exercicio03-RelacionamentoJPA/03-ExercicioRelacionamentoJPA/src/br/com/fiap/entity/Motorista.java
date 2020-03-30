package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@SequenceGenerator(allocationSize = 1,name = "mot",sequenceName = "seq_mot")
@Table(name="T_MOTORISTA")
public class Motorista {
	
	@Id
	@GeneratedValue(generator = "mot",strategy = GenerationType.SEQUENCE)
	@Column(name="nr_carteira")
	private int numero;
	@Column(name="nm_motorista")
	private String nome;
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar data;
	@Column(name="fl_carteira")
	@Lob()
	private byte[] foto;
	@Column(name="ds_genero")
	private String genero;
	
	//relacionamentos
	@OneToMany(mappedBy = "motorista",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	//muitos para muitos do motorista com veiculo
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

}
