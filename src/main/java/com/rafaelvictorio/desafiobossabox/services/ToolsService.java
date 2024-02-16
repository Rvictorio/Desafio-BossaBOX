package com.rafaelvictorio.desafiobossabox.services;

import com.rafaelvictorio.desafiobossabox.entity.Tools;
import com.rafaelvictorio.desafiobossabox.repository.ToolsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsService {


    private ToolsRepository toolsRepository;

    public ToolsService(ToolsRepository toolsRepository) {
        this.toolsRepository = toolsRepository;
    }

    public List<Tools> getAllTools(){
      List<Tools> toolsList =  toolsRepository.findAll();
      return toolsList;
    }

    public List<Tools> findToolsTag(String tags){
       List<Tools> toolsList = toolsRepository.findByTags(tags);
       return toolsList;
    }

}
