package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface CoverLetterDao extends JpaRepository<CoverLetter,Integer> {

	List<CoverLetter> getByCurriculumVitae_Id(int cvid);
}
