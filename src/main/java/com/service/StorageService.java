package com.service;

import com.model.Storage;
import com.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StorageService {

    private StorageRepository storageRepository;

    @Autowired
    public StorageService(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }

    public void saveStorage(Storage storage) {
        storageRepository.saveAndFlush(storage);
    }

    public void updateStorage(Storage storage) {
        storageRepository.save(storage);
    }

    public Storage findStorageById(long id) {
        return storageRepository.findById(id).get();
    }

    public List<Storage> findAllStoreges(){
        return storageRepository.findAll();
    }

    public void deleteStorage(Storage storage) {
        storageRepository.delete(storage);
    }
}
