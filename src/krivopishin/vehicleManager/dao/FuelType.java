package krivopishin.vehicleManager.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "fuelType" database table.
 * 
 */
@Entity
@Table(name="\"fuelType\"")
@NamedQuery(name="FuelType.findAll", query="SELECT f FROM FuelType f")
public class FuelType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"id\"")
	private int id;
	
	@Column(name="\"description\"")
	private String description;

	@Column(name="\"name\"")
	private String name;

	//bi-directional many-to-one association to FuelRefill
	@OneToMany(mappedBy="fuelType")
	private List<FuelRefill> fuelRefills;

	public FuelType() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "FuelType [id=" + id + ", description=" + description
				+ ", name=" + name + "]";
	}


}