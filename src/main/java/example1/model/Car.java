package example1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private int year;
	private String registred;
	
	public Car() {
	
	}

	public Car(int id, String brand, String model, int year, String registred) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.registred = registred;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRegistred() {
		return registred;
	}

	public void setRegistred(String registred) {
		this.registred = registred;
	}
	
	
	
    
}