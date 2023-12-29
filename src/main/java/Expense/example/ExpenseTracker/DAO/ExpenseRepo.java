package Expense.example.ExpenseTracker.DAO;

import Expense.example.ExpenseTracker.Model. Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepo extends JpaRepository<Expenses,Long>
{

}
