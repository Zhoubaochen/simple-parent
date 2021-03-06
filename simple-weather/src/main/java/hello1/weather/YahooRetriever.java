package hello1.weather;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {
	private static Logger log = Logger.getLogger(YahooRetriever.class);

	public InputStream retrieve(String zip) throws Exception {
		log.info("Retrieving Weather Data");
		String url = "http://weather.yahooapis.com/forecastrss?p=" + zip;
		URLConnection conn = new URL(url).openConnection();
		return conn.getInputStream();
	}
}
