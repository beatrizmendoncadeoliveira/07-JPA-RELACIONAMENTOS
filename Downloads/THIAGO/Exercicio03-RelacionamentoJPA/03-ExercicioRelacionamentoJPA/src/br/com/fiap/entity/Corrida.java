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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@SequenceGenerator(allocationSize = 1,name = "corrida",sequenceName = "seq_corrida")
@Table(name="T_CORRIDA")
public class Corrida {
	@Id
	@GeneratedValue(generator = "corrida",strategy = GenerationType.SEQUENCE)
	@Column(name="cd_corrida")
	private int codigo;
	@Column(name="ds_origem")
	private String origem;
	@Column(name="ds_destino")
	private String destino;
	@Column(name="dt_corrida")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	@Column(name="vl_corrida")
	private double valor;
	
	//relacionamento muitas corridas para 1 motorista e 1 passageiro
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Motorista motorista;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Passageiro passageiro;
	@OneToMany(mappedBy = "corrida",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Pagamento pagamento;
	

}
