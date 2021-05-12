package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "system_employees")
public class SystemEmployee {

	@Id
	@Column(name = "system_employee_id")
	private int systemEmployeeId;
	//@OneToOne
	@Column(name = "user_id")
	private int userId;
	//@OneToOne
	@Column(name = "job_id")
	private int jobId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "role")
	private int role;

}
