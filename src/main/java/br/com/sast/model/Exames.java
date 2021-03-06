package br.com.sast.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Exames {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(nullable = false)
	@NotEmpty
	private String exame;
	
	@Column(nullable = false)
	@NotEmpty
	private String data_exame;
	
	@Column(nullable = false)
	@NotEmpty
	private String data_vencimento;
	
	@Column(nullable = false)
	private Integer dias_vencimento;
	
	@Column(nullable = false)
	@NotEmpty
	private String status;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(columnDefinition = "aso_id", referencedColumnName = "id")
	private Aso aso;
	
	//private Short id_aso;
	
	
	// Gests e Sets

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public String getData_exame() {
		return data_exame;
	}

	public void setData_exame(String data_exame) {
		this.data_exame = data_exame;
	}

	public String getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getDias_vencimento() {
		return dias_vencimento;
	}

	public void setDias_vencimento(Integer dias_vencimento) {
		this.dias_vencimento = dias_vencimento;
	}

	public Aso getAso() {
		return aso;
	}

	public void setAso(Aso aso) {
		this.aso = aso;
	}

	

}
