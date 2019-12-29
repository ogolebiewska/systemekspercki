public class kawa extends dane {

    public String nazwa;
    public String stan;
    public String espresso;
    public String pianka;
    public String syrop;
    public String przyprawy;
    public int punkt;

    public kawa(){}


    public kawa(String n,String s, String e, String p, String sy, String prz){

        nazwa=n;
        stan=s;
        espresso=e;
        pianka=p;
        syrop=sy;
        przyprawy=prz;
        punkt =0;
    }


    public String getName(){
        return nazwa;
    }

    public String getStan(){
        return stan;
    }

    public String getEspresso() {
        return espresso;
    }

    public String getPianka(){
        return pianka;
        }

    public String getSyrop(){
        return syrop;
    }

    public String getPrzyprawy(){
        return przyprawy;
    }

}
