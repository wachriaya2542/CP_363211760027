package Lab8;
public class ArrayException {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50}; // index 0-4
        System.out.println(num[0]);
        try {
            System.out.println(num[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is invalid.");
        }
        System.out.println(num[4]);
    }
}