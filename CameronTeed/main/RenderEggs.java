package com.breakfast.main;
/*
 * This class renders the eggs.
 *
 * @author  Cameron Teed
 * @version 1.0
 * @since   2021-05-26
 */
import java.awt.Graphics;

/** */
public class RenderEggs extends HitBoxes {

    /** Initializes the background. */
    private Assets assets = new Assets();
    /** Initializes the x coord. */
    private final int offsetCursory = 200;
    /** Initializes the y coord. */
    private final int offsetCursorx = 440;
    /** Initializes the egg. */
    private boolean renderEgg = false;
    /** Initializes the egg. */
    private boolean renderEgg2 = false;
    /** Initializes the egg. */
    private boolean renderEgg3 = false;
    /** Initializes the egg. */
    private boolean renderEgg4 = false;
    /** Initializes the egg. */
    private boolean renderEgg5 = false;
    /** Initializes the egg. */
    private boolean renderEgg6 = false;
    /** Initializes the egg. */
    private boolean renderEgg7 = false;
    /** Initializes the egg. */
    private boolean renderEgg8 = false;
    /** Initializes the X. */
    private final int eggX = 140;
    /** Initializes the X. */
    private final int eggX2 = 215;
    /** Initializes the Y. */
    private final int eggY = 190;
    /** Initializes the Y. */
    private final int eggY2 = 265;
    /** Initializes the Y. */
    private final int eggY3 = 340;
    /** Initializes the Y. */
    private final int eggY4 = 415;
    /** Initializes the x coordinent. */
    private final int param1 = 550;
    /** Initializes the x coordinent. */
    private final int param2 = 360;
    /** Initializes the y coordinent. */
    private final int param3 = 435;
    /** Initializes the y coordinent. */
    private final int param4 = 510;
    /** Initializes the y coordinent. */
    private final int param5 = 585;
    /** Initializes the size. */
    private final int param6 = 75;
    /** Initializes the size. */
    private final int param7 = 625;
    /** Initializes the size. */
    private final long[] timer = new long[8];
    /** Initializes the size. */
    private final int cookTime = 10000;
    /** Initializes the size. */
    private final int array3 = 3;
    /** Initializes the size. */
    private final int array4 = 4;
    /** Initializes the size. */
    private final int array5 = 5;
    /** Initializes the size. */
    private final int array6 = 6;
    /** Initializes the size. */
    private final int array7 = 7;

    /**
     * Creates the logic to render the eggs.
     *
     * @param x
     * @param y
     * @param g2d
     */
    public void eggLogic(final int x, final int y, final Graphics g2d) {
        if (MyMouseListener.isKeyPressed1()) {
          // Checks if user clicked on the hitbox for the spoon and loads it
          g2d.drawImage(assets.getImage4(), x - offsetCursorx,
                  y - offsetCursory, null);
          if (isClicked(x, y, param1, param2, param6, param6)) {
            renderEgg = true;
            timer[0] = System.currentTimeMillis();
          } else if (isClicked(x, y, param1, param3, param6, param6)) {
            renderEgg2 = true;
            timer[1] = System.currentTimeMillis();
          } else if (isClicked(x, y, param1, param4, param6, param6)) {
            renderEgg3 = true;
            timer[2] = System.currentTimeMillis();
          } else if (isClicked(x, y, param1, param5, param6, param6)) {
            renderEgg4 = true;
            timer[array3] = System.currentTimeMillis();
          } else if (isClicked(x, y, param7, param2, param6, param6)) {
            renderEgg5 = true;
            timer[array4] = System.currentTimeMillis();
          } else if (isClicked(x, y, param7, param3, param6, param6)) {
            renderEgg6 = true;
            timer[array5] = System.currentTimeMillis();
          } else if (isClicked(x, y, param7, param4, param6, param6)) {
            renderEgg7 = true;
            timer[array6] = System.currentTimeMillis();
          } else if (isClicked(x, y, param7, param5, param6, param6)) {
            renderEgg8 = true;
            timer[array7] = System.currentTimeMillis();
          }
       }
    }

    /**
    * This method pains some graphics.
    * @param g
    */
    public void putEgg(final Graphics g) {
        if (renderEgg && System.currentTimeMillis() - timer[0] >= cookTime) {
            g.drawImage(assets.getImage8(), eggX, eggY, null);
        } else if (renderEgg) {
            g.drawImage(assets.getImage5(), eggX, eggY, null);
        }
        if (renderEgg2 && System.currentTimeMillis() - timer[1] >= cookTime) {
            g.drawImage(assets.getImage8(), eggX, eggY2, null);
        } else if (renderEgg2) {
            g.drawImage(assets.getImage5(), eggX, eggY2, null);
        }
        if (renderEgg3 && System.currentTimeMillis() - timer[2] >= cookTime) {
            g.drawImage(assets.getImage8(), eggX, eggY3, null);
        } else if (renderEgg3) {
            g.drawImage(assets.getImage5(), eggX, eggY3, null);
        }
        if (renderEgg4 && System.currentTimeMillis() - timer[array3]
                                                        >= cookTime) {
            g.drawImage(assets.getImage8(), eggX, eggY4, null);
        } else if (renderEgg4) {
            g.drawImage(assets.getImage5(), eggX, eggY4, null);
        }
        if (renderEgg5 && System.currentTimeMillis() - timer[array4]
                                                        >= cookTime) {
            g.drawImage(assets.getImage8(), eggX2, eggY, null);
        } else if (renderEgg5) {
            g.drawImage(assets.getImage5(), eggX2, eggY, null);
        }
        if (renderEgg6 && System.currentTimeMillis() - timer[array5]
                                                        >= cookTime) {
            g.drawImage(assets.getImage8(), eggX2, eggY2, null);
        } else if (renderEgg6) {
            g.drawImage(assets.getImage5(), eggX2, eggY2, null);
        }
        if (renderEgg7 && System.currentTimeMillis() - timer[array6]
                                                        >= cookTime) {
            g.drawImage(assets.getImage8(), eggX2, eggY3, null);
        } else if (renderEgg7) {
            g.drawImage(assets.getImage5(), eggX2, eggY3, null);
        }
        if (renderEgg8 && System.currentTimeMillis() - timer[array7]
                                                        >= cookTime) {
            g.drawImage(assets.getImage8(), eggX2, eggY4, null);
        } else if (renderEgg8) {
            g.drawImage(assets.getImage5(), eggX2, eggY4, null);
        }
    }
}
