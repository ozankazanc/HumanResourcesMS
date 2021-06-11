
package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface AbilityDao  extends JpaRepository<Ability,Integer> {

	List<Ability> getByCurriculumVitae_Id(int cvid);
}
