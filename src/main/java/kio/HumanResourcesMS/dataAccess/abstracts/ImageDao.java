package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface ImageDao extends JpaRepository<Image,Integer> {

	List<Image> getByCurriculumVitae_Id(int cvid);
}
