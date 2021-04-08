package model.pojo;

import java.util.ArrayList;

/**
 * Description:思维导图树的类,实际上就是根节点加上布局
 */
public class MapTree {
    private final MapNode root;
    private ArrayList<MapNode> tree;
    private String layout;

    public MapTree(MapNode root) {
        this.root = root;
        this.tree = null;
        this.layout = "default";
    }

    public ArrayList<MapNode> getTree() {
        return tree;
    }

    public void setTree(ArrayList<MapNode> tree) {
        this.tree = tree;
    }

    public MapNode getRoot() {
        return root;
    }


    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }
}
