package com.zking.ssmProject.controller;

import com.zking.ssmProject.model.Proposal;
import com.zking.ssmProject.service.IFileService;
import com.zking.ssmProject.service.IProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

@Controller
@RequestMapping("/File")
public class FileController {

    @Autowired
    private IFileService fileServices;


    @RequestMapping("/upload")
    @ResponseBody
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> upload(com.zking.ssmProject.model.File file) throws Exception {
        MultipartFile[] imgs = file.getFile();
        String fileId= file.getFileid();
        String filenameId=UUID.randomUUID().toString().replace("-","");
        for (MultipartFile img : imgs) {
            String filePath="D:\\T213\\Idea\\mybatis\\ssmProject\\src\\main\\webapp\\upload\\"+filenameId+img.getOriginalFilename();
            file.setFileid(fileId);
            file.setFilesize(img.getSize()+"");
            file.setContentType(img.getContentType());
            file.setRealName(img.getOriginalFilename());
            file.setUrl(filePath);
            int insert = fileServices.insert(file);
            img.transferTo(new File(filePath));
        }
        Map<String,Object> res=new HashMap<>();
        res.put("code",0);
        return res;
    }

    @RequestMapping("/delete")
    @Transactional
    public void delete(com.zking.ssmProject.model.File file){
        List<com.zking.ssmProject.model.File> files = fileServices.queryFile(file);
        if(0!=files.size()&&null!=files){
            fileServices.delete(file);
        }
        for (com.zking.ssmProject.model.File file1 : files) {
            File file2=new File(file1.getUrl());
            file2.delete();
        }
    }

    @RequestMapping("/queryFile")
    @Transactional(readOnly = true)
    @ResponseBody
    public List queryFile(com.zking.ssmProject.model.File file){
        List files = fileServices.queryFile(file);
        return files;
    }
}
