package strings;

public class Hero implements Cloneable {
	public String name;
	int hp;
	Sword sword;

	public boolean equals(Object o){
		if (o == this){return true;}
		if (o == null){return false;}
		if (!(o instanceof Hero))return false;
			Hero h = (Hero) o;
		if (!this.name.equals(h.name)){
			return false;
		}
		return true;
	}

	public int hashCode(){
		int result = 37;
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;
		return result;
	}

	public Hero clone(){
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}

	public void setSword(Sword s){
		this.sword = s;
	}

	public Sword getSword(){
		return this.sword;
	}

	public Hero(String name){
		this.name = name;
	}

	public Hero(){
		this("デフォ");
	}

}
