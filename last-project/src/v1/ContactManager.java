package v1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	
	private List<Contact> contactList;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
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
	//  예> 다양한 검색의 결과 중 하나를 선택해 contactList에서 제가하는 기능
	public static void main(String[] args) {
		
	}

}
