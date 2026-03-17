public class Rest {
    //Prop
    private String name;
    private int waitTime;
    private double rating;
    private double avgPrice;
    private double distance;
    private String hoursOpen;

    public Rest(){}

    public Rest(String name, int waitTime, double rating, double avgPrice, double distance,String hoursOpen){
        this.name = name;
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance ;
        this.hoursOpen = hoursOpen;
    }
// Getting and Setting

    public String getName() {return name;}
    public int getWaitTime(){return waitTime;}
    public double getRating(){return rating;}
    public double getAvgPrise(){return avgPrice;}
    public double getDistance(){return distance;}
    public String getHoursOpen(){return hoursOpen;}

    public void setName(String name) {this.name = name;}
    public void setWaitTime (int waitTime){this.waitTime = waitTime;}
    public void setRating (double rating){this.rating = rating;}
    public void setAvgPrice (double avgPrice){this.avgPrice = avgPrice;}
    public void setDistance (double distance){this.distance = distance;}
    public void setHoursOpen (String hoursOpen){this.hoursOpen = hoursOpen;}

//Printing settings

    public String toString(){
        return "Restaurant Name:\t\t" + name +
                "\nWait time:\t\t\t\t" + waitTime +
                "\nRating:\t\t\t\t\t"+ rating +
                "\nAverage Price:\t\t\t" + avgPrice +
                "\nHours of Operation:\t\t"+ hoursOpen;
    }

}
