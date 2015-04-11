import java.util.Collection;
//@Begin
import java.util.LinkedList;
//@End


public class VenderHolder {

	private static Collection<Vender> venders/*@Begin*//*;*/ =  new LinkedList<Vender>();/*@End*/

	public static Vender getVender(String venderName) {
		// @Begin
		Vender toReturn = null;
		for (Vender vender : venders) {
			if (vender.getName().equals(venderName)) {
				toReturn = vender;
			}
		}
		if (toReturn == null) {
			toReturn = new Vender(venderName);
			venders.add(toReturn);
		}
		return toReturn;
		// @End
		// return null;
	}

}
