package Classes;
import java.util.Random;

public class Monster extends Essenses<Player>{

    // Конструктор монстра
    public Monster(int health, int damage, int defense, int essenseAttack){
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.essenseAttack = essenseAttack;
    }

    // Реализация атаки монстра
    public void attack(Player player){

        assert player.health != 0 : "Игрок уже мертв";

        // Модификатор атаки
        int attackModificator = this.damage - player.defense + 1;

        // Рандомайзер
        Random random = new Random();

        // Проверка на успех атаки путем броска кубика ( 5 || 6 = успех  => условие > 4)
        for(int i = 0; i < attackModificator; i++){
            if(random.nextInt(6) + 1 > 4){
                player.health = Math.max(0,player.health - this.essenseAttack);
                break;
            }
        }
    }

}