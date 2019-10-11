package com.cmap.portlets.twitter.api.service.util;

import java.util.Comparator;

import org.apache.commons.httpclient.NameValuePair;

public class NvpComparator implements Comparator<NameValuePair> {
	
	public int compare(NameValuePair arg0, NameValuePair arg1) {
	    String name0 = arg0.getName();
	    String name1 = arg1.getName();
	    return name0.compareTo(name1);
	}
}
