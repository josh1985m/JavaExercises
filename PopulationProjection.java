
public class PopulationProjection {

	public static void main(String[] args) {
		int startingPopulation = 312032486;
		int birth = 1;
		int death = -1;
		int immigration = 1;
		int totalTimeinSecs = 60*60*24*365*5;
		int counter = 1;
		while(counter < totalTimeinSecs) 
		{
			if (counter % 7 == 2) {
				startingPopulation += birth;
			}
			if (counter % 13 == 2) {
				startingPopulation += death;
			}
			if (counter % 45 == 2) {
				startingPopulation += immigration;
			}
			counter += 1;
		}
		System.out.println(startingPopulation);
	}
}
