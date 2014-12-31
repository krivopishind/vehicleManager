package krivopishin.vehicleManager.servlet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import krivopishin.vehicleManager.dao.FuelRefill;
import krivopishin.vehicleManager.dao.Vehicle;

public class DbUtils {
	
	public Vehicle getAllVehicles(){
		Vehicle vehicle = new Vehicle();
		return vehicle;
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		System.out.println("start");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vehicleManager");
        EntityManager em = emf.createEntityManager();

		List<FuelRefill> fuelRefills = em.createNamedQuery("FuelRefill.findAll").getResultList();
        System.out.println("fuelTypes are: " + fuelRefills);
        
        em.close();
        emf.close();
        
		System.out.println("end");
	}
}
