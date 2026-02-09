package v1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	/**
	 * 연락처의 이름
	 */
	private String name;
	/**
	 * 연락처 별명
	 */
	private String nickname;
	/**
	 * 연락처 이메일
	 */
	private String email;
	
	private String firstname;
	
	private String lastname;
	
	/**
	 * 전화번호 목록
	 */
	private List<Phone> phones;
	
	/**
	 *근무중인 회사 정보 
	 */
	private Company company;
	/**
	 * 메모
	 */
	private String memo;
	
	public Contact() {
		this.phones = new ArrayList<>();
	}
	public Company getCompany() {
		return this.company;
	}
	public String getEmail() {
		return this.email;
	}
	public String getFirstname() {
		return this.firstname;
	}
	public String getLastname() {
		return this.lastname;
	}
	public String getMemo() {
		return this.memo;
	}
	public String getName() {
		return this.name;
	}
	public String getNickname() {
		return this.nickname;
	}
	public List<Phone> getPhones() {
		return this.phones;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "이름: " + this.name + "\n별명: " + this.nickname + "\n이메일: " + this.email + "\n메모: " + this.memo;
	}

}
