package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kio.HumanResourcesMS.entities.concretes.JobAdvertisement;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

	@Query("From JobAdvertisement where active=true")
	List<JobAdvertisement> getByIsActive();
	
	
	
	@Query(value = "From JobAdvertisement where employer_companyName = :companyName and active = true", nativeQuery = true)
	List<JobAdvertisement> getByActiveOneCompany(String companyName);
	
	
	
}