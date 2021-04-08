package model.service;

import model.pojo.MapNode;

/**
 * Description:
 */
public interface MapService {
    int changeLayout();
    int saveToCloud();
    int saveToLocal();
    int readFromCloud();
    int readFromLocal();
    int exportAsImage();
}
