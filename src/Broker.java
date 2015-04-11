import java.util.Collection;
// @Begin
import java.util.LinkedList;
// @End


public class Broker implements EventBus {

	private Collection<Subscription> subscriptions;

	public Broker() {
		subscriptions = new LinkedList<Subscription>();
	}

	public void proccessEvent(UnsubscribeEvent event) {
		// @Begin
		Subscription subscription = getSubscriptionByProductType(event.getProductType());
		subscription.removeConsumer(event.getConsumer());
		// @End
	}

	public void proccessEvent(SubscribeEvent event) {
		// @Begin
		Subscription subscription = getSubscriptionByProductType(event.getProductType());
		subscription.addConsumer(event.getConsumer());
		// @End
	}

	public void proccessEvent(PublishEvent event) {
		// @Begin
		Subscription subscription = getSubscriptionByProductType(event.getProduct().getProductType());
		Collection<Consumer> consumers = subscription.getConsumers();
		for(Consumer consumer : consumers){
			consumer.notifiy(event);
		}
		// @End
	}

	protected Subscription getSubscriptionByProductType(String productType) {
		// @Begin
		Subscription toReturn  = null;
		for (Subscription subscription : subscriptions) {
			if (subscription.getProductType().equals(productType)) {
				toReturn = subscription;
			}
		}
		if(toReturn == null){
			toReturn = new Subscription(productType);
			subscriptions.add(toReturn);
		}
		return toReturn;
		// @End
		// return null;
	}

}
