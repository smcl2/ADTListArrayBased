
public class TestADTList {

	public static void main(String[] args) {
		
		ArrayBasedList list = new ArrayBasedList();
		
		System.out.println("Is the list empty? " + list.isEmpty());
		list.add(1, 99);
		list.add(2, 150);
		list.add(3, 976);
		System.out.println("The item as position 2 is: " + list.get(2));
		list.add(2, 1067);
		System.out.println("The item as position 2 is: " + list.get(2));
		System.out.println("The item as position 3 is: " + list.get(3));
		System.out.println("The item as position 3 is: " + list.get(4));

	}

}
