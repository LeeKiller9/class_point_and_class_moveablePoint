public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = {this.getXSpeed(), this.getYSpeed()};
        return array;
    }

    public void setSpeed(float x, float y) {
        this.xSpeed = x;
        this.ySpeed = y;
    }

    @Override
    public String toString() {
        return super.toString() + " -- Speed: xSpeed = " + this.xSpeed + ", ySpeed = " + this.ySpeed;
    }

    public MovablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
