package com.zking.ssmProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/File")
public class FileController {

    @RequestMapping("/upload")
    @ResponseBody
    public Map<String, Object> upload(com.zking.ssmProject.model.File file) throws Exception {
        MultipartFile[] imgs = file.getFile();
        for (MultipartFile img : imgs) {
            String fileId= UUID.randomUUID().toString().replace("-","");
            String filePath="D:\\"+img.getOriginalFilename();
            img.transferTo(new File(filePath));
        }
        Map<String,Object> res=new HashMap<>();
        res.put("code",0);
        return res;
    }
}
