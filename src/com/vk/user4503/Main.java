package com.vk.user4503;

import static com.vk.user4503.Main.Robot.Direction.*;

public class Main {

    public static void main(String[] args) {



        // write your code here
    }
    public static void Navitel(int x, int y){


    }

    public static class Robot { //класс
        int x; // поля для класса
        int y;
        Direction d;

        public Robot(int x, int y, Direction d) {/*классовый конструктор для метода. Сюда входят необходимые
    поля для создания экземпляра Robot
   Для создания экземпляра, например, Arrow(стрелка к орах 0,0) - поля х и у будут неактуальны*/
            this.x = x;
            this.y = y;
            this.d = d;
            }
        public enum Direction { /* варианты поля "направление"*/
            UP,
            LEFT,
            DOWN,
            RIGHT
            }
        public Direction getDirection(){//геттер направления ссылка на Direction, так как юзаем вложенный метод
            return d;
        }
        public String  getLocation(){ // по сравнению с направлением ничего не используем, мы и так в robot
        /*отладочное*/
            return x + ","+ y;
         }
        public void step(Direction) {
            switch (d){
                case UP : y=y++;
                case DOWN: y=y--;
                case LEFT: x=x--;
                case RIGHT: x=x++;



        }






    }


    public static void stepForward(){

    }
    public  String (){





        
//System.out.println(Robot.getlocation);
    }
}

