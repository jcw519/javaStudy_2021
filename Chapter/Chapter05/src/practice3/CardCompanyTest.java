package practice3;

public class CardCompanyTest {
    
    /*카드 회사가 있습니다. 카드회사는 유일한 객체이고, 이 회사에서는 카드를 발급받으면
    항상 고유번호가 자동으로 생성됩니다. 10000부터 시작하여 카드가 생성될 때 마다
    10001, 10002식으로 증가됩니다. 다음 코드가 수행 되도록 Card클래스와 CardCompany 클래스를
    구현하십시오*/
    
    public static void main(String[] args) {
        
        CardCompany company = CardCompany.getInstance();
        
        Card myCard = company.createCard();
        Card yourCard = company.createCard();
        
        System.out.println(myCard.getCardNumber());
        System.out.println(yourCard.getCardNumber());
        
    }
}
