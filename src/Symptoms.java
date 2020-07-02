///HAS RELATIONSHIP PATIENT HAS SYMPTOMS

public class Symptoms extends ContactInformation{
    private String fever;
    private String durationFever;
    private String cough;
    private String durationCough;
    private String breathe;
    private String durationBreathe;
    private String tired;
    private String durationTired;
    private String aches;
    private String durationAches;
    private String chills;
    private String durationChills;
    private String throat;
    private String durationThroat;
    private String smell;
    private String durationSmell;
    private String taste;
    private String durationTaste;
    private String headache;
    private String durationHeadache;
    private String diarrhea;
    private String durationDiarrhea;
    private String vomiting;
    private String durationVomiting;
    private String extra;




    public Symptoms (){

    }

    public Symptoms(String fever,String durationFever,String cough,String durationCough,String breathe,String durationBreathe,String tired,String durationTired,
                    String aches,String durationAches,String chills,String durationChills, String throat,String durationThroat,
                    String smell,String durationSmell,String taste,String durationTaste,String headache,String durationHeadache,
                    String diarrhea,String durationDiarrhea, String vomiting,String durationVomiting,String extra) {
        this.fever=fever;
        this.durationFever=durationFever;
        this.cough=cough;
        this.durationCough=durationCough;
        this.breathe=breathe;
        this.durationBreathe=durationBreathe;
        this.tired=tired;
        this.durationTired=durationTired;
        this.aches=aches;
        this.durationAches=durationAches;
        this.chills=chills;
        this.durationChills=durationChills;
        this.throat=throat;
        this.durationThroat=durationThroat;
        this.smell=smell;
        this.durationSmell=durationSmell;
        this.taste=taste;
        this.durationTaste=durationTaste;
        this.headache=headache;
        this.durationHeadache=durationHeadache;
        this.vomiting=vomiting;
        this.durationVomiting=durationVomiting;
        this.diarrhea=diarrhea;
        this.durationDiarrhea=durationDiarrhea;
        this.extra=extra;




    }


    public void setFever(String fever) {
        this.fever=fever;
    }


    public String getFever() {
        return this.fever;

    }
    public void setDurationFever(String durationFever) {
        this.durationFever=durationFever;
    }


    public String getDurationFever() {
        return this.durationFever;

    }

    public void setCough(String cough) {
        this.cough=cough;;
    }


    public String getCough() {
        return this.cough;

    }
    public void setDurationCough(String durationCough) {
        this.durationCough=durationCough;;
    }


    public String getDurationCough() {
        return this.durationCough;

    }public void setBreathe(String breathe) {
        this.breathe=breathe;
    }


    public String getBreathe() {
        return this.breathe;

    }
    public void setDurationBreathe(String durationBreathe) {
        this.durationBreathe=durationBreathe;
    }


    public String getDurationBreathe()
    {
        return this.fever;
    }
    public void setTired(String tired){
        this.tired=tired;
    }
    public String getTired()
    {
        return this.tired;
    }

    public void setDurationTired(String durationTired) {
        this.durationTired = durationTired;
    }

    public String getDurationTired() {
        return durationTired;
    }

    public void setAches(String aches) {
        this.aches = aches;
    }

    public String getAches() {
        return aches;
    }

    public void setDurationAches(String durationAches) {
        this.durationAches = durationAches;
    }

    public String getDurationAches() {
        return durationAches;
    }

    public void setChills(String chills) {
        this.chills = chills;
    }

    public String getChills() {
        return chills;
    }

    public void setDurationChills(String durationChills) {
        this.durationChills = durationChills;
    }

    public String getDurationChills() {
        return durationChills;
    }

    public void setThroat(String throat) {
        this.throat = throat;
    }

    public String getThroat() {
        return throat;
    }

    public void setDurationThroat(String durationThroat) {
        this.durationThroat = durationThroat;
    }

    public String getDurationThroat() {
        return durationThroat;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setDurationSmell(String durationSmell) {
        this.durationSmell = durationSmell;
    }

    public String getDurationSmell() {
        return durationSmell;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setDurationTaste(String durationTaste) {
        this.durationTaste = durationTaste;
    }

    public String getDurationTaste() {
        return durationTaste;
    }

    public void setHeadache(String headache) {
        this.headache = headache;
    }

    public String getHeadache() {
        return headache;
    }

    public void setDurationHeadache(String durationHeadache) {
        this.durationHeadache = durationHeadache;
    }

    public String getDurationHeadache() {
        return durationHeadache;
    }

    public void setVomiting(String vomiting) {
        this.vomiting = vomiting;
    }

    public String getVomiting() {
        return vomiting;
    }

    public void setDurationVomiting(String durationVomiting) {
        this.durationVomiting = durationVomiting;
    }

    public String getDurationVomiting() {
        return durationVomiting;
    }

    public void setDiarrhea(String diarrhea) {
        this.diarrhea = diarrhea;
    }

    public String getDiarrhea() {
        return diarrhea;
    }

    public void setDurationDiarrhea(String durationDiarrhea) {
        this.durationDiarrhea = durationDiarrhea;
    }

    public String getDurationDiarrhea() {
        return durationDiarrhea;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getExtra() {
        return extra;
    }

    public String toString(){
        String msg=super.toString();
        return msg=
                "Symptoms: " +fever+ "\t"+
                "Duration: " +durationFever+"\n"
+               "Symptoms: " +cough+ "\t"+
                "Duration: " +durationCough+"\n"+
                 "Symptoms: "+breathe+ "\t"+
                "Duration: " +durationBreathe+"\n"+
                 "Symptoms: "+tired+ "\t"+
                "Duration: " +durationTired+"\n"+
                "Symptoms: " +aches+ "\t"+
                "Duration: " +durationAches+"\n"+
                "Symptoms: " +chills+ "\t"+
                "Duration: " +durationChills+"\n"+
                "Symptoms: " +throat+ "\t"+
                "Duration: " +durationThroat+"\n"+
                "Symptoms: " +smell+ "\t"+
                "Duration: " +durationSmell+"\n"+
                "Symptoms: " +taste+ "\t"+
                "Duration: " +durationTaste+"\n"+
                "Symptoms: " +headache+ "\t"+
                "Duration: " +durationHeadache+"\n"+
                "Symptoms: " +vomiting+ "\t"+
                "Duration: " +durationVomiting+"\n"+
                "Symptoms: " +diarrhea+ "\t"+
                "Duration: " +durationDiarrhea+"\n"+
        "Extra info: " +extra;

    }














}

