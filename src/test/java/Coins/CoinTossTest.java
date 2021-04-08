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
	public void testIfProbabilityOfNotGettingHeadOnCoinTossIs0Point5() {
		CoinToss notHeadOnEvent = new CoinToss(CoinProbability.head);
		double expectedValue = 0.5;
		double actualValue;

		actualValue = notHeadOnEvent.complementOfEvent();

		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testIfProbabilityOfNotGettingTailOnCoinTossIs0Point5() {
		CoinToss notTailOnEvent = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.5;
		double actualValue;

		actualValue = notTailOnEvent.complementOfEvent();

		assertEquals(expectedValue, actualValue);
	}
}