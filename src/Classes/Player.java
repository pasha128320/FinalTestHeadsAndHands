package Classes;
import java.util.Random;

public class Player extends Essenses<Monster>{

    // Количество аптечек у игрока; изначально по условию 4
    private int firstAidKit = 4;
    // Максимальное здоровье игрока, нужно для исцеления
    private int maxHealth;

    // Конструктор игрока
    public Player(int health, int damage, int defense, int essenseAttack){
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.essenseAttack = essenseAttack;
        this.maxHealth = health;
    }

    // Реализация атаки монстра
    public void attack(Monster monster){

        assert monster.health != 0 : "Монстр уже мертв";


        // Модификатор атаки
        int attackModificator = this.damage - monster.defense + 1;

        // Рандомайзер
        Random random = new Random();

        // Проверка на успех атаки путем броска кубика ( 5 || 6 = успех  => условие > 4)
        for(int i = 0; i < attackModificator; i++){
            if(random.nextInt(6) + 1 > 4){
                monster.health = Math.max(0,monster.health - this.essenseAttack);
                break;
            }
        }
    }

    // Лечение игрока аптечками
    public void healing(){
        // ассерт на количество аптечек
        assert firstAidKit > 0 : "Аптечки закончились";
        assert this.health != 0 : "Игрок уже мертв и не может использовать аптечки";
        // Если максимальное здоровье, игроку не нужна аптечка и он не может ее использовать
        if (this.health != this.maxHealth) {
            this.health = Math.min(this.maxHealth, (int) Math.round(this.health + 0.3 * this.maxHealth));
            this.firstAidKit -= 1;
        }
    }


}