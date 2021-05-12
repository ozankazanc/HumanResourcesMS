package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employers")
public class Employer {

	@Id
	@Column(name = "employerId")
	private int employerId;
	@OneToOne
	@Column(name = "userId")
	private int userId;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "website")
	private String website;
	@Column(name = "phone")
	private String phone;
}
