package com.wildcodeschool.doctorWho.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/")
    public String getAllDoctors() {
        return "index";
    }

    @GetMapping("/1")
    @ResponseBody
    public String getDoctorOne() {
        return "William Hartnell";
    }

    @GetMapping("/10")
    @ResponseBody
    public String getDoctorTen() {
        return "David Tennant";
    }

    @GetMapping("/13")
    @ResponseBody
    public String getDoctorThirteen() {
        return "Jodie Whittaker";
    }
}