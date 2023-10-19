package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name ="entities.Customer")
@Table(name = "customer")
public class Customer {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int cust_id;
	@Column (name = "name")
	private String name;
	@Column (name = "mobile_no")
	private String mobile_no;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", mobile_no=" + mobile_no + "]";
	}
}