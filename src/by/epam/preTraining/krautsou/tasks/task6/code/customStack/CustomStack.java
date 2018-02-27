package by.epam.preTraining.krautsou.tasks.task6.code.customStack;

public class CustomStack {
    private static final int EMPTY_ELEMENT = 0;
    private int capacity;
    private int numberOfElements = 0;
    private int topElement;
    private Object[] array;

    public CustomStack(int inCapacity) {
        topElement = -1;
        this.capacity = inCapacity;
        array = new Object[inCapacity];
    }

    public void push(Object... element) {
        for (Object anElement : element) {
            if (numberOfElements < capacity) {
                Object[] tempArray = array;
                array = new Object[++capacity];
                for (int i = 0; i < tempArray.length; i++) {
                    array[i] = tempArray[i];
                }
                array[numberOfElements++] = anElement;
            } else {
                array[numberOfElements++] = anElement;
            }
            topElement++;
        }
    }

    public Object pop() throws CustomException {
        if (topElement == EMPTY_ELEMENT) return null; //throw new CustomException("Empty");
        Object temp = array[topElement];
        array[topElement] = null;
        numberOfElements--;
        topElement--;
        return temp;

    }

    public int size() {
        return getCapacity();
    }

    public boolean isFull() {
        return topElement == (capacity - 1);
    }

    public boolean isEmpty() {
        return topElement == EMPTY_ELEMENT;
    }


    public Object peek() throws CustomException {
        if (topElement == EMPTY_ELEMENT) return null;//throw new CustomException("Empty");
        return array[topElement];
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public int getTopElement() {
        return topElement;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public Object getArrayIndex(int index) {
        return array[index];
    }

    public void setTopElement(int topElement) {
        this.topElement = topElement;
    }


}
