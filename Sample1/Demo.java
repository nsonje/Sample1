
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		
		d.setData(10);
		System.out.println("The data is: " + d.getData());
		
		//Do change for a commit
		d.setData(20);
		System.out.println("The data is: " + d.getData());
		
		//Another commit
		System.out.println("**Hello!");
		System.out.println("The square of the data is: " + d.squareData());
		System.out.println("**Another Hello!");
		System.out.println("**Be happy always.");
	}

}
