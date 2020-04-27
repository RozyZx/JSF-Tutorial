package ajax;

public class City {
	private String cityName, nflTeam, mlbTeam;
	  
	  public String getCityName() {
	    return(cityName);
	  }

	  public String getNflTeam() {
	    return(nflTeam);
	  }

	  public String getMlbTeam() {
	    return(mlbTeam);
	  }

	  public City(String cityName, String nflTeam, String mlbTeam) {
	    this.cityName = cityName;
	    this.nflTeam = nflTeam;
	    this.mlbTeam = mlbTeam;
	  }
}