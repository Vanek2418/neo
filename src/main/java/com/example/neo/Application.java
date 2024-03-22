package com.example.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //	Чтобы рассчитать примерную сумму отпускных,
    //	нужно разделить зарплату на 29,3 (среднее число дней в месяце)
    //	и умножить на количество дней отпуска

	/*
		Переменная salary хранит зарплату за год.
		Из неё получаем среднюю за месяц, умножаем на среднее количество дней в месяце
		и умножаем на количество дней отпуска

	*/


    @GetMapping("/calculacte")
    public double calcVacationPackages(@RequestParam double salary, @RequestParam int days) {
        return (salary / 12) / 29.3 * days;
    }

}
