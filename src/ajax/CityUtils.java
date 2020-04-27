package ajax;

import java.util.*;

public class CityUtils {
  private static City[] cities = {
    new City("Baltimore", "Ravens", "Orioles"),
    new City("Washington DC", "Redskins", "Nationals"),
    new City("Philadelphia", "Eagles", "Phillies")
  };
  private static Map<String,City> cityMap;
  
  static {
    cityMap = new HashMap<>();
    for(City city: cities) {
      cityMap.put(city.getCityName().toUpperCase(), city);
    }
  }
  
  public static City[] supportedCities() {
    return(cities);
  }
  
  public static City findCity(String cityName) {
    City city = cityMap.get(cityName.toUpperCase());
    if (city != null) {
      return(city);
    } else {
      return(new City(cityName, 
                          "Unknown NFL Team", "Unknown MLB Team"));
    }
  }

  private CityUtils() {} // Un-instantiatable class
}
