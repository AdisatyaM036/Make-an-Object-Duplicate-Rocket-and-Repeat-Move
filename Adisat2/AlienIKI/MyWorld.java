import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,70,100);
        Enemy enemy = new Enemy();
        addObject(enemy,545,255);
        hero.setLocation(94,383);
        enemy.setLocation(718,379);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,722,182);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,721,567);
        Enemy enemy4 = new Enemy(10);
        addObject(enemy4,623,284);
        removeObject(enemy4);
    }
}
