package generics;

import java.util.Comparator;

public class carspricecomparator implements Comparator<cars> {

	
	
//	
	
	@Override
	public int compare(cars tcar, cars ocar) {
		return ocar.price - tcar.price;
	}

}
