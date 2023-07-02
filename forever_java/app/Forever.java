//lombok logger function main
import lombok.extern.java.Log;
//write a main function and a class in java to use the above Log function
@Log
public class Forever {
    public static void main(String[] args) {
        while (true){
        //use the log function to print out the following
        log.info("Hello World!");
        log.warning("Warning!");
        log.severe("Severe!");
        }
    }
}
