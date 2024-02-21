package com.rafaelvictorio.desafiobossabox.services;

import com.rafaelvictorio.desafiobossabox.dto.ToolsResponse;
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

    public List<Tools> findToolsTag(List<String>tags){
       List<Tools> toolsList = toolsRepository.findByTagsIn(tags);
       return toolsList;
    }
    public ToolsResponse saveTools(Tools tools){
        Tools toolsSaved = toolsRepository.save(tools);
        ToolsResponse toolsResponse = new ToolsResponse(tools.getId(),
                toolsSaved.getTitle(),
                toolsSaved.getLink(),
                toolsSaved.getDescription(),
                toolsSaved.getTags() );
        return toolsResponse;
    }
    public void deleteToolsById(Long id){
        toolsRepository.deleteById(id);
    }


}
