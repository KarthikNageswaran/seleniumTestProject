import java.util.ArrayList;



public class ArrayListFunction {

	public static void main(String[] args) {
		
		ArrayList<String> AL=new ArrayList<String>();
		AL.add("Ka");
		AL.add("rt");
		AL.add("hick");
		
		System.out.println(AL.get(0));
		System.out.println(AL.size());
		
		System.out.println("Print All Elements in Array List");
		for(int i=0;i<AL.size();i++)
		{
			System.out.print(AL.get(i));
			
		}
		System.out.println();
		
		
		
		
	}

}
