package edu.ycp.cs320.gamingwebsite.shared;

public interface ISubscriber {
	/**
	 * Called by a Publisher when an event occurs.
	 * 
	 * @param key        key indicating the type of the event
	 * @param publisher  the publisher
	 * @param hint       additional information about the event
	 */
	public void eventOccured(Object key, IPublisher publisher, Object hint);
}
