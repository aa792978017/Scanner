/**
 * 扫描器启动类
 */
public class ScanApp {
    public static void main(String[] args) {
        // 待扫描的ip地址或ip地址组
        String ips = null;
        ips = "14.29.192.196,14.116.188.121";
        // 待扫描的port范围
        String ports = "20-25";
        Scanner.start(ips,ports);


    }
}
