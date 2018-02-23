package by.epam.preTraining.krautsou.tasks.task6.code.customStack;

public class CustomStack {
    private static final int EMPTY_ELEMENT = 0;
    private int capacity;
    private int topElement;
    private int[] array;

    public CustomStack(int inCapacity) {
        topElement = -1;
        this.capacity = inCapacity;
        array = new int[inCapacity];
    }

    public void push(int... element) {
        for (int anElement : element) {
            topElement++;
            array[topElement] = anElement;

        }
    }

    public void push(int element) {
        topElement++;
        array[topElement] = element;
    }

    public int pop() throws CustomException {
        if (topElement == EMPTY_ELEMENT) return 0; //throw new CustomException("Empty");
        array[topElement] = 0;
        return array[topElement--];
    }

    public int customSize() {
        return getCapacity();
    }

    public boolean isFull() {
        return topElement == (capacity - 1);
    }

    public boolean customIsEmpty() {
        return topElement == EMPTY_ELEMENT;
    }

    public int peek() throws CustomException {
        if (topElement == EMPTY_ELEMENT) return 0;//throw new CustomException("Empty");
        return array[topElement];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArrayIndex(int index) {
        return array[index];
    }
}
