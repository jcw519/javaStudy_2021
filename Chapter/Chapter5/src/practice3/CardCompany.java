package practice3;

public class CardCompany {
    
    private static int serialNumber = 10000;
    private static CardCompany instance = new CardCompany();
    
    private CardCompany(){ }
    
    public static CardCompany getInstance() {
        if (instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }
    
    public Card createCard() {
        Card card = new Card();
        card.setCardNumber(serialNumber++);
        return card;
    }
    
    public static int getSetialNumber(){
        return serialNumber;
    }
}
