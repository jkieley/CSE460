import java.util.Collection;
import java.util.List;

public class Broker implements EventBus {

	private Collection<Consumer> consumer;

	private Collection<Vender> vender;

	public Broker() {

	}

	public void proccessEvent(UnsubscribeEvent event) {

	}

	public void proccessEvent(SubscribeEvent event) {

	}

	public void proccessEvent(PublishEvent event) {

	}

	protected void addVender(Vender vender) {

	}

	protected void addConsumer(Consumer consumer) {

	}

	protected void removeConsumer() {

	}

	protected List<Consumer> getConsumersByProductType(String productType) {
		return null;
	}

}
