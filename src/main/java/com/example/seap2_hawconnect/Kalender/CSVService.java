package com.example.seap2_hawconnect.Kalender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {
    @Autowired
    CSVRepository csvRepository;

    public void save(MultipartFile file){
        try{
            List<Termin> termine = CSV_Reader_Writer.csvToTermin(file.getInputStream());
            csvRepository.saveAll(termine);
        }catch(IOException ex){
            throw new RuntimeException("fail to store csv data: "+ ex.getMessage());
        }
    }

    public List<Termin> getAllTermine(){
        return csvRepository.findAll();
    }
}
