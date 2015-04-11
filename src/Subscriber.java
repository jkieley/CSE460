public abstract interface Subscriber {

	public abstract void subscribe(Broker broker, String productType);

	public abstract void unsubscribe(Broker broker, String productType);

}
