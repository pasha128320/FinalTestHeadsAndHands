package Classes;

public abstract class Essenses<T> {

    // Переменная здоровья существа
    protected int health;
    // Переменная урона существа
    protected int damage;
    // Переменная защиты существа
    protected int defense;
    // Переменная атаки существа
    protected int essenseAttack;

    // Геттер для возврата здоровья существа
    public int getHealth() { return this.health; }
    // Геттер для возврата урона существа
    public int getDamage() { return this.damage; }
    // Геттер для возврата защиты
    public int getDefense() { return this.defense; }
    // Геттер для возврата урона существа
    public int getEssenseAttack() { return this.essenseAttack; }

    // Абстрактный метод для атаки существа другого в классах Monster и Player
    public abstract void attack(T essense);
}