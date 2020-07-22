public class CartasTeste{
	public static void main(String[] args){
		DeckCartas deck = new DeckCartas();
		deck.embaralhar();
		
		for(int i = 1; i <= 52; i++){
			System.out.println(deck.lidar());
			
			//pular uma linha sempre q forem impressos 4 numeros
			if(i%4 == 0){ 
				System.out.println();
			}
		}
	}
}