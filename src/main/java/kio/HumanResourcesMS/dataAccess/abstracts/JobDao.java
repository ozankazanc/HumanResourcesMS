package kio.HumanResourcesMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import kio.HumanResourcesMS.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer> {

	Job findByJobPosition(String jobPosition);
	//@Query(value = "SELECT * FROM jobs where job_position = :job_position", nativeQuery = true)
	//Job findbyJobPosition(@Param("job_position") String jobPosition);
}
