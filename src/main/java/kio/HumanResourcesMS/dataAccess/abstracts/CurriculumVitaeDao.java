package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kio.HumanResourcesMS.entities.concretes.*;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer> {

	List<CurriculumVitae> getByJobseeker_userId(int joobsekerId);
//
//	@Query(value = "From CurriculumVitae where active = true and jobseeker.userId=:joobseekerId", nativeQuery = true)
//	CurriculumVitae getByActiveCvJobseeker(int joobseekerId);
	CurriculumVitae getById(int id);
	
	
}