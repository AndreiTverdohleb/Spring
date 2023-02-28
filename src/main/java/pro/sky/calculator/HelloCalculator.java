package pro.sky.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class HelloCalculator {

    private final CalculatorServece calculatorServece;

    public HelloCalculator(CalculatorServece calculatorServece) {
        this.calculatorServece = calculatorServece;
    }


    @GetMapping
        public String welcome(){
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1")int num1, @RequestParam("nam2")int num2) {
        int result = calculatorServece.plus(num1, num2);
        return num1 + "+" + num2 + "=" + result;



    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1")int num1, @RequestParam("nam2")int num2) {
        int result = calculatorServece.minus(num1, num2);
        return num1 + "-" + num2 + "=" + result;

    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1")int num1, @RequestParam("nam2")int num2) {
        int result = calculatorServece.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + result;

    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1")int num1, @RequestParam("nam2")int num2) {
        int result = calculatorServece.divide(num1, num2);
        return num1 + "/" + num2 + "=" + result;

    }

}

