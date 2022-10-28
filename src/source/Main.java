package source;

public class Main {

	public static void main(String[] args) {
		
		
		SortedListPriorityQueue<Integer, String> teste = new SortedListPriorityQueue<>();
		
		
		System.out.println("---------------------");
		System.out.println("Insert");
		System.out.println(teste.toString());
		System.out.println(teste.insert(5,"A"));
		System.out.println(teste.toString());
		System.out.println(teste.insert(9,"C"));
		System.out.println(teste.toString());
		System.out.println(teste.insert(3,"B"));
		System.out.println(teste.toString());
		System.out.println(teste.insert(7,"D"));
		System.out.println(teste.toString());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("Min()");
		System.out.println(teste.min());
		System.out.println(teste.removeMin());
		System.out.println(teste.toString());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("size()");
		System.out.println(teste.size());
		System.out.println("---------------------");
		
		System.out.println("---------------------");
		System.out.println("removeMin()");
		System.out.println(teste.removeMin());
		System.out.println(teste.removeMin());
		System.out.println(teste.removeMin());
		System.out.println(teste.toString());
		System.out.println("---------------------");

	}

}
