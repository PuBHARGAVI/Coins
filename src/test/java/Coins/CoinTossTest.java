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
		CoinToss headOnToss1 = new CoinToss(CoinProbability.head);
		CoinToss headOnToss2 = new CoinToss(CoinProbability.head);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = headOnToss2.jointEvents(headOnToss1);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfTossingTwoSuccessiveTailsIs0Point25() {
		CoinToss tailOnToss1 = new CoinToss(CoinProbability.tail);
		CoinToss tailOnToss2 = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = tailOnToss2.jointEvents(tailOnToss1);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfTossingSuccessiveHeadAndTailIs0Point25() {
		CoinToss headOnToss1 = new CoinToss(CoinProbability.head);
		CoinToss tailOnToss2 = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = tailOnToss2.jointEvents(headOnToss1);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfTossingSuccessiveTailAndHeadIs0Point25() {
		CoinToss tailOnToss1 = new CoinToss(CoinProbability.tail);
		CoinToss headOnToss2 = new CoinToss(CoinProbability.head);
		double expectedValue = 0.25;
		double actualValue;

		actualValue = headOnToss2.jointEvents(tailOnToss1);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfNotGettingHeadOnCoinTossIs0Point5() {
		CoinToss notHeadOnToss = new CoinToss(CoinProbability.head);
		double expectedValue = 0.5;
		double actualValue;

		actualValue = notHeadOnToss.complementOfEvent();

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfNotGettingTailOnCoinTossIs0Point5() {
		CoinToss notTailOnToss = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.5;
		double actualValue;

		actualValue = notTailOnToss.complementOfEvent();

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfGettingEitherHeadOnFirstCoinOrHeadOnSecondCoinIs0Point75() {
		CoinToss headOnToss1 = new CoinToss(CoinProbability.head);
		CoinToss headOnToss2 = new CoinToss(CoinProbability.head);
		double expectedValue = 0.75;
		double actualValue;

		actualValue = headOnToss2.orOfEvents(headOnToss1);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfGettingEitherTailOnFirstCoinOrTailOnSecondCoinIs0Point75() {
		CoinToss headOnToss1 = new CoinToss(CoinProbability.tail);
		CoinToss headOnToss2 = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.75;
		double actualValue;

		actualValue = headOnToss2.orOfEvents(headOnToss1);

		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testIfProbabilityOfGettingEitherHeadOnFirstCoinOrTailOnSecondCoinIs0Point75() {
		CoinToss headOnToss1 = new CoinToss(CoinProbability.head);
		CoinToss headOnToss2 = new CoinToss(CoinProbability.tail);
		double expectedValue = 0.75;
		double actualValue;

		actualValue = headOnToss2.orOfEvents(headOnToss1);

		assertEquals(expectedValue, actualValue);
	}

}