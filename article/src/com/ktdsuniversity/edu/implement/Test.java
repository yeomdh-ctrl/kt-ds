package com.ktdsuniversity.edu.implement;

public class Test {
	public static void main(String[] args) {

		
//		LgSmartTV lgTv = new LgTV();
//		lgTv.turnOn();
//		lgTv.runInternet();
//		lgTv.turnOff();
//		SamsungSmartTV samsungTV = new SamsungTV();
//		samsungTV.turnOn();
//		samsungTV.runNetflix();
//		samsungTV.changeVolumn(50);
//		samsungTV.turnOff();
		
		LgSmartTV lgTv = new LgTV();
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTv);
		lgRemoteCon.runYoutube(lgTv);
		
		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemoteCon.turnOn(samsungTV);
//		lgRemoteCon.runYoutube(samsungTv);
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runCoupangPlay(samsungTV);
//		samsungRemoteCon.runNetflix(lgTV);
	}

}
