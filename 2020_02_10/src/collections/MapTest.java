package collections;

import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Date> map = new Hashtable<String, Date>();
		map.put( "birthday", new Date(1989,06,30) );
		map.put( "engday", new Date(2020,02,12) );
		
		System.out.println( map.get("birthday").getMonth() );
		
		Iterator<String> keys = map.keySet().iterator();
		while( keys.hasNext() ) {
			System.out.println( map.get( keys.next() ).getYear() );
		}
	}
}
