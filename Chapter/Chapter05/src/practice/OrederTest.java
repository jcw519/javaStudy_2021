package practice;

public class OrederTest {
    public static void main(String[] args){
        Order order = new Order();
        
        order.orderNumber = 20210814;
        order.orderID = "abc123";
        order.orderDate = "2021년 8월 14일";
        order.orderName = "정채원";
        order.orderProductNumber = "PD345-12";
        order.orderAddress = "서울시 영등포구 여의도동 20번지";
        
        order.showOrderInfo();
    }
}
