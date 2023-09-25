package com.example.microcam.service;

import com.example.microcam.model.MicroCam;
import com.example.microcam.repository.MicroCamRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MicroCamService {

    @Autowired
    MicroCamRepository microCamRepository;

    public void saveMicroCam() {
        log.info("Trying to save in DB");
        final MicroCam microCam = new MicroCam("id", "microCamTest");
        microCamRepository.save(microCam);
        log.info("Saved record");
    }
}
