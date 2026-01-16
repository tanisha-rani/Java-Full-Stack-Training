package objectClass;

public class phoneApp {
	public static void main(String[] args) {
		phones[] arr = new phones[3];

        arr[0] = new phones(12, 6);
        arr[1] = new phones(8, 12);
        arr[2] = new phones(3, 4);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        phones p1 = new phones(5, 6);
        System.out.println(p1);
	}
}
