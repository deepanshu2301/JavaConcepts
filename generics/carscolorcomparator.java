package generics;

import java.util.Comparator;

public class carscolorcomparator implements Comparator<cars> {

	
	
//	  if we write override it will overwrite the previous function and if the function is not present it will overwrite the default function 
//	present in the object class
	@Override
	public int compare(cars tcar, cars ocar) {
		return tcar.color.compareTo(ocar.color);
	}

}
