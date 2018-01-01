package cn.et;

public class User {
	private String name;
	private String sex;
	public User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
