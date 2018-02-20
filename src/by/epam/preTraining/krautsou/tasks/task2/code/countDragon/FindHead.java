package by.epam.preTraining.krautsou.tasks.task2.code.countDragon;

public class FindHead {
    private static final int START_HEAD = 3;
    private static final int ONE_HUNDRED_YEARS = 100;
    private static final int TWO_HUNDRED_YEARS = 200;
    private static final int THREE_HUNDRED_YEARS = 300;

    private static final int HEADS_FOR_MIDDLE_DRAGON = 2;
    private static final int HEAD_FOR_YOUNG_DRAGON = 3;

    public int getTheNumberOfHead(int yearsOld) {
        int quantityOfHead = START_HEAD;
        if (yearsOld < TWO_HUNDRED_YEARS) {
            quantityOfHead = yearsOld * HEAD_FOR_YOUNG_DRAGON + START_HEAD;
        }
        if (yearsOld >= TWO_HUNDRED_YEARS) {
            quantityOfHead = yearsOld * HEAD_FOR_YOUNG_DRAGON + START_HEAD;
            yearsOld = yearsOld - TWO_HUNDRED_YEARS;
            quantityOfHead += yearsOld * HEADS_FOR_MIDDLE_DRAGON;
        }
        if (yearsOld >= THREE_HUNDRED_YEARS) {
            quantityOfHead = yearsOld * HEAD_FOR_YOUNG_DRAGON + START_HEAD;
            yearsOld = yearsOld - TWO_HUNDRED_YEARS;
            quantityOfHead += yearsOld * HEADS_FOR_MIDDLE_DRAGON;
            yearsOld = yearsOld - ONE_HUNDRED_YEARS;
            quantityOfHead += yearsOld;
        }
        return quantityOfHead;
    }

}
