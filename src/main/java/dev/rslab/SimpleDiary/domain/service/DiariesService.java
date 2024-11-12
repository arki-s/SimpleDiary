package dev.rslab.SimpleDiary.domain.service;

import dev.rslab.SimpleDiary.domain.repository.DiariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DiariesService {
    @Autowired
    DiariesRepository diariesRepository;
}
