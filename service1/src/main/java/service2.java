import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.picocontainer.Startable;
/**
 * Created by exo on 22/09/16.
 */







public class service2 implements Startable {


    private static final Log LOG = ExoLogger.getLogger(service2.class);





    public void start() {

        LOG.info("#####################################################################################################" +
                "\n$$$$$$$$$$$$$$$$$$$$ $eXo Service is Starting $$$$$$$$$$$$$$$$$$$$\n" +
                "######################################################################################################");
    }


    public void stop() {
        LOG.info("\n\n\n$$$$$$$$$$$$$$$$$$$$ eXo Service is Stopping $$$$$$$$$$$$$$$$$$$$\n\n\n  ");

    }
}
