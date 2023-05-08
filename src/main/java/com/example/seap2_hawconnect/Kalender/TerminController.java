package com.example.seap2_hawconnect.Kalender;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOError;
import java.io.IOException;

@RestController
public class TerminController {
    private TerminService terminService;

    @PostMapping("/termin/add")
    public String addTermin(@RequestParam("title") String title, MultipartFile termin, Model model) throws IOException {
        String id = terminService.addTermin();
        return "redirected:/termin/" + id;
    }

    @GetMapping("/termin/{id}")
    public String getTermin(@PathVariable String id, Model model)throws Exception{
        Termin termin = terminService.getTermin(id);
        model.addAttribute("title", termin.getTerminID());
        model.addAttribute("url", "/termin/stream/"+id);
        return "termin";
    }

}
