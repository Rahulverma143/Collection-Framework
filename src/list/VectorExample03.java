package list;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample03 {

		public static void main(String[] args) {
			Vector<String> v = new Vector<String>();
			v.add("aa");
			v.add("bb");
			v.add("cc");
			v.add("dd");
			System.out.println(v); 
			
			Enumeration <String> enm = v.elements();
			while(enm.hasMoreElements()) {
			Object o = enm.nextElement();
			System.out.println(o);
			}
		}

	}


