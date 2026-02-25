public class trip {
    private double rate; //ksh per km
    private double distance;

    void trip(double rate, double distance){
        this.rate = rate;
        this.distance = distance;
    }

    public double getrate() {return rate;}
    public void setDistance(double distance) {this.distance = distance;}
}
