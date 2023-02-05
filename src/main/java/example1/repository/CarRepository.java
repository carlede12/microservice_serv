package example1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import example1.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{
	
	@Query("delete from Car c where c.lot=?1")
	public void deletesqlByLot(String lot);
	
	public Car findByLot(String lot);

}
