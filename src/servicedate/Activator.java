/*
 * Created on Tue Oct 21 12:35:46 CEST 2014
 */
package servicedate;

import java.util.Hashtable;

import org.knopflerfish.tutorial.ds.DS;
import org.knopflerfish.tutorial.ds.impl.DateServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
  
	public static BundleContext bc = null;
  	
	public void start(BundleContext bc) throws Exception {
		System.out.println(bc.getBundle().getHeaders().get
				(Constants.BUNDLE_NAME) + " starting...");
		Activator.bc = bc;
		DS service = new DateServiceImpl();
		ServiceRegistration registration =
				bc.registerService(DS.class.getName(),
                     service,
                     new Hashtable());
		System.out.println("Service registered: DateService");
	}
	public void stop(BundleContext bc) throws Exception {
		System.out.println(bc.getBundle().getHeaders().get
                   (Constants.BUNDLE_NAME) + " stopping...");
		Activator.bc = null;
	} 
	
}