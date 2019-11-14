package factory;

import java.util.Arrays;
import java.util.Collection;

import bean.Calendarsubbean;


public class CalendarsubFactory {
	
	private static Calendarsubbean[] data =
		{
			new Calendarsubbean("Vendredi", new Integer(1), new Integer(11), new Integer(2019), new Integer(1000),new Integer(1),new Integer(0)),
			new Calendarsubbean("Lundi", new Integer(4), new Integer(11), new Integer(2019), new Integer(1000),new Integer(2),new Integer(0)),
			new Calendarsubbean("Mardi", new Integer(5), new Integer(11), new Integer(2019), new Integer(1000),new Integer(3),new Integer(0)),
			new Calendarsubbean("Mercredi", new Integer(6), new Integer(11), new Integer(2019), new Integer(1000),new Integer(4),new Integer(0)),
			new Calendarsubbean("Jeudi", new Integer(7), new Integer(11), new Integer(2019), new Integer(1000),new Integer(5),new Integer(0)),
			new Calendarsubbean("Vendredi", new Integer(8), new Integer(11), new Integer(2019), new Integer(1000),new Integer(6),new Integer(0)),
			new Calendarsubbean("Lundi", new Integer(11), new Integer(11), new Integer(2019), new Integer(1000),new Integer(7),new Integer(0))

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
	public static Collection<Calendarsubbean> getBeanCollection()
	{
		return Arrays.asList(data);
	}


}
