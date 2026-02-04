package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Store {
	
	private List<Item> items;
	
	public Store() {
		this.items = new ArrayList<>();
	}
	
	public void add(Item item) {
		this.items.add(item);
		//추가
	}
	
	public void sell(Index index) {
		LocalDate tempExpireDate = null;
		for(Item i : this.items) {
			tempExpireDate = LocalDate.parse(i.getExpireDate().toString());
			tempExpireDate = tempExpireDate.withYear(LocalDate.now().getYear());
			/*
			 * index에 할당되어 있는 제품의 소비기한이 당일이라면
			 * "오늘까지 드세요"를 출력
			 */
			if(index == Index.NOW) {
				if(tempExpireDate.isEqual(LocalDate.now())) {
					System.out.println("오늘까지 드세요. " + i);
				}
			}
			/* 소비기한이 3일 내에 도래한다면
			 * "가능한 빨리 드세요"를 출력
			 */ 
			else if(index == Index.FUTURE) {
				if(tempExpireDate.isAfter(LocalDate.now()) 
						&& tempExpireDate.isBefore(LocalDate.now().plusDays(4))) {
					System.out.println("가능한 빨리 드세요. " + i);
				}
			}
			/* 소비기한이 지났다면
			 * "소비기한이 지나 판매하지 않습니다"
			 */
			else if(index == Index.PAST) {
				if(tempExpireDate.isBefore(LocalDate.now()) 
						&& tempExpireDate.isAfter(LocalDate.now().minusDays(4))) {
					System.out.println("소비기한이 지나 판매하지 않습니다. " + i);
					}
				}
			}
		}
		@Override
		public String toString() {
			StringBuffer buffer = new StringBuffer();
			
			if(this.items.size() == 0) {
				buffer.append("등록된 제품이 없습니다");
			}
			else {
				for(Item i : this.items) {
					buffer.append(i);
					buffer.append("\n");
				}
			}
			
			return buffer.toString();
		}
	}
