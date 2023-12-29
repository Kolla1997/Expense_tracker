package Expense.example.ExpenseTracker.Service;

import Expense.example.ExpenseTracker.DAO.ExpenseRepo;
import Expense.example.ExpenseTracker.Model.Expenses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class ExpenseService {
   @Autowired
   ExpenseRepo expenseRepo;

    public void add(Expenses expenses)
    {
        expenseRepo.save(expenses);
    }

    public List<Expenses> getAllExpenses()
    {
        return expenseRepo.findAll();
    }
}
