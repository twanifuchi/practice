package strings;

public class Sword {
	String name;

	public Sword(String name){
		this.name = name;
	}

	public Sword(){
		this("ななしの剣");
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Sword clone(){
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
}
