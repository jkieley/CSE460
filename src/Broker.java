import java.util.Collection;

public class Broker implements EventBus {

	private Collection<Subscription> subscription;

	public Broker() {

	}

	public void proccessEvent(UnsubscribeEvent event) {

	}

	public void proccessEvent(SubscribeEvent event) {

	}

	public void proccessEvent(PublishEvent event) {

	}

	protected Subscription getSubscriptionByProductType(String productType) {
		return null;
	}

}
