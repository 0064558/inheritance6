/*
Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00
*/

package entities;

public class Company extends TaxPlayer {

   private Double numberOfEmployees;

    public Company(String name, Double anualIncoming, Double numberOfEmployees) {
        super(name, anualIncoming);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Double getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Double numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10) {
            return getAnualIncoming() * 0.14;
        } else {
            return getAnualIncoming() * 0.16;
        }

    }
}
