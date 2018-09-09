package zad5;

/*
1.5. Wykorzystanie klasy abstrakcyjnej w programach
Zadanie: Tworzenie obiektów z wykorzystaniem klasy abstrakcyjnej
Wykorzystując kod stworzony przez nas w tym submodule: https://kodilla.com/pl/project-java/38595 utwórz nowe obiekty pracowników:

Pracownika zarabiającego 5 zł za stworzenie jednego produktu,
Pracownika, który zarabia pensję podstawową 2000zł i 20% tej pensji jeżeli zrealizuje dodatkową sprzedaż dowolnego produktu
Podpowiedź: w tym zadaniu będziesz tworzyć tylko obiekty na podstawie naszego kodu, który używa klas abstrakcyjnych. Nie musisz tworzyć nowych klas abstrakcyjnych.
 */

interface Employee {

    double calculateSalary();

}

class FixedSalaryEmployee implements Employee {

    private double salary;
    private double additionalSales;
    public double numberA = 1.2;


    public FixedSalaryEmployee(double salary, double additionalSales) {

        this.salary = salary;
        this.additionalSales = additionalSales;
    }



    public double calculateSalary() {
        return this.salary * additionalSales;

    }

}
class EmplyeeBonusSalary implements Employee {

    private double salary;
    private boolean isBonus;

    public EmplyeeBonusSalary (double salary, boolean isBonus) {
        this.salary = salary;
        this.isBonus = isBonus;
    }

    public double calculateSalary() {
        if(isBonus) {
            return	salary * 1.2;
        }
        return salary;
    }

}
class HourlySalaryEmployee implements Employee {

    private double pricePerProduct;
    private double product;

    public HourlySalaryEmployee(double pricePerProduct, double product) {
        this.pricePerProduct = pricePerProduct;
        this.product = product;
    }

    public double calculateSalary() {
        return this.product * this.pricePerProduct;
    }

}

// Payout
abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }

}

class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sending money to employee");
    }

}

class Application {

    public static void main(String args[]) {

        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000, 2);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(260, 5);
        EmplyeeBonusSalary employee2 = new EmplyeeBonusSalary(2000, true);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee2);
        processor.processPayout();
        processor.processPayout();
    }

}