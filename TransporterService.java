package com.liveasy.service;

import com.liveasy.model.Transporter;
import com.liveasy.repository.TransporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransporterService {

    @Autowired
    private TransporterRepository transporterRepository;

    public List<Transporter> getAllTransporters() {
        return transporterRepository.findAll();
    }
}
