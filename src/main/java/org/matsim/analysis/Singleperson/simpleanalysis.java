package org.matsim.analysis.Singleperson;

import org.matsim.core.events.EventsUtils;

public class simpleanalysis {
    public static void main(String[] args){
        var handler = new eventhandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);

        EventsUtils.readEvents(manager,"C:\\Users\\DELL\\Documents\\Matsim\\matsim-serengeti-park-hodenhagen\\scenarios\\serengeti-park-v1.0\\output\\output-serengeti-park-v1.0-run1\\serengeti-park-v1.0-run1.output_events.xml");
    }
}
