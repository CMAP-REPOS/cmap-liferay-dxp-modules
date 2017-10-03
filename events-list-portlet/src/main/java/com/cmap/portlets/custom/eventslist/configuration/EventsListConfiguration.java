package com.cmap.portlets.custom.eventslist.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(
		id = "com.cmap.portlets.custom.configuration.EventsListConfiguration"
)

public interface EventsListConfiguration {
    @Meta.AD(
    		deflt = "7",
    		required = false
    )
    public String numberOfDaysInThePast();

    @Meta.AD(
    		deflt = "100",
    		required = false
    )
    public String numberOfEventsToShow();
}