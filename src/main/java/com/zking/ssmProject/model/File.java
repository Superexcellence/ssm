package com.zking.ssmProject.model;

import org.springframework.web.multipart.MultipartFile;

public class File {
    private String fileid;

    private String filesize;

    private String realName;

    private String contentType;

    private String url;

    private MultipartFile[] file;

    public MultipartFile[] getFile() {
        return file;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }

    public File(String fileid, String filesize, String realName, String contentType, String url) {
        this.fileid = fileid;
        this.filesize = filesize;
        this.realName = realName;
        this.contentType = contentType;
        this.url = url;
    }

    public File() {
        super();
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}