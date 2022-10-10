import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
    }
    
    public void moveHero()
    {
        if (Greenfoot.isKeyDown("W"))
        {
            setRotation(270);
            setLocation(getX(), getY()-7);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            setRotation(90);
            setLocation(getX(), getY()+7);
        }
        if (Greenfoot.isKeyDown("A"))
        {
            setRotation(180);
            setLocation(getX()-7, getY());
        }
        if (Greenfoot.isKeyDown("D"))
        {
            setRotation(0);
            setLocation(getX()+7, getY());
        }
        if (isAtEdge())
            setLocation(0,400);
    }
}
