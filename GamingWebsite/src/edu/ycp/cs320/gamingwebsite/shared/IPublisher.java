package edu.ycp.cs320.gamingwebsite.shared;


public interface IPublisher {
	/**
	 * Called by a Subscriber to subscribe to a particular type of event.
	 * 
	 * @param key        key indicating type of event Subscriber wants to be notified of
	 * @param subscriber the Subscriber
	 * @param registrar  the SubscriptionRegistrar that will keep track of subscriptions
	 */
	public abstract void subscribe(Object key, ISubscriber subscriber);
	
	/**
	 * Called by a Subscriber to unsubscribe from a particular type of event.
	 * 
	 * @param key        key indicating type of event Subscriber no longer wants to be notified of
	 * @param subscriber the Subscriber
	 */
	public abstract void unsubscribe(Object key, ISubscriber subscriber);
	
	/**
	 * Called by a Subscriber to unsubscribe from all events published by this Publisher.
	 * 
	 * @param subscriber the Subscriber
	 */
	public abstract void unsubscribeFromAll(ISubscriber subscriber);

	/**
	 * Publish an event.
	 * 
	 * @param key   key indicating the type of the event
	 * @param hint  object with additional information about the event
	 */
	public abstract void notifySubscribers(Object key, Object hint);
	
}
