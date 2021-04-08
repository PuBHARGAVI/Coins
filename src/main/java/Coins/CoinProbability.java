package Coins;

public enum CoinProbability {
	head(0.5), tail(0.5);

	private double probability;

	public double getSideProbability() {
		return probability;
	}

	CoinProbability(double probability) {
		this.probability = probability;
	}

}
