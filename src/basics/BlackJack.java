package basics;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random random = new Random();
		int card1 = getRandomInteger(13,1);
		int card2 = getRandomInteger(13,1);
		System.out.println("Card1 is " + card1);
		System.out.println("Card2 is " + card2);
		if (card1 > 21 && card2 > 21) {
			System.out.println(0);
		} else if (card1 <= 21&& card2 > 21) {
			System.out.println("result is " + card1);{

			}
			}
		else {
		System.out.println("result is " + Math.max(card1, card2));
		}
		}
		
	
	static int getRandomInteger(int maximum, int minimum){
		return ((int) (Math.random()*(maximum - minimum))) + minimum;
		}

	}





