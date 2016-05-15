package br.projeto.web.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name ="Cliente")
public class Cliente implements Serializable{

	
	/**
	 * 	
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "cliente_seq", sequenceName = "cliente_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "nome", nullable= false, length=80)
	private String nome;
	
	@Column(name = "endereco", nullable=false, length= 120)
	private String endereco;
	
	@Column(name = "cep", length=10)
	private Integer cep;
	
	@Column(name = "fone_fixo", length=20)
	private BigInteger foneFixo;
	
	@Column(name = "fone_celular", length=15)
	private BigInteger foneCel;
	
	@Column(name = "rg", nullable=false, length=15)
	private BigDecimal clienteRg;
	
	@Column(name = "cpf", nullable=false, length=11)
	private BigDecimal clienteCpf;
	
	@Column(name = "data_nascimento", length=8)
	private Date nascimento;
	
	public Cliente() {
		super();
	}
	
	public Cliente(Long id, String nome, String endereco, Integer cep, BigInteger foneFixo, BigInteger foneCel,
			BigDecimal clienteRg, BigDecimal clienteCpf, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.foneFixo = foneFixo;
		this.foneCel = foneCel;
		this.clienteRg = clienteRg;
		this.clienteCpf = clienteCpf;
		this.nascimento = nascimento;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Integer getCep() {
		return cep;
	}
	
	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	public BigInteger getFoneFixo() {
		return foneFixo;
	}
	
	public void setFoneFixo(BigInteger foneFixo) {
		this.foneFixo = foneFixo;
	}
	
	public BigInteger getFoneCel() {
		return foneCel;
	}
	
	public void setFoneCel(BigInteger foneCel) {
		this.foneCel = foneCel;
	}
	
	public BigDecimal getClienteRg() {
		return clienteRg;
	}
	
	public void setClienteRg(BigDecimal clienteRg) {
		this.clienteRg = clienteRg;
	}
	
	public BigDecimal getClienteCpf() {
		return clienteCpf;
	}
	
	public void setClienteCpf(BigDecimal clienteCpf) {
		this.clienteCpf = clienteCpf;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((clienteCpf == null) ? 0 : clienteCpf.hashCode());
		result = prime * result + ((clienteRg == null) ? 0 : clienteRg.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((foneCel == null) ? 0 : foneCel.hashCode());
		result = prime * result + ((foneFixo == null) ? 0 : foneFixo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nascimento == null) ? 0 : nascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (clienteCpf == null) {
			if (other.clienteCpf != null)
				return false;
		} else if (!clienteCpf.equals(other.clienteCpf))
			return false;
		if (clienteRg == null) {
			if (other.clienteRg != null)
				return false;
		} else if (!clienteRg.equals(other.clienteRg))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (foneCel == null) {
			if (other.foneCel != null)
				return false;
		} else if (!foneCel.equals(other.foneCel))
			return false;
		if (foneFixo == null) {
			if (other.foneFixo != null)
				return false;
		} else if (!foneFixo.equals(other.foneFixo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nascimento == null) {
			if (other.nascimento != null)
				return false;
		} else if (!nascimento.equals(other.nascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Ciente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", cep=" + cep + ", foneFixo="
				+ foneFixo + ", foneCel=" + foneCel + ", clienteRg=" + clienteRg + ", clienteCpf=" + clienteCpf
				+ ", nascimento=" + nascimento + "]";
	}	
}
