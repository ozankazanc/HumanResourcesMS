package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobs")
public class Job {

	@Id
	@Column(name = "job_id")
	private int jobId;
	@Column(name = "job_position")
	private String jobPosition;
	@Column(name = "job_description")
	private String jobDescription;
}
