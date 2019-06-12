package generics;

import java.util.Comparator;

public class carsspeedcomparator implements Comparator<cars> {

	@Override
	public int compare(cars tcar, cars ocar) {
		return ocar.speed - tcar.speed;
	}

}
