import java.util.Collection;
import java.util.List;

public class Broker {

	private Collection<Consumer> consumer;

	private Collection<Vender> vender;

	public Broker() {

	}

	public List<Notification> proccessEvent(UnsubscribeEvent event) {
		return null;
	}

	public List<Notification> proccessEvent(SubscribeEvent event) {
		return null;
	}

	public List<Notification> proccessEvent(PublishEvent event) {
		return null;
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
