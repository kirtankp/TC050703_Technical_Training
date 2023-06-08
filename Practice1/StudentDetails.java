
public class StudentDetails extends PerInfo {
	String Erno,result;
	
	public String getEr() {
		return Erno;
	}
	
	public String getRes() {
		return result;
	}
	
	public void setEr(String e) {
		Erno = e;
	}
	
	public void setRes(String r) {
		result = r;
	}
	
	@Override
	public String toString() {
		return ("Name: "+getName()+" Address: "+getAdd()+" Er no: "+getEr()+" Result: "+getRes());
	}
	
}
