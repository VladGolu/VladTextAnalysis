package by.epam.golubev.consol.textanalysis.application.service;

public class ConsoleService {
    public void ConsoleForMenu(){
        System.out.println("Выберите действие");
        System.out.println("1. Отсортировать абзацы по количеству предложений");
        System.out.println("2. Найти предложения с самым длинным словом");
        System.out.println("3. Удалить из текста все предложения с числом слов меньше заданного");
        System.out.println("4. Найти в тексте все одинаковые слова без учета регистра и посчитать их количество");
        System.out.println("5. Подсчитать в предложении число гласных и согласных букв");
        System.out.println("6. Выйти из программы");
    }
}
