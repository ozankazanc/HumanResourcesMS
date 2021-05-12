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
	@Column(name = "jobseeker_id")
	private int jobseekerId;
	//@OneToOne
	@Column(name = "user_id")
	private int userId;
	@Column(name = "nationality_number")
	private String nationalityNumber;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
}
