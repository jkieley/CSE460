import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("inputargs: "+String.valueOf(args.length));
        for(String arg: args){
            System.out.println("arg: "+arg);
        }
        File inputFile = new File(args[0]);
        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                for(int i=0; i<columns.length;i++){
                    System.out.println("column: "+columns[i]+" "+i);
                }

                String command = columns[0].trim().toLowerCase();
                if (command.equals("subscribe") || command.equals("unsubscribe")) {
                    String consumerName = columns[1].trim().toLowerCase();
                    String productType = columns[2].trim().toLowerCase();
                    if (command.equals("subscribe")) {
                        
                    }else{ //command.equals("unsubscribe")

                    }
                }else if(command.equals("publish")){

                }else{
                    System.out.println("unrecgonized, first column");
                }
            }
        }catch(Exception e){}
    }

    private void readInput(String input) {

    }

}

