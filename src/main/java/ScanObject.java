public class ScanObject {
     private String ip;
     private int port;
     private String service;
     private Boolean isOpen;
     private String banner;

    public ScanObject(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Override
    public String toString() {
        return "ScanObject{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", service='" + service + '\'' +
                ", isOpen=" + isOpen +
                ", banner='" + banner + '\'' +
                '}';
    }
}
