import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Main;
import ru.netology.Radio;

public class RadioTest {

    // Тест 1. Установить любой номер радиостанции
    @Test
    public void setTheRadioStationNumber() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 2. Установить номер радиостанции выше лимита
    @Test
    public void setTheRadioStationNumberAboveTheLimit() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 3. Увеличить радиостанцию с 8 / на следующую.
    @Test
    public void increaseRadioStationFrom8() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(8);
        service.nextRadiostation(); // Вызываем тестируемый метод
        int expected = 9;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 4. Увеличить радиостанцию с 9 на следующую.
    @Test
    public void increaseRadioStationFrom9() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(9);
        service.nextRadiostation(); // Вызываем тестируемый метод
        int expected = 0;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 5. Увеличить радиостанцию с 0 на следующую.
    @Test
    public void increaseRadioStationFrom0() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(0);
        service.nextRadiostation(); // Вызываем тестируемый метод
        int expected = 1;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 6. Уменьшить номер радиостанции с 1;
    @Test
    public void decreaseRadioStationFrom1() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(1);
        service.prevRadiostation(); // Вызываем тестируемый метод
        int expected = 0;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 7. Уменьшить номер радиостанции с 0;
    @Test
    public void decreaseRadioStationFrom0() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(0);
        service.prevRadiostation(); // Вызываем тестируемый метод
        int expected = 9;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 8. Уменьшить номер радиостанции с -1;
    @Test
    public void decreaseRadioStationFromMinus1() {
        Radio service = new Radio();
        service.setCurrentRadioStationNumber(-1);
        service.prevRadiostation(); // Вызываем тестируемый метод
        int expected = 9;
        int actual = service.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 9. Увеличить звук со 99
    @Test
    public void nextVolume99() {
        Radio servise = new Radio();
        servise.setSoundVolume(99);
        servise.nextVolume();
        int expected = 100;
        int actual = servise.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 10. Увеличить звук со 100
    @Test
    public void nextVolume100() {
        Radio servise = new Radio();
        servise.setSoundVolume(100);
        servise.nextVolume();
        int expected = 100;
        int actual = servise.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 11. Увеличить звук со 101
    @Test
    public void nextVolume101() {
        Radio servise = new Radio();
        servise.setSoundVolume(101);
        servise.nextVolume();
        int expected = 100;
        int actual = servise.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 12. Уменьшить звук с 1
    @Test
    public void prevVolume1() {
        Radio servise = new Radio();
        servise.setSoundVolume(1);
        servise.prevVolume();
        int expected = 0;
        int actual = servise.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 13. Уменьшить звук с 0
    @Test
    public void prevVolume0() {
        Radio servise = new Radio();
        servise.setSoundVolume(0);
        servise.prevVolume();
        int expected = 0;
        int actual = servise.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 14. Уменьшить звук с -1
    @Test
    public void prevVolumeMinus1() {
        Radio servise = new Radio();
        servise.setSoundVolume(-1);
        servise.prevVolume();
        int expected = 0;
        int actual = servise.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Тест 15.  ---------------------MAIN покрытие .
    // Передаю Текст (параметр).
    // В Мэйн сравниваю строки и преобразую текст в целочисленный тип и возвращаю число.
    @Test
    public void stringToNumber() {
        Main service = new Main();
        int expected = 8;
        int actual = service.test("8");
        Assertions.assertEquals(expected, actual);
    }

    // Тест 16.  ---------------------MAIN покрытие .
    @Test
    public void stringToNumberEqual() {
        Main service = new Main();
        int expected = 9;
        int actual = service.test("9");
        Assertions.assertEquals(expected, actual);
    }

}
