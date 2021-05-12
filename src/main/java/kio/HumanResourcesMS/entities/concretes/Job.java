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
	@Column(name = "jobId")
	private int jobId;
	@Column(name = "jobId")
	private String jobPosition;
	@Column(name = "jobId")
	private String jobDescription;
}
