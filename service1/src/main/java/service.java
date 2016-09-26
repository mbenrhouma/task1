
/**
 * Created by exo on 22/09/16.
 */

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class service implements Job {



    private static final Log log = ExoLogger.getLogger(service.class);


    public void execute(JobExecutionContext context) throws JobExecutionException {

        log.info("My Job is running!!!");
        log.warn("everything is awesome sTo this is not WARN !!!");

    }
}