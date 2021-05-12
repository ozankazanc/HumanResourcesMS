package kio.HumanResourcesMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jobseekers")
public class Jobseeker {

	@Id
	@Column(name = "jobseekerId")
	private int jobseekerId;
	@OneToOne
	@Column(name = "userId")
	private int userId;
	@Column(name = "nationalityNumber")
	private String nationalityNumber;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
}
