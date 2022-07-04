package cn.mirror6.rr;

/**
 * @author ai lun
 * @description
 * @create 2022-05-26 4:59 下午
 */
public class Server {


    private String ip;
    private int weight;

    public Server(String ip) {
        super();
        this.ip = ip;
    }

    public Server(String ip, int weight) {
        this.ip = ip;
        this.weight = weight;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Server [ip=" + ip + ", weight=" + weight + "]";
    }
}
