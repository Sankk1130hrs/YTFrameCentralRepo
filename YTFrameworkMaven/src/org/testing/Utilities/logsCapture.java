package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class logsCapture 
{
	public static void takelogs (String Classname , String msg)
	{
		DOMConfigurator.configure("../YTFramework/Layout.xml");
		Logger L=Logger.getLogger(Classname);
		L.info(msg);
	}
	

}
