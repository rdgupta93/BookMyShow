package ram.developer.BookMyShow11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ram.developer.BookMyShow11.model.City;
import ram.developer.BookMyShow11.repository.CityRepository;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String cityName){
       City city =new City();
       city.setName(cityName);
       return cityRepository.save(city);
    }
}
