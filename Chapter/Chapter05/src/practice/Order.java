package practice;

public class Order {
    int orderNumber;
    String orderID;
    String orderDate;
    String orderName;
    String orderProductNumber;
    String orderAddress;
    
    public void showOrderInfo() {
        System.out.println("주문 번호 : " + orderNumber);
        System.out.println("주문자 아이디 : " + orderID);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문자 이름 : " + orderName);
        System.out.println("주문 상품 번호 : " + orderProductNumber);
        System.out.println("배송 주소 : " + orderAddress);
    }
    
}
