package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "systemEmployee")
public class SystemEmployee {

	@Id
	@Column(name = "systemEmployeeId")
	private int systemEmployeeId;
	@OneToOne
	@Column(name = "userId")
	private int userId;
	@OneToOne
	@Column(name = "jobId")
	private int jobId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "Role")
	private int Role;

}
