package hm.yatzy.test;

import hm.yatzy.refactoring.YatzyCategoryEnum;
import hm.yatzy.refactoring.calcul.YatzyCalculation;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class YatzyTest {

    private YatzyCalculation yatzyCalc = null;

    @Before
    public void init() {
        yatzyCalc = new YatzyCalculation();
    }

    @Test
    public void sum_of_all_dice_test() {
        Assert.assertEquals(15, yatzyCalc.calculate(new Integer[]{2, 3, 4, 5, 1}, YatzyCategoryEnum.SUM).intValue());
        Assert.assertEquals(16, yatzyCalc.calculate(new Integer[]{3, 3, 4, 5, 1}, YatzyCategoryEnum.SUM).intValue());
    }

    @Test
    public void chance_test() {
        Assert.assertEquals(50, yatzyCalc.calculate(new Integer[]{4, 4, 4, 4, 4}, YatzyCategoryEnum.CHANCE).intValue());
        Assert.assertEquals(50, yatzyCalc.calculate(new Integer[]{6, 6, 6, 6, 6}, YatzyCategoryEnum.CHANCE).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{6, 6, 6, 6, 3}, YatzyCategoryEnum.CHANCE).intValue());
    }

    @Test
    public void onces_test() {
        Assert.assertTrue(yatzyCalc.calculate(new Integer[]{1, 2, 3, 4, 5}, YatzyCategoryEnum.ONES).equals(1));
        Assert.assertEquals(2, yatzyCalc.calculate(new Integer[]{1, 2, 1, 4, 5}, YatzyCategoryEnum.ONES).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{6, 2, 2, 4, 5}, YatzyCategoryEnum.ONES).intValue());
        Assert.assertEquals(4, yatzyCalc.calculate(new Integer[]{1, 2, 1, 1, 1}, YatzyCategoryEnum.ONES).intValue());
    }

    @Test
    public void twos_test() {
        Assert.assertEquals(4, yatzyCalc.calculate(new Integer[]{1, 2, 3, 2, 6}, YatzyCategoryEnum.TWOS).intValue());
        Assert.assertEquals(10, yatzyCalc.calculate(new Integer[]{2, 2, 2, 2, 2}, YatzyCategoryEnum.TWOS).intValue());
    }

    @Test
    public void threes_test() {
        Assert.assertEquals(6, yatzyCalc.calculate(new Integer[]{1, 2, 3, 2, 3}, YatzyCategoryEnum.THREES).intValue());
        Assert.assertEquals(12, yatzyCalc.calculate(new Integer[]{2, 3, 3, 3, 3}, YatzyCategoryEnum.THREES).intValue());
    }

    @Test
    public void fours_test() {
        Assert.assertEquals(12, yatzyCalc.calculate(new Integer[]{4, 4, 4, 5, 5}, YatzyCategoryEnum.FOURS).intValue());
        Assert.assertEquals(8, yatzyCalc.calculate(new Integer[]{4, 4, 5, 5, 5}, YatzyCategoryEnum.FOURS).intValue());
        Assert.assertEquals(4, yatzyCalc.calculate(new Integer[]{4, 5, 5, 5, 5}, YatzyCategoryEnum.FOURS).intValue());
    }

    @Test
    public void fives_test() {
        Assert.assertEquals(10, yatzyCalc.calculate(new Integer[]{4, 4, 4, 5, 5}, YatzyCategoryEnum.FIVES).intValue());
        Assert.assertEquals(15, yatzyCalc.calculate(new Integer[]{4, 4, 5, 5, 5}, YatzyCategoryEnum.FIVES).intValue());
        Assert.assertEquals(20, yatzyCalc.calculate(new Integer[]{4, 5, 5, 5, 5}, YatzyCategoryEnum.FIVES).intValue());
    }

    @Test
    public void sixes_test() {
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{4, 4, 4, 5, 5}, YatzyCategoryEnum.SIXES).intValue());
        Assert.assertEquals(6, yatzyCalc.calculate(new Integer[]{4, 4, 6, 5, 5}, YatzyCategoryEnum.SIXES).intValue());
        Assert.assertEquals(18, yatzyCalc.calculate(new Integer[]{6, 5, 6, 6, 5}, YatzyCategoryEnum.SIXES).intValue());
    }

    @Test
    public void one_pair_test() {
        Assert.assertEquals(6, yatzyCalc.calculate(new Integer[]{3, 4, 3, 5, 6}, YatzyCategoryEnum.PAIR).intValue());
        Assert.assertEquals(6, yatzyCalc.calculate(new Integer[]{5, 3, 3, 3, 5}, YatzyCategoryEnum.PAIR).intValue());
        Assert.assertEquals(10, yatzyCalc.calculate(new Integer[]{5, 3, 6, 6, 5}, YatzyCategoryEnum.PAIR).intValue());
    }

    @Test
    public void two_Pair_test() {
        Assert.assertEquals(16, yatzyCalc.calculate(new Integer[]{3, 3, 5, 4, 5}, YatzyCategoryEnum.TWO_PAIRS).intValue());
        Assert.assertEquals(16, yatzyCalc.calculate(new Integer[]{3, 3, 5, 5, 5}, YatzyCategoryEnum.TWO_PAIRS).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{3, 3, 1, 2, 5}, YatzyCategoryEnum.TWO_PAIRS).intValue());
        Assert.assertEquals(8, yatzyCalc.calculate(new Integer[]{1, 3, 1, 2, 3}, YatzyCategoryEnum.TWO_PAIRS).intValue());
    }

    @Test
    public void three_of_a_kind_test() {
        Assert.assertEquals(9, yatzyCalc.calculate(new Integer[]{3, 3, 3, 4, 5}, YatzyCategoryEnum.THREE_OF_A_KIND).intValue());
        Assert.assertEquals(15, yatzyCalc.calculate(new Integer[]{5, 3, 5, 4, 5}, YatzyCategoryEnum.THREE_OF_A_KIND).intValue());
        Assert.assertEquals(9, yatzyCalc.calculate(new Integer[]{3, 3, 3, 3, 5}, YatzyCategoryEnum.THREE_OF_A_KIND).intValue());
    }

    @Test
    public void four_of_a_kind_test() {
        Assert.assertEquals(12, yatzyCalc.calculate(new Integer[]{3, 3, 3, 3, 5}, YatzyCategoryEnum.FOUR_OF_A_KIND).intValue());
        Assert.assertEquals(20, yatzyCalc.calculate(new Integer[]{5, 5, 5, 4, 5}, YatzyCategoryEnum.FOUR_OF_A_KIND).intValue());
        Assert.assertEquals(4, yatzyCalc.calculate(new Integer[]{1, 1, 3, 1, 1}, YatzyCategoryEnum.FOUR_OF_A_KIND).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{1, 1, 3, 2, 5}, YatzyCategoryEnum.FOUR_OF_A_KIND).intValue());
    }

    @Test
    public void small_straight_test() {
        Assert.assertEquals(15, yatzyCalc.calculate(new Integer[]{1, 2, 3, 4, 5}, YatzyCategoryEnum.SMALL_STRAIGHT).intValue());
        Assert.assertEquals(15, yatzyCalc.calculate(new Integer[]{2, 3, 4, 5, 1}, YatzyCategoryEnum.SMALL_STRAIGHT).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{1, 2, 2, 4, 5}, YatzyCategoryEnum.SMALL_STRAIGHT).intValue());
    }

    @Test
    public void large_straight_test() {
        Assert.assertEquals(20, yatzyCalc.calculate(new Integer[]{6, 2, 3, 4, 5}, YatzyCategoryEnum.LARGE_STRAIGHT).intValue());
        Assert.assertEquals(20, yatzyCalc.calculate(new Integer[]{2, 3, 4, 5, 6}, YatzyCategoryEnum.LARGE_STRAIGHT).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{1, 2, 2, 4, 5}, YatzyCategoryEnum.LARGE_STRAIGHT).intValue());
    }

    @Test
    public void full_house_test() {
        Assert.assertEquals(18, yatzyCalc.calculate(new Integer[]{6, 2, 2, 2, 6}, YatzyCategoryEnum.FULL_HOUSE).intValue());
        Assert.assertEquals(0, yatzyCalc.calculate(new Integer[]{2, 3, 4, 5, 6}, YatzyCategoryEnum.FULL_HOUSE).intValue());
    }
}
