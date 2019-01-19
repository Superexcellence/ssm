package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.File;

import java.util.List;

public interface FileMapper {
    int insert(File record);

    int delete(File file);

    /**
     * 查询文件
     * @param file
     * @return
     */
    List<File> queryFile(File file);
}