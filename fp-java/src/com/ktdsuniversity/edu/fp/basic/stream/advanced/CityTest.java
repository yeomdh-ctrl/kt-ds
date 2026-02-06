package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;


public class CityTest {

	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
		cities.forEach(System.out::println);
		
		//stateId 가 3907인 City 의 countryName을 출력
		for(City city : cities) {
			if(city.getStateId() == 3907) {
				System.out.println(city.getCountryName() + "_");
			}
		}
		//==>Stream 으로 구현
		cities.stream() //Stream<City>
		.filter(city -> city.getStateId() == 3907) //Stream<City>
//		.map(city -> city.getCountryName()) //==> map은 T를 받아 R을 반환 하는데 R이 city.getCountryName() 이 됨. Stream<String>
		.map(City::getCountryName)
//		.forEach(countryName -> System.out.println(countryName));
		.distinct() // 중복 제외 Stream<String>
		.forEach(System.out::println); // map을 사용해서 이런식으로 바꿀 수 있다.
				
		// countryName이 "South Korea"인 City의 _native를 출력
		cities.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.forEach(city -> System.out.println(city.get_native()));
		System.out.println("------------------");
		// countryName이 "South Korea"이면서  _native 의 길이가 3이상인 City의 _native를 출력
		cities.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.filter(city -> city.get_native().length() >= 3)
		.forEach(city -> System.out.println(city.get_native()));
		
		System.out.println("=".repeat(40));
		cities.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.filter(city -> city.get_native().length() >= 3)
		.skip(3) //동래구 강서구 금정구 skip
		.limit(3) 
		.forEach(city -> System.out.println(city.get_native()));//기장군 해운대구 사하구만 출력
/*
* 동래구
강서구
금정구
기장군
해운대구
사하구
사상구
수영구
영도구
달서구
*/
		
		//_native 의 값이 한글로만 이루어진 값 중에서 
		//_native의 길이가 4글자 이상인 것의 name을 중복없이 조회한다
		System.out.println("=".repeat(40));
		
		cities.stream()
		.filter(city -> city.get_native().matches("^[가-힣 ]{4,}+$")) //Stream<City>
		.map(City::getName) //Stream<String>
		.distinct()
//		.map(String::length)
		.forEach(System.out::println);
		
		//<예시> 한글로만 이루어져 있는가?
		String name= "가나다";
		System.out.println(name + "은 한글로만 이루어져 있다" + name.matches("^[가-힣 ]{4,}+$")); //한글로 시작해서 한글로 끝나는데 그것이 4글자 이상이냐는 정규표현식
		
		//애월읍의 stateName을 출력해라
		Optional<City> found = cities.stream() //Stream<City>
		.filter(city -> city.getName().equals("Gaigeturi")) //Stream<City>
		.findFirst(); //Optional<City>
		System.out.println(found.orElse(null).getStateName()); // 값이 있든 없든 orElse 쓰는 것이 안전
		
		Optional<City> found2 = cities.stream() //Stream<City>
				.filter(city -> city.getName().equals("ffffff")) //Stream<City>
				.findFirst(); //Optional<City>
//				System.out.println(found2.orElse(null).getStateName()); // NullPointerException 발생
		//Optional을 사용하는 Case1
		City city = found2.orElse(null);
		if(city != null) {
			System.out.println(city.getStateName());
		}
		//Optional을 사용하는 Case2
		if(found2.isPresent()) {
			System.out.println(found2.get().getStateName()); //위랑 같은 방법
		}
		//Optional을 사용하는 Case3
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
		
		cities.stream()
		.peek(_city -> System.out.println(_city.getCountryCode()))
		.filter(_city -> true)
		.map(_city -> city.get_native());
		System.out.println("~~~~~");
		
	}
}
