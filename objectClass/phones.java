package objectClass;

public class phones {
	int ram;
	int rom;
	phones(){
		
	}
	phones(int ram, int rom){
		this.ram=ram;
		this.rom=rom;
	}
	public String toString() {
		return "Phone conatins Ram :"+ram+" rom :"+rom;
			
	}
}
