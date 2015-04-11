import java.util.Collection;
//@Begin
import java.util.LinkedList;
//@End


public class ConsumerHolder {

	private static Collection<Consumer> consumers/*@Begin*//*;*/ =  new LinkedList<Consumer>();/*@End*/

	public static Consumer getConsumer(String consumerName) {
		// @Begin
		Consumer toReturn = null;
		for(Consumer consumer: consumers){
			if (consumer.getName().equals(consumerName)) {
				toReturn = consumer;
				break;
			}
		}
		if (toReturn == null) {
			toReturn = new Consumer(consumerName);
			consumers.add(toReturn);
		}
		return toReturn;
		// @End
		// return null;
	}

}
