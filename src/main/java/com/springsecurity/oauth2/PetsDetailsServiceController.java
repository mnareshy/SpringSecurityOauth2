package com.springsecurity.oauth2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/petdetailsService")
public class PetsDetailsServiceController {


   @GetMapping("/getPetStoreAppDetails")
   public String getPetStoreAppDetails(){

        return "Pet Store - Is am online store for buying pets and pet food ";
    }

}
