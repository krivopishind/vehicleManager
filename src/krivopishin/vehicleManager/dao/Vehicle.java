package krivopishin.vehicleManager.dao;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;

/**
 * The persistent class for the "vehicle" database table.
 * 
 */
@Entity
@Table(name = "vehicle")
@NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "distanceMeasureUnit")
	private String distanceMeasureUnit;

	@Column(name = "fuelUnit")
	private String fuelUnit;

	@Column(name = "name")
	private String name;

	@Column(name = "tankCapacity")
	private BigDecimal tankCapacity;

	@Column(name = "tankStandartRemain")
	private BigDecimal tankStandartRemain;
	
	@ManyToOne()
	@JoinColumn(name = "currencyId", nullable = false, updatable = false)
	private CurrencyType currencyType;

	public Vehicle() {
	}


	public String getDistanceMeasureUnit() {
		return this.distanceMeasureUnit;
	}

	public void setDistanceMeasureUnit(String distanceMeasureUnit) {
		this.distanceMeasureUnit = distanceMeasureUnit;
	}

	public String getFuelUnit() {
		return this.fuelUnit;
	}

	public void setFuelUnit(String fuelUnit) {
		this.fuelUnit = fuelUnit;
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

	public BigDecimal getTankCapacity() {
		return this.tankCapacity;
	}

	public void setTankCapacity(BigDecimal tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public BigDecimal getTankStandartRemain() {
		return this.tankStandartRemain;
	}

	public void setTankStandartRemain(BigDecimal tankStandartRemain) {
		this.tankStandartRemain = tankStandartRemain;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", distanceMeasureUnit="
				+ distanceMeasureUnit + ", fuelUnit=" + fuelUnit + ", name="
				+ name + ", tankCapacity=" + tankCapacity
				+ ", tankStandartRemain=" + tankStandartRemain
				+ ", currencyType=" + currencyType + "]";
	}
	
	

}