package ram.developer.BookMyShow11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ram.developer.BookMyShow11.dto.CityRequestDTO;
import ram.developer.BookMyShow11.model.City;
import ram.developer.BookMyShow11.service.CityService;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
      try {
         String cityName =cityRequestDTO.getName();
         if(cityName==null || cityName.isBlank()||cityName.isEmpty()){
         throw new Exception("City name is Invalid");
        }
          City savedCity =cityService.saveCity(cityName);
         return ResponseEntity.ok(savedCity);
       } catch (Exception e){
          e.printStackTrace();
      }
      return null;
    }

}
