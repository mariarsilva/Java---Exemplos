import java.security.SecureRandom;

public class DeckCartas{
	private static final SecureRandom randomNum = new SecureRandom();
	private static final int NUMERO_CARTAS = 52;	
	private Carta[] deck = new Carta[NUMERO_CARTAS];
	private int cartaAtual = 0;
	
	public DeckCartas(){
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
		                  "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] naipe = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		for(int contador = 0; contador < deck.length; contador++){
			deck[contador] = new Carta(faces[contador%13], naipe[contador/13]);			
		}
	}
	
	public void embaralhar(){
		cartaAtual = 0;
		for(int primeiro = 0; primeiro < deck.length; primeiro++){
			int segundo = randomNum.nextInt(NUMERO_CARTAS);
			Carta temp = deck[primeiro];
			deck[primeiro] = deck[segundo];
			deck[segundo] = temp;			
		}
	}
	
	public Carta lidar(){
		if(cartaAtual < deck.length){
			return deck[cartaAtual++];
		}else{
			return null;
		}
	}
}