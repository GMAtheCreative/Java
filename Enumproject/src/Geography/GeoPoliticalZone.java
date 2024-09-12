package Geography;

public enum GeoPoliticalZone {
    North_Central("Benue, FCT, Kogi, Kwara, Nasarawa, Niger, Plateau."),
    North_East("Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe."),
    North_West("Kaduna, Katsina, Kano, Kebbi, Sokoto, Jigawa, Zamfara."),
    South_South("Akwa-Ibom, Bayelsa, Cross-River, Delta, Edo, Rivers."),
    South_East("Abia, Anambra, Ebonyi, Enugu, Imo."),
    South_West("Ekiti, Lagos, Osun, Ondo, Ogun, Oyo.");

    private final String States;
    private GeoPoliticalZone(String States) {
        this.States = States;
    }
    public String getStates() {
        return States;
    }


}
