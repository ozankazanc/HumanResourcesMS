package kio.HumanResourcesMS.business.abstracts;

import java.util.List;

import kio.HumanResourcesMS.core.utilities.results.*;
import kio.HumanResourcesMS.entities.concretes.Jobseeker;

public interface JobseekerService {
	
	DataResult<List<Jobseeker>> getAll();
    DataResult<Jobseeker> get(int id);
    DataResult<Jobseeker> add(Jobseeker candidate);
    //DataResult<Jobseeker> imageUpload(int candidateId, MultipartFile file) throws IOException;
    Result delete(Jobseeker candidate);
    DataResult<Jobseeker> update(Jobseeker candidate);

}
