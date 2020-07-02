public class Distancing extends ContactInformation{
    private String distanceName;
    private String distanceNum;
    private String distanceEmail;
    private String distanceName2;
    private String distanceNum2;
    private String distanceEmail2;
    private String extraC;

    public Distancing (){}
    public Distancing(String distanceName,String distanceEmail,String distanceNum,
    String distanceName2,String distanceEmail2,String distanceNum2){
        this.distanceEmail=distanceEmail;
        this.distanceName=distanceName;
        this.distanceNum=distanceNum;
        this.distanceEmail2=distanceEmail2;
        this.distanceName2=distanceName2;
        this.distanceNum2=distanceNum2;
        this.extraC=extraC;
    }
    public void setDistanceName(String distanceName){
        this.distanceName=distanceName;
    }

    public String getDistanceName() {
        return distanceName;
    }

    public void setDistanceNum(String distanceNum){
        this.distanceNum=distanceNum;
    }

    public String getDistanceNum() {
        return distanceNum;
    }

    public void setDistanceEmail(String distanceEmail){
        this.distanceEmail=distanceEmail;
    }

    public String getDistanceEmail() {
        return distanceEmail;
    }
    public void setDistanceName2(String distanceName2){
        this.distanceName2=distanceName2;
    }

    public String getDistanceName2() {
        return distanceName2;
    }

    public void setDistanceNum2(String distanceNum2){
        this.distanceNum2=distanceNum2;
    }

    public String getDistanceNum2() {
        return distanceNum2;
    }

    public void setDistanceEmail2(String distanceEmail2){
        this.distanceEmail2=distanceEmail2;
    }

    public String getDistanceEmail2() {
        return distanceEmail2;
    }

    public void setExtraC(String extraC) {
        this.extraC = extraC;
    }

    public String getExtraC() {
        return extraC;
    }

    public String toString() {
        String msg = super.toString();
        return msg = "Contact Name: "+distanceName+"\n"+
                "Contact Number: "+distanceNum+"\n"+
                "Contact Email: " +distanceEmail;
    }
    public String toString2(){
        String msg = super.toString();
        return "Contact Name: "+distanceName2+"\n"+
                "Contact Number: "+distanceNum2+"\n"+
                "Contact Email: " +distanceEmail2;

    }







}
