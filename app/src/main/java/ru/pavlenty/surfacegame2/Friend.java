package ru.pavlenty.surfacegame2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class Friend {
    private Bitmap bitmap;
    private int x;
    private int y;
    private int speed = 0;
    private boolean boosting;
    private final int GRAVITY = -10;
    private int maxY;
    private int minY;
    private int maxX;

    private Rect detectCollision;

    public Friend(Context context, int screenX, int screenY) {
        speed = 1;
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.friend);
        maxY = screenY - bitmap.getHeight();
        maxX = screenX - bitmap.getWidth();
        minY = 0;
        x = maxX;
        y = (int) (Math.random() * (screenY + 1) + 50);
        boosting = false;

        detectCollision = new Rect(x, y, bitmap.getWidth(), bitmap.getHeight());
    }
//     public void stopBoosting() {
//         boosting = false;
//     }
//     public void setBoosting() {
//         boosting = true;
//     }

    public void update() {
        x -= 5;


        detectCollision.left = x;
        detectCollision.top = y;
        detectCollision.right = x + bitmap.getWidth();
        detectCollision.bottom = y + bitmap.getHeight();

    }


    public Rect getDetectCollision() {
        return detectCollision;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int my_y) {
        y = my_y;
    }

    public int getSpeed() {
        return speed;
    }
}


