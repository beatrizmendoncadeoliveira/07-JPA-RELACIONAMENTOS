package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(allocationSize = 1,name = "veiculo",sequenceName = "seq_veiculo")
public class Veiculo {
	@Id
	@GeneratedValue(generator = "veiculo",strategy = GenerationType.SEQUENCE)
	@Column(name="cd_veiculo")
	private int codigo;
	@Column(name="ds_placa")
	private String placa;
	@Column(name="ds_cor")
	private String cor;
	@Column(name="nr_ano")
	private int ano;
	//relacionamento muitos para muitos
	
	
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
