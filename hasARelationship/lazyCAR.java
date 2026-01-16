package hasARelationship;

public class lazyCAR {
	Wheel[] wheels=new Wheel[4];	
	
	int i=0;
	void addWheel(Wheel wheel) {
		wheels[i]=wheel;
		i++;
	}
}
