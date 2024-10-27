import java.util.ArrayList;
import java.util.Random;

public class CardGame {
   private ArrayList<Card> deck = new ArrayList<>();
   private ArrayList<Card>hand;
   public CardGame(){
       deck = new ArrayList<>();
   }

   public void fillDeck(){
       for(int i= 0; i<60; i++){
           deck.add(new Energy());
       }
       deck.add(new Charmander());
       deck.add(new MagiKarp());
       deck.add(new Pikachu());
   }
   public void drawHand(){
       Random rng= new Random();
       for (int i=0; i<7; i++){
           int cardToTakeIndex = rng.nextInt(deck.size()+1);
           hand.add(deck.get(cardToTakeIndex));
           deck.remove(cardToTakeIndex);
       }
   }
   public boolean cardChecker(){
       for(Card singleCard: hand){
           if (singleCard instanceof Pokemon){
               return true;
           }
           }
       return false;

       }
   public void reshuffleCards()
   {
       while (cardChecker()==false){
           drawHand();

       }
   }

   public void run(){
       fillDeck();
       drawHand();
       cardChecker();
       reshuffleCards();
   }


}
