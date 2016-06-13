package org.json;


import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
	public Activator() { 
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
		
}
