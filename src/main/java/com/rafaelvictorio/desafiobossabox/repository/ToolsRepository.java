package com.rafaelvictorio.desafiobossabox.repository;

import com.rafaelvictorio.desafiobossabox.entity.Tools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToolsRepository extends JpaRepository<Tools, Long> {


    List<Tools> findByTagsIn(List<String> tags);
}
