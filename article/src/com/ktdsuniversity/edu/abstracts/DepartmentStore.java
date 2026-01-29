package com.ktdsuniversity.edu.abstracts;

public class DepartmentStore extends AbstractMart{
	public DepartmentStore(int productPrice) {
		super(productPrice);
	}
	@Override
	public int usePoint(Guest guest) {

		return 0;
	}
	@Override
	public void givePoint(Guest guest, int amount) {
		/*
		 * Guest: Guest is a Guest
		 *   - VIP is a Guest
		 *     -VVIP is a VIP and Guest
		 *     이렇게 모두 Guest 에 포함 되어있다면 가장 멀리있는것 부터 쓰는 것이 좋음.
		 */
		if(guest instanceof VVIP) {
			guest.addPoint((int)(amount * 0.3));
		}
		else if(guest instanceof VIP) {
			
		}
		else if(guest instanceof Guest) {
			guest.addPoint((int)(amount * 0.05));
		}
	}
	@Override
	public int discount(Guest guest, int amount) {
		
		return 0;
	}
}
