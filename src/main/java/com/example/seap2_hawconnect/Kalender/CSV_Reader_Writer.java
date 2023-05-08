package com.example.seap2_hawconnect.Kalender;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSV_Reader_Writer {
    public static String TYPE = "text/csv";
    static String[] HEADER = {"ID", "Title", "Description", "Published"};

    public static boolean hasCSVFormat(MultipartFile file){
        if(!TYPE.equals(file.getContentType())){
            return false;
        }
        return true;
    }

    public static List<Termin> csvToTermin(InputStream inputStream){
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<Termin> termine = new ArrayList<Termin>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                Termin termin = new Termin();

                termine.add(termin);
            }

            return termine;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
        }
    }

