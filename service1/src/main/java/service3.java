import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.exoplatform.services.organization.User;
import org.exoplatform.services.organization.UserEventListener;


public class service3 extends UserEventListener {




        public void postSave(User user, boolean isNew) throws Exception {

         Log logger = ExoLogger.getLogger(service3.class.getName());

            //logger.info("After user " + user.getUserName() + (isNew?" created":" updated"));
            logger.info("Before user is added into database");
            logger.info("After user is added into database");
        }

    }

