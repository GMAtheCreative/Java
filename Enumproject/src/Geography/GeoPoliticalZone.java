package Geography;

public enum GeoPoliticalZone {
    BENUE("North_Central"),
    FCT("North_Central"),
    KOGI("North_Central"),
    KWARA("North_Central"),
    NASARAWA("North_Central"),
    NIGER("North_Central"),
    PLATEAU("North_Central"),
    ADAMAWA("North_East"),
    BAUCHI("North_East"),
    BORNO("North_East"),
    GOMBE("North_East"),
    TARABA("North_East"),
    YOBE("North_East"),
    KADUNA("North_West"),
    KATSINA("North_West"),
    KANO("North_West"),
    KEBBI("North_West"),
    SOKOTO("North_West"),
    JIGAWA("North_West"),
    ZAMFARA("North_West"),
    AKWAIBOM("South_South"),
    BAYELSA("South_South"),
    CROSSRIVER("South_South"),
    DELTA("South_South"),
    EDO("South_South"),
    RIVERS("South_South"),
    ABIA("South_East"),
    ANAMBRA("South_East"),
    EBONYI("South_East"),
    ENUGU("South_East"),
    IMO("South_East"),
    EKITI("South_West"),
    LAGOS("South_West"),
    OSUN("South_West"),
    ONDO("South_West"),
    OGUN("South_West"),
    OYO("South_West");

    private final String geo_political_zone;
    GeoPoliticalZone(String geo_political_zone) {
        this.geo_political_zone = geo_political_zone;
    }
    public String getStates() {
        return geo_political_zone;
    }


}
