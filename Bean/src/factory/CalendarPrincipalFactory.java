package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import bean.CalendarPrincipal;
import bean.CalendarsubActivite;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class CalendarPrincipalFactory {
	
	
	
	
	public static Collection<CalendarsubActivite> loadActivites() {
		List<CalendarsubActivite> listActivites=new ArrayList<>();
		Collection<CalendarsubActivite> activites= CalendarsubActiviteFactory.getBeanCollection();
		listActivites.addAll(activites);
		
		return listActivites;
	}
	
	
	
	private static CalendarPrincipal[] data =
		{
				new CalendarPrincipal("Dupont", "Jean", new Integer(11), new Integer(2019), new JRBeanCollectionDataSource(loadActivites()))
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
	public static Collection<CalendarPrincipal> getBeanCollection()
	{
		return Arrays.asList(data);
	}

}

