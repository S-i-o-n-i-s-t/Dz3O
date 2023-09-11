import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * TODO: Доработать в рамках домашней работы
 */

public class Freelancer extends Employee implements Iterator<String> {
    /**
     * Итеация
     *
     * @return
     */
    private int item;

    @Override
    public boolean hasNext() {
        return item++ < 5;
    }

    @Override
    public String next() {
                switch (item) {
            case 1:
                return  String.format("Фамилия - %s", surNames);
            case 2:
                return String.format("Имя - %s", name);
            case 3:
                return String.format("Ставка - %.2f", bet);
            case 4:
                return String.format("Количество выходов - %d", numberOfWorkingDays);
            default:
                return String.format("Зарплата - %.2f", salary);
        }
    }

    @Override
    public int compareTo() {
        return 0;
    }
    /**
     * Добавили пару полей "для раднообразия"
     */
    private double bet;
    private int numberOfWorkingDays;

    public double getBet() {
        return bet;
    }

    public Employee getInstance(){
        return new Freelancer(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(surNames.length)],
                bet = random.nextInt(500, 5000),
                numberOfWorkingDays = random.nextInt(1, 25),
                bet*8*numberOfWorkingDays);
    }
    public List<Employee> getFreelanc(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employees.add(getInstance());
        }
        return employees;
    }
    protected Freelancer(){
    }

    protected Freelancer(String surName, String name, double bet, int numberOfWorkingDays, double salary) {
        super(surName, name, salary);
        this.bet = bet;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }




    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Ставка/час %.2f; Количество выходов %d Рабочий; заработная плата: %.2f (руб.)",
                surName, name, bet, numberOfWorkingDays, salary);
    }



}
