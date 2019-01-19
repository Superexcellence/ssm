package com.zking.ssmProject.service.impl;

import com.zking.ssmProject.mapper.FileMapper;
import com.zking.ssmProject.model.File;
import com.zking.ssmProject.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements IFileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public int insert(File record) {
        return fileMapper.insert(record);
    }

    @Override
    public int delete(File file) {
        return fileMapper.delete(file);
    }

    @Override
    public List<File> queryFile(File file) {
        return fileMapper.queryFile(file);
    }
}
