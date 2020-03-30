package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@SequenceGenerator(allocationSize = 1,name = "pagamento",sequenceName = "seq_pagamento")
@Table(name = "T_PAGAMENTO")
public class Pagamento {
	@Id
	@GeneratedValue(generator = "pagamento",strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_pagamento")
	private int codigo;
	@Column(name="dt_pagamento")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	@Column(name="vl_pagamento")
	private double valor;
	@Column(name="ds_forma_pagamento")
	private String forma_pagamento;
	
	
	//relacionamento
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Corrida corrida;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	public Corrida getCorrida() {
		return corrida;
	}
	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}
	
	

}
