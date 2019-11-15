package factory;

import java.util.Arrays;
import java.util.Collection;

import bean.CalendarsubActivite;


public class CalendarsubActiviteFactory {
	
	private static CalendarsubActivite[] data =
		{
			new CalendarsubActivite("Lundi", new Integer(28), new Integer(10), new Integer(2019), new Integer(1000),new Integer(2),new Integer(0)),
			new CalendarsubActivite("Mardi", new Integer(29), new Integer(10), new Integer(2019), new Integer(1000),new Integer(3),new Integer(0)),
			new CalendarsubActivite("Mercredi", new Integer(30), new Integer(10), new Integer(2019), new Integer(1000),new Integer(4),new Integer(0)),
			new CalendarsubActivite("Jeudi", new Integer(31), new Integer(10), new Integer(2019), new Integer(1000),new Integer(5),new Integer(0)),	
			new CalendarsubActivite("Vendredi", new Integer(1), new Integer(11), new Integer(2019), new Integer(1000),new Integer(1),new Integer(0)),
			new CalendarsubActivite("Lundi", new Integer(4), new Integer(11), new Integer(2019), new Integer(1000),new Integer(2),new Integer(0)),
			new CalendarsubActivite("Mardi", new Integer(5), new Integer(11), new Integer(2019), new Integer(1000),new Integer(3),new Integer(0)),
			new CalendarsubActivite("Mercredi", new Integer(6), new Integer(11), new Integer(2019), new Integer(1000),new Integer(4),new Integer(0)),
			new CalendarsubActivite("Jeudi", new Integer(7), new Integer(11), new Integer(2019), new Integer(1000),new Integer(5),new Integer(0)),
			new CalendarsubActivite("Vendredi", new Integer(8), new Integer(11), new Integer(2019), new Integer(1000),new Integer(6),new Integer(0)),
			new CalendarsubActivite("Lundi", new Integer(11), new Integer(11), new Integer(2019), new Integer(1000),new Integer(7),new Integer(0)),
			new CalendarsubActivite("Mardi", new Integer(12), new Integer(11), new Integer(2019), new Integer(1000),new Integer(8),new Integer(0)),
			new CalendarsubActivite("Mercredi", new Integer(13), new Integer(11), new Integer(2019), new Integer(1000),new Integer(9),new Integer(0)),
			new CalendarsubActivite("Jeudi", new Integer(14), new Integer(11), new Integer(2019), new Integer(1000),new Integer(10),new Integer(0)),
			new CalendarsubActivite("Vendredi", new Integer(15), new Integer(11), new Integer(2019), new Integer(1000),new Integer(11),new Integer(0)),
			new CalendarsubActivite("Lundi", new Integer(18), new Integer(11), new Integer(2019), new Integer(1000),new Integer(12),new Integer(0)),
			new CalendarsubActivite("Mardi", new Integer(19), new Integer(11), new Integer(2019), new Integer(1000),new Integer(13),new Integer(0)),
			new CalendarsubActivite("Mercredi", new Integer(20), new Integer(11), new Integer(2019), new Integer(1000),new Integer(14),new Integer(0)),
			new CalendarsubActivite("Jeudi", new Integer(21), new Integer(11), new Integer(2019), new Integer(1000),new Integer(15),new Integer(0)),
			new CalendarsubActivite("Vendredi", new Integer(22), new Integer(11), new Integer(2019), new Integer(1000),new Integer(16),new Integer(0)),
			new CalendarsubActivite("Lundi", new Integer(25), new Integer(11), new Integer(2019), new Integer(1000),new Integer(12),new Integer(0)),
			new CalendarsubActivite("Mardi", new Integer(26), new Integer(11), new Integer(2019), new Integer(1000),new Integer(13),new Integer(0)),
			new CalendarsubActivite("Mercredi", new Integer(27), new Integer(11), new Integer(2019), new Integer(1000),new Integer(14),new Integer(0)),
			new CalendarsubActivite("Jeudi", new Integer(28), new Integer(11), new Integer(2019), new Integer(1000),new Integer(15),new Integer(0)),
			new CalendarsubActivite("Vendredi", new Integer(29), new Integer(11), new Integer(2019), new Integer(1000),new Integer(16),new Integer(0))
		};  
			

	/**
	 *
	 */
	public static Object[] getBeanArray()
	{
		return data;
	}


	/**
	 *
	 */
	public static Collection<CalendarsubActivite> getBeanCollection()
	{
		return Arrays.asList(data);
	}


}
