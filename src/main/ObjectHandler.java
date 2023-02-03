package main;

import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class ObjectHandler {
    GamePanel gp;
    public ObjectHandler(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 22 * gp.tileSize;
        gp.obj[0].worldY = 6 * gp.tileSize;

        gp.obj[1] = new OBJ_Door();
        gp.obj[1].worldX = 27 * gp.tileSize;
        gp.obj[1].worldY = 11 * gp.tileSize;

        gp.obj[2] = new OBJ_Chest();
        gp.obj[2].worldX = 3 * gp.tileSize;
        gp.obj[2].worldY = 16 * gp.tileSize;
    }
}
