import Classes.*;

public class Main{

    public static void main(String[] args) {
        try {
            Player player = new Player(13, 25, 20, 6);
            Monster monster = new Monster(15, 25, 20, 7);
            // ассерт на правильный ввод урона и защиты игрока
            assert player.getDamage() < 31 && player.getDefense() < 31  &&
                    monster.getDamage() < 31 && monster.getDefense() < 31: "Неправильно введены значения атаки и защиты" ;

            player.attack(monster);
            monster.attack(player);
            //player.healing();

            player.attack(monster);
            monster.attack(player);

            player.attack(monster);
            monster.attack(player);

            player.attack(monster);
            monster.attack(player);


        } catch (AssertionError e){
            e.printStackTrace();
        } // У нас нет обязательных методов для использования блока finally
    }



}