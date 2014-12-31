package krivopishin.vehicleManager.dao;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the "fuelRefills" database table.
 * 
 */
@Entity
@Table(name="\"fuelRefills\"")
@NamedQuery(name="FuelRefill.findAll", query="SELECT f FROM FuelRefill f")
public class FuelRefill implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="\"id\"")
	private int id;

	@Column(name="\"odValue\"")
	private BigDecimal odValue;

	@Column(name="\"price\"")
	private BigDecimal price;

	@Column(name="\"refillCapacity\"")
	private BigDecimal refillCapacity;

	@Column(name="\"sum\"")
	private BigDecimal sum;
	
	@Column(name="\"date\"")
	private String date;

	@Column(name="\"calc_Distance\"")
	private BigDecimal calc_Distance;

	@Column(name="\"calc_FuelConsumption\"")
	private BigDecimal calc_FuelConsumption;

	@Column(name="\"calc_FuelSizeConsumed\"")
	private BigDecimal calc_FuelSizeConsumed;

	@Column(name="\"calc_PricePerDistUnit\"")
	private BigDecimal calc_PricePerDistUnit;
	
	@ManyToOne() 
    @JoinColumn(name="fuelid", nullable=false, updatable=false)
	private FuelType fuelType;

	@ManyToOne()
	@JoinColumn(name = "currencyId", nullable = false, updatable = false)
	private CurrencyType currencyType;
	
	@ManyToOne()
	@JoinColumn(name = "vehicleId", nullable = false, updatable = false)
	private Vehicle vehicle;

	@Column(name="\"fullOrNot\"")
	private int fullOrNot;
	

	public FuelRefill() {
	}

	public BigDecimal getCalc_Distance() {
		return this.calc_Distance;
	}

	public void setCalc_Distance(BigDecimal calc_Distance) {
		this.calc_Distance = calc_Distance;
	}

	public BigDecimal getCalc_FuelConsumption() {
		return this.calc_FuelConsumption;
	}

	public void setCalc_FuelConsumption(BigDecimal calc_FuelConsumption) {
		this.calc_FuelConsumption = calc_FuelConsumption;
	}

	public BigDecimal getCalc_FuelSizeConsumed() {
		return this.calc_FuelSizeConsumed;
	}

	public void setCalc_FuelSizeConsumed(BigDecimal calc_FuelSizeConsumed) {
		this.calc_FuelSizeConsumed = calc_FuelSizeConsumed;
	}

	public BigDecimal getCalc_PricePerDistUnit() {
		return this.calc_PricePerDistUnit;
	}

	public void setCalc_PricePerDistUnit(BigDecimal calc_PricePerDistUnit) {
		this.calc_PricePerDistUnit = calc_PricePerDistUnit;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFullOrNot() {
		return this.fullOrNot;
	}

	public void setFullOrNot(int fullOrNot) {
		this.fullOrNot = fullOrNot;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getOdValue() {
		return this.odValue;
	}

	public void setOdValue(BigDecimal odValue) {
		this.odValue = odValue;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getRefillCapacity() {
		return this.refillCapacity;
	}

	public void setRefillCapacity(BigDecimal refillCapacity) {
		this.refillCapacity = refillCapacity;
	}

	public BigDecimal getSum() {
		return this.sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "FuelRefill [id=" + id + ", odValue=" + odValue + ", price="
				+ price + ", refillCapacity=" + refillCapacity + ", sum=" + sum
				+ ", date=" + date + ", calc_Distance=" + calc_Distance
				+ ", calc_FuelConsumption=" + calc_FuelConsumption
				+ ", calc_FuelSizeConsumed=" + calc_FuelSizeConsumed
				+ ", calc_PricePerDistUnit=" + calc_PricePerDistUnit
				+ ", fuelType=" + fuelType + ", currencyType=" + currencyType
				+ ", vehicle=" + vehicle + ", fullOrNot=" + fullOrNot + "]";
	}
	

}