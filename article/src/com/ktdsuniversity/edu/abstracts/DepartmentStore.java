package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore extends AbstractMart{
	public DepartmentStore(int productPrice) {
		super(productPrice);
	}
	@Override
	public int usePoint(Guest guest) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void givePoint(Guest guest, int amount) {
		int point = (int)(amount * 0.5);
		guest.addPoint(point);
		
	}
	@Override
	public int discount(Guest guest, int amount) {
		if(guest instanceof VIP) {
			amount += 0.97;
		}
		if(guest instanceof VVIP) {
			amount *= 0.9;
		}
		return 0;
	}
}
