package resultsCalc;

public class Calc {

	public static void results(int biology, int chemistry, int physics) {
		System.out.println("Biology: " + biology);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Physics: " + physics);
	}

	public static void percentageCalc(int biology, int chemistry, int physics) {
		int totals = biology + chemistry + physics;
		System.out.println("total =" + totals);
		double overallPercentage = (totals * 100 / 450);
		double biologyPercentage = (biology * 100 / 150);
		double chemistryPercentage = (chemistry * 100 / 150);
		double physicsPercentage = (physics * 100 / 150);
		if (overallPercentage < 60) {
			System.out.println("Fail");
		} else {
			if ((biologyPercentage < 60) && (chemistryPercentage >= 60) && (physicsPercentage >= 60)) {
				System.out.println("Fail- biology is less than 60%");
			} else if ((chemistryPercentage < 60) && (biologyPercentage >= 60) && (physicsPercentage >= 60)) {
				System.out.println("Fail- chemistry is less than 60%");
			}

			else if ((physicsPercentage < 60) && (biologyPercentage >= 60) && (physicsPercentage >= 60)) {
				System.out.println("Fail-physics is less than 60%");
			} else {
				System.out.println("pass");
			}

		}
	}


}