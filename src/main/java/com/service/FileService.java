package com.service;

import com.exception.FileNotMuchException;
import com.model.File;
import com.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FileService {


    private FileRepository fileRepository;

    @Autowired
    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void saveFile(File file) throws FileNotMuchException {
        if (isValidName(file.getName())) {
            fileRepository.saveAndFlush(file);
        } else
            throw new FileNotMuchException("File with name: " + file.getName() + " contains more than 10 chars. Its not valid here");
    }

    public void updateFile(File file) {
        fileRepository.save(file);
    }

    public File findFileById(long id) {
        return fileRepository.findById(id).get();
    }

    public List<File> findAllFiles() {
        return fileRepository.findAll();
    }

    public void deleteFiles(File file) {
        fileRepository.delete(file);
    }

    public List<File> findFilesByStorage(int storageID) {
        return null;//fileRepository.findAllByUniversityId(universityId);
    }

    private boolean isValidName(String name) {
        if (name != null && name.length() <= 10) {
            return true;
        }
        return false;
    }


}
