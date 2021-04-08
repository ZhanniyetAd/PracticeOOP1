public class Club {
    public String name;
    public String country;
    public int ratingPoints;
    public Player []players;


    public Club() { }
    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData(){
        System.out.println("Club name: " + name);
        System.out.println("Club country: " + country);
        System.out.println("Club rating points : " + ratingPoints);
        System.out.println("Club Players : ");
        System.out.println();
        for(int i = 0; i < players.length; i++){
            System.out.println(players[i].toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRatingPoints() {
        return ratingPoints;
    }

    public void setRatingPoints(int ratingPoints) {
        this.ratingPoints = ratingPoints;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
