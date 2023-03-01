package com.example.uploadingfiles.storage;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {
    Stream<Path> loadAll();

    Resource loadAsResource(String filename);

    void store(MultipartFile file);

    public Path load(String filename);

    void deleteAll();

    void init();
}
