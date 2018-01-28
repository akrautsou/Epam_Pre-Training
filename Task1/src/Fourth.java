class Fourth {
    static void start() {
        Integer numbers = 45678, flag = 1;
        String txt = Integer.toString(numbers);
        char[] array = txt.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            if (Character.getNumericValue(array[i]) < Character.getNumericValue(array[i + 1])) {
                flag++;
            } else {
                System.out.println("Ne vernoe");
                i = array.length;
            }
        }
        if (flag == array.length) {
            System.out.println("Vernoe");

        }
    }
}