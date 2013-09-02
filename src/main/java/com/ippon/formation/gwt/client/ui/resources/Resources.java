package com.ippon.formation.gwt.client.ui.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {

	public static Resources INSTANCE = GWT.create(Resources.class);

	@Source("ippon_logo.png")
	ImageResource ipponLogo();

	@Source("MyCss.css")
	MyCss myCss();

}
