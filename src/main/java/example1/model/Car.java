package example1.model;



import java.util.Date;


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
	private String lot;
	private String status;
	private boolean available;
	private Date registred;
	

	

	
	
	
	public Car(int id, String brand, String model, int year, String lot, String status, boolean available,
			Date registred) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.lot = lot;
		this.status = status;
		this.available = available;
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
	
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public Date getRegistred() {
		return registred;
	}

	public void setRegistred(Date registred) {
		this.registred = registred;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	


    
}