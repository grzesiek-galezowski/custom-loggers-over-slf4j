import lombok.val;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LoggerWrapperFactorySpecification {

  public static final String MESSAGE = "emergency!";
  public static final String METHOD = "doJob";
  public static final String LINE = "9";
  public static final String FILE = "DomainObject.java";
  public static final String CLASS = "DomainObject";
  public static final String LEVEL = "ERROR";

  @Test
  public void shouldPrintSourceCallerInfoWhenCreatedWithInstance() throws Exception {
    //GIVEN
    try(val consoleCapture = new ConsoleCapture()) {
      val obj = new DomainObject(
          new EmergencyOpsThatMonitorLogs(
              DomainObject.class));

      //WHEN
      obj.doJob();

      //THEN
      val logs = consoleCapture.content();

      assertThat(logs)
          .contains(LEVEL)
          .contains(CLASS)
          .contains(FILE)
          .contains(LINE)
          .contains(METHOD)
          .contains(MESSAGE);
    }

  }

  @Test
  public void shouldPrintSourceCallerInfoWhenCreatedWithClass() throws Exception {
    //GIVEN
    try(val consoleCapture = new ConsoleCapture()) {
      val obj = new DomainObject(
          new EmergencyOpsThatMonitorLogs2(
              DomainObject.class));

      //WHEN
      obj.doJob();

      //THEN
      val logs = consoleCapture.content();

      assertThat(logs)
          .contains(LEVEL)
          .contains(CLASS)
          .contains(FILE)
          .contains(LINE)
          .contains(METHOD)
          .contains(MESSAGE);
    }

  }

}
