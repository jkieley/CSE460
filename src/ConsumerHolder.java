import java.util.Collection;

public class ConsumerHolder {

	private static Collection<Consumer> consumer;

	public static Consumer getConsumer(String consumerName) {
		// @Begin
		Consumer toReturn = null;
		for(Consumer con: consumer){
			if (con.getName().equals(consumerName)) {
				toReturn = con;
				break;
			}
		}
		if (toReturn == null) {
			toReturn = new Consumer(consumerName);
			consumer.add(toReturn);
		}
		return toReturn;
		// @End
		// return null;
	}

}
