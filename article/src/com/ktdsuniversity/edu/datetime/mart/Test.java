package com.ktdsuniversity.edu.datetime.mart;

public class Test {

	public static void main(String[] args) {
		
		Store store = new Store();
		
		store.add(new Item("A", "2026-02-07"));
		store.add(new Item("B", "2026-02-01"));
		store.add(new Item("C", "2026-02-04"));
		
		store.sell(Index.FUTURE);
		store.sell(Index.NOW);
		store.sell(Index.PAST);
		
		System.out.println(store);

	}

}
