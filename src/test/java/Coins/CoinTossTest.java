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
		CoinToss headOnEvent1 = new CoinToss(CoinProbability.head);
		CoinToss headOnEvent2 = new CoinToss(CoinProbability.head);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = headOnEvent1.jointProbability(headOnEvent1, headOnEvent2);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfTossingTwoSuccessiveTailsIs0Point25() {
		CoinToss tailOnEvent1 = new CoinToss(CoinProbability.tail);
		CoinToss tailOnEvent2 = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = tailOnEvent1.jointProbability(tailOnEvent1, tailOnEvent2);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfTossingSuccessiveHeadAndTailIs0Point25() {
		CoinToss headOnEvent1 = new CoinToss(CoinProbability.head);
		CoinToss tailOnEvent2 = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = headOnEvent1.jointProbability(headOnEvent1, tailOnEvent2);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfTossingSuccessiveTailAndHeadIs0Point25() {
		CoinToss tailOnEvent1 = new CoinToss(CoinProbability.tail);
		CoinToss headOnEvent2 = new CoinToss(CoinProbability.head);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = tailOnEvent1.jointProbability(tailOnEvent1, headOnEvent2);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfNotTossingHeadIs0Point5() {
		CoinToss headOnEvent = new CoinToss(CoinProbability.head);
		double expectedValue = 0.5;
		double actualValue;

		actualValue = headOnEvent.complementOfEvent();

		assertEquals(expectedValue, actualValue);
	}

}