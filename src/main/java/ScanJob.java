/**
 * 扫描线程
 */
public class ScanJob implements Runnable{
    private ScanObject object;
    private String scanType;

    public ScanJob(ScanObject object,String scanType) {
        this.object = object;
        this.scanType = scanType;

    }

    @Override
    public void run() {
        ScanEngine.scan(object, scanType);
    }
}
