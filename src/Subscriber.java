public abstract interface Subscriber {

	public abstract void subscribe(Broker broker);

	public abstract void unsubscribe(Broker broker);

}
