package CountDragon;

public class FindEyes {
    private static final int EYES_PER_HEAD = 2;

    public int getTheNumberOfEyes(int quantityOfHead) {
        return quantityOfHead * EYES_PER_HEAD;
    }
}
