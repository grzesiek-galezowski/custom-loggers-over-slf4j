import com.github.grzesiekgalezowski.loggers.slf4j.custom.LoggerWrapperFactory;
import org.slf4j.Logger;

public class EmergencyOpsThatMonitorLogs implements EmergencyOps {
  private Logger log;

  public EmergencyOpsThatMonitorLogs(Class clazz) {
    log = LoggerWrapperFactory.getLogger(clazz, this);
  }

  @Override
  public void notifyEmergencyHappened() {
    log.error("emergency!");
  }
}

