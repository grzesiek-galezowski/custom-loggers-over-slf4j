public class DomainObject {
  private EmergencyOps ops;

  public DomainObject(EmergencyOps ops) {
    this.ops = ops;
  }

  public void doJob() {
    ops.notifyEmergencyHappened();
  }
}
