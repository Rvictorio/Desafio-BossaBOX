package com.rafaelvictorio.desafiobossabox.dto;

import com.rafaelvictorio.desafiobossabox.entity.Tools;

import java.util.List;

public record ToolsRequest (
        String title,
        String link,
        String description,
        List<String> tags
){
    public Tools toModel(){
        return new Tools(title, link, description, tags);
    }
}