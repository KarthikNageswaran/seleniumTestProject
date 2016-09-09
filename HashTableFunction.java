import java.util.Hashtable;

public class HashTableFunction {

	public static void main(String[] args) {
		//Key value pair
		Hashtable<String,String> table=new Hashtable<String,String>();
		table.put("Name", "Karthick");
		table.put("height", "6");
		
		System.out.println(table.get("Name"));
		
		System.out.println(table.get("height"));

		//multiple tables
		
		Hashtable<String,Hashtable<String,String>> table2=new Hashtable<String,Hashtable<String,String>>();
		table2.put("Name", table);
		System.out.println(table2.get("Name"));
		
	
	}

}
