package com.zking.ssmProject.model;

import org.springframework.web.multipart.MultipartFile;

public class File {
    private Integer fileid;

    private String filename;

    private String filenamen;

    private String filenamet;

    private String filenames;

    private MultipartFile[] file;

    public MultipartFile[] getFile() {
        return file;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }
    public File(Integer fileid, String filename, String filenamen, String filenamet, String filenames) {
        this.fileid = fileid;
        this.filename = filename;
        this.filenamen = filenamen;
        this.filenamet = filenamet;
        this.filenames = filenames;
    }

    public File() {
        super();
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilenamen() {
        return filenamen;
    }

    public void setFilenamen(String filenamen) {
        this.filenamen = filenamen;
    }

    public String getFilenamet() {
        return filenamet;
    }

    public void setFilenamet(String filenamet) {
        this.filenamet = filenamet;
    }

    public String getFilenames() {
        return filenames;
    }

    public void setFilenames(String filenames) {
        this.filenames = filenames;
    }
}