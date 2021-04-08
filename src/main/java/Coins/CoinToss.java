package Coins;

public class CoinToss {
	private CoinProbability side;

	public CoinToss(CoinProbability side) {
		this.side = side;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((side == null) ? 0 : side.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CoinToss coinToss = (CoinToss) obj;
		if (this.side.getSideProbability() == coinToss.side.getSideProbability())
			return true;
		return false;
	}

	public double getProbabilityOfEvents(CoinToss event1, CoinToss event2) {
		return event1.side.getSideProbability()*event2.side.getSideProbability();
	}
}
