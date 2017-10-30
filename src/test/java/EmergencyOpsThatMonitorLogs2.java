import com.github.grzesiekgalezowski.loggers.slf4j.custom.LoggerWrapperFactory;
import org.slf4j.Logger;

public class EmergencyOpsThatMonitorLogs2 implements EmergencyOps {
  private Logger log;

  public EmergencyOpsThatMonitorLogs2(Class clazz) {
    log = LoggerWrapperFactory.getLogger(clazz, this.getClass());
  }

  public void notifyEmergencyHappened() {
    log.error("emergency!");
  }
}
