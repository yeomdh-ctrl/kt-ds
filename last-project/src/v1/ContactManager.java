package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContactManager {
	
	private List<Contact> contactList;
	private Scanner sc;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}
	//1. contactList에 Contact 인스턴스를 추가하는 기능
	//2. contactList의 모든 연락처 정보를 출력하는 기능
	//3. contactList에서 전화번호 검색 결과 출력하는 기능
	//  예> 010을 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력
	//4. contactList에서 이름 검색 결과 출력하는 기능
	//  예> 김을 파라미터로 전달하면 name, firstName, lastName, companyName에 김이 포함된 연락처의 모든 정보를 출력
	//5. contactList에서 이메일 검색 결과 출력하는 기능
	//  예> "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 포함된 연락처의 모든 정보를 출력
	//6. 연락처 정보 수정 기능
	//  예> 다양한 검색의 결과중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
	//      이름을 변경, 전화번호 추가, 전화번호 수정, 회사정보 수정 등
	//7. 연락처 정보 삭제 기능
	//  예> 다양한 검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능
	public static void main(String[] args) {
		ContactManager manager = new ContactManager();
		manager.run();
	}
	public void run() {
		while(true) {
			System.out.println("1.연락처 추가 2.연락처 정보 3.전화번호 검색 4.이름 검색 5.이메일 검색 6.연락처 정보 수정 7.연락처 삭제 0.종료");
			String input = sc.nextLine();
			if(input.equals("0")) {
				System.out.println("종료 합니다.");
				break;
			}
			else if(input.equals("1")) {
				addContact();
			}
			else if(input.equals("2")) {
				printAllContact();
			}
			else if(input.equals("3")) {
				searchContact();
			}
			else if(input.equals("4")) {
				searchName();
			}
			else if(input.equals("5")) {
				searchEmail();
			}
			else if(input.equals("6")) {
				editContact();
			}
			else if(input.equals("7")) {
				removeContact();
			}
		}
	}
	public void addContact() {
		System.out.println("<연락처 추가>");
		
		Contact contact = new Contact();
		System.out.println("성:");
		String last = sc.nextLine();
		contact.setLastname(last);
		System.out.println("이름:");
		String first = sc.nextLine();
		contact.setFirstname(first);
		contact.setName(last + first);
		System.out.println("별명:");
		contact.setNickname(sc.nextLine());
		System.out.println("이메일:");
		contact.setEmail(sc.nextLine());
		System.out.println("메모:");
		contact.setMemo(sc.nextLine());
		
		Company company = new Company();
		contact.setCompany(company);
		
		System.out.println("회사명:");
		company.setCompanyName(sc.nextLine());
		System.out.println("회사주소:");
		company.setAddress(sc.nextLine());
		System.out.println("직급:");
		company.setJob(sc.nextLine());
		
		while(true) {
			System.out.println("전화번호 추가:");
			String number = sc.nextLine();
			if(number.isEmpty()) {
				break;
			}
			System.out.println("타입: 1.개인 2.집 3.회사");
			String typeNum = sc.nextLine();
			Phone.Type type = Phone.Type.PERSONAL;
			if(typeNum.equals("2")) {
				type = Phone.Type.HOME;
			}
			else if(typeNum.equals("3")) {
				type = Phone.Type.COMPANY;
			}
			contact.getPhones().add(new Phone(type, number));
			break;
		}
		contactList.add(contact);
	}
	public void printAllContact() {
		System.out.println("<전체 연락처 정보>");
		for(int i = 0; i < contactList.size(); i ++) {
			Contact c = contactList.get(i);			
			System.out.println("\n이름: " + c.getName() + "\n별명: " + c.getNickname() + "\n이메일: " + c.getEmail() + "\n메모: " + c.getMemo());
			if(c.getCompany() != null) {
				System.out.println(c.getCompany());
			}
			else {
				System.out.println("회사 정보 입력 안됨");
			}
			for(Phone p : c.getPhones()) {
				System.out.println("전화번호: " + p.getPhoneNumber() +"\n타입: "+ p.getPhoneType());
			}
		}
	}
	public void searchContact() {
		System.out.println("전화번호 검색:");
		String keyWord = sc.nextLine();
		for(Contact c : contactList) {
			for(Phone p : c.getPhones()) {
				if(p.getPhoneNumber().contains(keyWord)) {
					System.out.println(c);
					System.out.println(c.getCompany());
				}
			}
		}
	}
	public void searchName() {
		System.out.println("이름 검색:");
		String keyWord = sc.nextLine();
		for(Contact c : contactList) {
			if(c.getName().contains(keyWord)) {
				System.out.println(c);
				System.out.println(c.getCompany());
			}
		}
	}
	public void searchEmail() {
		System.out.println("이메일 검색:");
		String keyWord = sc.nextLine();
		for(Contact c : contactList) {
			if(c.getEmail().contains(keyWord)) {
				System.out.println(c);
				System.out.println(c.getCompany());
			}
		}
	}
	public void editContact() {
		System.out.println("1.이름 변경 2.이메일 변경 3.전화번호 수정");
		String num = sc.nextLine();

		if(num.equals("1")) {
			System.out.println("변경하고 싶은 대상의 이름: ");
			String searchName = sc.nextLine();
			System.out.println("새로 설정할 이름: ");
			String newName = sc.nextLine();

			for(Contact c : contactList) {
				if(c.getName() != null && c.getName().equals(searchName)) {
					c.setName(newName);
					System.out.println(searchName + "님의 이름이 " + newName + "로 변경되었습니다.");
				}
				else {
					System.out.println("해당하지 않는 연락처입니다.");
				}
			}
		}
		if(num.equals("2")) {
			System.out.println("변경하고 싶은 대상의 이름: ");
			String searchName = sc.nextLine();
			System.out.println("수정할 이메일: ");
			String newEmail = sc.nextLine();
					
			for(Contact c : contactList) {
				if(c.getName() != null && c.getName().equals(searchName)) {
					c.setEmail(newEmail);
					System.out.println(searchName + "님의 이메일이 " + newEmail + "로 변경되었습니다.");
				}
				else{
					System.out.println("해당하지 않는 연락처입니다.");
				}
			}
		}
		if(num.equals("3")) {
			System.out.println("변경하고 싶은 대상의 이름: ");
			String searchName = sc.nextLine();
			System.out.println("수정할 전화번호: ");
			String newPhoneNum = sc.nextLine();			
			for(Contact c : contactList) {
				for(Phone p : c.getPhones()) {
					if(c.getName() != null && c.getName().equals(searchName)) {
						p.setPhoneNumber(newPhoneNum);
						System.out.println(searchName + "님의 전화번호가 " + newPhoneNum + "로 변경되었습니다.");
					}
					else{
						System.out.println("해당하지 않는 연락처입니다.");
					}
				}
			}
		}
	}

	public void removeContact() {
		System.out.println("삭제할 대상 입력: ");
		String keyWord = sc.nextLine();
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getName().equals(keyWord)) {
				contactList.remove(i);
				System.out.println("삭제 되었습니다.");
				return;
			}
			else {
				System.out.println("존재하지 않는 이름입니다");
			}
			return;
		}
	}

}
