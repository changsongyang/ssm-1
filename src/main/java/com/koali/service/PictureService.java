package com.koali.service;

import com.koali.entity.Picture;

import java.util.List;

/**
 * Created by Elric on 2017/3/24.
 */
public interface PictureService {
    /**查询所有照片
     * @return 所有照片
     */
    List<Picture> getAllPicture();

    /**
     * 这个服务就是PictureDao中的InsertP
     * @param picName
     * @param content
     * @return 数据库成功返回1，失败返回0
     */
    int InsertPicture(String picName, String content);
}
