package com.controllers;

import com.exception.FileNotMuchException;
import com.model.File;
import com.model.Storage;
import com.service.FileService;
import com.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MainController {

    private StorageService storageService;
    private FileService fileService;

    @Autowired
    public MainController(StorageService storageService, FileService fileService) {
        this.storageService = storageService;
        this.fileService = fileService;
    }

    public void put(Storage storage, File file) throws FileNotMuchException {

        file.setStorage(storage);
        fileService.saveFile(file);
    }
}
