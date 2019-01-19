package oop_box;
//definition main_file .class
public class main_file
{
    public static void main(String[] args)
    {
        //declare variable box as mybox .object
        box mybox;

        //assignment to mybox .object with box .class
        mybox = new box();

        //declare to mybox .object properties from box .class with parameters
        mybox.height = 10;
        mybox.length = 15;
        mybox.width  = 10;

        //definition new variable
        int volume;

        //out new variable volume calculate mybox .object parameters
        volume = mybox.height * mybox.length * mybox.width;

        //output from variable volume
        System.out.println(volume);
    }
}