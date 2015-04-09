import java.util.Collection;

public class ConsumerHolder {

	private Collection<Consumer> consumer;

	public Consumer getConsumer(String consumerName) {
		Consumer toReturn = null;
		for(Consumer con: consumer){
			if (con.getName().equals(consumerName)) {
				toReturn = con;
				break;
			}
		}
	}

}
