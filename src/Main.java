// @Begin
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
// @End

public class Main {

	public static void main(String[] args) {
		// @Begin
		Broker broker = new Broker();
		File inputFile = new File(args[0]);
		try{
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			try{
			    String line;
			    while ((line = reader.readLine()) != null) {
			    	String[] columns = line.split(",");
			    	String command = columns[0].trim().toLowerCase();
			    	if (command.equals("subscribe") || command.equals("unsubscribe")) {
			    		String consumerName = columns[1].trim().toLowerCase();
			    		String productType = columns[2].trim().toLowerCase();
			    		if (command.equals("subscribe")) {
			    			Consumer consumer = ConsumerHolder.getConsumer(consumerName);
			    			consumer.subscribe(broker, productType);
			    		}else{ //command.equals("unsubscribe")
			    			Consumer consumer = ConsumerHolder.getConsumer(consumerName);
			    			consumer.unsubscribe(broker, productType);
			    		}
			    	}else if(command.equals("publish")){
			    		String venderName = columns[1].trim().toLowerCase();
			    		String productType = columns[2].trim().toLowerCase();
			    		String productName = columns[3].trim().toLowerCase();
			    		Vender vender = VenderHolder.getVender(venderName);
			    		vender.publish(broker, new Product(productName,productType));
			    	}else{
			    		System.out.println("unrecgonized, first column");
			    	}
			    }
			}catch(Exception e){
				System.out.println(e.toString());
			}finally{
				reader.close();
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		// @End
	}

}
