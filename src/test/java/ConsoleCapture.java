import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleCapture implements AutoCloseable {
  private PrintStream old;
  private ByteArrayOutputStream baos;
  private final PrintStream ps;

  public ConsoleCapture() {
    baos = new ByteArrayOutputStream();
    ps = new PrintStream(baos);
    old = System.out;
    System.setOut(ps);
  }

  public String content() {
    return baos.toString();
  }

  @Override
  public void close() throws Exception {
    System.out.flush();
    System.setOut(old);
    ps.close();
  }
}