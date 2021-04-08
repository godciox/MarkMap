package model.service;

import model.pojo.MapNode;
import model.pojo.MapTree;

import java.util.ArrayList;

/**
 * Description:
 */
public interface NodeService {
    int addNode(MapNode node);
    int updateNode(MapNode node);
    int deleteNodeById(int id);
    ArrayList<MapNode> queryMapByString(String string);
    MapNode getSelectedNode();//不知道给什么参数,未知如何实现
    int unfoldChildrenList();
    int foldChildrenList();
    int moveNode();
    int copyNode();
    int pasteNode();


}
