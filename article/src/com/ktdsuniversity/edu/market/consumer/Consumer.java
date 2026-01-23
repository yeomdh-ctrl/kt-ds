package com.ktdsuniversity.edu.market.consumer;

public class Consumer {
    private int itemCount;            // 구매한 상품 수
    private int money;                // 가진 돈
    private int maxWeight;            // 들 수 있는 최대 무게(g)
    
    
    public int getItemCount() {
    	return this.itemCount;
    }
    public int getMoney() {
    	return this.money;
    }
    public int getMaxWeight() {
    	return this.maxWeight;
    }
    public final int getPrice() {
    	return this.price;
    }
    public final int getItemWeight() {
    	return this.itemWeight;
    }
    
    public void setItemCount(int itemCount) {
    	this.itemCount = itemCount;
    }
    public void setMoney(int money) {
    	this.money = money;
    }
    public void setMaxWeight(int maxWeight) {
    	this.maxWeight = maxWeight;
    }
 
    

    // 물건 구매
    public void buy(int count) {
        // 돈 부족
        if (this.money < this.price) {
            System.out.println("돈이 부족합니다");
            return;
        }

        // 무게 초과
        else if (this.itemCount * this.itemWeight >= this.maxWeight) {
            System.out.println("더 이상 장바구니를 들 수 없습니다");
            return;
        }

        // 돈으로 가능한 최대 개수
        int possibleByMoney = this.money / this.price;

        // 무게로 가능한 최대 개수
        int possibleByWeight =
                (this.maxWeight - this.itemCount * this.itemWeight) / this.itemWeight;

        int buyCount = count;

        if (buyCount > possibleByMoney)
            buyCount = possibleByMoney;

        if (buyCount > possibleByWeight)
            buyCount = possibleByWeight;

        // 구매 처리
        this.itemCount += buyCount;
        this.money -= buyCount * this.price;
    }

    public void showResult() {
        System.out.println("구매한 상품 수: " + this.itemCount);
        System.out.println("장바구니 무게: " + (this.itemCount * this.itemWeight) + "g");
        System.out.println("남은 돈: " + this.money);
    }
}    