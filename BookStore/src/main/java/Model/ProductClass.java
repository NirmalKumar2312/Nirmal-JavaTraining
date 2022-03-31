package Model;
public class ProductClass {
	int id;
	int age;
	int phone_no;
	float salary;
	String gender;
	
	public ProductClass() {
		super();
		// TODO Auto-generated constructor stub
	}
public ProductClass(int id,int age,int phone_no,float Salary,String gender) {
	this.id=id;
	this.age=age;
	this.phone_no=phone_no;
	this.salary=salary;
	this.gender=gender;
	
}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "ProductClass [id=" + id + ", age=" + age + ", phone_no=" + phone_no + ", salary=" + salary + ", gender="
				+ gender + "]";
	}
	
}