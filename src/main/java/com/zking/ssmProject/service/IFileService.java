package com.zking.ssmProject.service;

import com.zking.ssmProject.model.File;

import java.util.List;

public interface IFileService {
    /**
     * 添加文件
     * @param record
     * @return
     */
    int insert(File record);

    /**
     * 删除文件
     * @param file
     * @return
     */
    int delete(File file);

    /**
     * 查询文件
     * @param file
     * @return
     */
    List<File> queryFile(File file);
}