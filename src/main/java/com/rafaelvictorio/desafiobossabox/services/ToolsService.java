package com.rafaelvictorio.desafiobossabox.services;

import com.rafaelvictorio.desafiobossabox.repository.ToolsRepository;
import org.springframework.stereotype.Service;

@Service
public class ToolsService {


    private ToolsRepository toolsRepository;

    public ToolsService(ToolsRepository toolsRepository) {
        this.toolsRepository = toolsRepository;
    }
}
