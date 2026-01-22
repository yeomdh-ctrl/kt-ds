package oop;

public class Consumer {
    int itemCount;            // 구매한 상품 수
    int money;                // 가진 돈
    int maxWeight;            // 들 수 있는 최대 무게(g)
    final int price = 1000;   // 물건 가격 (고정)
    final int itemWeight = 500;

    // 물건 구매
    public void buy(int count) {
        // 돈 부족
        if (money < price) {
            System.out.println("돈이 부족합니다");
            return;
        }

        // 무게 초과
        else if (itemCount * itemWeight >= maxWeight) {
            System.out.println("더 이상 장바구니를 들 수 없습니다");
            return;
        }

        // 돈으로 가능한 최대 개수
        int possibleByMoney = money / price;

        // 무게로 가능한 최대 개수
        int possibleByWeight =
                (maxWeight - itemCount * itemWeight) / itemWeight;

        int buyCount = count;

        if (buyCount > possibleByMoney)
            buyCount = possibleByMoney;

        if (buyCount > possibleByWeight)
            buyCount = possibleByWeight;

        // 구매 처리
        itemCount += buyCount;
        money -= buyCount * price;
    }

    public void showResult() {
        System.out.println("구매한 상품 수: " + itemCount);
        System.out.println("장바구니 무게: " + (itemCount * itemWeight) + "g");
        System.out.println("남은 돈: " + money);
    }
}    