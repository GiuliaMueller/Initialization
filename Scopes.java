package chapter1;
 public class Scopes {

	 
	 
	public void eatMore(boolean hungry, int amountOfFood) {
		int roomInBelly = 5;
		
		if (hungry) {
			boolean timeToEat = true;
			if (timeToEat) {
				while(amountOfFood > 0) {
					int amountEaten = 2;
					roomInBelly = roomInBelly - amountEaten;
					amountOfFood = amountOfFood - amountEaten;
				}
			}
		}

		System.out.println(amountOfFood);
	}
}

 class AnotherClass{ }
