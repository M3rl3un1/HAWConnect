package com.example.seap2_hawconnect.Kalender;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public interface CSVRepository extends JpaRepository<Termin, Long> {


}
