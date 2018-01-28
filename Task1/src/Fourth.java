class Fourth {
    void start() {
        Integer numbers = 45678;
        Integer flag = 1;
        String txt = Integer.toString(numbers);
        char[] array = txt.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            if (Character.getNumericValue(array[i]) < Character.getNumericValue(array[i + 1])) {
                flag++;
            } else {
                System.out.println("Ne vernoe");
                break;
            }
        }
        if (flag.equals(array.length)) {
            System.out.println("Vernoe");
        }
    }
}