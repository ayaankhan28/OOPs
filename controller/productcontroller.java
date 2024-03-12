package com.ayaankhan.first.controller;




import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class productcontroller {

    @RequestMapping("/carts")
    @ResponseBody

    private carts[] getAll() {
        String uri = "https://fakestoreapi.com/carts";
        RestTemplate restTemplate = new RestTemplate();

        carts[] user = restTemplate.getForObject(uri, carts[].class);
        System.out.println("User: " + user);

        return user;
    }
    @RequestMapping("/carts/{id}")
    //@ResponseBody

    private carts getUser(@PathVariable Integer id) {
        String uri = "https://fakestoreapi.com/carts/"+id;
        RestTemplate restTemplate = new RestTemplate();

        carts user = restTemplate.getForObject(uri, carts.class);
        String test = restTemplate.getForObject(uri, String.class);
        System.out.println("User: " + test);

        return user;
    }

//    @RequestMapping("/carts?startdate=2019-12-10&enddate={end}")
//    //@ResponseBody
//
//    private carts[] getdaterange(@PathVariable Integer end) {
//        String uri = "https://fakestoreapi.com/carts?startdate=2019-12-10&enddate="+end;
//        RestTemplate restTemplate = new RestTemplate();
//
//        daterange user = restTemplate.getForObject(uri, daterange.class);
//        System.out.println("User: " + user.getCarts());
//
//        return user.getCarts();
//    }




}
