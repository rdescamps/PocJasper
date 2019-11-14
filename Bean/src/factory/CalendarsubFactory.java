package factory;

import java.util.Arrays;
import java.util.Collection;

import bean.Calendarsubbean;


public class CalendarsubFactory {
	
	private static Calendarsubbean[] data =
		{
			new Calendarsubbean("test", new Integer(3), new Integer(1000),new Integer(1),new Integer(0)),
			new Calendarsubbean("test", new Integer(4), new Integer(1000),new Integer(2),new Integer(0)),
			new Calendarsubbean("test", new Integer(5), new Integer(1000),new Integer(3),new Integer(0)),
			new Calendarsubbean("test", new Integer(6), new Integer(1000),new Integer(4),new Integer(0)),
			new Calendarsubbean("test", new Integer(7), new Integer(1000),new Integer(5),new Integer(0)),
			new Calendarsubbean("test", new Integer(10), new Integer(1000),new Integer(6),new Integer(0)),
			new Calendarsubbean("test", new Integer(11), new Integer(1000),new Integer(7),new Integer(0))

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
