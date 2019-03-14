package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author jummy
 * @date 2019-02-28 12:29
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
