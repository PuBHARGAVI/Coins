package Coins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CoinTossTest {
	@Test
	public void testIfHeadsProbabilityEqualsToTailProbability() {
		CoinToss headProbability = new CoinToss(CoinProbability.head);
		CoinToss tailProbability = new CoinToss(CoinProbability.tail);

		assertEquals(headProbability, tailProbability);
	}

	@Test
	public void testIfProbabilityOfTossingTwoSuccessiveHeadsIs0Point25() {
		CoinToss event1Result = new CoinToss(CoinProbability.head);
		CoinToss event2Result = new CoinToss(CoinProbability.head);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = event1Result.getProbabilityOfEvents(event1Result, event2Result);

		assertEquals(expectedValue, actualValue);
	}

}