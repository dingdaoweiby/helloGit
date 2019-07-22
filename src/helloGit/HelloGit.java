package helloGit;

public class HelloGit {

    public static void main(String[] args) {
        System.out.println("Hello git, this is idea");
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void reverse(int[] array, int i, int j) {
        while (i < j) {
            int temp = array[i];
            array[i++] = array[j];
            array[j--] = temp;
        }
    }

}
