package pr3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDoctor {
    Doctor doctor = new Doctor();

    @Test
    void test_problem1() {
        String expected = doctor.problem(1);
        Assert.assertEquals("голова", expected);
    }

    @Test
    void test_problem2() {
        String expected = doctor.problem(2);
        Assert.assertEquals("грудь", expected);
    }

    @Test
    void test_problem3() {
        String expected = doctor.problem(3);
        Assert.assertEquals("горло", expected);
    }

    @Test
    void test_chest1() {
        String expected = doctor.chestAche("да", "", "");
        Assert.assertEquals("Обратитесь к кардиологу", expected);
    }

    @Test
    void test_chest2() {
        String expected = doctor.chestAche("нет", "да", "");
        Assert.assertEquals("Обратитесь к пульмологу", expected);
    }

    @Test
    void test_chest3() {
        String expected = doctor.chestAche("нет", "нет", "да");
        Assert.assertEquals("Сходите в травмпункт", expected);
    }

    @Test
    void test_chest4() {
        String expected = doctor.chestAche("нет", "нет", "нет");
        Assert.assertEquals("Симулянт", expected);
    }

    @Test
    void test_throat1() {
        String expected = doctor.throatAche("да", "да", "сухой", "", "");
        Assert.assertEquals("Тонзиллит", expected);
    }

    @Test
    void test_throat2() {
        String expected = doctor.throatAche("да", "нет", "", "", "");
        Assert.assertEquals("Ангина", expected);
    }

    @Test
    void test_throat3() {
        String expected = doctor.throatAche("да", "да", "влажный", "", "");
        Assert.assertEquals("Бронхит", expected);
    }

    @Test
    void test_throat4() {
        String expected = doctor.throatAche("нет", "", "", "да", "");
        Assert.assertEquals("Не напрягайте их в ближайшее время", expected);
    }

    @Test
    void test_throat5() {
        String expected = doctor.throatAche("нет", "", "", "нет", "да");
        Assert.assertEquals("Обратись к ЛОР-врачу", expected);
    }

    @Test
    void test_throat6() {
        String expected = doctor.throatAche("нет", "", "", "нет", "нет");
        Assert.assertEquals("Симулянт", expected);
    }

    @Test
    void test_head1() {
        String expected = doctor.headAche("да", "", "", "");
        Assert.assertEquals("Сходите к терапевту", expected);
    }

    @Test
    void test_head2() {
        String expected = doctor.headAche("нет", "да", "", "");
        Assert.assertEquals("Сходите в травмпункт", expected);
    }

    @Test
    void test_head3() {
        String expected = doctor.headAche("нет", "нет", "да", "");
        Assert.assertEquals("Сходите на МРТ", expected);
    }

    @Test
    void test_head4() {
        String expected = doctor.headAche("нет", "нет", "нет", "да");
        Assert.assertEquals("Выпейте коньячку", expected);
    }

    @Test
    void test_head5() {
        String expected = doctor.headAche("нет", "нет", "нет", "нет");
        Assert.assertEquals("Симулянт", expected);
    }




}
