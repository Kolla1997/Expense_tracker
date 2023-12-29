package Expense.example.ExpenseTracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public class Expenses
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String category;
    private  double amount;
    private Date date;
    private  String description;
    public Expenses(String category, double amount, LocalDate date, String description) {
        this.category = category;
        this.amount = amount;
        this.date = Date.valueOf(date);
        this.description = description;
    }

}
