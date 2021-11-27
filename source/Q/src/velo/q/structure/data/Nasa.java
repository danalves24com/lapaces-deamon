package velo.q.structure.data;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import velo.ladaalpha.fields.internet.APIreq;
import velo.ladaalpha.fields.internet.HttpResponse;
import velo.q.structure.DataPoint;
import velo.q.structure.Source;

public class Nasa extends Source{
	public Nasa() {
		super("nasa", new DataPoint[] {SatIMG()}, corePath );
	}
	private static String corePath = "https://api.nasa.gov/", key = "GM7OqKsE8hAG4o7YsYCWdJum4fqti4Wgzd4imvTt";
	public static DataPoint SatIMG() {
		class satimg extends DataPoint {
			public satimg() {
				super("satimg", new String[] {"lat", "lon", "y-m-d", "ratio"});
			}
			@Override
			public Object fetch(Object[] p) {
				String lat = (String) p[0], lon = (String) p[1], date = (String)p[2], ratio = (String) p[3];
				String path = corePath+"planetary/earth/imagery?lon="+lon+"&lat="+lat+"&dim="+ratio+"&date="+date+"&api_key="+key;
				String loc = APIreq.IMAGE(path, lat+":"+lon+"@"+date+"-"+ratio);
				return loc;				
			}
			@Override
			public String stringify(Object o) {
				String loc = (String)o;
				Desktop dt = Desktop.getDesktop();
				try {
					dt.open(new File(loc));
				} catch (IOException e) {
				}
				return "Stored in " + loc;
			}
		}
		return new satimg();
	}
}