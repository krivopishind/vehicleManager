package krivopishin.vehicleManager.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the "currencyType" database table.
 * 
 */
@Entity
@Table(name = "\"currencyType\"")
@NamedQuery(name = "CurrencyType.findAll", query = "SELECT c FROM CurrencyType c")
public class CurrencyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "\"id\"")
	private int id;

	@Column(name = "\"name\"")
	private String name;

	// bi-directional many-to-one association to Vehicle
	@OneToMany(mappedBy = "currencyType")
	private List<Vehicle> vehicles;

	public CurrencyType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CurrencyType [id=" + id + ", name=" + name + " ]";
	}
	

}